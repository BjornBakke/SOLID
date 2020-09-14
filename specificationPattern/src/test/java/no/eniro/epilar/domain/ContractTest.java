package no.eniro.epilar.domain;

import com.eniro.specification.Specification;
import no.eniro.epilar.specification.InitialSpecification;
import no.eniro.epilar.specification.ProposalSpecification;
import no.eniro.epilar.specification.SendSpecification;
import no.eniro.epilar.specification.TestSpecification;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContractTest {
    @Test
    public void isEditable_FirstLoad_true() {
        Contract contract = new Contract(ContractStatus.INITIELL);

        boolean editable = contract.isEditable(new InitialSpecification());

        assertTrue(editable);
    }

    @Test
    public void isEditable_deleted_false() {
        Contract contract = new Contract(ContractStatus.DELETED);

        boolean editable = contract.isEditable(new InitialSpecification());

        assertFalse(editable);
    }


    @Test
    public void isEditable_whenInitialOrProposal_true() {
        Contract contract = new Contract(ContractStatus.PROPOSAL);

        InitialSpecification initialSpecification = new InitialSpecification();
        ProposalSpecification proposalSpecification = new ProposalSpecification();
        SendSpecification sendSpecification = new SendSpecification();
        TestSpecification testSpecification = new TestSpecification();

        Specification editableSpecification = initialSpecification.
                or(proposalSpecification.not(sendSpecification)).
                and(testSpecification);

        boolean editable = contract.isEditable(editableSpecification);

        assertTrue(editable);
    }
}
