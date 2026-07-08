package com.ss.android.ugc.aweme.story.feed.immersive.abroll;

import X.C1308910kAL;
import X.C1619980sG4;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444890HcV;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ALAdapterS3S0100000_6;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryAbRollProgressButton extends View {
    public final Context LL;
    public final RectF LLILLJJLI;
    public final Rect LLILLL;
    public final C444890HcV LLILZ;
    public final PorterDuffXfermode LLILZIL;
    public float LLILZLL;
    public ValueAnimator LLIZ;
    public ValueAnimator LLIZLLLIL;
    public ObjectAnimator LLJ;
    public ObjectAnimator LLJI;
    public ObjectAnimator LLJIJIL;
    public ObjectAnimator LLJILJIL;
    public ObjectAnimator LLJILJILJ;
    public ObjectAnimator LLJILLL;
    public boolean LLJJ;

    public StoryAbRollProgressButton() {
        throw null;
    }

    public final void LIZLLL() {
        this.LLJJ = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<StoryAbRollProgressButton, Float>) View.SCALE_X, 1.0f, 1.1f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 15));
        this.LLJIJIL = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<StoryAbRollProgressButton, Float>) View.SCALE_X, 1.1f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.addListener(new ALAdapterS3S0100000_6(this, 16));
        this.LLJILJILJ = objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, (Property<StoryAbRollProgressButton, Float>) View.SCALE_Y, 1.0f, 1.1f);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat3.setDuration(1000L);
        this.LLJILJIL = objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<StoryAbRollProgressButton, Float>) View.SCALE_Y, 1.1f, 1.0f);
        objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
        objectAnimatorOfFloat4.setDuration(1000L);
        this.LLJILLL = objectAnimatorOfFloat4;
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null) {
            C786410Ut5.Pd(objectAnimator);
        }
        ObjectAnimator objectAnimator2 = this.LLJILJIL;
        if (objectAnimator2 != null) {
            C786410Ut5.Pd(objectAnimator2);
        }
    }

    private final Drawable getIcon() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_ab_roll_fill;
        return c419910GdJ.LIZ(this.LL);
    }

    public final void LIZ() {
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.LLJILJIL;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        ObjectAnimator objectAnimator3 = this.LLJILJILJ;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllListeners();
        }
        ObjectAnimator objectAnimator4 = this.LLJILLL;
        if (objectAnimator4 != null) {
            objectAnimator4.removeAllListeners();
        }
        ObjectAnimator objectAnimator5 = this.LLJIJIL;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        ObjectAnimator objectAnimator6 = this.LLJILJIL;
        if (objectAnimator6 != null) {
            objectAnimator6.cancel();
        }
        ObjectAnimator objectAnimator7 = this.LLJILJILJ;
        if (objectAnimator7 != null) {
            objectAnimator7.cancel();
        }
        ObjectAnimator objectAnimator8 = this.LLJILLL;
        if (objectAnimator8 != null) {
            objectAnimator8.cancel();
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(1.0f);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat.setDuration(300L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            LIZJ(0.8f, 1.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat2.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        LIZJ(0.85f, 0.8f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        boolean z;
        super.onDraw(canvas);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, this.LL);
        if (numLIZJ != null) {
            this.LLILZ.setColor(numLIZJ.intValue());
        }
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float measuredWidth = (getMeasuredWidth() * this.LLILZLL) / 100.0f;
        if (measuredWidth < getMeasuredHeight()) {
            int measuredHeight3 = getMeasuredHeight() / 2;
            float f = measuredHeight3 * measuredHeight3;
            float f2 = 2;
            float f3 = measuredHeight3 - (measuredWidth / f2);
            measuredHeight = ((float) Math.sqrt(f - (f3 * f3))) * f2;
        } else {
            measuredHeight = getMeasuredHeight();
        }
        float f4 = 2;
        this.LLILLJJLI.set(0.0f, (getMeasuredHeight() - measuredHeight) / f4, measuredWidth, (getMeasuredHeight() + measuredHeight) / f4);
        canvas.drawRoundRect(this.LLILLJJLI, measuredHeight2, measuredHeight2, this.LLILZ);
        if (this.LLILZLL == 100.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, this.LL);
            if (numLIZJ2 != null) {
                this.LLILZ.setColor(numLIZJ2.intValue());
            }
        } else {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.z_, this.LL);
            if (numLIZJ3 != null) {
                this.LLILZ.setColor(numLIZJ3.intValue());
            }
        }
        String string = this.LL.getString(2131834721);
        this.LLILZ.getTextBounds(string, 0, string.length(), this.LLILLL);
        Drawable icon = getIcon();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingStart = getPaddingStart() + (width / 2);
        float intrinsicWidth = icon.getIntrinsicWidth();
        float fCenterX = this.LLILLL.centerX();
        float fLIZIZ = paddingStart - (((((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(r1))) + intrinsicWidth) + (fCenterX * f4)) / f4) - intrinsicWidth) - C418440Gaw.LIZIZ(4));
        float paddingTop = (getPaddingTop() + (height / 2)) - this.LLILLL.centerY();
        canvas.drawText(string, fLIZIZ, paddingTop, this.LLILZ);
        float intrinsicWidth2 = icon.getIntrinsicWidth();
        float paddingStart2 = ((getPaddingStart() + r15) - icon.getIntrinsicWidth()) - ((((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(C418440Gaw.LIZIZ(4)))) + intrinsicWidth2) + (this.LLILLL.centerX() * f4)) / f4) - intrinsicWidth2);
        float paddingTop2 = (getPaddingTop() + r14) - (icon.getIntrinsicHeight() / 2.0f);
        int i = (int) paddingStart2;
        int i2 = (int) paddingTop2;
        icon.setBounds(i, i2, (int) (icon.getIntrinsicWidth() + paddingStart2), (int) (icon.getIntrinsicHeight() + paddingTop2));
        icon.draw(canvas);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        icon.setBounds(i, i2, (int) (paddingStart2 + icon.getIntrinsicWidth()), (int) (paddingTop2 + icon.getIntrinsicHeight()));
        icon.draw(canvas2);
        canvas2.drawText(string, fLIZIZ, paddingTop, this.LLILZ);
        this.LLILZ.setXfermode(this.LLILZIL);
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a0p, this.LL);
        if (numLIZJ4 != null) {
            this.LLILZ.setColor(numLIZJ4.intValue());
        }
        canvas2.drawRect(new RectF(0.0f, 0.0f, (getWidth() * this.LLILZLL) / 100, getHeight()), this.LLILZ);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        this.LLILZ.setXfermode(null);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
        }
    }

    public final void setProgress(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public StoryAbRollProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLJJLI = new RectF();
        this.LLILLL = new Rect();
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZ = c444890HcV;
        this.LLILZIL = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.LLILZLL = 100.0f;
        setBackground(context.getDrawable(R.drawable.d_5));
        c444890HcV.setDither(true);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setStyle(Paint.Style.FILL_AND_STROKE);
        c444890HcV.setTextAlign(Paint.Align.LEFT);
        c444890HcV.setTypeface(Typeface.MONOSPACE);
        c444890HcV.LIZ(102);
        setProgress(100.0f);
    }

    public final void LIZJ(float f, float f2) {
        ObjectAnimator objectAnimator = this.LLJ;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        ObjectAnimator objectAnimator2 = this.LLJI;
        if (objectAnimator2 != null) {
            objectAnimator2.pause();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", f, f2);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLJ = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", f, f2);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat2.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        this.LLJI = objectAnimatorOfFloat2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        Drawable icon = getIcon();
        int paddingStart = getPaddingStart() + getPaddingEnd() + icon.getIntrinsicWidth();
        int paddingTop = getPaddingTop() + getPaddingBottom() + icon.getIntrinsicHeight();
        String string = this.LL.getString(2131834721);
        Rect rect = new Rect();
        this.LLILZ.getTextBounds(string, 0, string.length(), rect);
        int iWidth = paddingStart + rect.width() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        if (getLayoutParams().width != -2) {
            iWidth = View.MeasureSpec.getSize(i);
        }
        if (getLayoutParams().height == -2) {
            size = Math.max(paddingTop, getPaddingTop() + getPaddingBottom() + rect.height());
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(iWidth, size);
    }
}
