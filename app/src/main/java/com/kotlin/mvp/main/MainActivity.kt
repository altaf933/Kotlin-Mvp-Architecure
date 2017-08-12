package com.kotlin.mvp.main

import android.os.Bundle
import com.kotlin.base.BaseActivity
import com.kotlin.mvp.R

class MainActivity
    : BaseActivity<Main.View, Main.Presntenter>(), Main.View {

    override var mPresenter: Main.Presntenter = MainPresenter();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun dataUpdated() {
    }

    override fun error(msg: String?) {
    }


    //override var mPrsenter: Main.Presntenter = MainPresenter()

    override fun showMessage(msg: String) {

    }

}
