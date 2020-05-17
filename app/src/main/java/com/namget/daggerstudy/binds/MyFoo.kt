package com.namget.daggerstudy.binds

import java.util.*
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by Namget on 2020.05.17.
 */
class MyFoo {
    @Inject
    lateinit var str : Optional<String>

/*    @Inject
    lateinit var str2 : Optional<Provider<String>>

    @Inject
    lateinit var str3 : Optional<Lazy<String>>*/
}