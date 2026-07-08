package com.ss.android.ttve.nativePort;

import X.C2122208Tc;

/* JADX INFO: loaded from: classes4.dex */
public class TEGPUInfoReader {
    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    static {
        synchronized (C2122208Tc.class) {
            C2122208Tc.LIZJ();
        }
    }
}
