package com.namget.daggerstudy.binds

import dagger.Component

@Component(modules = [CommonModule::class, HelloModule::class])
interface StrComponent {
    fun inject(myFoo: MyFoo)
}