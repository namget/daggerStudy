package com.namget.daggerstudy.extends

import dagger.Component

/**
 * Created by Namget on 2020.05.19.
 */
@Component(modules = [ParentModule::class])
interface ParentComponent {
    fun strings(): Set<String>
    fun childComponentBuilder() : ChildComponent.Builder
}