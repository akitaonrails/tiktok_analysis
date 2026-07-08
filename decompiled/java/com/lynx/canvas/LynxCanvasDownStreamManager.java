package com.lynx.canvas;

import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public class LynxCanvasDownStreamManager {
    public static native long nativeAddSurface(long j, String str, Surface surface, int i, int i2, int i3);

    public static native void nativeRemoveSurface(long j, String str, long j2);

    public LynxCanvasDownStreamManager() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("CanvasDownStreamSurfaceManager should be used on main thread only.");
        }
    }
}
