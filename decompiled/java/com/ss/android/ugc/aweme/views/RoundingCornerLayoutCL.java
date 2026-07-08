package com.ss.android.ugc.aweme.views;

import X.C01GW;
import X.C0I6L;
import X.C0I6N;
import X.C0I6R;
import X.C1308910kAL;
import X.C1509305vX;
import X.C16GH;
import X.C1954807lC;
import X.C418440Gaw;
import X.C462630ICf;
import X.C814420VxA;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class RoundingCornerLayoutCL extends ConstraintLayout {
    public final C16GH LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;

    public RoundingCornerLayoutCL(Context context) {
        this(context, null, 6, 0);
    }

    public RoundingCornerLayoutCL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final Paint getBorderPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    public final float[] getCornerRadius() {
        return this.LL.LIZ;
    }

    public final boolean getHasBorder() {
        return this.LLILLJJLI;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.LL.LIZIZ);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.LLILLJJLI) {
            C16GH c16gh = this.LL;
            canvas.drawPath(c16gh.LIZIZ, getBorderPaint());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.clipPath(this.LL.LIZIZ);
        super.onDraw(canvas);
    }

    public final void setBorder(C0I6N c0i6n) {
        int iIntValue = 0;
        if (Intrinsics.LJFF(c0i6n, C0I6R.LIZ)) {
            this.LLILLJJLI = false;
        } else if (c0i6n instanceof C0I6L) {
            this.LLILLJJLI = true;
            getBorderPaint().setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(r5.LIZ))));
            Paint borderPaint = getBorderPaint();
            Integer numLIZJ = C1308910kAL.LIZJ(((C0I6L) c0i6n).LIZIZ, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            borderPaint.setColor(iIntValue);
        } else {
            throw new C1954807lC();
        }
        invalidate();
    }

    public final void setCornerRadius(float[] fArr) {
        this.LL.LIZ = fArr;
    }

    public final void setHasBorder(boolean z) {
        this.LLILLJJLI = z;
    }

    public void setRoundingParams(C462630ICf c462630ICf) {
        this.LL.LIZ(c462630ICf, getWidth(), getHeight());
        invalidate();
    }

    public RoundingCornerLayoutCL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C16GH();
        this.LLILLL = C1509305vX.LIZ(AFwS221S0000000_31.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    public /* synthetic */ RoundingCornerLayoutCL(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.LIZIZ(getWidth(), getHeight());
        invalidate();
    }
}
