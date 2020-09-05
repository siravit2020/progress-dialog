package com.example.myapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mai.progressdialog.maiProgressDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = maiProgressDialog(this)

        d.setText("Loading..ff.")
        d.setTextColor(R.color.colorPrimaryDark)
        d.setCorner(15)
       // d.setColorDialog(R.color.colorPrimary)
        d.returnDialog().show()


    }
}