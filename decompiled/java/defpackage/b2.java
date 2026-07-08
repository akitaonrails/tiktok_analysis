package defpackage;

import X.C1308910kAL;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C814420VxA;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class b2 extends View {
    public final int[] LL;
    public final float[] LLILLJJLI;
    public final int LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public Shader LLJI;
    public final Paint LLJIJIL;
    public Shader LLJILJIL;
    public final int[] LLJILJILJ;
    public final float LLJILLL;
    public final RectF LLJJ;
    public final float LLJJI;
    public final Pair<Float, Float> LLJJIII;

    public b2(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        super(context, null, 0);
        int[] iArr = new int[2];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ew, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -8134190;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ev, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -8068128;
        }
        iArr[1] = iIntValue2;
        this.LL = iArr;
        this.LLILLJJLI = new float[]{0.0f, 1.0f};
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -1;
        }
        this.LLILLL = C2441009hQ.LJIIL(iIntValue3, 30);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ex, context);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 1934317656;
        }
        paint.setColor(iIntValue4);
        this.LLILZ = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.z_, context);
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        paint2.setColor(iIntValue5);
        paint2.setAlpha(12);
        this.LLILZIL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(2.25f)));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.LLILZLL = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(0);
        this.LLIZ = paint4;
        this.LLIZLLLIL = C418440Gaw.LIZIZ(Float.valueOf(3.21f));
        this.LLJ = C418440Gaw.LIZIZ(Float.valueOf(3.21f));
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.FILL);
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(20.09f));
        if (fLIZIZ > 0.0f) {
            paint5.setMaskFilter(new BlurMaskFilter(fLIZIZ, BlurMaskFilter.Blur.NORMAL));
        }
        paint5.setAlpha(76);
        this.LLJIJIL = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(Paint.Style.FILL);
        float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(20.09f));
        if (fLIZIZ2 > 0.0f) {
            paint6.setMaskFilter(new BlurMaskFilter(fLIZIZ2, BlurMaskFilter.Blur.NORMAL));
        }
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.ee, context);
        paint6.setColor(numLIZJ6 != null ? numLIZJ6.intValue() : -1);
        paint6.setAlpha(127);
        int[] iArr2 = new int[2];
        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.ev, context);
        if (numLIZJ7 != null) {
            iIntValue6 = numLIZJ7.intValue();
        } else {
            iIntValue6 = -5636869;
        }
        iArr2[0] = iIntValue6;
        Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.ew, context);
        if (numLIZJ8 != null) {
            iIntValue7 = numLIZJ8.intValue();
        } else {
            iIntValue7 = -3868478;
        }
        iArr2[1] = iIntValue7;
        this.LLJILJILJ = iArr2;
        this.LLJILLL = 1.59f;
        this.LLJJ = new RectF();
        this.LLJJI = C418440Gaw.LIZIZ(34);
        this.LLJJIII = new Pair<>(Float.valueOf(C418440Gaw.LIZIZ(33)), Float.valueOf(C418440Gaw.LIZIZ(28)));
        setLayerType(1, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = width / 2.0f;
        this.LLILZ.setShader(null);
        float f2 = 2;
        float f3 = width / f2;
        float f4 = height / f2;
        canvas.drawCircle(f3, f4, f, this.LLILZ);
        float strokeWidth = f - (this.LLILZIL.getStrokeWidth() / 2.0f);
        if (strokeWidth > 0.0f) {
            canvas.drawCircle(f3, f4, strokeWidth, this.LLILZIL);
        }
        canvas.save();
        Path path = new Path();
        path.addCircle(f3, f4, f, Path.Direction.CW);
        canvas.clipPath(path);
        this.LLJIJIL.setShader(this.LLJILJIL);
        canvas.drawOval(this.LLJJ, this.LLJIJIL);
        canvas.restore();
        canvas.save();
        Path path2 = new Path();
        path2.addCircle(f3, f4, f, Path.Direction.CW);
        canvas.clipPath(path2);
        this.LLIZ.setShadowLayer(this.LLIZLLLIL, 0.0f, this.LLJ, this.LLILLL);
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
        this.LLIZ.setStrokeWidth(fLIZIZ);
        canvas.drawCircle(f3, f4, f + (fLIZIZ / 2.0f), this.LLIZ);
        canvas.restore();
        this.LLILZLL.setShader(this.LLJI);
        this.LLILZLL.setStrokeWidth((width / this.LLJJI) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.25d))));
        float fLIZIZ2 = ((width / this.LLJJI) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) / f2;
        canvas.drawLine(f3 - fLIZIZ2, f4, f3 + fLIZIZ2, f4, this.LLILZLL);
        canvas.drawLine(f3, f4 - fLIZIZ2, f3, f4 + fLIZIZ2, this.LLILZLL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = f / 2.0f;
            float f3 = i2 / 2.0f;
            float fLIZIZ = ((int) ((f / this.LLJJI) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)))) / 2.0f;
            this.LLJI = new LinearGradient(f2 - fLIZIZ, f3, f2 + fLIZIZ, f3, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP);
            float f4 = f / this.LLJJI;
            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(this.LLJILLL)) * f4;
            float fFloatValue = this.LLJJIII.getFirst().floatValue() * f4;
            float fFloatValue2 = this.LLJJIII.getSecond().floatValue() * f4;
            float f5 = fLIZIZ2 + (fFloatValue / 2.0f);
            float f6 = this.LLJJI * f4;
            float f7 = 2;
            float f8 = fFloatValue / f7;
            float f9 = f5 - f8;
            float f10 = fFloatValue2 / f7;
            float f11 = f5 + f8;
            this.LLJJ.set(f9, f6 - f10, f11, f10 + f6);
            this.LLJILJIL = new LinearGradient(f9, f6, f11, f6, this.LLJILJILJ, (float[]) null, Shader.TileMode.CLAMP);
        }
    }
}
