package com.ss.android.ttve.common;

import X.C2122208Tc;

/* JADX INFO: loaded from: classes21.dex */
public class TECloudCtrlInvoker {
    private native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    static {
        C2122208Tc.LIZJ();
    }

    public final boolean LIZ(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty() || nativeVerifyJson(str.getBytes(), str2.getBytes()) != 0) {
            return false;
        }
        return true;
    }
}
