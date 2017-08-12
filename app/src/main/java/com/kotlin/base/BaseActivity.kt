package com.kotlin.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

/**
 * Created by altaf.h.shaikh on 8/12/2017.
 */
abstract class BaseActivity<in V : BaseView, T : BasePresenter<V>>
    : AppCompatActivity(), BaseView {

    protected abstract var mPresenter: T

    override fun getContext(): Context = this

    private val TAG = BaseActivity::class.java!!.getSimpleName()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this as V);
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }


    fun <T : Fragment> addOrGetFragment(trans: FragmentTransaction,
                                        containerId: Int, tag: String, fragmentClass: Class<T>,
                                        arguments: Bundle? = null): T {

        val _args = if (arguments != null) Bundle(arguments) else Bundle()
        var fragment = fragmentManager.findFragmentByTag(tag) as T?

        if (fragment == null || fragment.isDetached) {
            fragment = Fragment.instantiate(this, fragmentClass.canonicalName, _args) as T
            trans.add(containerId, fragment, tag);
        }
        trans.commit();
        return fragment;
    }
}