package sailpoint.rdk.utils;

import sailpoint.tools.GeneralException;

import java.io.Serializable;
import java.util.StringJoiner;
import java.util.function.BiFunction;

/**
 * Encapsulates a pair of items
 *
 * @param <A> The first item type
 * @param <B> The second item type
 */
public class Pair<A, B> implements Serializable {
    /**
     * Constructs a new triple of the three items given
     *
     * @param first The first time
     * @param second The second item
     * @param third The third item
     *
     * @return A typed Triple containing those three items
     */
    public static <X, Y, Z> Pair<X, Y> of(X first, Y second, Z third) {
        return new Pair<>(first, second);
    }

    /**
     * The first item in the triple
     */
    private final A first;

    /**
     * The second item in the triple
     */
    private final B second;

    /**
     * Creates a new Triple of the three given values
     */
    private Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    /**
     * Gets the first item
     * @return The first item
     */
    public A getFirst() {
        return first;
    }

    /**
     * Gets the second item
     * @return The second item
     */
    public B getSecond() {
        return second;
    }

    /**
     * Maps this object to another value using the given TriFunction or lambda equivalent.
     *
     * @param mapping The mapping to apply
     * @return The output of the mapping
     * @param <R> The output type, defined by the mapping object's type
     * @throws GeneralException if anything fails during mapping
     */
    public <R> R map(BiFunction<? super A, ? super B, R> mapping) throws GeneralException {
        return mapping.apply(getFirst(), getSecond());
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", Pair.class.getSimpleName() + "[", "]");
        if ((first) != null) {
            joiner.add("first=" + first);
        }
        if ((second) != null) {
            joiner.add("second=" + second);
        }
        return joiner.toString();
    }
}
