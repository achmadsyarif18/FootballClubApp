package com.gdk.achmad.footballclub.coroutines

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

open class CoroutineContextProvider{
    open val main: CoroutineContext by lazy { Dispatchers.Main }
}