package com.bytedance.sysoptimizer;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceUtils {
    public static native int nativeSetSurfaceGeometry(Surface surface, int i, int i2);

    public static int setSurfaceGeometry(Surface surface, int i, int i2) {
        return nativeSetSurfaceGeometry(surface, i, i2);
    }
}
