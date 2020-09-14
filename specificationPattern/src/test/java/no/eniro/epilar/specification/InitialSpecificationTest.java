package no.eniro.epilar.specification;

import no.eniro.epilar.domain.ContractStatus;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InitialSpecificationTest {

    @Test
    public void contractStatus_initial_satisfySpecification() {
        InitialSpecification initialSpecification = new InitialSpecification();

        assertTrue(initialSpecification.isSatisfiedBy(ContractStatus.INITIELL));
    }

    @Test
    public void contractStatus_deleted_violatesSpecification() {
        InitialSpecification initialSpecification = new InitialSpecification();

        assertFalse(initialSpecification.isSatisfiedBy(ContractStatus.DELETED));
    }
}
