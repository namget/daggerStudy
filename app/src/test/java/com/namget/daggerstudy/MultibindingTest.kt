package com.namget.daggerstudy

import com.namget.daggerstudy.multibinding.DaggerSetComponent
import com.namget.daggerstudy.multibinding.SetFoo
import org.junit.Test

/**
 * Created by Namget on 2020.05.18.
 */
class MultibindingTest {
    @Test
    fun testMultibindingSet() {
        val setFoo = SetFoo()
        DaggerSetComponent.create().inject(setFoo)
        setFoo.print()
    }
}