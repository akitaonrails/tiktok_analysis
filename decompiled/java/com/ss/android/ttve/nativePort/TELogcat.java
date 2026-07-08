package com.ss.android.ttve.nativePort;

import X.C2122208Tc;

/* JADX INFO: loaded from: classes4.dex */
public class TELogcat {
    public static native void nativeLog(byte b, String str, String str2);

    public static native void nativeSetEnableNonErrorLog(boolean z);

    public static native void nativeSetLogLevel(byte b);

    static {
        synchronized (C2122208Tc.class) {
            C2122208Tc.LIZJ();
        }
    }

    public static void setEnableNonErrorLog(boolean z) {
        nativeSetEnableNonErrorLog(z);
    }

    public static void setLogLevel(byte b) {
        nativeSetLogLevel(b);
    }

    public static void Log(byte b, String str, String str2) {
        nativeLog(b, str, str2);
    }
}
