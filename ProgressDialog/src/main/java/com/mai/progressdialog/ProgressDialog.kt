package com.mai.progressdialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class ProgressDialog(var context:Context,var inflater: LayoutInflater) {
    lateinit var dialog: Dialog
    lateinit var view2: View
    var width=0
    fun maiDialog()
    {
        dialog = Dialog(context)
        view2 = inflater.inflate(R.layout.progress_dialog, null)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(view2)
        width = (context.resources.displayMetrics.widthPixels * 0.8).toInt()
        dialog.window!!.setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT)
    }
    fun setDialogWidth(size:Double)
    {
        width = (context.resources.displayMetrics.widthPixels * size).toInt()
    }
    fun show()
    {
        dialog.show()
    }
    fun dismiss()
    {
        dialog.dismiss()
    }
    fun setText(str:String)
    {
        view2.findViewById<TextView>(R.id.textbar).text = str
    }



}