package com.eniro.specification;


/**
 * NOT decorator, used to create a new Specification that is the inverse (NOT) of the given spec.
 */
public class NotSpecification<T> extends AbstractSpecification<T> {

    private Specification<T> specification1;

    /**
     * Create a new NOT specification based on another spec.
     *
     * @param specification1 Specification instance to not.
     */
    public NotSpecification(final Specification<T> specification1) {
        this.specification1 = specification1;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isSatisfiedBy(final T t) {
        return !specification1.isSatisfiedBy(t);
    }
}
