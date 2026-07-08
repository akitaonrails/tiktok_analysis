package com.bytedance.tux.status.loading;

import X.C0GXS;
import X.C0GXT;
import X.C20597815iq;
import X.C2188811AlT;
import Y.AUListenerS256S0100000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TuxSpinner extends AppCompatImageView {
    public C0GXS LL;
    public final C0GXT LLILLJJLI;

    public TuxSpinner(Context context) {
        this(context, null, 6, 0);
    }

    public TuxSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() != 0 || Looper.myLooper() == null) {
            return;
        }
        C0GXT c0gxt = this.LLILLJJLI;
        if (c0gxt.LIZ) {
            return;
        }
        c0gxt.LIZ = true;
        c0gxt.LIZIZ.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Looper.myLooper() != null) {
            C0GXT c0gxt = this.LLILLJJLI;
            if (c0gxt.LIZ) {
                c0gxt.LIZ = false;
                c0gxt.LIZIZ.cancel();
            }
        }
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getVisibility() == 0) {
            if (Looper.myLooper() != null) {
                C0GXT c0gxt = this.LLILLJJLI;
                if (!c0gxt.LIZ) {
                    c0gxt.LIZ = true;
                    c0gxt.LIZIZ.start();
                    return;
                }
                return;
            }
            return;
        }
        if (Looper.myLooper() == null) {
            return;
        }
        C0GXT c0gxt2 = this.LLILLJJLI;
        if (!c0gxt2.LIZ) {
            return;
        }
        c0gxt2.LIZ = false;
        c0gxt2.LIZIZ.cancel();
    }

    public final void LIZ(int i, int i2) {
        C0GXS c0gxs = new C0GXS(getContext(), i);
        this.LL = c0gxs;
        c0gxs.LJFF(i2);
        setImageDrawable(this.LL);
    }

    public TuxSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSpinner, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSpinner_tux_icon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSpinner_tux_tintColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0GXS c0gxs = new C0GXS(context, resourceId);
        this.LL = c0gxs;
        c0gxs.LJFF(color);
        setImageDrawable(this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("spinner#");
        sbLIZ.append(context);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = new C0GXT(AFwS192S0000000_6.get$arr$(24), new AUListenerS256S0100000_6(this, 15));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TuxSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.yt;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }
}
