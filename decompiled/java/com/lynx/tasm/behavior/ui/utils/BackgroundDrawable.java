package com.lynx.tasm.behavior.ui.utils;

import X.AbstractC1313260kHM;
import X.AbstractC1313310kHR;
import X.C1310290kCZ;
import X.C1312750kGX;
import X.C1312780kGa;
import X.C1313900kIO;
import X.C1314260kIy;
import X.C1314360kJ8;
import X.C1314430kJF;
import X.C2188811AlT;
import X.EnumC1312770kGZ;
import X.EnumC1313350kHV;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import j27.s;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class BackgroundDrawable extends AbstractC1313260kHM<C1314430kJF> {
    public boolean LJII;
    public boolean LJIIIIZZ;
    public C1314260kIy LJIIIZ;
    public C1314260kIy LJIIJ;
    public EnumC1313350kHV[] LJIIJJI;
    public PathEffect LJIIL;
    public C1312750kGX LJIILIIL;
    public C1312750kGX LJIILJJIL;
    public Map<EnumC1312770kGZ, C1312750kGX> LJIILL;
    public Path LJIILLIIL;
    public Path LJIIZILJ;
    public PointF LJIJ;
    public PointF LJIJI;
    public PointF LJIJJ;
    public PointF LJIJJLI;
    public boolean LJIL;
    public final Paint LJJ;
    public int LJJI;
    public int LJJIFFI;
    public C1313900kIO LJJII;
    public C1314360kJ8 LJJIII;

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.AbstractC1313260kHM
    public final AbstractC1313310kHR LIZ() {
        final s sVar = this.LJFF;
        final float f = this.LJI;
        return new AbstractC1313310kHR(sVar, this, f) { // from class: X.0kJF
            @Override // X.AbstractC1313310kHR
            public final boolean LIZJ() {
                return false;
            }
        };
    }

    public final Path LJIIJJI() {
        C1312750kGX c1312750kGX;
        if (this.LJJII == null || !LJIJ() || (c1312750kGX = this.LJIILIIL) == null) {
            return null;
        }
        return c1312750kGX.LIZJ;
    }

    public final boolean LJIJ() {
        if (this.LJJII == null) {
            return false;
        }
        if (!this.LJIL) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.LJIL = false;
        RectF rectFLIZIZ = LIZIZ();
        if (this.LJJII != null) {
            Rect bounds2 = getBounds();
            this.LJJII.LIZLLL(bounds2.width(), bounds2.height());
        }
        C1313900kIO c1313900kIO = this.LJJII;
        float[] fArrLIZ = c1313900kIO != null ? c1313900kIO.LIZ() : null;
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new C1312750kGX();
        }
        this.LJIILIIL.LIZLLL(bounds, fArrLIZ, rectFLIZIZ, 1.0f, false);
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new C1312750kGX();
        }
        this.LJIILJJIL.LIZLLL(bounds, fArrLIZ, rectFLIZIZ, 0.0f, false);
        C1313900kIO c1313900kIO2 = this.LJJII;
        if (c1313900kIO2 != null && c1313900kIO2.LIZIZ()) {
            LJIIZILJ(EnumC1312770kGZ.CENTER, bounds, fArrLIZ, rectFLIZIZ);
            if (this.LJIIJJI != null) {
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                do {
                    EnumC1313350kHV enumC1313350kHV = this.LJIIJJI[i];
                    if (enumC1313350kHV != null) {
                        if (enumC1313350kHV == EnumC1313350kHV.DOUBLE) {
                            z = true;
                        } else if (enumC1313350kHV == EnumC1313350kHV.GROOVE || enumC1313350kHV == EnumC1313350kHV.RIDGE) {
                            z2 = true;
                        }
                    }
                    i++;
                } while (i <= 8);
                if (z) {
                    LJIIZILJ(EnumC1312770kGZ.INNER3, bounds, fArrLIZ, rectFLIZIZ);
                    LJIIZILJ(EnumC1312770kGZ.OUTER3, bounds, fArrLIZ, rectFLIZIZ);
                }
                if (z2) {
                    LJIIZILJ(EnumC1312770kGZ.INNER2, bounds, fArrLIZ, rectFLIZIZ);
                    LJIIZILJ(EnumC1312770kGZ.OUTER2, bounds, fArrLIZ, rectFLIZIZ);
                }
            }
        }
        Path path = this.LJIILLIIL;
        if (path == null) {
            this.LJIILLIIL = new Path();
        } else {
            path.reset();
        }
        this.LJIILLIIL.addRoundRect(new RectF(bounds), C1312750kGX.LIZJ(fArrLIZ, rectFLIZIZ, -0.5f), Path.Direction.CW);
        C1312750kGX c1312750kGX = this.LJIILIIL;
        RectF rectF = c1312750kGX.LIZ;
        RectF rectF2 = this.LJIILJJIL.LIZ;
        float[] fArr = c1312750kGX.LIZIZ;
        if (this.LJIJ == null) {
            this.LJIJ = new PointF();
        }
        PointF pointF = this.LJIJ;
        RectF rectF3 = this.LJIILIIL.LIZ;
        pointF.x = rectF3.left;
        pointF.y = rectF3.top;
        double d = rectF.left;
        double d2 = rectF.top;
        LJIIJ(d, d2, (fArr[0] * 2.0f) + r2, (fArr[1] * 2.0f) + r1, rectF2.left, rectF2.top, d, d2, pointF);
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new PointF();
        }
        PointF pointF2 = this.LJIJJLI;
        float f = rectF.left;
        pointF2.x = f;
        float f2 = rectF.bottom;
        pointF2.y = f2;
        double d3 = f;
        double d4 = f2;
        LJIIJ(d3, f2 - (fArr[6] * 2.0f), (fArr[7] * 2.0f) + f, d4, rectF2.left, rectF2.bottom, d3, d4, pointF2);
        if (this.LJIJI == null) {
            this.LJIJI = new PointF();
        }
        PointF pointF3 = this.LJIJI;
        float f3 = rectF.right;
        pointF3.x = f3;
        float f4 = rectF.top;
        pointF3.y = f4;
        double d5 = f4;
        double d6 = f3;
        LJIIJ(f3 - (fArr[2] * 2.0f), d5, d6, (fArr[3] * 2.0f) + f4, rectF2.right, rectF2.top, d6, d5, pointF3);
        if (this.LJIJJ == null) {
            this.LJIJJ = new PointF();
        }
        PointF pointF4 = this.LJIJJ;
        float f5 = rectF.right;
        pointF4.x = f5;
        float f6 = rectF.bottom;
        pointF4.y = f6;
        double d7 = f5;
        double d8 = f6;
        LJIIJ(f5 - (fArr[4] * 2.0f), f6 - (fArr[5] * 2.0f), d7, d8, rectF2.right, rectF2.bottom, d7, d8, pointF4);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iLIZ = C1312780kGa.LIZ(this.LJJI, this.LJJIFFI) >>> 24;
        if (iLIZ == 255) {
            return -1;
        }
        return iLIZ == 0 ? -2 : -3;
    }

    public final boolean LJIILIIL() {
        RectF rectFLIZIZ = LIZIZ();
        return rectFLIZIZ.left > 0.0f || rectFLIZIZ.top > 0.0f || rectFLIZIZ.right > 0.0f || rectFLIZIZ.bottom > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJJIFFI;
    }

    public static int LJFF(float f) {
        if (f > 0.1f && f < 1.0f) {
            return 1;
        }
        return Math.round(f);
    }

    public static boolean LJIILJJIL(EnumC1313350kHV enumC1313350kHV) {
        if (enumC1313350kHV != EnumC1313350kHV.DASHED && enumC1313350kHV != EnumC1313350kHV.DOTTED && enumC1313350kHV != EnumC1313350kHV.HIDDEN) {
            return false;
        }
        return true;
    }

    public final int LJII(int i) {
        float fLIZ;
        float fLIZ2;
        C1314260kIy c1314260kIy = this.LJIIIZ;
        if (c1314260kIy != null) {
            fLIZ = c1314260kIy.LIZ(i);
        } else {
            fLIZ = 0.0f;
        }
        C1314260kIy c1314260kIy2 = this.LJIIJ;
        if (c1314260kIy2 != null) {
            fLIZ2 = c1314260kIy2.LIZ(i);
        } else {
            fLIZ2 = 255.0f;
        }
        return ((((int) fLIZ2) << 24) & (-16777216)) | (((int) fLIZ) & 16777215);
    }

    public final EnumC1313350kHV LJIIIIZZ(int i) {
        EnumC1313350kHV[] enumC1313350kHVArr;
        if (i <= 8 && i >= 0 && (enumC1313350kHVArr = this.LJIIJJI) != null) {
            EnumC1313350kHV enumC1313350kHV = enumC1313350kHVArr[i];
            if (enumC1313350kHV != null) {
                return enumC1313350kHV;
            }
            return enumC1313350kHVArr[8];
        }
        return null;
    }

    public final EnumC1313350kHV LJIIIZ(int i) {
        EnumC1313350kHV[] enumC1313350kHVArr = this.LJIIJJI;
        if (enumC1313350kHVArr != null) {
            EnumC1313350kHV enumC1313350kHV = enumC1313350kHVArr[i];
            if (enumC1313350kHV == null) {
                EnumC1313350kHV enumC1313350kHV2 = enumC1313350kHVArr[8];
                if (enumC1313350kHV2 != null) {
                    return enumC1313350kHV2;
                }
            } else {
                return enumC1313350kHV;
            }
        }
        C1310290kCZ c1310290kCZ = this.LJFF.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJIILIIL) {
            return EnumC1313350kHV.NONE;
        }
        return EnumC1313350kHV.SOLID;
    }

    public final C1312750kGX LJIIL(EnumC1312770kGZ enumC1312770kGZ) {
        Map<EnumC1312770kGZ, C1312750kGX> map = this.LJIILL;
        if (map == null) {
            return null;
        }
        return (C1312750kGX) ((HashMap) map).get(enumC1312770kGZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r51) {
        /*
            Method dump skipped, instruction units count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Path path;
        if (this.LJJII != null && LJIJ() && (path = this.LJIILLIIL) != null) {
            outline.setConvexPath(path);
        } else {
            outline.setRect(getBounds());
        }
    }

    @Override // X.AbstractC1313260kHM, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.LJIL = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJJIFFI) {
            this.LJJIFFI = i;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.LJJI = i;
        invalidateSelf();
    }

    public BackgroundDrawable(s sVar, float f) {
        super(sVar, f);
        this.LJIL = true;
        this.LJJ = new Paint(1);
        this.LJJI = 0;
        this.LJJIFFI = 255;
    }

    @Override // X.AbstractC1313260kHM
    public final boolean LIZJ(float f, int i) {
        boolean zLIZJ = super.LIZJ(f, i);
        if (zLIZJ) {
            this.LJIL = true;
            this.LJIIIIZZ = true;
        }
        return zLIZJ;
    }

    @Override // X.AbstractC1313260kHM
    public final boolean LIZLLL(float f, float f2, float f3, float f4) {
        boolean zLIZLLL = super.LIZLLL(f, f2, f3, f4);
        if (zLIZLLL) {
            this.LJIL = true;
            this.LJII = true;
        }
        return zLIZLLL;
    }

    public final void LJIIZILJ(EnumC1312770kGZ enumC1312770kGZ, Rect rect, float[] fArr, RectF rectF) {
        C1312750kGX c1312750kGX;
        try {
            Map<EnumC1312770kGZ, C1312750kGX> map = this.LJIILL;
            if (map != null) {
                c1312750kGX = (C1312750kGX) ((HashMap) map).get(enumC1312770kGZ);
                if (c1312750kGX == null) {
                }
                c1312750kGX.LIZLLL(rect, fArr, rectF, enumC1312770kGZ.LIZJ(), true);
            }
            this.LJIILL = new HashMap();
            c1312750kGX = new C1312750kGX();
            ((HashMap) this.LJIILL).put(enumC1312770kGZ, c1312750kGX);
            c1312750kGX.LIZLLL(rect, fArr, rectF, enumC1312770kGZ.LIZJ(), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCachePath exception:");
            sbLIZ.append(e.toString());
            LynxLog.e("BackgroundDrawable", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(float r15, float r16, int r17, int r18, android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.LJIILL(float, float, int, int, android.graphics.Canvas):void");
    }

    public final void LJIILLIIL(Canvas canvas, int i, float f, int i2, int i3, boolean z) {
        int i4;
        EnumC1312770kGZ enumC1312770kGZ;
        EnumC1312770kGZ enumC1312770kGZ2;
        this.LJJ.setPathEffect(null);
        this.LJJ.setStyle(Paint.Style.STROKE);
        this.LJJ.setStrokeWidth(f);
        boolean z2 = true;
        if (i != 1 && i != 0) {
            z2 = false;
        }
        Paint paint = this.LJJ;
        if (z2) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        paint.setColor(C1312780kGa.LIZ(i4, this.LJJIFFI));
        if (z) {
            enumC1312770kGZ = EnumC1312770kGZ.OUTER3;
        } else {
            enumC1312770kGZ = EnumC1312770kGZ.OUTER2;
        }
        C1312750kGX c1312750kGXLJIIL = LJIIL(enumC1312770kGZ);
        if (c1312750kGXLJIIL != null) {
            c1312750kGXLJIIL.LIZIZ(canvas, this.LJJ);
        }
        Paint paint2 = this.LJJ;
        if (!z2) {
            i2 = i3;
        }
        paint2.setColor(C1312780kGa.LIZ(i2, this.LJJIFFI));
        if (z) {
            enumC1312770kGZ2 = EnumC1312770kGZ.INNER3;
        } else {
            enumC1312770kGZ2 = EnumC1312770kGZ.INNER2;
        }
        C1312750kGX c1312750kGXLJIIL2 = LJIIL(enumC1312770kGZ2);
        if (c1312750kGXLJIIL2 != null) {
            c1312750kGXLJIIL2.LIZIZ(canvas, this.LJJ);
        }
    }

    public static void LJIIJ(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double dAbs = Math.abs(d3 - d) / 2.0d;
        double dAbs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = dAbs2 * dAbs2;
        double d16 = dAbs * dAbs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = dAbs * 2.0d * dAbs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double dSqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = (d13 * dSqrt) + d14;
        double d22 = dSqrt + d9;
        double d23 = d21 + d10;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            pointF.x = (float) d22;
            pointF.y = (float) d23;
        }
    }

    public final void LJI(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (z) {
            C1312750kGX c1312750kGX = this.LJIILJJIL;
            if (c1312750kGX != null) {
                canvas.clipPath(c1312750kGX.LIZJ, Region.Op.INTERSECT);
            }
            C1312750kGX c1312750kGX2 = this.LJIILIIL;
            if (c1312750kGX2 != null) {
                canvas.clipPath(c1312750kGX2.LIZJ, Region.Op.DIFFERENCE);
            }
        }
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new Path();
        }
        this.LJIIZILJ.reset();
        this.LJIIZILJ.moveTo(f, f2);
        this.LJIIZILJ.lineTo(f3, f4);
        this.LJIIZILJ.lineTo(f5, f6);
        this.LJIIZILJ.lineTo(f7, f8);
        this.LJIIZILJ.lineTo(f, f2);
        canvas.clipPath(this.LJIIZILJ);
    }
}
