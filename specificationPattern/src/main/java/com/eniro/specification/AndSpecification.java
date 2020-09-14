package com.eniro.specification;


/**
 * AND specification, used to create a new Specification that is the AND of two other specifications.
 */
public class AndSpecification<T> extends AbstractSpecification<T> {

    private Specification<T> specification1;
    private Specification<T> specification2;

    /**
     * Create a new AND specification based on two other spec.
     *
     * @param specification1 Specification one.
     * @param specification2 Specification two.
     */
    public AndSpecification(final Specification<T> specification1, final Specification<T> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isSatisfiedBy(final T t) {
        return specification1.isSatisfiedBy(t) && specification2.isSatisfiedBy(t);
    }
}
