package com.ss.android.ugc.aweme.views;

import X.C12ES;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class TransEdgeView extends FrameLayout {
    public final int[] LL;
    public final float[] LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final Paint LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setDrawSize(float f) {
        this.LLILLL = f;
        invalidate();
    }

    public TransEdgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new int[]{-1, 0};
        this.LLILLJJLI = new float[]{0.0f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TransEdgeView);
        this.LLILZLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TransEdgeView_edge_position, 0);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            if ((this.LLILZLL & 16) != 0) {
                this.LLILZLL = 4;
            }
            if ((this.LLILZLL & 32) != 0) {
                this.LLILZLL = 16;
            }
        } else {
            if ((this.LLILZLL & 16) != 0) {
                this.LLILZLL = 8;
            }
            if ((this.LLILZLL & 32) != 0) {
                this.LLILZLL = 4;
            }
        }
        this.LLILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.TransEdgeView_edge_width, C12ES.LIZJ(20.0f, getContext()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LLIZ = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.LLILZLL;
        if (i == 0 || (i & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, this.LLILZ, this.LLILLL, this.LLIZ);
        }
        int i2 = this.LLILZLL;
        if (i2 == 0 || (i2 & 2) != 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.LLILZ / 2, this.LLILZIL / 2);
            canvas.drawRect(0.0f, -3.0f, this.LLILZ, this.LLILLL, this.LLIZ);
            canvas.restoreToCount(iSave);
        }
        int i3 = (this.LLILZIL - this.LLILZ) / 2;
        int i4 = this.LLILZLL;
        if (i4 == 0 || (i4 & 4) != 0) {
            int iSave2 = canvas.save();
            canvas.rotate(90.0f, this.LLILZ / 2, this.LLILZIL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LLILZ + i3, this.LLILLL, this.LLIZ);
            canvas.restoreToCount(iSave2);
        }
        int i5 = this.LLILZLL;
        if (i5 == 0 || (i5 & 8) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(270.0f, this.LLILZ / 2, this.LLILZIL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LLILZ + i3, this.LLILLL, this.LLIZ);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILLL, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
        this.LLILZ = getWidth();
        this.LLILZIL = getHeight();
    }
}
