package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mai.progressdialog.maiProgressDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = maiProgressDialog(this)
        d.setCorner(30)
        d.setText("LOL")
        d.setTextColor(R.color.colorAccent)
        d.setDialogWidth(0.9)
        d.setColorDialog(R.color.colorPrimary)
        val dialog = d.returnDialog()
        dialog.show()
        dialog.dismiss()

    }
}