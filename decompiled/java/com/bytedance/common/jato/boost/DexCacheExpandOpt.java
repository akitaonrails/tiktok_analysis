package com.bytedance.common.jato.boost;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class DexCacheExpandOpt {
    public static volatile boolean LIZ;

    public static native void checkHitExpand();

    public static native boolean expandInner(ClassLoader classLoader, int i, int i2, int i3, int i4);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZ(int i) {
        if (i <= 1024) {
            return;
        }
        LIZ = true;
        expandInner(DexCacheExpandOpt.class.getClassLoader(), i, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r4, int r5, int r6, int r7) {
        /*
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L12
            java.lang.String r3 = "unknown"
        L12:
            r2 = r3
        L13:
            if (r2 != 0) goto L32
            return
        L16:
            if (r3 == 0) goto L13
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L32
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            goto L13
        L32:
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "aosp"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3f
            return
        L3f:
            boolean r0 = com.bytedance.common.jato.boost.DexCacheExpandOpt.LIZ
            if (r0 == 0) goto L44
            return
        L44:
            r1 = 0
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 > r0) goto L4a
            r4 = 0
        L4a:
            if (r5 > r0) goto L4d
            r5 = 0
        L4d:
            if (r6 > r0) goto L50
            r6 = 0
        L50:
            if (r7 > r0) goto L53
            r7 = 0
        L53:
            if (r4 != 0) goto L5c
            if (r5 != 0) goto L5e
            if (r6 != 0) goto L73
            if (r7 != 0) goto L73
            return
        L5c:
            if (r5 <= 0) goto L73
        L5e:
            java.lang.String r0 = "samsung"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L73
        L66:
            r0 = 1
            com.bytedance.common.jato.boost.DexCacheExpandOpt.LIZ = r0
            java.lang.Class<com.bytedance.common.jato.boost.DexCacheExpandOpt> r0 = com.bytedance.common.jato.boost.DexCacheExpandOpt.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            expandInner(r0, r4, r1, r6, r7)
            return
        L73:
            r1 = r5
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.boost.DexCacheExpandOpt.LIZIZ(int, int, int, int):void");
    }
}
