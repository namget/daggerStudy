package com.namget.daggerstudy.binds

import dagger.BindsInstance
import dagger.Component

@Component
interface BindsComponent {
    fun inject(bindFoo: BindFoo)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun setString(str : String) : Builder
        fun build() : BindsComponent
    }
}