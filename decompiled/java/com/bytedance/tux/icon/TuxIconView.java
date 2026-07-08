package com.bytedance.tux.icon;

import X.C20597815iq;
import X.C419910GdJ;
import X.InterfaceC420530GeJ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class TuxIconView extends AppCompatImageView {
    public TuxIconDrawable LL;
    public InterfaceC420530GeJ LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public TuxIconView(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
    }

    public TuxIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getScreenAntiBurnEnabled() {
        return false;
    }

    public final void LIZ() {
        this.LL.LIZ();
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        InterfaceC420530GeJ interfaceC420530GeJ = this.LLILLJJLI;
        if (interfaceC420530GeJ != null) {
            interfaceC420530GeJ.LIZLLL();
        }
        return viewPropertyAnimatorAnimate;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZJ(boolean z) {
        this.LL.LIZLLL(z);
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

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        InterfaceC420530GeJ interfaceC420530GeJ = this.LLILLJJLI;
        if (interfaceC420530GeJ != null) {
            interfaceC420530GeJ.LIZJ(f);
        }
    }

    public final void setIconHeight(int i) {
        this.LL.LJ(i);
        requestLayout();
    }

    public final void setIconRes(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        TuxIconDrawable tuxIconDrawable = this.LL;
        c419910GdJ.LIZLLL = tuxIconDrawable.LJIILL;
        c419910GdJ.LIZIZ = tuxIconDrawable.getIntrinsicWidth();
        c419910GdJ.LIZJ = this.LL.getIntrinsicHeight();
        TuxIconDrawable tuxIconDrawable2 = this.LL;
        c419910GdJ.LJFF = tuxIconDrawable2.LJIILJJIL;
        c419910GdJ.LJI = tuxIconDrawable2.LJIILLIIL;
        setTuxIcon(c419910GdJ);
    }

    public final void setIconWidth(int i) {
        this.LL.LJII(i);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof TuxIconDrawable) {
            TuxIconDrawable tuxIconDrawable = (TuxIconDrawable) drawable;
            this.LL = tuxIconDrawable;
            CharSequence string = tuxIconDrawable.LJIILLIIL;
            if (string == null) {
                Integer num = tuxIconDrawable.LJ;
                if (num != null) {
                    string = getContext().getResources().getString(num.intValue());
                } else {
                    string = null;
                }
            }
            setContentDescription(string);
        }
    }

    public final void setLabel(CharSequence charSequence) {
        this.LL.LJIILLIIL = charSequence;
        setContentDescription(charSequence);
    }

    public final void setTintColor(int i) {
        this.LL.LJFF(i);
    }

    public final void setTintColorRes(int i) {
        this.LL.LJI(i, getContext());
    }

    public final void setTintColorStateList$tux_theme_release(ColorStateList colorStateList) {
        TuxIconDrawable tuxIconDrawable = this.LL;
        tuxIconDrawable.LJIIIZ = colorStateList;
        tuxIconDrawable.invalidateSelf();
    }

    public final void setTuxIcon(C419910GdJ c419910GdJ) {
        if (c419910GdJ == null) {
            setImageDrawable(null);
            return;
        }
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        setImageDrawable(tuxIconDrawableLIZ);
        this.LL = tuxIconDrawableLIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        InterfaceC420530GeJ interfaceC420530GeJ = this.LLILLJJLI;
        if (interfaceC420530GeJ != null) {
            interfaceC420530GeJ.LJ(i);
        }
    }

    public final void setVisibilityListener(InterfaceC420530GeJ interfaceC420530GeJ) {
        this.LLILLJJLI = interfaceC420530GeJ;
    }

    public TuxIconView(Context context, AttributeSet attributeSet, int i) {
        Integer numValueOf;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxIconView, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxIconView_tux_icon, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxIconView_tux_tintColor)) {
            numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxIconView_tux_tintColor, 0));
        } else {
            numValueOf = null;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxIconView_tux_iconWidth, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxIconView_tux_iconHeight, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxIconView_tux_iconShadow, false);
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = numValueOf;
        c419910GdJ.LIZIZ = dimensionPixelSize;
        c419910GdJ.LIZJ = dimensionPixelSize2;
        c419910GdJ.LJFF = z;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        this.LL = tuxIconDrawableLIZ;
        setImageDrawable(tuxIconDrawableLIZ);
    }

    public /* synthetic */ TuxIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.y2 : i);
    }
}
