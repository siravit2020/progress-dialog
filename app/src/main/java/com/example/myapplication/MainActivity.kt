package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mai.progressdialog.maiProgressDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = maiProgressDialog(this)
        d.setText("LOL")

        d.setColorDialog(R.color.progress)
        val dialog = d.returnDialog()
        dialog.show()
       // dialog.dismiss()

    }
}