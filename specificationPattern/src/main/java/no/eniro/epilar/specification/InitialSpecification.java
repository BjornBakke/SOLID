package no.eniro.epilar.specification;

import com.eniro.specification.AbstractSpecification;
import no.eniro.epilar.domain.ContractStatus;

public class InitialSpecification extends AbstractSpecification<ContractStatus> {
    @Override
    public boolean isSatisfiedBy(ContractStatus status) {
        return status == ContractStatus.INITIELL;
    }
}
