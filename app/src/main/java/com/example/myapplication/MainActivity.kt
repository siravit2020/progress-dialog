package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mai.progressdialog.ProgressDialogMai


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = ProgressDialogMai(this)
        d.setText("LOL")
        d.setColorDialog(R.color.colorPrimary)
        val dialog = d.returnDialog()
        dialog.show()

    }
}