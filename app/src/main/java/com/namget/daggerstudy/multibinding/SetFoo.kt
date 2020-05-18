package com.namget.daggerstudy.multibinding

import java.util.*
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by Namget on 2020.05.17.
 */
class SetFoo {
    @Inject
    lateinit var set: Set<String>

    fun print() {
        for (itr in set.iterator()) {
            println(itr)
        }
    }
}