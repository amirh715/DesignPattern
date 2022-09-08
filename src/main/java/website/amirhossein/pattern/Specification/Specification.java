package website.amirhossein.pattern.Specification;

public interface Specification<C> {

    boolean isSatisfiedBy(C candidate);

}
