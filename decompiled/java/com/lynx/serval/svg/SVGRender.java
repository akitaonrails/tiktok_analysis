package com.lynx.serval.svg;

import X.C0WIY;
import X.C1312430kG1;
import X.C2188811AlT;
import X.InterfaceC1312370kFv;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.lynx.serval.svg.model.FillPaintModel;
import com.lynx.serval.svg.model.GradientModel;
import com.lynx.serval.svg.model.LinearGradientModel;
import com.lynx.serval.svg.model.PaintRef;
import com.lynx.serval.svg.model.RadialGradientModel;
import com.lynx.serval.svg.model.StopModel;
import com.lynx.serval.svg.model.StrokePaintModel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class SVGRender {
    public static final float[] LJFF = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2126f, 0.7152f, 0.0722f, 0.0f, 0.0f};
    public InterfaceC1312370kFv LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Canvas mPictureCanvas;
    public SVGRenderEngine mSVGRenderEngineNG = SVGRenderEngine.getInstance();
    public final HashMap<String, C0WIY<String, GradientModel>> LIZ = new HashMap<>();

    public void applyLuminanceToAlpha() {
    }

    public void setViewBox(float f, float f2, float f3, float f4) {
    }

    public void restore() {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            canvas.restore();
        }
    }

    public void restoreLayer() {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            canvas.restore();
        }
    }

    public void save() {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            canvas.save();
        }
    }

    public String getColor() {
        return this.LIZJ;
    }

    public static Paint LIZ(FillPaintModel fillPaintModel) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setFlags(193);
        paint.setHinting(0);
        if (fillPaintModel != null) {
            paint.setColor(getColorWithOpacity(fillPaintModel.mColor, fillPaintModel.mOpacity));
        }
        return paint;
    }

    public static Paint LIZLLL(StrokePaintModel strokePaintModel) {
        int i;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setFlags(193);
        paint.setHinting(0);
        if (strokePaintModel != null) {
            paint.setColor(getColorWithOpacity(strokePaintModel.mColor, strokePaintModel.mOpacity));
            paint.setStrokeWidth(strokePaintModel.mWith);
            int i2 = strokePaintModel.mStrokeLineCap;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    }
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
            } else {
                paint.setStrokeCap(Paint.Cap.BUTT);
            }
            int i3 = strokePaintModel.mStrokeLineJoin;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        paint.setStrokeJoin(Paint.Join.BEVEL);
                    }
                } else {
                    paint.setStrokeJoin(Paint.Join.ROUND);
                }
            } else {
                paint.setStrokeJoin(Paint.Join.MITER);
            }
            paint.setStrokeMiter(strokePaintModel.mStrokeMiterLimit);
            float[] fArr = strokePaintModel.mStrokeDashArray;
            if (fArr != null && fArr.length != 0) {
                int length = fArr.length;
                if (length % 2 == 0) {
                    i = length;
                } else {
                    i = length * 2;
                }
                float[] fArr2 = new float[i];
                float f = 0.0f;
                for (int i4 = 0; i4 < i; i4++) {
                    float f2 = fArr[i4 % length];
                    fArr2[i4] = f2;
                    f += f2;
                }
                if (f == 0.0f) {
                    paint.setPathEffect(null);
                    return paint;
                }
                float f3 = strokePaintModel.mStrokeDashOffset;
                if (f3 < 0.0f) {
                    f3 = (f3 % f) + f;
                }
                paint.setPathEffect(new DashPathEffect(fArr2, f3));
                return paint;
            }
            paint.setPathEffect(null);
        }
        return paint;
    }

    public static float[] calculatePathBoundsArray(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new float[]{rectF.left, rectF.top, rectF.width(), rectF.height()};
    }

    public static int clampOpacity(float f) {
        return Math.max(0, Math.min((int) (f * 256.0f), 255));
    }

    public void setBlendMode(int i) {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            if (i == 1) {
                if (!this.LIZLLL) {
                    boolean z = this.LJ;
                    Paint paint = new Paint();
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    if (z) {
                        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(LJFF)));
                    }
                    this.mPictureCanvas.saveLayer(null, paint);
                    this.LIZLLL = true;
                    return;
                }
                return;
            }
            if (i != 0 || !this.LIZLLL) {
                return;
            }
            canvas.restore();
            this.LIZLLL = false;
        }
    }

    public void setColor(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LIZJ = null;
        } else {
            this.LIZJ = str.trim();
        }
    }

    public void setMaskIsLuminance(boolean z) {
        this.LJ = z;
    }

    public void setResourceManager(InterfaceC1312370kFv interfaceC1312370kFv) {
        this.LIZIZ = interfaceC1312370kFv;
    }

    public void transform(float[] fArr) {
        if (this.mPictureCanvas != null && fArr != null && fArr.length == 6) {
            float[] fArr2 = {fArr[0], fArr[2], fArr[4], fArr[1], fArr[3], fArr[5], 0.0f, 0.0f, 1.0f};
            Matrix matrix = new Matrix();
            matrix.setValues(fArr2);
            this.mPictureCanvas.concat(matrix);
        }
    }

    public static float[] LJ(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[2];
        float f4 = fArr2[1];
        float f5 = (f * f2) + (f3 * f4);
        float f6 = fArr[1];
        float f7 = fArr[3];
        float f8 = (f2 * f6) + (f4 * f7);
        float f9 = fArr2[2];
        float f10 = fArr2[3];
        float f11 = (f * f9) + (f3 * f10);
        float f12 = (f9 * f6) + (f10 * f7);
        float f13 = fArr2[4];
        float f14 = fArr2[5];
        return new float[]{f5, f8, f11, f12, (f * f13) + (f3 * f14) + fArr[4], (f6 * f13) + (f7 * f14) + fArr[5]};
    }

    public static void applyTransform(Path path, float[] fArr) {
        if (path != null) {
            float[] fArr2 = {fArr[0], fArr[2], fArr[4], fArr[1], fArr[3], fArr[5], 0.0f, 0.0f, 1.0f};
            Matrix matrix = new Matrix();
            matrix.setValues(fArr2);
            path.transform(matrix);
        }
    }

    public static int getColorWithOpacity(long j, float f) {
        int iMin;
        int iRound = Math.round(((int) ((j >> 24) & 255)) * f);
        if (iRound < 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iRound, 255);
        }
        return ((int) (j & 16777215)) | (iMin << 24);
    }

    public void clipPath(Path path, int i) {
        if (this.mPictureCanvas != null && path != null) {
            if (i == 1) {
                path.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.setFillType(Path.FillType.WINDING);
            }
            this.mPictureCanvas.clipPath(path);
        }
    }

    public Picture renderPicture(String str, Rect rect) {
        Picture picture = new Picture();
        this.mPictureCanvas = picture.beginRecording(rect.width(), rect.height());
        SVGRenderEngine sVGRenderEngine = this.mSVGRenderEngineNG;
        if (sVGRenderEngine != null) {
            float f = rect.left;
            float f2 = rect.top;
            float fWidth = rect.width();
            float fHeight = rect.height();
            sVGRenderEngine.getClass();
            sVGRenderEngine.render(this, str, f, f2, fWidth, fHeight, getColor());
        }
        picture.endRecording();
        return picture;
    }

    public void translate(float f, float f2) {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            canvas.translate(f, f2);
        }
    }

    public static Paint LIZIZ(LinearGradientModel linearGradientModel, Path path, PaintRef paintRef) {
        float f;
        float f2;
        int length = linearGradientModel.mStopModels.length;
        Paint paintLIZLLL = null;
        if (length == 0) {
            return null;
        }
        if (paintRef instanceof FillPaintModel) {
            paintLIZLLL = LIZ((FillPaintModel) paintRef);
        } else if (paintRef instanceof StrokePaintModel) {
            paintLIZLLL = LIZLLL((StrokePaintModel) paintRef);
        }
        paintLIZLLL.setAlpha(clampOpacity(paintRef.mOpacity));
        float[] fArr = new float[length];
        int[] iArr = new int[length];
        float f3 = -1.0f;
        int i = 0;
        do {
            StopModel stopModel = linearGradientModel.mStopModels[i];
            float f4 = stopModel.mOffset;
            if (i != 0 && f4 < f3) {
                fArr[i] = f3;
            } else {
                fArr[i] = f4;
                f3 = f4;
            }
            iArr[i] = getColorWithOpacity(stopModel.mColor, stopModel.mStopOpacity);
            i++;
        } while (i < length);
        float f5 = linearGradientModel.mX1;
        float f6 = linearGradientModel.mY1;
        float f7 = linearGradientModel.mX2;
        float f8 = linearGradientModel.mY2;
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        if (linearGradientModel.mType == GradientModel.GRADIENT_TYPE_OBJECT_BOUNDING_BOX) {
            float f9 = rectF.left;
            float f10 = rectF.top;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            f5 = (f5 * fWidth) + f9;
            f6 = (f6 * fHeight) + f10;
            f2 = f9 + (f7 * fWidth);
            f = f10 + (f8 * fHeight);
        } else {
            f = f8;
            f2 = f7;
        }
        if ((f5 != f2 || f6 != f) && length != 1) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i2 = linearGradientModel.mSpreadMode;
            if (i2 == GradientModel.GRADIENT_SPREAD_REFLECT) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (i2 == GradientModel.GRADIENT_SPREAD_REPEAT) {
                tileMode = Shader.TileMode.REPEAT;
            }
            LinearGradient linearGradient = new LinearGradient(f5, f6, f2, f, iArr, fArr, tileMode);
            float[] fArrLJ = linearGradientModel.mTransform;
            if (fArrLJ != null) {
                if (linearGradientModel.mType == GradientModel.GRADIENT_TYPE_OBJECT_BOUNDING_BOX) {
                    float f11 = rectF.left;
                    float f12 = rectF.top;
                    float fWidth2 = rectF.width();
                    float fHeight2 = rectF.height();
                    if (fArrLJ.length == 6 && fWidth2 != 0.0f && fHeight2 != 0.0f) {
                        fArrLJ = LJ(LJ(new float[]{fWidth2, 0.0f, 0.0f, fHeight2, f11, f12}, fArrLJ), new float[]{1.0f / fWidth2, 0.0f, 0.0f, 1.0f / fHeight2, (-f11) / fWidth2, (-f12) / fHeight2});
                    }
                }
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{fArrLJ[0], fArrLJ[2], fArrLJ[4], fArrLJ[1], fArrLJ[3], fArrLJ[5], 0.0f, 0.0f, 1.0f});
                linearGradient.setLocalMatrix(matrix);
            }
            paintLIZLLL.setShader(linearGradient);
            return paintLIZLLL;
        }
        paintLIZLLL.setColor(iArr[length - 1]);
        return paintLIZLLL;
    }

    public static Paint LIZJ(RadialGradientModel radialGradientModel, Path path, PaintRef paintRef) {
        int length = radialGradientModel.mStopModels.length;
        Paint paintLIZLLL = null;
        if (length == 0) {
            return null;
        }
        if (paintRef instanceof FillPaintModel) {
            paintLIZLLL = LIZ((FillPaintModel) paintRef);
        } else if (paintRef instanceof StrokePaintModel) {
            paintLIZLLL = LIZLLL((StrokePaintModel) paintRef);
        }
        paintLIZLLL.setAlpha(clampOpacity(paintRef.mOpacity));
        float[] fArr = new float[length];
        int[] iArr = new int[length];
        float f = -1.0f;
        int i = 0;
        do {
            StopModel stopModel = radialGradientModel.mStopModels[i];
            float f2 = stopModel.mOffset;
            if (i != 0 && f2 < f) {
                fArr[i] = f;
            } else {
                fArr[i] = f2;
                f = f2;
            }
            iArr[i] = getColorWithOpacity(stopModel.mColor, stopModel.mStopOpacity);
            i++;
        } while (i < length);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        int i2 = radialGradientModel.mSpreadMode;
        if (i2 == GradientModel.GRADIENT_SPREAD_REFLECT) {
            tileMode = Shader.TileMode.MIRROR;
        } else if (i2 == GradientModel.GRADIENT_SPREAD_REPEAT) {
            tileMode = Shader.TileMode.REPEAT;
        }
        float[] fArr2 = radialGradientModel.mTransform;
        if (radialGradientModel.mType == GradientModel.GRADIENT_TYPE_OBJECT_BOUNDING_BOX) {
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (fWidth != 0.0f && fHeight != 0.0f) {
                float f3 = radialGradientModel.mFr;
                if (f3 != 0.0f && length != 1) {
                    RadialGradient radialGradient = new RadialGradient(radialGradientModel.mCx, radialGradientModel.mCy, f3, iArr, fArr, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setValues(new float[]{fWidth, 0.0f, rectF.left, 0.0f, fHeight, rectF.top, 0.0f, 0.0f, 1.0f});
                    if (fArr2 != null) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fArr2[0], fArr2[2], fArr2[4], fArr2[1], fArr2[3], fArr2[5], 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                    }
                    radialGradient.setLocalMatrix(matrix);
                    paintLIZLLL.setShader(radialGradient);
                    return paintLIZLLL;
                }
                paintLIZLLL.setColor(iArr[length - 1]);
                return paintLIZLLL;
            }
            paintLIZLLL.setColor(iArr[length - 1]);
            return paintLIZLLL;
        }
        float f4 = radialGradientModel.mFr;
        if (f4 != 0.0f && length != 1) {
            RadialGradient radialGradient2 = new RadialGradient(radialGradientModel.mCx, radialGradientModel.mCy, f4, iArr, fArr, tileMode);
            if (fArr2 != null) {
                Matrix matrix3 = new Matrix();
                matrix3.setValues(new float[]{fArr2[0], fArr2[2], fArr2[4], fArr2[1], fArr2[3], fArr2[5], 0.0f, 0.0f, 1.0f});
                radialGradient2.setLocalMatrix(matrix3);
            }
            paintLIZLLL.setShader(radialGradient2);
            return paintLIZLLL;
        }
        paintLIZLLL.setColor(iArr[length - 1]);
        return paintLIZLLL;
    }

    public void addGradientModel(String str, String str2, GradientModel gradientModel) {
        HashMap<String, C0WIY<String, GradientModel>> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("#");
        sbLIZ.append(str);
        map.put(C2188811AlT.LIZIZ(sbLIZ), new C0WIY<>(str2, gradientModel));
    }

    public void draw(Path path, FillPaintModel fillPaintModel, StrokePaintModel strokePaintModel) {
        Paint paintLIZLLL;
        Matrix matrix;
        C0WIY<String, GradientModel> c0wiy;
        Paint paintLIZJ;
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null && path != null) {
            boolean localMatrix = false;
            Matrix matrix2 = null;
            if (fillPaintModel != null) {
                if (fillPaintModel.mFillRule == 1) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.setFillType(Path.FillType.WINDING);
                }
                int i = fillPaintModel.mType;
                if (i == 2) {
                    if (!TextUtils.isEmpty(fillPaintModel.mIri) && (c0wiy = this.LIZ.get(fillPaintModel.mIri)) != null) {
                        GradientModel gradientModel = c0wiy.LIZIZ;
                        if (gradientModel instanceof LinearGradientModel) {
                            paintLIZJ = LIZIZ((LinearGradientModel) gradientModel, path, fillPaintModel);
                        } else {
                            GradientModel gradientModel2 = c0wiy.LIZIZ;
                            if (gradientModel2 instanceof RadialGradientModel) {
                                paintLIZJ = LIZJ((RadialGradientModel) gradientModel2, path, fillPaintModel);
                            }
                        }
                        if (paintLIZJ != null) {
                            canvas.drawPath(path, paintLIZJ);
                        }
                    }
                } else if (i == 1) {
                    canvas.drawPath(path, LIZ(fillPaintModel));
                }
            } else {
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setTypeface(Typeface.DEFAULT);
                paint.setFlags(193);
                paint.setHinting(0);
                canvas.drawPath(path, paint);
            }
            Canvas canvas2 = this.mPictureCanvas;
            if (strokePaintModel != null) {
                int i2 = strokePaintModel.mType;
                if (i2 == 2) {
                    C0WIY<String, GradientModel> c0wiy2 = this.LIZ.get(strokePaintModel.mIri);
                    if (c0wiy2 != null) {
                        GradientModel gradientModel3 = c0wiy2.LIZIZ;
                        if (gradientModel3 instanceof LinearGradientModel) {
                            paintLIZLLL = LIZIZ((LinearGradientModel) gradientModel3, path, strokePaintModel);
                        } else {
                            GradientModel gradientModel4 = c0wiy2.LIZIZ;
                            if (!(gradientModel4 instanceof RadialGradientModel)) {
                                return;
                            } else {
                                paintLIZLLL = LIZJ((RadialGradientModel) gradientModel4, path, strokePaintModel);
                            }
                        }
                    } else {
                        return;
                    }
                } else if (i2 != 1) {
                    return;
                } else {
                    paintLIZLLL = LIZLLL(strokePaintModel);
                }
                if (paintLIZLLL != null) {
                    if (strokePaintModel.mVectorEffect == 1) {
                        Matrix matrix3 = canvas2.getMatrix();
                        Path path2 = new Path();
                        path.transform(matrix3, path2);
                        Shader shader = paintLIZLLL.getShader();
                        if (shader != null) {
                            matrix2 = new Matrix();
                            localMatrix = shader.getLocalMatrix(matrix2);
                            if (localMatrix) {
                                matrix = new Matrix(matrix2);
                            } else {
                                matrix = new Matrix();
                            }
                            matrix.postConcat(matrix3);
                            shader.setLocalMatrix(matrix);
                        }
                        canvas2.save();
                        canvas2.setMatrix(new Matrix());
                        canvas2.drawPath(path2, paintLIZLLL);
                        canvas2.restore();
                        if (shader != null) {
                            if (!localMatrix) {
                                matrix2 = new Matrix();
                            }
                            shader.setLocalMatrix(matrix2);
                            return;
                        }
                        return;
                    }
                    canvas2.drawPath(path, paintLIZLLL);
                }
            }
        }
    }

    public void clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            canvas.clipRect(f, f2, f3, f4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawText(android.text.SpannableStringBuilder r16, int r17, float r18, float r19) {
        /*
            r15 = this;
            r1 = r19
            r2 = r18
            android.text.TextPaint r8 = new android.text.TextPaint
            r8.<init>()
            r3 = 1
            r8.setAntiAlias(r3)
            r7 = r16
            android.text.BoringLayout$Metrics r13 = android.text.BoringLayout.isBoring(r7, r8)
            r0 = 2
            r4 = r17
            if (r13 != 0) goto L4f
            android.text.StaticLayout r6 = new android.text.StaticLayout
            r9 = 2147483647(0x7fffffff, float:NaN)
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            int r5 = r6.getWidth()
            if (r4 != r3) goto L4c
            int r5 = r5 / r0
        L2d:
            float r3 = (float) r5
            float r2 = r2 - r3
        L2f:
            int r3 = r6.getLineCount()
            if (r3 <= 0) goto L46
            android.graphics.Canvas r5 = r15.mPictureCanvas
            int r4 = r6.getLineAscent(r13)
            int r3 = r6.getLineDescent(r13)
            int r4 = r4 - r3
            int r4 = r4 / r0
            float r0 = (float) r4
            float r1 = r1 + r0
            r5.translate(r2, r1)
        L46:
            android.graphics.Canvas r0 = r15.mPictureCanvas
            r6.draw(r0)
            return
        L4c:
            if (r4 != r0) goto L2f
            goto L2d
        L4f:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            r14 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            android.text.BoringLayout r6 = android.text.BoringLayout.make(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r3) goto L76
            int r3 = r13.width
            int r3 = r3 / r0
        L61:
            float r3 = (float) r3
            float r2 = r2 - r3
        L63:
            android.graphics.Canvas r5 = r15.mPictureCanvas
            int r4 = r13.ascent
            int r3 = r13.descent
            int r4 = r4 - r3
            int r4 = r4 / r0
            float r0 = (float) r4
            float r1 = r1 + r0
            r5.translate(r2, r1)
            android.graphics.Canvas r0 = r15.mPictureCanvas
            r6.draw(r0)
            return
        L76:
            if (r4 != r0) goto L63
            int r3 = r13.width
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.serval.svg.SVGRender.drawText(android.text.SpannableStringBuilder, int, float, float):void");
    }

    public void saveLayer(float f, float f2, float f3, float f4) {
        Canvas canvas = this.mPictureCanvas;
        if (canvas != null) {
            if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
                canvas.saveLayer(null, null);
            } else {
                this.mPictureCanvas.saveLayer(new RectF(f, f2, f3, f4), null);
            }
        }
    }

    public void drawImage(String str, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        InterfaceC1312370kFv interfaceC1312370kFv;
        if (!TextUtils.isEmpty(str) && (interfaceC1312370kFv = this.LIZIZ) != null) {
            interfaceC1312370kFv.LIZ(str, new C1312430kG1(this, f3, f4, f, f2, i, i2, i3));
        }
    }
}
