package com.ss.android.ugc.aweme.commentv2.commentpage.ui;

import X.C2188811AlT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ClipFrameLayout extends FrameLayout {
    public float LL;
    public final Path LLILLJJLI;

    public ClipFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LL > 0.0f) {
            this.LLILLJJLI.reset();
            this.LLILLJJLI.addRect(this.LL + 0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
            canvas.clipPath(this.LLILLJJLI);
        }
        super.onDraw(canvas);
    }

    public final void setClipWidth(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setClipWidth ");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL = Math.abs(f);
        invalidate();
    }

    public ClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.cg7);
        }
        this.LLILLJJLI = new Path();
    }
}
