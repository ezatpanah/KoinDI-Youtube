package com.ezatpanah.koindi_youtube

import org.koin.dsl.module

val appModule = module {
    single { Fly() }
    factory { Eat() }
    factory { Bird(get(), get()) }
}