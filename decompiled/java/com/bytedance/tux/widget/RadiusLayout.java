package com.bytedance.tux.widget;

import X.C19RK;
import X.C19RL;
import X.C426750GoL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes34.dex */
public final class RadiusLayout extends FrameLayout {
    public boolean LL;
    public Paint LLILLJJLI;
    public boolean LLILLL;
    public C19RL LLILZ;
    public boolean LLILZIL;

    public RadiusLayout(Context context) {
        this(context, null, 6);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ(boolean z) {
        this.LL = z;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C19RL c19rl;
        Paint paint;
        C19RL c19rl2 = this.LLILZ;
        if (c19rl2 != null) {
            c19rl2.LIZ(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.LLILLL && this.LL && (c19rl = this.LLILZ) != null && (paint = this.LLILLJJLI) != null) {
            c19rl.LIZIZ.set(0.0f, 0.0f, c19rl.LIZ.getWidth(), c19rl.LIZ.getHeight());
            if (!(c19rl instanceof C19RK)) {
                c19rl.LIZJ.reset();
                c19rl.LIZJ.addRoundRect(c19rl.LIZIZ, c19rl.LIZIZ(), Path.Direction.CW);
            }
            canvas.drawPath(c19rl.LIZJ, paint);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C19RL c19rl = this.LLILZ;
        if (c19rl != null) {
            c19rl.LIZ(canvas);
        }
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        C19RL c19rl = new C19RL(this) { // from class: X.19RM
            {
                super(this);
            }

            @Override // X.C19RL
            public final void LIZJ(float[] fArr) {
                this.LIZLLL = fArr;
                this.LIZ.setOutlineProvider(new C2189491AmZ(fArr, 0));
                this.LIZ.setClipToOutline(true);
            }
        };
        this.LLILZ = c19rl;
        c19rl.LIZJ(new float[]{f, f, f, f, f, f, f, f});
        invalidate();
    }

    public final void setSmoothRadius(boolean z) {
        if (this.LLILZIL != z) {
            this.LLILZIL = z;
            C19RL c19rl = this.LLILZ;
            if (c19rl != null) {
                C19RL c19rl2 = new C19RL(this) { // from class: X.19RK
                    {
                        super(this);
                    }

                    @Override // X.C19RL
                    public final void LIZ(Canvas canvas) {
                        this.LIZIZ.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
                        float width = this.LIZ.getWidth();
                        float height = this.LIZ.getHeight();
                        this.LIZJ.reset();
                        C415500GQy.LIZ(this.LIZJ, LIZIZ()[0], LIZIZ()[2], LIZIZ()[4], LIZIZ()[6], width, height);
                        canvas.clipPath(this.LIZJ);
                    }

                    @Override // X.C19RL
                    public final void LIZJ(float[] fArr) {
                        this.LIZLLL = fArr;
                        this.LIZ.setOutlineProvider(null);
                        this.LIZ.setClipToOutline(false);
                    }
                };
                c19rl2.LIZJ(c19rl.LIZIZ());
                this.LLILZ = c19rl2;
            }
            invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadiusLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadiusLayout, 0, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusLeftTop, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusRightTop, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusLeftBottom, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusRightBottom, dimension);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusLayout_radiusStrokeColor, -16777216);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeWidth, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeDashWidth, 0);
        int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeDashGapWidth, 0);
        if (dimension2 == dimension3 && dimension2 == dimension4 && dimension4 == dimension5) {
            setRadius(dimension2);
        } else {
            LIZ(dimension2, dimension3, dimension4, dimension5);
        }
        LIZIZ(color, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        float[] fArr;
        if (C426750GoL.LIZLLL(getContext())) {
            fArr = new float[]{f2, f2, f, f, f3, f3, f4, f4};
        } else {
            fArr = new float[]{f, f, f2, f2, f4, f4, f3, f3};
        }
        C19RL c19rl = new C19RL(this) { // from class: X.19RJ
            {
                super(this);
            }

            @Override // X.C19RL
            public final void LIZ(Canvas canvas) {
                this.LIZIZ.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
                this.LIZJ.reset();
                this.LIZJ.addRoundRect(this.LIZIZ, LIZIZ(), Path.Direction.CW);
                canvas.clipPath(this.LIZJ);
            }

            @Override // X.C19RL
            public final void LIZJ(float[] fArr2) {
                this.LIZLLL = fArr2;
                this.LIZ.setOutlineProvider(null);
                this.LIZ.setClipToOutline(false);
            }
        };
        this.LLILZ = c19rl;
        c19rl.LIZJ(fArr);
        invalidate();
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        boolean z = true;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        if (i3 != 0 && i4 != 0) {
            paint.setPathEffect(new DashPathEffect(new float[]{i3, i4}, 0.0f));
        }
        paint.setStrokeWidth(i2);
        this.LLILLJJLI = paint;
        if ((i & (-16777216)) == 0 || i2 == 0) {
            z = false;
        }
        this.LLILLL = z;
        invalidate();
    }
}
