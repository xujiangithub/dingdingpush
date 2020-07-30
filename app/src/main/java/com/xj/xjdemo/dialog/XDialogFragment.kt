package com.xj.xjdemo.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.xj.xjdemo.R


class XDialogFragment: DialogFragment() {

    companion object {
        fun newInstance(title: String): XDialogFragment {
            val xDialogFragment = XDialogFragment()
            val bundle = Bundle()
            bundle.putString("title", title)
            xDialogFragment.arguments = bundle
            return xDialogFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater?.inflate(R.layout.x_dialog_fragment, container, false)
    }

}