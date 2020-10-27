package com.example.dagger.dependencyInjection.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Scope аннотация для активити
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
