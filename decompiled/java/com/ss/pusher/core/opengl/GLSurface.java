package com.ss.pusher.core.opengl;

import android.view.Surface;
import com.ss.pusher.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public class GLSurface extends NativeObject {
    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native int nativeQuerySurfaceHeight();

    public native int nativeQuerySurfaceWidth();

    public native boolean nativeSurfaceChanged(int i, int i2, int i3);

    public native boolean nativeSurfaceCreate(int i, int i2, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();
}
