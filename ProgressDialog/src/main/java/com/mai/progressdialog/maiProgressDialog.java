package com.mai.progressdialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class maiProgressDialog {
    private Dialog dialog;
    private View view2;
    private int width=0;
    private Context context;
    public maiProgressDialog(Context context) {
        this.context = context;
        this.view2 = LayoutInflater.from(context).inflate(R.layout.progress_dialog, null);
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
    public void setCorner(int dp)
    {
        float scale = context.getResources().getDisplayMetrics().scaledDensity;
        float mTextSizeP = (dp / scale);
        GradientDrawable shape = (GradientDrawable) view2.findViewById(R.id.layoutCorner).getBackground();
        shape.setCornerRadius(mTextSizeP);
    }
    public void setColorDialog(int color)
    {
        GradientDrawable shape = (GradientDrawable) view2.findViewById(R.id.layoutCorner).getBackground();
        shape.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
    }
}