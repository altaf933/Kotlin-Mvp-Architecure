package com.kotlin.base

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
interface BasePresenter<in V : BaseView> {
    fun attachView(view: V)
    fun detachView()
}