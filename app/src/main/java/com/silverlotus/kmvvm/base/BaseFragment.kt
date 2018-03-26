package com.silverlotus.kmvvm.base

import android.os.Bundle
import android.support.v4.app.Fragment
import com.github.salomonbrys.kodein.KodeinInjected
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.android.appKodein

/**
 * Created by Gian Patrick Quintana on 1/22/2018.
 */
abstract class BaseFragment : Fragment(), KodeinInjected {

    override val injector = KodeinInjector()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject(appKodein())
    }
}