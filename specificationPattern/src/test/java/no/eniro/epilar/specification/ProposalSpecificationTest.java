package no.eniro.epilar.specification;

import no.eniro.epilar.domain.ContractStatus;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProposalSpecificationTest {
    @Test
    public void contractStatus_initial_satisfySpecification() {
        ProposalSpecification proposalSpecification = new ProposalSpecification();

        assertTrue(proposalSpecification.isSatisfiedBy(ContractStatus.PROPOSAL));
    }

    @Test
    public void contractStatus_deleted_violatesSpecification() {
        ProposalSpecification proposalSpecification = new ProposalSpecification();

        assertFalse(proposalSpecification.isSatisfiedBy(ContractStatus.DELETED));
    }
}
