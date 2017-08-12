package com.kotlin.base

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {

    override fun detachView() {
    }

    override fun attachView(view: V) {
    }

}