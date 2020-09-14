package no.eniro.epilar.specification;

import com.eniro.specification.AbstractSpecification;
import no.eniro.epilar.domain.ContractStatus;

public class SendSpecification extends AbstractSpecification<ContractStatus> {
    @Override
    public boolean isSatisfiedBy(ContractStatus contractStatus) {
        return contractStatus.equals(ContractStatus.SENDT);
    }
}
