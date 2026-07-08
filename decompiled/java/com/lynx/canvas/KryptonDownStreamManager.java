package com.lynx.canvas;

import X.C1288370jdD;
import X.EnumC1285200jY6;
import android.graphics.RectF;
import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonDownStreamManager {
    public static native long nativeAddSurface(long j, String str, Surface surface, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4);

    public static native void nativeRemoveSurface(long j, String str, long j2);

    public KryptonDownStreamManager() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("KryptonDownStreamManager should be used on main thread only.");
        }
    }

    public static void LIZIZ(KryptonApp kryptonApp, long j, String str) {
        long jLJFF = kryptonApp.LJFF();
        if (jLJFF == 0) {
            C1288370jdD.LIZIZ("KryptonDownStreamManager", "canvas app weak ptr is nullptr.");
        } else {
            nativeRemoveSurface(jLJFF, str, j);
        }
    }

    public static long LIZ(KryptonApp kryptonApp, Surface surface, int i, int i2, EnumC1285200jY6 enumC1285200jY6, RectF rectF, int i3) {
        long jLJFF = kryptonApp.LJFF();
        if (jLJFF == 0) {
            C1288370jdD.LIZIZ("KryptonDownStreamManager", "canvas app weak ptr is nullptr.");
            return 0L;
        }
        if (enumC1285200jY6 == EnumC1285200jY6.SCALE_TO_FILL_WITH_SOURCE_CROP) {
            if (rectF != null) {
                return nativeAddSurface(jLJFF, "miniGame", surface, i, i2, enumC1285200jY6.value, rectF.left, (1.0f - rectF.top) - rectF.height(), rectF.width(), rectF.height(), i3);
            }
            throw new IllegalArgumentException("sourceRect must be passed if use SCALE_TO_FILL_WITH_SOURCE_CROP");
        }
        return nativeAddSurface(jLJFF, "miniGame", surface, i, i2, enumC1285200jY6.value, 0.0f, 0.0f, 0.0f, 0.0f, i3);
    }
}
