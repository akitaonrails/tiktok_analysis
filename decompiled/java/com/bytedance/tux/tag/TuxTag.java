package com.bytedance.tux.tag;

import X.C1308910kAL;
import X.C197036127e;
import X.C197037127f;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C814420VxA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class TuxTag extends TuxTextView {
    public final boolean LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public final int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final RectF LLJLL;
    public boolean LLJLLIL;
    public final C197036127e LLJLLL;

    public TuxTag(Context context) {
        this(context, null, 6);
    }

    public TuxTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJJJJJ() {
        TuxIconDrawable tuxIconDrawable;
        TuxIconDrawable tuxIconDrawable2;
        if (this.LLJJJJ && this.LLJLILLLLZIIL) {
            int i = TextUtils.isEmpty(getText()) ? 0 : this.LLJLIL;
            C197036127e c197036127e = this.LLJLLL;
            boolean z = this.LLJLLIL;
            Drawable drawable = c197036127e.LJI;
            if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable2 = (TuxIconDrawable) drawable) != null) {
                tuxIconDrawable2.LJIIJJI = z;
                tuxIconDrawable2.invalidateSelf();
            }
            Drawable drawable2 = c197036127e.LJII;
            if ((drawable2 instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable2) != null) {
                tuxIconDrawable.LJIIJJI = z;
                tuxIconDrawable.invalidateSelf();
            }
            this.LLJLLL.LIZJ(i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLJLLIL) {
            this.LLJLL.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayer(this.LLJLL, null);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setHollow(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        this.LLJLLIL = z;
        TextPaint paint = getPaint();
        if (z) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        } else {
            porterDuffXfermode = null;
        }
        paint.setXfermode(porterDuffXfermode);
        LJJJJJ();
    }

    public void setIconHeight(int i) {
        this.LLJLLL.LIZIZ = i;
        LJJJJJ();
    }

    public void setIconTintColor(int i) {
        this.LLJLLL.LIZLLL = Integer.valueOf(i);
        LJJJJJ();
    }

    public void setIconTintColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            setIconTintColor(numLIZJ.intValue());
        }
    }

    public void setIconWidth(int i) {
        this.LLJLLL.LIZJ = i;
        LJJJJJ();
    }

    public final void setTagBackgroundColor(int i) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    public final void setTagIcon(Integer num) {
        C197036127e c197036127e = this.LLJLLL;
        c197036127e.LJI = c197036127e.LIZIZ(num);
        LJJJJJ();
    }

    public final void setTagIconBitmap(Bitmap bitmap) {
        C197036127e c197036127e = this.LLJLLL;
        Context context = getContext();
        c197036127e.getClass();
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, -1);
        tuxIconDrawable.LIZ = new BitmapDrawable(context.getResources(), bitmap);
        c197036127e.LJI = tuxIconDrawable;
        LJJJJJ();
    }

    public final void setTagSize(int i) {
        C197037127f c197037127f;
        this.LLJL = i;
        setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160)));
        setTextColorRes(R.attr.zi);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        setBackground(c384050F3z.LIZ(getContext()));
        C427690Gpr.LJ(this, C418440Gaw.LIZIZ(4));
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        c197037127f = new C197037127f(19, 5, 2, 62, 16);
                    }
                } else {
                    c197037127f = new C197037127f(17, 5, 2, 72, 12);
                }
            } else {
                c197037127f = new C197037127f(15, 5, 2, 72, 12);
            }
        } else {
            c197037127f = new C197037127f(13, 4, 0, 92, 0);
        }
        setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197037127f.LIZ))));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197037127f.LIZIZ)));
        setPadding(iLIZIZ, 0, iLIZIZ, 0);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197037127f.LIZJ)));
        this.LLJLIL = iLIZIZ2;
        if (iLIZIZ2 <= 0) {
            z = false;
        }
        this.LLJLILLLLZIIL = z;
        LJJJJJ();
        setTuxFont(c197037127f.LIZLLL);
        int i2 = c197037127f.LJ;
        if (i2 > 0) {
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            setIconTintColorRes(R.attr.zi);
            setIconHeight(iLIZIZ3);
            setIconWidth(iLIZIZ3);
        }
    }

    public final void setTagTextColor(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        setTextColor(i);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        LJJJJJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TuxTag(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z0;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLJJJJLIIL = Integer.MAX_VALUE;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = new RectF();
        this.LLJJJJ = true;
        C197036127e c197036127e = new C197036127e(this);
        this.LLJLLL = c197036127e;
        c197036127e.LIZ(attributeSet, i2);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTag, i2, 0);
            this.LLJL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTag_tux_tagSize, -1);
            this.LLJJL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTag_tux_backgroundColor, -7829368);
            setHollow(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTag_tux_tagIsHollow, false));
            this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTag_tux_tagTextColor, -1);
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTag_tux_tagIconColor, -1);
            typedArrayObtainStyledAttributes.recycle();
            c197036127e.LIZLLL = Integer.valueOf(color);
        }
        setTagSize(this.LLJL);
        this.LLJJJJJIL = getMinWidth();
        this.LLJJJJLIIL = getMaxWidth();
        setGravity(19);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
        int i3 = this.LLJLIL;
        setCompoundDrawablePadding(i3 <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : i3);
        setTextColor(this.LLJJLIIIJLLLLLLLZ);
        setTagBackgroundColor(this.LLJJL);
        LJJJJJ();
        int i4 = this.LLJJJJLIIL;
        if (i4 < Integer.MAX_VALUE) {
            setMaxWidth(i4);
        }
        int i5 = this.LLJJJJJIL;
        if (i5 > 0) {
            setMinWidth(i5);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJJJJ();
    }
}
