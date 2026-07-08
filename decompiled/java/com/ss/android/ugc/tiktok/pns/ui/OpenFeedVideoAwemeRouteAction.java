package com.ss.android.ugc.tiktok.pns.ui;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes13.dex */
public final class OpenFeedVideoAwemeRouteAction implements IRouteAction {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[PHI: r5
      0x0025: PHI (r5v1 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:6:0x000b, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L65
            if (r10 == 0) goto L68
            java.lang.String r0 = "enter_from"
            java.lang.String r6 = r10.getString(r0)
        La:
            r5 = 0
            if (r10 == 0) goto L25
            java.lang.String r0 = "show_badge"
            java.lang.String r0 = r10.getString(r0)
            if (r0 == 0) goto L1d
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L1d
            r5 = 1
        L1d:
            java.lang.String r0 = "item_id"
            java.lang.String r4 = r10.getString(r0)
            if (r4 != 0) goto L27
        L25:
            java.lang.String r4 = "7473967813569301806"
        L27:
            if (r5 == 0) goto L3e
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            Y.ARunnableS112S0100000_12 r2 = new Y.ARunnableS112S0100000_12
            r0 = 228(0xe4, float:3.2E-43)
            r2.<init>(r8, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        L3e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme://aweme/detail/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "?enter_from="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "&show_badge="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r8, r0)
            r0.open()
        L65:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L68:
            r6 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.ui.OpenFeedVideoAwemeRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
