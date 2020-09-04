package com.example.myapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mai.progressdialog.ProgressDialogmai

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = ProgressDialogmai(this,layoutInflater)
       // d.maiDialog()
        // d.setDialogWidth(0.5)
        d.setText("Loading...")
        d.showmai()

    }
}