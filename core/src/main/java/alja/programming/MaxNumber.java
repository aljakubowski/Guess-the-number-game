package alja.programming;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @interface denotes that it is an "annotation type" definition
// @Target
// >indicates context in which annotation type is applicable :
// Means our Annotation MaxNumber can be added to fields parameters and methods
// @Retention
// >indicates: how long annotations with the annotated type are to be retained
// with RetentionPolicy.RUNTIME  -annotations recorded in the class file by the compiler and retained by JVM at Runtime
//@Qualifier
// Spring annotation - used to annotate other custom annotations that can be used as qualifiers

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MaxNumber {
}
