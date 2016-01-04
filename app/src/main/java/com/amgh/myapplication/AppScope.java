package com.amgh.myapplication;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by amirghoreshi on 04/01/16.
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}
