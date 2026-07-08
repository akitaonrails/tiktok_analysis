package com.bytedance.tux.drawable;

import X.AbstractC415370GQl;
import X.C01GW;
import X.C1308910kAL;
import X.C418440Gaw;
import X.C418520Gb4;
import X.C418530Gb5;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC1294060jmO;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class TuxIconDrawable extends Drawable {
    public Drawable LIZ;
    public Drawable LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public Integer LJ;
    public final boolean LJFF;
    public ColorStateList LJIIIZ;
    public final C418530Gb5 LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILJJIL;
    public Integer LJIILL;
    public CharSequence LJIILLIIL;
    public final int iconRes;
    public final C01GW LJI = C452501pT.LIZIZ(new C418520Gb4());
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIL = -1;
    public int LJIILIIL = -1;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -1;
    }

    public final void LIZ() {
        if (this.LJIILL != null) {
            this.LJIILL = null;
            Drawable drawable = this.LIZ;
            if (drawable == null) {
                return;
            }
            drawable.setColorFilter(null);
            drawable.setAlpha(255);
            invalidateSelf();
        }
    }

    public final int LIZIZ() {
        int i = this.LJIILIIL;
        return i <= 0 ? getBounds().height() : i;
    }

    public final int LIZJ() {
        int i = this.LJIIL;
        return i <= 0 ? getBounds().width() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.LJIIJ;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.LJIIIZ != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJIIIIZZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJII;
    }

    public final void LIZLLL(boolean z) {
        Drawable drawableMutate;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        this.LJIILJJIL = z;
        if (z) {
            this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            Drawable drawable = this.LIZ;
            if (drawable instanceof AbstractC415370GQl) {
                drawableMutate = (Drawable) drawable.getClass().newInstance();
            } else if (drawable != null && (constantState = drawable.getConstantState()) != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                drawableMutate = drawableNewDrawable.mutate();
            } else {
                drawableMutate = null;
            }
            this.LIZIZ = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setAlpha(30);
            }
            Drawable drawable2 = this.LIZIZ;
            if (drawable2 != null) {
                drawable2.setColorFilter(null);
            }
        } else {
            this.LIZIZ = null;
        }
        invalidateSelf();
    }

    public final void LJ(int i) {
        this.LJIILIIL = i;
        this.LJIIIIZZ = i;
        invalidateSelf();
    }

    public final void LJFF(int i) {
        this.LJIILL = Integer.valueOf(i);
        LJIIIIZZ(this.LIZ, i);
        invalidateSelf();
    }

    public final void LJII(int i) {
        this.LJIIL = i;
        this.LJII = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Xfermode xfermode;
        Drawable drawable = this.LIZ;
        if (drawable == null) {
            return;
        }
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        ColorStateList colorStateList = this.LJIIIZ;
        boolean z = false;
        if (colorStateList != null) {
            LJIIIIZZ(this.LIZ, colorStateList.getColorForState(getState(), 0));
        }
        if (this.LIZLLL && this.LJFF) {
            z = true;
            canvas.save();
            canvas.translate(iWidth, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        if (LIZJ() > 0 && LIZIZ() > 0) {
            drawable.setBounds(getBounds().left + ((iWidth - LIZJ()) / 2), getBounds().top + ((iHeight - LIZIZ()) / 2), getBounds().left + ((iWidth + LIZJ()) / 2), getBounds().top + ((iHeight + LIZIZ()) / 2));
        } else {
            drawable.setBounds(getBounds().left, getBounds().top, getBounds().left + iWidth, getBounds().top + iHeight);
        }
        if (this.LJIILJJIL) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = this.LIZIZ;
            if (drawable2 != null) {
                int i = bounds.left;
                int i2 = bounds.top;
                int i3 = this.LIZJ;
                drawable2.setBounds(i, i2 + i3, bounds.right, bounds.bottom + i3);
            }
            Drawable drawable3 = this.LIZIZ;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
        if (this.LJIIJJI) {
            xfermode = (Xfermode) this.LJI.getValue();
        } else {
            xfermode = null;
        }
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getPaint().setXfermode(xfermode);
        } else if (drawable instanceof AbstractC415370GQl) {
            AbstractC415370GQl abstractC415370GQl = (AbstractC415370GQl) drawable;
            Iterator<Paint> it2 = abstractC415370GQl.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().setXfermode(xfermode);
            }
            abstractC415370GQl.invalidateSelf();
        }
        drawable.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.LJIIIZ != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.LIZIZ;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Gb5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxIconDrawable(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            X.0Gb4 r0 = new X.0Gb4
            r0.<init>()
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r3.LJI = r0
            r0 = -1
            r3.LJII = r0
            r3.LJIIIIZZ = r0
            r3.LJIIL = r0
            r3.LJIILIIL = r0
            X.06wZ r1 = X.C1770406wY.LJI(r5)
            r2 = 0
            if (r1 == 0) goto L35
            boolean r0 = r1.LIZIZ
            r3.LIZLLL = r0
            java.lang.Integer r0 = r1.LIZJ
            r3.LJ = r0
            android.graphics.drawable.Drawable r1 = r1.LIZ
            if (r1 == 0) goto L35
        L2a:
            boolean r0 = X.C426750GoL.LIZLLL(r4)
            r3.LJFF = r0
            if (r1 != 0) goto L47
            if (r5 <= 0) goto L46
            goto L37
        L35:
            r1 = r2
            goto L2a
        L37:
            android.graphics.drawable.Drawable r0 = X.C800330VaR.LIZIZ(r4, r5)     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L46
            android.graphics.drawable.Drawable r2 = r0.mutate()     // Catch: java.lang.Exception -> L42
            goto L46
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L46:
            r1 = r2
        L47:
            r3.LIZ = r1
            r3.iconRes = r5
            X.0Gb5 r0 = new X.0Gb5
            r0.<init>(r3)
            r3.LJIIJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.drawable.TuxIconDrawable.<init>(android.content.Context, int):void");
    }

    public static void LJIIIIZZ(Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(i), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(i), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(i), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        drawable.setAlpha(Color.alpha(i));
    }

    public final void LJI(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            LJFF(numLIZJ.intValue());
        }
    }
}
