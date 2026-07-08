package com.ss.android.ugc.aweme.comment.keyboard.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class ClipLinearLayout extends LinearLayout {
    public int LL;
    public final Path LLILLJJLI;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LL > -1) {
            this.LLILLJJLI.reset();
            this.LLILLJJLI.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.LL, Path.Direction.CW);
            canvas.clipPath(this.LLILLJJLI);
        }
        super.onDraw(canvas);
    }

    public void setClipHeight(int i) {
        this.LL = i;
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.cg7);
        }
        this.LLILLJJLI = new Path();
    }
}
