package com.namget.daggerstudy.scope

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class UserScope {

}