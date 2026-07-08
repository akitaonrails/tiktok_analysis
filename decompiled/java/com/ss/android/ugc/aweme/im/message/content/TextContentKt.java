package com.ss.android.ugc.aweme.im.message.content;

/* JADX INFO: loaded from: classes.dex */
public final class TextContentKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getTextByStarlingKey(java.lang.String r5, android.content.Context r6) {
        /*
            r4 = 0
            r3 = 0
            if (r5 == 0) goto Lb
            int r0 = r5.length()     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r3
        L11:
            android.content.res.Resources r2 = r6.getResources()     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L26
            java.lang.String r1 = "string"
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Exception -> L42
            int r0 = X.C786410Ut5.n3(r2, r5, r1, r0)     // Catch: java.lang.Exception -> L42
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L42
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 == 0) goto L46
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L42
            if (r0 <= 0) goto L46
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = r6.getString(r0)     // Catch: java.lang.Exception -> L42
            int r0 = r1.length()     // Catch: java.lang.Exception -> L42
            if (r0 <= 0) goto L3e
            r4 = 1
        L3e:
            if (r4 == 0) goto L41
            return r1
        L41:
            return r3
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.content.TextContentKt.getTextByStarlingKey(java.lang.String, android.content.Context):java.lang.String");
    }
}
