package com.namget.daggerstudy.binds

import dagger.Component
import dagger.Provides
import javax.inject.Inject


@Component(modules = [CommonModule::class])
interface NoStrComponent {
    fun inject(myFoo: MyFoo)
}
