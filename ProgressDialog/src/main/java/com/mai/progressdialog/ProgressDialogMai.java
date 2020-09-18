package com.mai.progressdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

public class ProgressDialogMai {
    private Dialog dialog;
    private View view2;
    private int width = 0;
    private Context context;

    public ProgressDialogMai(Context context) {
        this.context = context;
        this.view2 = LayoutInflater.from(context).inflate(R.layout.progress_dialog, null);
        dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(view2);
        ViewCompat.setBackgroundTintList(view2.findViewById(R.id.layoutCorner), ContextCompat.getColorStateList(context, R.color.progress));
        width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.8);
        dialog.getWindow().setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
    public Dialog dialog() {
        return dialog;
    }

    public void setDialogWidth(Double size) {
        if(size > 0.0 && size < 1.0)
        {
            width = (int) (context.getResources().getDisplayMetrics().widthPixels * size);
            dialog.getWindow().setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT);
        }
    }
    public void setDialogWidth(int size) {
        if(size == 0)
        dialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
    public void setColorProgress(int color){
        ProgressBar p = view2.findViewById(R.id.progress);
        p.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(context,color), android.graphics.PorterDuff.Mode.SRC_ATOP);
    }

    public void setText(String str) {
        TextView t = view2.findViewById(R.id.textbar);
        t.setText(str);
    }

    public void setTextSize(int dp) {
        int twelveDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
        TextView t = view2.findViewById(R.id.textbar);
        t.setTextSize(twelveDp);
    }

    public void setTextColor(int color) {
        TextView t = view2.findViewById(R.id.textbar);
        t.setTextColor(ContextCompat.getColor(context, color));
    }

    public void setCorner(int dp) {
        float twelveDp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
        GradientDrawable shape = (GradientDrawable) view2.findViewById(R.id.layoutCorner).getBackground();
        shape.setCornerRadius(twelveDp);
    }

    public void setColorDialog(int color) {
        ViewCompat.setBackgroundTintList(view2.findViewById(R.id.layoutCorner), ContextCompat.getColorStateList(context, color));
    }
}
