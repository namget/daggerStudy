package com.namget.daggerstudy

import com.namget.daggerstudy.binds.BindFoo
import com.namget.daggerstudy.binds.BindsComponent
import com.namget.daggerstudy.binds.DaggerBindsComponent
import org.junit.Test

/**
 * Created by Namget on 2020.05.18.
 */
class BindInstanceTest {
    @Test
    fun testBindsInstance(){
        val hello = "Hello World"
        val foo = BindFoo()
        val component : BindsComponent = DaggerBindsComponent.builder()
            .setString(hello)
            .build()
        component.inject(foo)
        println(foo.str)
    }
}