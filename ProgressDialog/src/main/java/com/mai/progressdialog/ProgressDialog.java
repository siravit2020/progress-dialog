package com.mai.progressdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProgressDialog {
    private Dialog dialog;
    private View view2;
    private int width=0;
    private Context context;
    private LayoutInflater inflater;
    public ProgressDialog(Context context, LayoutInflater inflater) {
        this.context = context;
        this.inflater = inflater;
        view2 = inflater.inflate(R.layout.progress_dialog, null);
        dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(view2);
        width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.8);
        dialog.getWindow().setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
    public Dialog returnDialog(){
        return dialog;
    }

    public void setDialogWidth(Double size)
    {
        width = (int) (context.getResources().getDisplayMetrics().widthPixels * size);
        dialog.getWindow().setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
    public void setText(String str)
    {
        TextView t = view2.findViewById(R.id.textbar);
        t.setText(str);
    }
}
