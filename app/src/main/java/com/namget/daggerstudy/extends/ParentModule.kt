package com.namget.daggerstudy.extends

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

/**
 * Created by Namget on 2020.05.19.
 */
@Module(subcomponents = [ChildComponent::class])
class ParentModule {
    @Provides
    @IntoSet
    fun string1() : String{
        return "parent string 1"
    }

    @Provides
    @IntoSet
    fun string2() : String{
        return "parent string 2"
    }
}