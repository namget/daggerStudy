package com.namget.daggerstudy.extends

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

/**
 * Created by Namget on 2020.05.19.
 */
@Module
class ChildModule{
    @Provides
    @IntoSet
    fun string3() : String{
        return "child string1"
    }

    @Provides
    @IntoSet
    fun string4() : String{
        return "child string2"
    }
}