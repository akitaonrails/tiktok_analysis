package com.ss.android.ugc.aweme.share;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareFlavorServiceImpl implements ShareFlavorService {
    public static int LIZIZ = 500;

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final String LIZLLL(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r5, long r6, X.C2241008qG r8) {
        /*
            r4 = this;
            r1 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Throwable -> L36
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L36
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L34
            r1.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "    "
            r1.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L34
            r3.append(r0)     // Catch: java.lang.Throwable -> L34
            goto L4d
        L34:
            r0 = move-exception
            goto L38
        L36:
            r0 = move-exception
            r2 = 0
        L38:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            goto L4b
        L3c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L46
            throw r1
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            throw r1
        L4b:
            if (r2 == 0) goto L55
        L4d:
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            int r1 = com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ
            java.lang.String r0 = r3.toString()
            int r0 = r0.length()
            if (r1 <= r0) goto L6b
            java.lang.String r0 = r3.toString()
            int r0 = r0.length()
            com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ = r0
        L6b:
            java.lang.String r2 = r3.toString()
            r1 = 0
            int r0 = com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ
            java.lang.String r2 = r2.substring(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = "errorFileContent"
            if (r0 != 0) goto L82
            r8.LIZLLL(r1, r2)
        L81:
            return
        L82:
            java.lang.String r0 = "file is null"
            r8.LIZLLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ(java.lang.String, long, X.08qG):void");
    }
}
