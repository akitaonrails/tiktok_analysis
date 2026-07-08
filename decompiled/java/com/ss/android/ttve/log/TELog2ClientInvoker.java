package com.ss.android.ttve.log;

import X.C2122208Tc;
import X.C971740bOW;

/* JADX INFO: loaded from: classes16.dex */
public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetIsToLogcat(boolean z);

    static {
        synchronized (C2122208Tc.class) {
            C2122208Tc.LIZJ();
        }
    }

    public static boolean onNativeCallback_checkJni(byte[] bArr) {
        if (bArr != null) {
            bArr[0] = 1;
            return true;
        }
        C971740bOW.LIZ(4, "onCheckJni data is null");
        return false;
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        C971740bOW.LIZ(i, str);
    }
}
