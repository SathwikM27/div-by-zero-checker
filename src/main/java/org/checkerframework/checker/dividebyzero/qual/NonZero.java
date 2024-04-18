
package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.QualifierForLiterals;

@Target(ElementType.TYPE_USE, ElementType.TYPE_PARAMETER)
@SubtypeOf({})
@QualifierForLiterals(LiteralKind.ALL)
public @interface NonZero {
}