package com.lynx.serval.svg;

import X.C415310GQf;
import X.C786410Ut5;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.serval.svg.model.FillPaintModel;
import com.lynx.serval.svg.model.LinearGradientModel;
import com.lynx.serval.svg.model.RadialGradientModel;
import com.lynx.serval.svg.model.StopModel;
import com.lynx.serval.svg.model.StrokePaintModel;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public class SVGRenderEngine {
    public static volatile boolean LIZ;
    public static SVGRenderEngine LIZIZ;

    public static void layout(float f) {
    }

    public native float[] calculateViewBoxTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2, int i3);

    public native int render(SVGRender sVGRender, String str, float f, float f2, float f3, float f4, String str2);

    public static SVGRenderEngine getInstance() {
        if (LIZIZ == null) {
            synchronized (SVGRenderEngine.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new SVGRenderEngine();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static Path makeMutablePath() {
        return new Path();
    }

    public static SpannableStringBuilder makeStringBuilder() {
        return new SpannableStringBuilder();
    }

    public SVGRenderEngine() {
        if (LIZ) {
            return;
        }
        try {
            INVOKESTATIC_com_lynx_serval_svg_SVGRenderEngine_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("serval_svg");
            LIZ = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void INVOKESTATIC_com_lynx_serval_svg_SVGRenderEngine_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static Path makePolyLinePath(float[] fArr) {
        return C415310GQf.LIZ(fArr, false);
    }

    public static Path makePolygonPath(float[] fArr) {
        return C415310GQf.LIZ(fArr, true);
    }

    public static Path makePath(byte[] bArr, float[] fArr) {
        boolean z;
        double d;
        double d2;
        double d3;
        double dAcos;
        Path path = new Path();
        int i = 0;
        for (byte b : bArr) {
            if (b != 0) {
                boolean z2 = true;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 5) {
                                int i2 = i + 1;
                                float f = fArr[i];
                                int i3 = i2 + 1;
                                float f2 = fArr[i2];
                                int i4 = i3 + 1;
                                float f3 = fArr[i3];
                                int i5 = i4 + 1;
                                float f4 = fArr[i4];
                                int i6 = i5 + 1;
                                float f5 = fArr[i5];
                                int i7 = i6 + 1;
                                if (((int) fArr[i6]) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i8 = i7 + 1;
                                if (((int) fArr[i7]) == 0) {
                                    z2 = false;
                                }
                                int i9 = i8 + 1;
                                float f6 = fArr[i8];
                                i = i9 + 1;
                                float f7 = fArr[i9];
                                if (f != f6 || f2 != f7) {
                                    if (f3 != 0.0f && f4 != 0.0f) {
                                        float fAbs = Math.abs(f3);
                                        float fAbs2 = Math.abs(f4);
                                        double radians = Math.toRadians(((double) f5) % 360.0d);
                                        double dCos = Math.cos(radians);
                                        double dSin = Math.sin(radians);
                                        double d4 = ((double) (f - f6)) / 2.0d;
                                        double d5 = ((double) (f2 - f7)) / 2.0d;
                                        double d6 = (dCos * d4) + (dSin * d5);
                                        double d7 = ((-dSin) * d4) + (d5 * dCos);
                                        double d8 = fAbs * fAbs;
                                        double d9 = fAbs2 * fAbs2;
                                        double d10 = d6 * d6;
                                        double d11 = d7 * d7;
                                        double d12 = (d10 / d8) + (d11 / d9);
                                        if (d12 > 0.99999d) {
                                            double dSqrt = Math.sqrt(d12) * 1.00001d;
                                            fAbs = (float) (((double) fAbs) * dSqrt);
                                            fAbs2 = (float) (dSqrt * ((double) fAbs2));
                                            d8 = fAbs * fAbs;
                                            d9 = fAbs2 * fAbs2;
                                        }
                                        if (z == z2) {
                                            d = -1.0d;
                                        } else {
                                            d = 1.0d;
                                        }
                                        double d13 = d8 * d9;
                                        double d14 = d8 * d11;
                                        double d15 = d9 * d10;
                                        double d16 = ((d13 - d14) - d15) / (d14 + d15);
                                        if (d16 < 0.0d) {
                                            d16 = 0.0d;
                                        }
                                        double dSqrt2 = d * Math.sqrt(d16);
                                        double d17 = fAbs;
                                        double d18 = fAbs2;
                                        double d19 = ((d17 * d7) / d18) * dSqrt2;
                                        double d20 = dSqrt2 * (-((d18 * d6) / d17));
                                        double d21 = (((double) (f + f6)) / 2.0d) + ((dCos * d19) - (dSin * d20));
                                        double d22 = (((double) (f2 + f7)) / 2.0d) + (dSin * d19) + (dCos * d20);
                                        double d23 = (d6 - d19) / d17;
                                        double d24 = (d7 - d20) / d18;
                                        double d25 = ((-d6) - d19) / d17;
                                        double d26 = ((-d7) - d20) / d18;
                                        double d27 = (d23 * d23) + (d24 * d24);
                                        double dSqrt3 = Math.sqrt(d27);
                                        if (d24 < 0.0d) {
                                            d2 = -1.0d;
                                        } else {
                                            d2 = 1.0d;
                                        }
                                        double dAcos2 = d2 * Math.acos(d23 / dSqrt3);
                                        double dSqrt4 = Math.sqrt(d27 * ((d25 * d25) + (d26 * d26)));
                                        double d28 = (d23 * d25) + (d24 * d26);
                                        if ((d23 * d26) - (d24 * d25) < 0.0d) {
                                            d3 = -1.0d;
                                        } else {
                                            d3 = 1.0d;
                                        }
                                        double d29 = d28 / dSqrt4;
                                        if (d29 < -1.0d) {
                                            dAcos = 3.141592653589793d;
                                        } else if (d29 > 1.0d) {
                                            dAcos = 0.0d;
                                        } else {
                                            dAcos = Math.acos(d29);
                                        }
                                        double d30 = d3 * dAcos;
                                        if (d30 == 0.0d) {
                                            path.lineTo(f6, f7);
                                        } else {
                                            if (!z2) {
                                                if (d30 > 0.0d) {
                                                    d30 -= 6.283185307179586d;
                                                }
                                            } else if (d30 < 0.0d) {
                                                d30 += 6.283185307179586d;
                                            }
                                            double d31 = d30 % 6.283185307179586d;
                                            double d32 = dAcos2 % 6.283185307179586d;
                                            int iCeil = (int) Math.ceil((Math.abs(d31) * 2.0d) / 3.141592653589793d);
                                            double d33 = d31 / ((double) iCeil);
                                            double d34 = d33 / 2.0d;
                                            double dSin2 = (Math.sin(d34) * 1.3333333333333333d) / (Math.cos(d34) + 1.0d);
                                            int i10 = iCeil * 6;
                                            float[] fArr2 = new float[i10];
                                            int i11 = 0;
                                            for (int i12 = 0; i12 < iCeil; i12++) {
                                                double d35 = (((double) i12) * d33) + d32;
                                                double dCos2 = Math.cos(d35);
                                                double dSin3 = Math.sin(d35);
                                                int i13 = i11 + 1;
                                                fArr2[i11] = (float) (dCos2 - (dSin2 * dSin3));
                                                int i14 = i13 + 1;
                                                fArr2[i13] = (float) (dSin3 + (dCos2 * dSin2));
                                                double d36 = d35 + d33;
                                                double dCos3 = Math.cos(d36);
                                                double dSin4 = Math.sin(d36);
                                                int i15 = i14 + 1;
                                                fArr2[i14] = (float) ((dSin2 * dSin4) + dCos3);
                                                int i16 = i15 + 1;
                                                fArr2[i15] = (float) (dSin4 - (dSin2 * dCos3));
                                                int i17 = i16 + 1;
                                                fArr2[i16] = (float) dCos3;
                                                i11 = i17 + 1;
                                                fArr2[i17] = (float) dSin4;
                                            }
                                            Matrix matrix = new Matrix();
                                            matrix.postScale(fAbs, fAbs2);
                                            matrix.postRotate(f5);
                                            matrix.postTranslate((float) d21, (float) d22);
                                            matrix.mapPoints(fArr2);
                                            fArr2[i10 - 2] = f6;
                                            fArr2[i10 - 1] = f7;
                                            for (int i18 = 0; i18 < i10; i18 += 6) {
                                                path.cubicTo(fArr2[i18], fArr2[i18 + 1], fArr2[i18 + 2], fArr2[i18 + 3], fArr2[i18 + 4], fArr2[i18 + 5]);
                                            }
                                        }
                                    } else {
                                        path.lineTo(f6, f7);
                                    }
                                }
                            } else {
                                path.close();
                            }
                        } else {
                            int i19 = i + 1;
                            float f8 = fArr[i];
                            int i20 = i19 + 1;
                            float f9 = fArr[i19];
                            int i21 = i20 + 1;
                            i = i21 + 1;
                            path.quadTo(f8, f9, fArr[i20], fArr[i21]);
                        }
                    } else {
                        int i22 = i + 1;
                        float f10 = fArr[i];
                        int i23 = i22 + 1;
                        float f11 = fArr[i22];
                        int i24 = i23 + 1;
                        float f12 = fArr[i23];
                        int i25 = i24 + 1;
                        float f13 = fArr[i24];
                        int i26 = i25 + 1;
                        i = i26 + 1;
                        path.cubicTo(f10, f11, f12, f13, fArr[i25], fArr[i26]);
                    }
                } else {
                    int i27 = i + 1;
                    float f14 = fArr[i];
                    i = i27 + 1;
                    path.lineTo(f14, fArr[i27]);
                }
            } else {
                int i28 = i + 1;
                float f15 = fArr[i];
                i = i28 + 1;
                path.moveTo(f15, fArr[i28]);
            }
        }
        return path;
    }

    public static void setFillType(Path path, int i) {
        Path.FillType fillType;
        if (path != null) {
            if (i == 1) {
                fillType = Path.FillType.EVEN_ODD;
            } else {
                fillType = Path.FillType.WINDING;
            }
            path.setFillType(fillType);
        }
    }

    public static Path makeCirclePath(float f, float f2, float f3) {
        float f4 = f - f3;
        float f5 = f2 - f3;
        float f6 = f + f3;
        float f7 = f2 + f3;
        float f8 = f3 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f6, f2);
        float f9 = f2 + f8;
        float f10 = f + f8;
        path.cubicTo(f6, f9, f10, f7, f, f7);
        float f11 = f - f8;
        path.cubicTo(f11, f7, f4, f9, f4, f2);
        float f12 = f2 - f8;
        path.cubicTo(f4, f12, f11, f5, f, f5);
        path.cubicTo(f10, f5, f6, f12, f6, f2);
        path.close();
        return path;
    }

    public static StopModel makeStopModel(float f, long j, float f2) {
        return new StopModel(f, j, f2);
    }

    public static void op(Path path, Path path2, int i) {
        Path.Op op = Path.Op.UNION;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            op = Path.Op.REVERSE_DIFFERENCE;
                        }
                    } else {
                        op = Path.Op.XOR;
                    }
                }
            } else {
                op = Path.Op.INTERSECT;
            }
        } else {
            op = Path.Op.DIFFERENCE;
        }
        path.op(path2, op);
    }

    public static void appendSpan(SpannableStringBuilder spannableStringBuilder, String str, int i, float f) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = str.length();
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(i), 0, length, 33);
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan((int) f, true), 0, length, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static Path makeEllipsePath(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float f7 = f + f3;
        float f8 = f2 + f4;
        float f9 = f3 * 0.5522848f;
        float f10 = f4 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f, f6);
        float f11 = f + f9;
        float f12 = f2 - f10;
        path.cubicTo(f11, f6, f7, f12, f7, f2);
        float f13 = f2 + f10;
        path.cubicTo(f7, f13, f11, f8, f, f8);
        float f14 = f - f9;
        path.cubicTo(f14, f8, f5, f13, f5, f2);
        path.cubicTo(f5, f12, f14, f6, f, f6);
        path.close();
        return path;
    }

    public static Path makeLinePath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static FillPaintModel makeFillPaintModel(int i, String str, long j, int i2, float f) {
        return new FillPaintModel(i, str, j, f, i2);
    }

    public static Path makeRectPath(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f + f5;
        float f8 = f2 + f6;
        Path path = new Path();
        if (f3 != 0.0f && f4 != 0.0f) {
            float f9 = f3 * 0.5522848f;
            float f10 = f4 * 0.5522848f;
            float f11 = f2 + f4;
            path.moveTo(f, f11);
            float f12 = f11 - f10;
            float f13 = f + f3;
            float f14 = f13 - f9;
            path.cubicTo(f, f12, f14, f2, f13, f2);
            float f15 = f7 - f3;
            path.lineTo(f15, f2);
            float f16 = f9 + f15;
            path.cubicTo(f16, f2, f7, f12, f7, f11);
            float f18 = f8 - f4;
            path.lineTo(f7, f18);
            float f19 = f10 + f18;
            path.cubicTo(f7, f19, f16, f8, f15, f8);
            path.lineTo(f13, f8);
            path.cubicTo(f14, f8, f, f19, f, f18);
            path.lineTo(f, f11);
            path.close();
            return path;
        }
        path.moveTo(f, f2);
        path.lineTo(f7, f2);
        path.lineTo(f7, f8);
        path.lineTo(f, f8);
        path.close();
        return path;
    }

    public static Path makeStrokePath(Path path, float f, int i, int i2, float f2, float f3, float[] fArr) {
        if (path == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        if (i == 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        } else if (i == 1) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            paint.setStrokeCap(Paint.Cap.SQUARE);
        }
        if (i2 == 0) {
            paint.setStrokeJoin(Paint.Join.MITER);
        } else if (i2 == 1) {
            paint.setStrokeJoin(Paint.Join.ROUND);
        } else {
            paint.setStrokeJoin(Paint.Join.BEVEL);
        }
        paint.setStrokeMiter(f2);
        if (fArr != null && fArr.length > 0) {
            paint.setPathEffect(new DashPathEffect(fArr, f3));
        }
        Path path2 = new Path();
        paint.getFillPath(path, path2);
        return path2;
    }

    public static void makeLinearGradient(SVGRender sVGRender, String str, float[] fArr, int i, float f, float f2, float f3, float f4, int i2, StopModel[] stopModelArr) {
        if (sVGRender != null) {
            LinearGradientModel linearGradientModel = new LinearGradientModel();
            linearGradientModel.mType = i2;
            linearGradientModel.mTransform = fArr;
            linearGradientModel.mStopModels = stopModelArr;
            linearGradientModel.mX1 = f;
            linearGradientModel.mX2 = f2;
            linearGradientModel.mY1 = f3;
            linearGradientModel.mY2 = f4;
            linearGradientModel.mSpreadMode = i;
            sVGRender.addGradientModel(str, "linearGradient", linearGradientModel);
        }
    }

    public static void makeRadialGradient(SVGRender sVGRender, String str, float[] fArr, int i, float f, float f2, float f3, float f4, float f5, int i2, StopModel[] stopModelArr) {
        if (sVGRender != null) {
            RadialGradientModel radialGradientModel = new RadialGradientModel();
            radialGradientModel.mType = i2;
            radialGradientModel.mTransform = fArr;
            radialGradientModel.mStopModels = stopModelArr;
            radialGradientModel.mSpreadMode = i;
            radialGradientModel.mCx = f;
            radialGradientModel.mCy = f2;
            radialGradientModel.mFr = f3;
            radialGradientModel.mFx = f4;
            radialGradientModel.mFy = f5;
            sVGRender.addGradientModel(str, "radialGradient", radialGradientModel);
        }
    }

    public static StrokePaintModel makeStrokePaintModel(int i, String str, long j, float f, float f2, int i2, int i3, float f3, float f4, float[] fArr, int i4) {
        return new StrokePaintModel(i, str, j, f, f2, i2, i3, f3, f4, fArr, i4);
    }
}
