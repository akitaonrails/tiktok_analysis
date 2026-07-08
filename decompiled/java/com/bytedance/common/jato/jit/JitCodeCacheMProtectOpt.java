package com.bytedance.common.jato.jit;

import X.C2104908Ml;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class JitCodeCacheMProtectOpt {
    public static final int LIZ = Build.VERSION.SDK_INT;

    public static native void nStartPharse1(long j, long j2);

    public static native void nStartPharse2();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = r10.split("\\s+")[0].split("-");
        r6 = r0[0];
        r5 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r6.startsWith("0x") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d3, code lost:
    
        r6 = r6.substring(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r5.startsWith("0x") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
    
        r5 = r5.substring(2);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.jit.JitCodeCacheMProtectOpt.LIZ():void");
    }

    public static void LIZIZ() {
        int i = LIZ;
        if (i < 24 || i > 30 || !C2104908Ml.LIZIZ()) {
            return;
        }
        nStartPharse2();
    }
}
