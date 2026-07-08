package com.ss.android.ugc.aweme.social.thought.view;

import X.C19358410oQ;
import X.C1954807lC;
import X.C21568019aw;
import X.C21568219ay;
import X.C21568319az;
import X.C814420VxA;
import X.EnumC1321550kUj;
import X.EnumC19358310oP;
import X.EnumC21568119ax;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes34.dex */
public class SocialThoughtBaseBubbleBackgroundView extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public EnumC21568119ax LLILLL;
    public final Path LLILZ;
    public final Path LLILZIL;
    public final Matrix LLILZLL;
    public final RectF LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public EnumC19358310oP LLJI;
    public float LLJIJIL;
    public int[] LLJILJIL;

    public SocialThoughtBaseBubbleBackgroundView(Context context) {
        this(context, null, 6, 0);
    }

    public SocialThoughtBaseBubbleBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public void LIZLLL(Path path, RectF rectF) {
    }

    public boolean LJFF(View view) {
        return false;
    }

    public void LJI(int i, int i2) {
    }

    public void LJII() {
    }

    public float getExtraInsetRight() {
        return 0.0f;
    }

    public float getExtraInsetTop() {
        return 0.0f;
    }

    public float getExtraOverflowTop() {
        return 0.0f;
    }

    public final void LIZIZ() {
        EnumC21568119ax enumC21568119ax = this.LLILLL;
        float density = getDensity();
        float f = 255;
        this.LL.setShadowLayer(enumC21568119ax.getShadowRadius() * density, enumC21568119ax.getShadowOffsetX() * density, enumC21568119ax.getShadowOffsetY() * density, Color.argb((int) (enumC21568119ax.getShadowOpacity() * f), 0, 0, 0));
        this.LLILLJJLI.setStrokeWidth(enumC21568119ax.getBorderWidth() * density);
        this.LLILLJJLI.setColor(-16777216);
        this.LLILLJJLI.setAlpha((int) (enumC21568119ax.getBorderOpacity() * f));
    }

    public final float getEffectiveInsetTop() {
        return Math.max(this.LLILLL.getContentInsetTop(), getExtraInsetTop());
    }

    public final int getFillColor() {
        return this.LL.getColor();
    }

    public final int getShadowOutsetBottomPx() {
        if (this.LLJ) {
            return C814420VxA.LIZIZ(this.LLILLL.getShadowOutsetBottomDp() * getDensity());
        }
        return 0;
    }

    public final int getShadowOutsetLeftPx() {
        if (this.LLJ) {
            return C814420VxA.LIZIZ(this.LLILLL.getShadowOutsetLeftDp() * getDensity());
        }
        return 0;
    }

    public final int getShadowOutsetRightPx() {
        if (this.LLJ) {
            return C814420VxA.LIZIZ(this.LLILLL.getShadowOutsetRightDp() * getDensity());
        }
        return 0;
    }

    public final int getShadowOutsetTopPx() {
        if (this.LLJ) {
            return C814420VxA.LIZIZ(this.LLILLL.getShadowOutsetTopDp() * getDensity());
        }
        return 0;
    }

    public final void LIZ() {
        float shadowOutsetLeftPx = getShadowOutsetLeftPx();
        float shadowOutsetTopPx = getShadowOutsetTopPx();
        float shadowOutsetRightPx = getShadowOutsetRightPx();
        float shadowOutsetBottomPx = getShadowOutsetBottomPx();
        float extraOverflowTop = getExtraOverflowTop() * getDensity();
        float f = getLayoutDirection() == 1 ? shadowOutsetRightPx : -shadowOutsetLeftPx;
        if (getLayoutDirection() == 1) {
            shadowOutsetRightPx = -shadowOutsetLeftPx;
        }
        int i = C19358410oQ.LIZ[this.LLJI.ordinal()];
        if (i == 1) {
            float translationY = (getTranslationY() + this.LLIZLLLIL) - extraOverflowTop;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(translationY);
            this.LLIZLLLIL = extraOverflowTop;
            return;
        }
        if (i == 2) {
            this.LLIZLLLIL = 0.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY((-shadowOutsetTopPx) - extraOverflowTop);
            return;
        }
        if (i == 3) {
            this.LLIZLLLIL = 0.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(shadowOutsetBottomPx - extraOverflowTop);
            return;
        }
        if (i == 4) {
            this.LLIZLLLIL = 0.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(shadowOutsetRightPx);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY((-shadowOutsetTopPx) - extraOverflowTop);
            return;
        }
        if (i != 5) {
            throw new C1954807lC();
        }
        this.LLIZLLLIL = 0.0f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationX(shadowOutsetRightPx);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(shadowOutsetBottomPx - extraOverflowTop);
    }

    public final void LIZJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        if (!this.LLJ) {
            setReserveShadowOutset(true);
        }
        int[] iArr = this.LLJILJIL;
        if (iArr != null) {
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + iArr[0]);
            marginLayoutParams.topMargin += iArr[1];
            marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() + iArr[2]);
            marginLayoutParams.bottomMargin += iArr[3];
        }
        int shadowOutsetLeftPx = getShadowOutsetLeftPx();
        int shadowOutsetTopPx = getShadowOutsetTopPx();
        int shadowOutsetRightPx = getShadowOutsetRightPx();
        int shadowOutsetBottomPx = getShadowOutsetBottomPx();
        marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() - shadowOutsetLeftPx);
        marginLayoutParams.topMargin -= shadowOutsetTopPx;
        marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() - shadowOutsetRightPx);
        marginLayoutParams.bottomMargin -= shadowOutsetBottomPx;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        this.LLJILJIL = new int[]{shadowOutsetLeftPx, shadowOutsetTopPx, shadowOutsetRightPx, shadowOutsetBottomPx};
    }

    public final View LJ() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!LJFF(childAt) && childAt.getVisibility() != 8) {
                return childAt;
            }
        }
        return null;
    }

    public final float getBodyContentInsetLeftDp() {
        boolean z = getLayoutDirection() == 1;
        EnumC21568119ax enumC21568119ax = this.LLILLL;
        return z ? enumC21568119ax.getContentInsetRight() : enumC21568119ax.getContentInsetLeft();
    }

    public final float getBodyContentInsetRightDp() {
        return Math.max(getLayoutDirection() == 1 ? this.LLILLL.getContentInsetLeft() : this.LLILLL.getContentInsetRight(), getExtraInsetRight());
    }

    public final float getDensity() {
        return getResources().getDisplayMetrics().density;
    }

    public final float getBodyMinWidthOverrideDp() {
        return this.LLJIJIL;
    }

    public final RectF getBodyRectDp() {
        return this.LLIZ;
    }

    public final EnumC19358310oP getBubbleAnchor() {
        return this.LLJI;
    }

    public final EnumC21568119ax getBubbleShape() {
        return this.LLILLL;
    }

    public final boolean getReserveShadowOutset() {
        return this.LLJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.LLILZ, this.LL);
        if (this.LLILLJJLI.getAlpha() > 0) {
            canvas.drawPath(this.LLILZ, this.LLILLJJLI);
        }
        canvas.drawPath(this.LLILZIL, this.LL);
        if (this.LLILLJJLI.getAlpha() > 0) {
            canvas.drawPath(this.LLILZIL, this.LLILLJJLI);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
        invalidate();
        LIZ();
    }

    public final void setBodyMinWidthOverrideDp(float f) {
        if (this.LLJIJIL == f) {
            return;
        }
        this.LLJIJIL = f;
        requestLayout();
        invalidate();
    }

    public final void setBubbleAnchor(EnumC19358310oP enumC19358310oP) {
        if (this.LLJI == enumC19358310oP) {
            return;
        }
        this.LLJI = enumC19358310oP;
        if (enumC19358310oP != EnumC19358310oP.NONE) {
            setReserveShadowOutset(true);
        }
        LIZ();
    }

    public final void setBubbleShape(EnumC21568119ax enumC21568119ax) {
        if (this.LLILLL == enumC21568119ax) {
            return;
        }
        this.LLILLL = enumC21568119ax;
        LIZIZ();
        requestLayout();
        invalidate();
        LIZ();
        if (this.LLJILJIL != null) {
            LIZJ();
        }
    }

    public final void setFillColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setReserveShadowOutset(boolean z) {
        if (this.LLJ == z) {
            return;
        }
        this.LLJ = z;
        requestLayout();
        invalidate();
        LIZ();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int iLIZIZ;
        float density = getDensity();
        LJII();
        View viewLJ = LJ();
        if (viewLJ == null) {
            super.onMeasure(i, i2);
            return;
        }
        EnumC21568119ax enumC21568119ax = this.LLILLL;
        int iLIZIZ2 = C814420VxA.LIZIZ(getBodyContentInsetLeftDp() * density);
        int iLIZIZ3 = C814420VxA.LIZIZ(getEffectiveInsetTop() * density);
        int iLIZIZ4 = iLIZIZ2 + C814420VxA.LIZIZ(getBodyContentInsetRightDp() * density);
        int iLIZIZ5 = iLIZIZ3 + C814420VxA.LIZIZ(enumC21568119ax.getContentInsetBottom() * density);
        int shadowOutsetLeftPx = getShadowOutsetLeftPx();
        int shadowOutsetTopPx = getShadowOutsetTopPx();
        int shadowOutsetRightPx = shadowOutsetLeftPx + getShadowOutsetRightPx();
        int shadowOutsetBottomPx = shadowOutsetTopPx + getShadowOutsetBottomPx();
        if (View.MeasureSpec.getMode(i) != 0) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = Integer.MAX_VALUE;
        }
        viewLJ.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - iLIZIZ4) - shadowOutsetRightPx), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f = this.LLJIJIL;
        if (f >= 0.0f) {
            iLIZIZ = C814420VxA.LIZIZ((f + getBodyContentInsetLeftDp() + getBodyContentInsetRightDp()) * density);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(enumC21568119ax.getMinWidth() * density);
        }
        int iMax = Math.max(viewLJ.getMeasuredWidth() + iLIZIZ4, iLIZIZ) + shadowOutsetRightPx;
        int iLIZIZ6 = C814420VxA.LIZIZ(getExtraOverflowTop() * density);
        int measuredHeight = viewLJ.getMeasuredHeight() + iLIZIZ5 + shadowOutsetBottomPx + iLIZIZ6;
        int iResolveSize = FrameLayout.resolveSize(iMax, i);
        int iResolveSize2 = FrameLayout.resolveSize(measuredHeight, i2);
        viewLJ.measure(View.MeasureSpec.makeMeasureSpec((iResolveSize - iLIZIZ4) - shadowOutsetRightPx, 1073741824), View.MeasureSpec.makeMeasureSpec(((iResolveSize2 - iLIZIZ5) - shadowOutsetBottomPx) - iLIZIZ6, 1073741824));
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    public SocialThoughtBaseBubbleBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI = paint2;
        this.LLILLL = EnumC21568119ax.BOTTOM_LEFT_SMALL;
        this.LLILZ = new Path();
        this.LLILZIL = new Path();
        this.LLILZLL = new Matrix();
        this.LLIZ = new RectF();
        setWillNotDraw(false);
        setLayerType(1, null);
        setClipChildren(false);
        setClipToPadding(false);
        LIZIZ();
        this.LLJI = EnumC19358310oP.NONE;
        this.LLJIJIL = -1.0f;
    }

    public /* synthetic */ SocialThoughtBaseBubbleBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Path path;
        Path pathLIZLLL;
        float density = getDensity();
        int iLIZIZ = C814420VxA.LIZIZ(getExtraOverflowTop() * density);
        View viewLJ = LJ();
        if (viewLJ != null) {
            int iLIZIZ2 = C814420VxA.LIZIZ(getBodyContentInsetLeftDp() * density) + getShadowOutsetLeftPx();
            int iLIZIZ3 = C814420VxA.LIZIZ(getEffectiveInsetTop() * density) + getShadowOutsetTopPx() + iLIZIZ;
            viewLJ.layout(iLIZIZ2, iLIZIZ3, viewLJ.getMeasuredWidth() + iLIZIZ2, viewLJ.getMeasuredHeight() + iLIZIZ3);
        }
        LJI(i, i3);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.LLILZ.reset();
        this.LLILZIL.reset();
        if (i5 > 0 && i6 > 0) {
            float density2 = getDensity();
            EnumC21568119ax enumC21568119ax = this.LLILLL;
            this.LLIZ.set(getBodyContentInsetLeftDp() + (getShadowOutsetLeftPx() / density2), getEffectiveInsetTop() + (getShadowOutsetTopPx() / density2) + getExtraOverflowTop(), ((i5 / density2) - getBodyContentInsetRightDp()) - (getShadowOutsetRightPx() / density2), ((i6 / density2) - enumC21568119ax.getContentInsetBottom()) - (getShadowOutsetBottomPx() / density2));
            boolean z2 = true;
            if (getLayoutDirection() != 1) {
                z2 = false;
            }
            RectF rectF = this.LLIZ;
            int[] iArr = C21568219ay.LIZ;
            switch (iArr[enumC21568119ax.ordinal()]) {
                case 1:
                    path = new Path();
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.right;
                    float f4 = rectF.bottom;
                    float f5 = f + 72.792f;
                    float f6 = f2 - 5.542f;
                    path.moveTo(f5, f6);
                    path.cubicTo(f + 76.599f, f2 - 6.633f, f + 80.226f, f2 - 5.707f, f + 80.894f, f2 - 3.475f);
                    path.cubicTo(f + 81.231f, f2 - 2.346f, f + 80.746f, f2 - 1.098f, f + 79.692f, f2);
                    path.lineTo(f3 - 38.4f, f2);
                    EnumC1321550kUj enumC1321550kUj = EnumC1321550kUj.LLILLJJLI;
                    C21568319az[] c21568319azArr = C21568019aw.LIZ;
                    C21568019aw.LIZ(path, f3, f2, enumC1321550kUj, c21568319azArr);
                    path.lineTo(f3, f4 - 38.4f);
                    C21568019aw.LIZ(path, f3, f4, EnumC1321550kUj.LLILLL, c21568319azArr);
                    path.lineTo(f + 38.4f, f4);
                    C21568019aw.LIZ(path, f, f4, EnumC1321550kUj.LLILZ, c21568319azArr);
                    path.lineTo(f, 38.4f + f2);
                    C21568019aw.LIZ(path, f, f2, EnumC1321550kUj.LL, c21568319azArr);
                    path.lineTo(67.015f + f, f2);
                    path.cubicTo(f + 66.804f, f2 - 2.127f, f + 69.251f, f2 - 4.528f, f5, f6);
                    path.close();
                    break;
                case 2:
                    path = C21568019aw.LIZJ(rectF);
                    break;
                case 3:
                    path = C21568019aw.LJ(rectF);
                    break;
                case 4:
                    path = C21568019aw.LJ(rectF);
                    path.transform(C21568019aw.LIZIZ(rectF));
                    break;
                case 5:
                    if (rectF.height() >= 44.0f) {
                        path = new Path();
                        float f7 = rectF.left;
                        float f8 = rectF.top;
                        float f9 = rectF.right;
                        float f10 = rectF.bottom;
                        float f11 = f9 - 22.0f;
                        path.moveTo(f11, f8);
                        EnumC1321550kUj enumC1321550kUj2 = EnumC1321550kUj.LLILLJJLI;
                        C21568319az[] c21568319azArr2 = C21568019aw.LIZIZ;
                        C21568019aw.LIZ(path, f9, f8, enumC1321550kUj2, c21568319azArr2);
                        float f12 = f10 - 22.0f;
                        path.lineTo(f9, f12);
                        C21568019aw.LIZ(path, f9, f10, EnumC1321550kUj.LLILLL, c21568319azArr2);
                        path.lineTo(f7 + 25.949f, f10);
                        path.cubicTo(f7 + 26.367f, f10 + 1.722f, f7 + 24.109f, f10 + 3.788f, f7 + 20.862f, f10 + 4.637f);
                        path.cubicTo(f7 + 17.584f, f10 + 5.494f, f7 + 14.539f, f10 + 4.784f, f7 + 14.064f, f10 + 3.052f);
                        path.cubicTo(f7 + 13.782f, f10 + 2.028f, f7 + 14.461f, f10 + 0.875f, f7 + 15.741f, f10 - 0.073f);
                        path.cubicTo(f7 + 13.908f, f10 - 0.154f, f7 + 12.559f, f10 - 0.324f, f7 + 11.356f, f10 - 0.689f);
                        path.cubicTo(f7 + 6.242f, f10 - 2.24f, f7 + 2.24f, f10 - 6.242f, f7 + 0.689f, f10 - 11.356f);
                        path.cubicTo(f7, f10 - 13.627f, f7, f10 - 16.418f, f7, f12);
                        path.lineTo(f7, f8 + 22.0f);
                        C21568019aw.LIZ(path, f7, f8, EnumC1321550kUj.LL, c21568319azArr2);
                        path.lineTo(f11, f8);
                        path.close();
                    } else {
                        path = new Path();
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float fHeight = rectF.height() / 2.0f;
                        float f18 = 0.5522848f * fHeight;
                        float fCenterY = rectF.centerY();
                        float f19 = f15 - fHeight;
                        float f20 = fHeight + f13;
                        path.moveTo(f19, f14);
                        float f21 = f19 + f18;
                        float f22 = fCenterY - f18;
                        path.cubicTo(f21, f14, f15, f22, f15, fCenterY);
                        float f23 = fCenterY + f18;
                        path.cubicTo(f15, f23, f21, f16, f19, f16);
                        path.lineTo(f13 + 25.949f, f16);
                        path.cubicTo(f13 + 26.367f, f16 + 1.722f, f13 + 24.109f, f16 + 3.788f, f13 + 20.862f, f16 + 4.637f);
                        path.cubicTo(f13 + 17.584f, 5.494f + f16, f13 + 14.539f, f16 + 4.784f, f13 + 14.064f, f16 + 3.052f);
                        path.cubicTo(f13 + 13.782f, f16 + 2.028f, f13 + 14.461f, f16 + 0.875f, f13 + 15.741f, f16 - 0.073f);
                        path.lineTo(f20, f16);
                        float f24 = f20 - f18;
                        path.cubicTo(f24, f16, f13, f23, f13, fCenterY);
                        path.cubicTo(f13, f22, f24, f14, f20, f14);
                        path.lineTo(f19, f14);
                        path.close();
                    }
                    break;
                case 6:
                    path = new Path();
                    float f25 = rectF.left;
                    float f26 = rectF.top;
                    float f27 = rectF.right;
                    float f28 = rectF.bottom;
                    float f29 = f27 - 26.5f;
                    path.moveTo(f29, f26);
                    EnumC1321550kUj enumC1321550kUj3 = EnumC1321550kUj.LLILLJJLI;
                    C21568319az[] c21568319azArr3 = C21568019aw.LIZLLL;
                    C21568019aw.LIZ(path, f27, f26, enumC1321550kUj3, c21568319azArr3);
                    float f30 = f28 - 26.5f;
                    path.lineTo(f27, f30);
                    C21568019aw.LIZ(path, f27, f28, EnumC1321550kUj.LLILLL, c21568319azArr3);
                    path.lineTo(f25 + 26.5f, f28);
                    path.cubicTo(f25 + 24.179f, f28, f25 + 23.018f, f28, f25 + 22.039f, f28 - 0.08f);
                    path.cubicTo(f25 + 15.004f, f28 - 0.657f, f25 + 8.842f, f28 - 4.244f, f25 + 4.835f, f28 - 9.555f);
                    path.cubicTo(f25 + 4.343f, f28 - 8.834f, f25 + 3.709f, f28 - 8.326f, f25 + 2.948f, f28 - 8.111f);
                    path.cubicTo(f25 + 0.316f, f28 - 7.369f, f25 - 2.802f, f28 - 10.411f, f25 - 4.016f, f28 - 14.905f);
                    path.cubicTo(f25 - 5.229f, f28 - 19.4f, f25 - 4.078f, f28 - 23.646f, f25 - 1.445f, f28 - 24.389f);
                    path.cubicTo(f25 - 0.973f, f28 - 24.522f, f25 - 0.486f, f28 - 24.532f, f25 + 0.004f, f28 - 24.436f);
                    path.cubicTo(f25 + 4.0E-4f, f28 - 25.008f, f25, f28 - 25.682f, f25, f30);
                    path.lineTo(f25, f26 + 26.5f);
                    C21568019aw.LIZ(path, f25, f26, EnumC1321550kUj.LL, c21568319azArr3);
                    path.lineTo(f29, f26);
                    path.close();
                    break;
                case 7:
                    path = C21568019aw.LIZJ(rectF);
                    path.transform(C21568019aw.LIZIZ(rectF));
                    break;
                default:
                    throw new C1954807lC();
            }
            if (z2) {
                path.transform(C21568019aw.LIZIZ(rectF));
            }
            LIZLLL(path, this.LLIZ);
            RectF rectF2 = this.LLIZ;
            switch (iArr[enumC21568119ax.ordinal()]) {
                case 1:
                    Path path2 = new Path();
                    float f31 = rectF2.left;
                    float f32 = rectF2.top;
                    float f33 = f31 + 67.004f;
                    float f34 = f32 - 11.914f;
                    path2.moveTo(f33, f34);
                    path2.cubicTo(f31 + 68.917f, f32 - 12.272f, f31 + 70.69f, f32 - 11.48f, f31 + 70.964f, f32 - 10.147f);
                    path2.cubicTo(f31 + 71.238f, f32 - 8.813f, f31 + 69.909f, f32 - 7.443f, f31 + 67.996f, f32 - 7.085f);
                    path2.cubicTo(f31 + 66.083f, f32 - 6.728f, f31 + 64.31f, f32 - 7.519f, f31 + 64.036f, f32 - 8.853f);
                    pathLIZLLL = path2;
                    pathLIZLLL.cubicTo(f31 + 63.762f, f32 - 10.186f, f31 + 65.091f, f32 - 11.557f, f33, f34);
                    pathLIZLLL.close();
                    break;
                case 2:
                    pathLIZLLL = C21568019aw.LIZLLL(rectF2);
                    break;
                case 3:
                    pathLIZLLL = C21568019aw.LJFF(rectF2);
                    break;
                case 4:
                    pathLIZLLL = C21568019aw.LJFF(rectF2);
                    pathLIZLLL.transform(C21568019aw.LIZIZ(rectF2));
                    break;
                case 5:
                    Path path3 = new Path();
                    float f35 = rectF2.left;
                    float f36 = rectF2.bottom;
                    float f37 = 23.486f + f35;
                    float f38 = 6.464f + f36;
                    path3.moveTo(f37, f38);
                    path3.cubicTo(f35 + 24.654f, f36 + 5.809f, f35 + 25.944f, f36 + 5.853f, f35 + 26.366f, f36 + 6.564f);
                    path3.cubicTo(f35 + 26.789f, f36 + 7.274f, f35 + 26.184f, f36 + 8.382f, f35 + 25.016f, f36 + 9.037f);
                    path3.cubicTo(f35 + 23.848f, f36 + 9.692f, f35 + 22.558f, f36 + 9.647f, f35 + 22.136f, f36 + 8.937f);
                    pathLIZLLL = path3;
                    pathLIZLLL.cubicTo(f35 + 21.713f, f36 + 8.226f, f35 + 22.318f, f36 + 7.119f, f37, f38);
                    pathLIZLLL.close();
                    break;
                case 6:
                    Path path4 = new Path();
                    float f39 = rectF2.left;
                    float f40 = rectF2.bottom;
                    float f41 = f39 - 12.9f;
                    float f42 = f40 - 27.132f;
                    path4.moveTo(f41, f42);
                    path4.cubicTo(f39 - 12.131f, f40 - 29.25f, f39 - 10.319f, f40 - 30.46f, f39 - 8.852f, f40 - 29.836f);
                    path4.cubicTo(f39 - 7.385f, f40 - 29.211f, f39 - 6.819f, f40 - 26.986f, f39 - 7.588f, f40 - 24.868f);
                    path4.cubicTo(f39 - 8.357f, f40 - 22.75f, f39 - 10.171f, f40 - 21.539f, f39 - 11.638f, f40 - 22.164f);
                    pathLIZLLL = path4;
                    pathLIZLLL.cubicTo(f39 - 13.105f, f40 - 22.789f, f39 - 13.67f, f40 - 25.014f, f41, f42);
                    pathLIZLLL.close();
                    break;
                case 7:
                    pathLIZLLL = C21568019aw.LIZLLL(rectF2);
                    pathLIZLLL.transform(C21568019aw.LIZIZ(rectF2));
                    break;
                default:
                    throw new C1954807lC();
            }
            if (z2) {
                pathLIZLLL.transform(C21568019aw.LIZIZ(rectF2));
            }
            this.LLILZLL.setScale(density2, density2);
            path.transform(this.LLILZLL, this.LLILZ);
            pathLIZLLL.transform(this.LLILZLL, this.LLILZIL);
        }
    }
}
