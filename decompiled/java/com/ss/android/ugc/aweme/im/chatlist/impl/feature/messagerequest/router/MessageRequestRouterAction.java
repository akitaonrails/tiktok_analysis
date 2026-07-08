package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.router;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestRouterAction implements IRouteAction {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[PHI: r2
      0x0026: PHI (r2v4 long) = (r2v0 long), (r2v5 long) binds: [B:30:0x0068, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r2 r5
      0x002a: PHI (r2v1 long) = (r2v4 long), (r2v5 long) binds: [B:15:0x0028, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r5v0 java.lang.String) = (r5v3 java.lang.String), (r5v4 java.lang.String) binds: [B:15:0x0028, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r2 r5
      0x0062: PHI (r2v3 long) = (r2v1 long), (r2v1 long), (r2v1 long), (r2v4 long) binds: [B:17:0x0030, B:19:0x0036, B:21:0x003c, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v0 java.lang.String), (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:17:0x0030, B:19:0x0036, B:21:0x003c, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L6b
            if (r8 == 0) goto L6b
            int r0 = r8.length()
            if (r0 == 0) goto L6b
            if (r9 == 0) goto L64
            java.lang.String r0 = "click_start_page_time"
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L64
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L64
            long r2 = r0.longValue()
        L1e:
            java.lang.String r0 = "enter_from"
            java.lang.String r5 = r9.getString(r0)
            if (r5 != 0) goto L2a
        L26:
            java.lang.String r5 = ""
            if (r9 == 0) goto L62
        L2a:
            java.lang.String r0 = "stranger_request_type"
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L62
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L62
            int r1 = r0.intValue()
            if (r1 < 0) goto L62
            X.07zh r0 = X.EnumC871430YGn.getEntries()
            java.lang.Object r4 = r0.get(r1)
            X.0YGn r4 = (X.EnumC871430YGn) r4
        L48:
            X.0Ys6 r0 = com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI> r0 = X.C887720Ys6.LIZIZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI r1 = (com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI) r1
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams r0 = new com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams
            r0.<init>(r2, r5, r4)
            r1.LIZ(r7, r0)
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L62:
            r4 = 0
            goto L48
        L64:
            long r2 = android.os.SystemClock.uptimeMillis()
            if (r9 == 0) goto L26
            goto L1e
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.router.MessageRequestRouterAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
