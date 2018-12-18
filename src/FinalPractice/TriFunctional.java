package FinalPractice;

@FunctionalInterface
public interface TriFunctional<S1, S2, S3,R> {
 R apply(S1 s1, S2 s2, S3 s3);
}
