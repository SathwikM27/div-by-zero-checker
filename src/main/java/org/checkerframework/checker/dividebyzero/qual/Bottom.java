package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;


@Target(ElementType.TYPE_USE)
@SubtypeOf({Positive.class, Negative.class, Zero.class, NonZero.class})
public @interface Bottom {
}