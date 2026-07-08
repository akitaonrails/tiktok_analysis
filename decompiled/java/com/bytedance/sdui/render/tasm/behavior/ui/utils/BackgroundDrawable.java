package com.bytedance.sdui.render.tasm.behavior.ui.utils;

import X.AbstractC1314220kIu;
import X.AbstractC1317090kNX;
import X.C1313640kHy;
import X.C1313740kI8;
import X.C1313750kI9;
import X.C1314140kIm;
import X.C1314230kIv;
import X.C1314350kJ7;
import X.C1314860kJw;
import X.EnumC1313600kHu;
import X.EnumC1313770kIB;
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
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class BackgroundDrawable extends Drawable {
    public C1314230kIv LIZJ;
    public C1314230kIv LIZLLL;
    public EnumC1313600kHu[] LJ;
    public PathEffect LJFF;
    public C1313640kHy LJI;
    public C1313640kHy LJII;
    public Map<EnumC1313770kIB, C1313640kHy> LJIIIIZZ;
    public Path LJIIIZ;
    public Path LJIIJ;
    public PointF LJIIJJI;
    public PointF LJIIL;
    public PointF LJIILIIL;
    public PointF LJIILJJIL;
    public final C1313740kI8 LJIJJLI;
    public C1313750kI9 LJIL;
    public C1314350kJ7 LJJ;
    public final Rect LJIILL = new Rect();
    public final Rect LJIILLIIL = new Rect();
    public boolean LJIIZILJ = true;
    public final Paint LJIJ = new Paint(1);
    public int LJIJI = 0;
    public int LJIJJ = 255;
    public final C1314230kIv LIZIZ = new C1314230kIv();
    public final C1314230kIv LIZ = new C1314230kIv();

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final RectF LJFF() {
        float fLIZ = this.LIZ.LIZ(1);
        float fLIZ2 = this.LIZ.LIZ(3);
        float fLIZ3 = this.LIZ.LIZ(0);
        float fLIZ4 = this.LIZ.LIZ(2);
        Rect bounds = getBounds();
        float f = fLIZ3 + fLIZ4;
        if (f > bounds.width() && bounds.width() >= 1) {
            float fWidth = bounds.width() / f;
            fLIZ3 *= fWidth;
            fLIZ4 *= fWidth;
        }
        float f2 = fLIZ + fLIZ2;
        if (f2 > bounds.height() && bounds.height() >= 1) {
            float fHeight = bounds.height() / f2;
            fLIZ *= fHeight;
            fLIZ2 *= fHeight;
        }
        return new RectF(fLIZ3, fLIZ, fLIZ4, fLIZ2);
    }

    public final boolean LJIIL() {
        EnumC1313600kHu[] enumC1313600kHuArr = this.LJ;
        if (enumC1313600kHuArr == null) {
            return true;
        }
        EnumC1313600kHu enumC1313600kHu = enumC1313600kHuArr[8];
        EnumC1313600kHu enumC1313600kHu2 = enumC1313600kHuArr[0];
        if (enumC1313600kHu2 == null) {
            enumC1313600kHu2 = enumC1313600kHu;
        }
        EnumC1313600kHu enumC1313600kHu3 = enumC1313600kHuArr[2];
        if (enumC1313600kHu3 == null) {
            enumC1313600kHu3 = enumC1313600kHu;
        }
        if (enumC1313600kHu3 != enumC1313600kHu2) {
            return false;
        }
        EnumC1313600kHu enumC1313600kHu4 = enumC1313600kHuArr[1];
        if (enumC1313600kHu4 == null) {
            enumC1313600kHu4 = enumC1313600kHu;
        }
        if (enumC1313600kHu4 != enumC1313600kHu2) {
            return false;
        }
        EnumC1313600kHu enumC1313600kHu5 = enumC1313600kHuArr[3];
        if (enumC1313600kHu5 != null) {
            enumC1313600kHu = enumC1313600kHu5;
        }
        if (enumC1313600kHu != enumC1313600kHu2) {
            return false;
        }
        return enumC1313600kHu2 == null || enumC1313600kHu2.isSolidDashedOrDotted();
    }

    public final void LJIILL() {
        if (this.LJIL != null) {
            Rect bounds = getBounds();
            C1313750kI9 c1313750kI9 = this.LJIL;
            if (c1313750kI9.LIZJ != 0) {
                c1313750kI9.LIZJ = 0;
                c1313750kI9.LJ = null;
            }
            c1313750kI9.LIZLLL(bounds.width(), bounds.height());
        }
    }

    public final boolean LJIILLIIL() {
        if (this.LJIL == null) {
            return false;
        }
        if (!this.LJIIZILJ) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.LJIIZILJ = false;
        RectF rectFLJFF = LJFF();
        LJIILL();
        C1313750kI9 c1313750kI9 = this.LJIL;
        float[] fArrLIZ = c1313750kI9 != null ? c1313750kI9.LIZ() : null;
        if (this.LJI == null) {
            this.LJI = new C1313640kHy();
        }
        this.LJI.LIZJ(bounds, fArrLIZ, rectFLJFF, 1.0f, false);
        if (this.LJII == null) {
            this.LJII = new C1313640kHy();
        }
        this.LJII.LIZJ(bounds, fArrLIZ, rectFLJFF, 0.0f, false);
        C1313750kI9 c1313750kI92 = this.LJIL;
        if (c1313750kI92 != null && c1313750kI92.LIZJ()) {
            LJIILIIL(EnumC1313770kIB.CENTER, bounds, fArrLIZ, rectFLJFF);
            if (this.LJ != null) {
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                do {
                    EnumC1313600kHu enumC1313600kHu = this.LJ[i];
                    if (enumC1313600kHu != null) {
                        if (enumC1313600kHu == EnumC1313600kHu.DOUBLE) {
                            z = true;
                        } else if (enumC1313600kHu == EnumC1313600kHu.GROOVE || enumC1313600kHu == EnumC1313600kHu.RIDGE) {
                            z2 = true;
                        }
                    }
                    i++;
                } while (i <= 8);
                if (z) {
                    LJIILIIL(EnumC1313770kIB.INNER3, bounds, fArrLIZ, rectFLJFF);
                    LJIILIIL(EnumC1313770kIB.OUTER3, bounds, fArrLIZ, rectFLJFF);
                }
                if (z2) {
                    LJIILIIL(EnumC1313770kIB.INNER2, bounds, fArrLIZ, rectFLJFF);
                    LJIILIIL(EnumC1313770kIB.OUTER2, bounds, fArrLIZ, rectFLJFF);
                }
            }
        }
        Path path = this.LJIIIZ;
        if (path == null) {
            this.LJIIIZ = new Path();
        } else {
            path.reset();
        }
        this.LJIIIZ.addRoundRect(new RectF(bounds), C1313640kHy.LIZIZ(fArrLIZ, rectFLJFF, -0.5f), Path.Direction.CW);
        C1313640kHy c1313640kHy = this.LJI;
        RectF rectF = c1313640kHy.LIZ;
        RectF rectF2 = this.LJII.LIZ;
        float[] fArr = c1313640kHy.LIZIZ;
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new PointF();
        }
        PointF pointF = this.LJIIJJI;
        RectF rectF3 = this.LJI.LIZ;
        pointF.x = rectF3.left;
        pointF.y = rectF3.top;
        double d = rectF.left;
        double d2 = rectF.top;
        LJI(d, d2, (fArr[0] * 2.0f) + r2, (fArr[1] * 2.0f) + r1, rectF2.left, rectF2.top, d, d2, pointF);
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new PointF();
        }
        PointF pointF2 = this.LJIILJJIL;
        float f = rectF.left;
        pointF2.x = f;
        float f2 = rectF.bottom;
        pointF2.y = f2;
        double d3 = f;
        double d4 = f2;
        LJI(d3, f2 - (fArr[6] * 2.0f), (fArr[7] * 2.0f) + f, d4, rectF2.left, rectF2.bottom, d3, d4, pointF2);
        if (this.LJIIL == null) {
            this.LJIIL = new PointF();
        }
        PointF pointF3 = this.LJIIL;
        float f3 = rectF.right;
        pointF3.x = f3;
        float f4 = rectF.top;
        pointF3.y = f4;
        double d5 = f4;
        double d6 = f3;
        LJI(f3 - (fArr[2] * 2.0f), d5, d6, (fArr[3] * 2.0f) + f4, rectF2.right, rectF2.top, d6, d5, pointF3);
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new PointF();
        }
        PointF pointF4 = this.LJIILIIL;
        float f5 = rectF.right;
        pointF4.x = f5;
        float f6 = rectF.bottom;
        pointF4.y = f6;
        double d7 = f5;
        double d8 = f6;
        LJI(f5 - (fArr[4] * 2.0f), f6 - (fArr[5] * 2.0f), d7, d8, rectF2.right, rectF2.bottom, d7, d8, pointF4);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iLIZ = C1314860kJw.LIZ(this.LJIJI, this.LJIJJ) >>> 24;
        if (iLIZ == 255) {
            return -1;
        }
        return iLIZ == 0 ? -2 : -3;
    }

    public final void LJIILJJIL() {
        Rect bounds = getBounds();
        this.LJIILL.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        RectF rectFLJFF = LJFF();
        Rect rect = this.LJIILL;
        int i = (int) (rect.left + rectFLJFF.left);
        rect.left = i;
        int i2 = (int) (rect.top + rectFLJFF.top);
        rect.top = i2;
        int i3 = (int) (rect.right - rectFLJFF.right);
        rect.right = i3;
        int i4 = (int) (rect.bottom - rectFLJFF.bottom);
        rect.bottom = i4;
        this.LJIILLIIL.set(i, i2, i3, i4);
        C1314230kIv c1314230kIv = this.LIZIZ;
        if (c1314230kIv != null) {
            this.LJIILLIIL.left = (int) (r2.left + c1314230kIv.LIZ(0));
            this.LJIILLIIL.top = (int) (r3.top + this.LIZIZ.LIZ(1));
            this.LJIILLIIL.right = (int) (r3.right - this.LIZIZ.LIZ(2));
            this.LJIILLIIL.bottom = (int) (r3.bottom - this.LIZIZ.LIZ(3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJIJJ;
    }

    public static int LIZ(float f) {
        if (f > 0.1f && f < 1.0f) {
            return 1;
        }
        return Math.round(f);
    }

    public static boolean LJIIIIZZ(EnumC1313600kHu enumC1313600kHu) {
        if (enumC1313600kHu != EnumC1313600kHu.DASHED && enumC1313600kHu != EnumC1313600kHu.DOTTED && enumC1313600kHu != EnumC1313600kHu.HIDDEN) {
            return false;
        }
        return true;
    }

    public final int LIZJ(int i) {
        float fLIZ;
        float fLIZ2;
        C1314230kIv c1314230kIv = this.LIZJ;
        if (c1314230kIv != null) {
            fLIZ = c1314230kIv.LIZ(i);
        } else {
            fLIZ = 0.0f;
        }
        C1314230kIv c1314230kIv2 = this.LIZLLL;
        if (c1314230kIv2 != null) {
            fLIZ2 = c1314230kIv2.LIZ(i);
        } else {
            fLIZ2 = 255.0f;
        }
        return ((((int) fLIZ2) << 24) & (-16777216)) | (((int) fLIZ) & 16777215);
    }

    public final EnumC1313600kHu LIZLLL(int i) {
        EnumC1313600kHu[] enumC1313600kHuArr;
        if (i <= 8 && i >= 0 && (enumC1313600kHuArr = this.LJ) != null) {
            EnumC1313600kHu enumC1313600kHu = enumC1313600kHuArr[i];
            if (enumC1313600kHu != null) {
                return enumC1313600kHu;
            }
            return enumC1313600kHuArr[8];
        }
        return null;
    }

    public final EnumC1313600kHu LJ(int i) {
        EnumC1313600kHu[] enumC1313600kHuArr = this.LJ;
        if (enumC1313600kHuArr != null) {
            EnumC1313600kHu enumC1313600kHu = enumC1313600kHuArr[i];
            if (enumC1313600kHu == null) {
                EnumC1313600kHu enumC1313600kHu2 = enumC1313600kHuArr[8];
                if (enumC1313600kHu2 != null) {
                    return enumC1313600kHu2;
                }
            } else {
                return enumC1313600kHu;
            }
        }
        return EnumC1313600kHu.SOLID;
    }

    public final C1313640kHy LJII(EnumC1313770kIB enumC1313770kIB) {
        Map<EnumC1313770kIB, C1313640kHy> map = this.LJIIIIZZ;
        if (map == null) {
            return null;
        }
        return (C1313640kHy) ((HashMap) map).get(enumC1313770kIB);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06a3 A[PHI: r4
      0x06a3: PHI (r4v12 float) = (r4v11 float), (r4v14 float) binds: [B:274:0x0659, B:276:0x0673] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r57) {
        /*
            Method dump skipped, instruction units count: 2479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Path path;
        if (this.LJIL != null && LJIILLIIL() && (path = this.LJIIIZ) != null) {
            outline.setConvexPath(path);
        } else {
            outline.setRect(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LJIIZILJ = true;
        for (AbstractC1314220kIu abstractC1314220kIu : (ArrayList) this.LJIJJLI.LL) {
            rect.width();
            rect.height();
            abstractC1314220kIu.LJFF();
        }
        LJIILJJIL();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJIJJ) {
            this.LJIJJ = i;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.LJIJI = i;
        invalidateSelf();
    }

    public BackgroundDrawable(AbstractC1317090kNX abstractC1317090kNX, float f) {
        this.LJIJJLI = null;
        this.LJIJJLI = new C1313740kI8(this);
    }

    public final void LJIIIZ(float f, int i) {
        if (!C1314140kIm.LIZ(this.LIZIZ.LIZ[i], f)) {
            this.LIZIZ.LIZIZ(f, i);
            this.LJIIZILJ = true;
            LJIILJJIL();
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.EnumC1313770kIB r9, android.graphics.Rect r10, float[] r11, android.graphics.RectF r12) {
        /*
            r8 = this;
            java.util.Map<X.0kIB, X.0kHy> r0 = r8.LJIIIIZZ     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L21
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r0.get(r9)     // Catch: java.lang.Exception -> L4f
            X.0kHy r2 = (X.C1313640kHy) r2     // Catch: java.lang.Exception -> L4f
            if (r2 != 0) goto L1a
        Le:
            X.0kHy r2 = new X.0kHy     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            java.util.Map<X.0kIB, X.0kHy> r0 = r8.LJIIIIZZ     // Catch: java.lang.Exception -> L4f
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L4f
            r0.put(r9, r2)     // Catch: java.lang.Exception -> L4f
        L1a:
            int r1 = r9.ordinal()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L45
            goto L29
        L21:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L4f
            r0.<init>()     // Catch: java.lang.Exception -> L4f
            r8.LJIIIIZZ = r0     // Catch: java.lang.Exception -> L4f
            goto Le
        L29:
            r0 = 1
            if (r1 == r0) goto L42
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L3b
            r0 = 4
            if (r1 == r0) goto L37
            r6 = 0
            goto L47
        L37:
            r6 = 1042983595(0x3e2aaaab, float:0.16666667)
            goto L47
        L3b:
            r6 = 1062557013(0x3f555555, float:0.8333333)
            goto L47
        L3f:
            r6 = 1048576000(0x3e800000, float:0.25)
            goto L47
        L42:
            r6 = 1061158912(0x3f400000, float:0.75)
            goto L47
        L45:
            r6 = 1056964608(0x3f000000, float:0.5)
        L47:
            r7 = 1
            r5 = r12
            r4 = r11
            r3 = r10
            r2.LIZJ(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4f
            return
        L4f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateCachePath exception:"
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable.LJIILIIL(X.0kIB, android.graphics.Rect, float[], android.graphics.RectF):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(float r15, float r16, int r17, int r18, android.graphics.Canvas r19) {
        /*
            r14 = this;
            r10 = r15
            r12 = r18
            r7 = r14
            X.0kHu[] r1 = r7.LJ
            r2 = 0
            r9 = r17
            if (r1 == 0) goto L15
            r6 = r1[r9]
            if (r6 != 0) goto L17
            r0 = 8
            r6 = r1[r0]
            if (r6 != 0) goto L17
        L15:
            X.0kHu r6 = X.EnumC1313600kHu.SOLID
        L17:
            r7.LJFF = r2
            int[] r1 = X.C1313760kIA.LIZIZ
            int r0 = r6.ordinal()
            r5 = r1[r0]
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 16711422(0xfefefe, float:2.341769E-38)
            r1 = 1
            r0 = 1073741824(0x40000000, float:2.0)
            r8 = r19
            switch(r5) {
                case 1: goto L7e;
                case 2: goto L7e;
                case 3: goto L66;
                case 4: goto L66;
                case 5: goto L2e;
                case 6: goto L74;
                case 7: goto L6d;
                case 8: goto L7f;
                case 9: goto L8d;
                case 10: goto L9e;
                default: goto L2e;
            }
        L2e:
            android.graphics.Paint r3 = r7.LJIJ
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            android.graphics.Paint r3 = r7.LJIJ
            int r0 = r7.LJIJJ
            int r0 = X.C1314860kJw.LIZ(r12, r0)
            r3.setColor(r0)
            android.graphics.Paint r0 = r7.LJIJ
            r3 = r16
            r0.setStrokeWidth(r3)
            android.graphics.Paint r3 = r7.LJIJ
            android.graphics.PathEffect r0 = r7.LJFF
            r3.setPathEffect(r0)
            android.graphics.Paint r0 = r7.LJIJ
            r0.setAntiAlias(r1)
            X.0kIB r0 = X.EnumC1313770kIB.CENTER
            X.0kHy r1 = r7.LJII(r0)
            if (r1 == 0) goto L60
            android.graphics.Paint r0 = r7.LJIJ
            r1.LIZ(r8, r0)
        L60:
            android.graphics.Paint r0 = r7.LJIJ
            r0.setPathEffect(r2)
            return
        L66:
            android.graphics.PathEffect r0 = r6.getPathEffect(r10)
            r7.LJFF = r0
            goto L2e
        L6d:
            r0 = 3
            if (r9 == r0) goto L78
            r0 = 2
            if (r9 != r0) goto L2e
            goto L78
        L74:
            if (r9 == r1) goto L78
            if (r9 != 0) goto L2e
        L78:
            r0 = r12 & r3
            int r0 = r0 >> r1
            r12 = r12 & r4
            r12 = r12 | r0
            goto L2e
        L7e:
            return
        L7f:
            r0 = 1077936128(0x40400000, float:3.0)
            float r10 = r10 / r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            r7 = r12
            r8 = r1
            r2.LJIIJJI(r3, r4, r5, r6, r7, r8)
            return
        L8d:
            float r10 = r10 / r0
            r0 = r12 & r3
            int r0 = r0 >> r1
            r5 = r12 & r4
            r5 = r5 | r0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r0.LJIIJJI(r1, r2, r3, r4, r5, r6)
            return
        L9e:
            float r10 = r10 / r0
            r0 = r12 & r3
            int r0 = r0 >> r1
            r11 = r12 & r4
            r11 = r11 | r0
            r13 = 0
            r7.LJIIJJI(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable.LJIIJ(float, float, int, int, android.graphics.Canvas):void");
    }

    public final void LJIIJJI(Canvas canvas, int i, float f, int i2, int i3, boolean z) {
        int i4;
        EnumC1313770kIB enumC1313770kIB;
        EnumC1313770kIB enumC1313770kIB2;
        this.LJIJ.setPathEffect(null);
        this.LJIJ.setStyle(Paint.Style.STROKE);
        this.LJIJ.setStrokeWidth(f);
        boolean z2 = true;
        if (i != 1 && i != 0) {
            z2 = false;
        }
        Paint paint = this.LJIJ;
        if (z2) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        paint.setColor(C1314860kJw.LIZ(i4, this.LJIJJ));
        if (z) {
            enumC1313770kIB = EnumC1313770kIB.OUTER3;
        } else {
            enumC1313770kIB = EnumC1313770kIB.OUTER2;
        }
        C1313640kHy c1313640kHyLJII = LJII(enumC1313770kIB);
        if (c1313640kHyLJII != null) {
            c1313640kHyLJII.LIZ(canvas, this.LJIJ);
        }
        Paint paint2 = this.LJIJ;
        if (!z2) {
            i2 = i3;
        }
        paint2.setColor(C1314860kJw.LIZ(i2, this.LJIJJ));
        if (z) {
            enumC1313770kIB2 = EnumC1313770kIB.INNER3;
        } else {
            enumC1313770kIB2 = EnumC1313770kIB.INNER2;
        }
        C1313640kHy c1313640kHyLJII2 = LJII(enumC1313770kIB2);
        if (c1313640kHyLJII2 != null) {
            c1313640kHyLJII2.LIZ(canvas, this.LJIJ);
        }
    }

    public static void LJI(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
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

    public final void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (z) {
            C1313640kHy c1313640kHy = this.LJII;
            if (c1313640kHy != null) {
                canvas.clipPath(c1313640kHy.LIZJ, Region.Op.INTERSECT);
            }
            C1313640kHy c1313640kHy2 = this.LJI;
            if (c1313640kHy2 != null) {
                canvas.clipPath(c1313640kHy2.LIZJ, Region.Op.DIFFERENCE);
            }
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new Path();
        }
        this.LJIIJ.reset();
        this.LJIIJ.moveTo(f, f2);
        this.LJIIJ.lineTo(f3, f4);
        this.LJIIJ.lineTo(f5, f6);
        this.LJIIJ.lineTo(f7, f8);
        this.LJIIJ.lineTo(f, f2);
        canvas.clipPath(this.LJIIJ);
    }
}
