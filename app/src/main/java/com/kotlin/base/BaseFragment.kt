package com.kotlin.base

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
abstract class BaseFragment<in V : BaseView, T : BasePresenter<V>> : Fragment(), BaseView {

    protected abstract fun getInitContentViewId(): Int
    protected abstract fun initView(saveInstantState: Bundle?, view: View)

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(getInitContentViewId(), container, false)
        return view;
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(savedInstanceState, view!!)
    }

    override fun getContext(): Context {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) return super.getContext() else activity
    }
}