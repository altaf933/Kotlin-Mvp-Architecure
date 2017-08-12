package com.kotlin.mvp.main

import com.kotlin.base.BasePresenter
import com.kotlin.base.BaseView

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
object Main {

    interface View : BaseView {
        fun dataUpdated()
        fun error(msg: String?)
    }

    interface Presntenter : BasePresenter<View> {
        fun loadingData()
    }
}