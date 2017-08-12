package com.kotlin.base

import android.content.Context

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
interface BaseView {

    fun getContext(): Context
    fun showMessage(msg: String)

}