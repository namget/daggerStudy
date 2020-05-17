package com.namget.daggerstudy

import com.namget.daggerstudy.binds.DaggerNoStrComponent
import com.namget.daggerstudy.binds.DaggerStrComponent
import com.namget.daggerstudy.binds.MyFoo
import org.junit.Test

/**
 * Created by Namget on 2020.05.17.
 */
class BindOptionTest{

    @Test
    fun testMyFoo(){
        val myFoo = MyFoo()
        val daggerNoStrComponent = DaggerNoStrComponent.create()
        daggerNoStrComponent.inject(myFoo)
        println(myFoo.str.isPresent)
        println(myFoo.str)

    }
}