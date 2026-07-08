package com.google.android.play.core.install;

import X.C0W4V;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends C0W4V {
    public int getErrorCode() {
        return super.getStatusCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            java.util.Locale r5 = java.util.Locale.getDefault()
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3[r1] = r0
            java.util.Map r6 = X.C812860Vue.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r6 = (java.util.HashMap) r6
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L5e
            java.util.Map r1 = X.C812860Vue.LIZIZ
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L4c:
            r0 = 1
            r3[r0] = r1
            java.lang.String r0 = "Install Error(%d): %s"
            java.lang.String r0 = X.C786410Ut5.k4(r5, r0, r3)
            r4.<init>(r8, r0)
            r7.<init>(r4)
            if (r8 == 0) goto L61
            return
        L5e:
            java.lang.String r1 = ""
            goto L4c
        L61:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.a.<init>(int):void");
    }
}
