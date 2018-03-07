package CI346.lambdaExercises;

/**
 * A functional interface defining a method, isBetter, that takes two Comparable elements,
 * e1 and e2, and returns true if e1 is "better" than e2 in some sense.
  *
 * Created by jb259 on 20/11/16.
 */
public interface TwoElementPredicate<T extends Comparable> {
    public boolean isBetter(T e1, T e2);
}
