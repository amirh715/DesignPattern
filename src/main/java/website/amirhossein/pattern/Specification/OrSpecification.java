package website.amirhossein.pattern.Specification;

public class OrSpecification<C> extends AbstractSpecification<C> {

    private final Specification<C> first;
    private final Specification<C> second;

    public OrSpecification(Specification<C> first, Specification<C> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfiedBy(C candidate) {
        return first.isSatisfiedBy(candidate) || second.isSatisfiedBy(candidate);
    }

    public Specification<C> getFirst() {
        return first;
    }

    public Specification<C> getSecond() {
        return second;
    }

}
