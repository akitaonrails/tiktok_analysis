package com.ss.android.ugc.aweme.feed.ui;

import X.C1608660rxo;
import X.C300390Bq1;
import X.C418440Gaw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryTag extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int[] LLILZ;
    public final float[] LLILZIL;
    public final Paint LLILZLL;
    public final RectF LLIZ;
    public float LLIZLLLIL;
    public LinearGradient LLJ;
    public int[] LLJI;
    public float[] LLJIJIL;
    public Integer LLJILJIL;
    public boolean LLJILJILJ;

    public StoryTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final LinearGradient getInnerShader() {
        float width = getWidth();
        float height = getHeight();
        int[] iArr = this.LLJI;
        if (iArr == null) {
            iArr = this.LLILZ;
        }
        float[] fArr = this.LLJIJIL;
        if (fArr == null) {
            fArr = this.LLILZIL;
        }
        return new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final Integer getColor() {
        return this.LLJILJIL;
    }

    public final Paint getPaint() {
        return this.LLILZLL;
    }

    public final float[] getPositionColorList() {
        return this.LLJIJIL;
    }

    public final float getRadius() {
        return this.LLIZLLLIL;
    }

    public final int[] getShaderColorList() {
        return this.LLJI;
    }

    public final boolean getUseColor() {
        return this.LLJILJILJ;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILZLL.setStyle(Paint.Style.FILL);
        Integer num = this.LLJILJIL;
        if (this.LLJILJILJ && num != null) {
            this.LLILZLL.setColor(num.intValue());
            RectF rectF = this.LLIZ;
            float f = this.LLIZLLLIL;
            canvas.drawRoundRect(rectF, f, f, this.LLILZLL);
            return;
        }
        if (C300390Bq1.LIZ() && !C1608660rxo.LIZIZ) {
            return;
        }
        this.LLILZLL.setShader(this.LLJ);
        this.LLILZLL.setColor(-16777216);
        RectF rectF2 = this.LLIZ;
        float f2 = this.LLIZLLLIL;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLILZLL);
    }

    public final void setColor(Integer num) {
        this.LLJILJIL = num;
    }

    public final void setPositionColorList(float[] fArr) {
        this.LLJIJIL = fArr;
    }

    public final void setRadius(float f) {
        this.LLIZLLLIL = f;
        invalidate();
    }

    public final void setShaderColorList(int[] iArr) {
        this.LLJI = iArr;
    }

    public final void setUseColor(boolean z) {
        this.LLJILJILJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryTag(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        int i2 = 0;
        this.LL = ColorProtector.parseColor("#10B7FF");
        this.LLILLJJLI = ColorProtector.parseColor("#20D5EC");
        this.LLILLL = ColorProtector.parseColor("#17E9B6");
        int[] iArr = new int[3];
        int i3 = 0;
        loop0: while (true) {
            int i4 = this.LL;
            while (true) {
                iArr[i3] = i4;
                i3++;
                if (i3 >= 3) {
                    break loop0;
                }
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i4 = 0;
                        } else {
                            i4 = this.LLILLL;
                        }
                    } else {
                        i4 = this.LLILLJJLI;
                    }
                }
            }
        }
        this.LLILZ = iArr;
        float[] fArr = new float[3];
        while (true) {
            float f = 0.0f;
            while (true) {
                fArr[i2] = f;
                i2++;
                if (i2 < 3) {
                    if (i2 == 0) {
                        break;
                    } else if (i2 != 1) {
                        f = i2 == 2 ? 1.0f : 0.5f;
                    }
                } else {
                    this.LLILZIL = fArr;
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    paint.setStyle(Paint.Style.STROKE);
                    this.LLILZLL = paint;
                    this.LLIZ = new RectF();
                    this.LLIZLLLIL = C418440Gaw.LIZIZ(4);
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            RectF rectF = this.LLIZ;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = i;
            rectF.bottom = i2;
            this.LLJ = getInnerShader();
        }
    }
}
