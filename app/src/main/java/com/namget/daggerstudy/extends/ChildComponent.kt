package com.namget.daggerstudy.extends

import dagger.Subcomponent

/**
 * Created by Namget on 2020.05.19.
 */
@Subcomponent(modules = [ChildModule::class])
interface ChildComponent{
    fun strings() : Set<String>

    @Subcomponent.Builder
    interface Builder{
        fun build() : ChildComponent
    }

}