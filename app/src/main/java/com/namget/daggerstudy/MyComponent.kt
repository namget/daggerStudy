package com.namget.daggerstudy

import dagger.Component
import dagger.Provides

/**
 * Created by Namget on 2020.05.17.
 */
@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString() : String
    fun getClassB() : ClassB
    fun injectSomeType(classB: ClassB)


}