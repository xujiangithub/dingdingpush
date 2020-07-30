package com.xj.xjdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xj.xjdemo.dialog.XDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ttt.setOnClickListener {
            openDialogFragment()
        }

    }


    fun openDialogFragment() {
        val ft = supportFragmentManager.beginTransaction()
        val dialog = supportFragmentManager.findFragmentByTag("XDialogFragment")
        dialog?.let {
            ft.remove(dialog)
        }
        val mDialog = XDialogFragment.newInstance("wed")
        ft.add(mDialog, "XDialogFragment")
        ft.commitAllowingStateLoss()
    }
}