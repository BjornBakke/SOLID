package no.eniro.epilar.domain;

import com.eniro.specification.Specification;

public class Contract {
    private ContractStatus status;

    public Contract(ContractStatus status) {
        this.status = status;
    }

    public boolean isEditable(Specification specification) {
        return specification.isSatisfiedBy(status);
    }
}
