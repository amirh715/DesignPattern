package website.amirhossein.pattern.Specification;

public abstract class AbstractSpecification<C> implements Specification<C> {

    public Specification<C> and(Specification<C> other) {
        return new AndSpecification<>(this, other);
    }

    public Specification<C> or(Specification<C> other) {
        return new OrSpecification<>(this, other);
    }

    public Specification<C> not() {
        return new NotSpecification<>(this);
    }

}
