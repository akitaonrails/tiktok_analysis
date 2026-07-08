package com.bytedance.fly_main_color;

import X.C204674156y;
import X.C2439109h7;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes32.dex */
public final class FlyMainColor {
    public static final FlyMainColor LIZ = new FlyMainColor();

    private final native int nCutMainColor(Bitmap bitmap, int[] iArr, int[] iArr2, int[] iArr3);

    private final native float nGetColorDifference(int i, int i2, int i3, int i4, int i5, int i6);

    private final native int nRGB2OKLCH(int i, int i2, int i3, float[] fArr);

    private final native int nSolveMainColor(int i, int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, float f4, float f5, float f6, float f7);

    static {
        LoadSoLancet.LIZJ("fly-main-color-lib");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("fly-main-color-lib");
        LoadSoLancet.LJ(jUptimeMillis, "fly-main-color-lib");
        LoadSoLancet.LIZLLL(jUptimeMillis, "fly-main-color-lib");
        LoadSoLancet.LIZIZ("fly-main-color-lib");
    }

    public static int LIZJ(C204674156y c204674156y) {
        return LIZ.nSolveMainColor(c204674156y.LIZLLL, c204674156y.LJ, c204674156y.LJFF, c204674156y.LJI, c204674156y.LJII, c204674156y.LJIIIIZZ, c204674156y.LJIIIZ, c204674156y.LJIIJ, c204674156y.LJIIJJI, c204674156y.LJIIL, c204674156y.LJIILIIL);
    }

    public final C204674156y LIZ(C2439109h7 c2439109h7) {
        int[] iArr;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        Rect rect = c2439109h7.LIZ;
        if (rect == null) {
            iArr = null;
        } else {
            iArr = new int[]{rect.left, rect.top, rect.right, rect.bottom};
        }
        return new C204674156y(nCutMainColor(c2439109h7.LIZIZ, iArr, iArr2, iArr3), iArr2, iArr3);
    }

    public final float[] LIZIZ(int i) {
        float[] fArr = new float[3];
        nRGB2OKLCH(Color.red(i), Color.green(i), Color.blue(i), fArr);
        return fArr;
    }
}
