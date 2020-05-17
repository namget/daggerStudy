package com.namget.daggerstudy.binds

import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@Component
interface BindsComponent {
    fun inject(myFoo: MyFoo)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun setString(str : String) : Builder
        fun build() : BindsComponent
    }
}