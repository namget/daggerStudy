package com.namget.daggerstudy.multi

import dagger.Component

@Component(modules = [MultibindsModules::class])
interface MultibindsComponent {
    fun getStrings() : Set<String>
}