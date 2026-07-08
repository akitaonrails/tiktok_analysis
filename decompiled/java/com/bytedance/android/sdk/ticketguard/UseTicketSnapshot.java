package com.bytedance.android.sdk.ticketguard;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class UseTicketSnapshot extends CommonSnapshot {

    @C09CT("local_error")
    public final String local_error;

    @C09CT("remote_error")
    public final String remote_error;

    @C09CT("request_client_data")
    public final String request_client_data;

    @C09CT("request_client_data_req_content")
    public final String request_client_data_req_content;

    @C09CT("request_client_data_req_sign")
    public final String request_client_data_req_sign;

    @C09CT("request_client_data_timestamp")
    public final String request_client_data_timestamp;

    @C09CT("request_client_data_ts_sign")
    public final String request_client_data_ts_sign;

    @C09CT("ticket")
    public final String ticket;

    @C09CT("ticket_name")
    public final String ticket_name;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[PHI: r3
      0x0053: PHI (r3v1 com.bytedance.android.sdk.ticketguard.ClientData) = 
      (r3v0 com.bytedance.android.sdk.ticketguard.ClientData)
      (r3v3 com.bytedance.android.sdk.ticketguard.ClientData)
      (r3v3 com.bytedance.android.sdk.ticketguard.ClientData)
      (r3v3 com.bytedance.android.sdk.ticketguard.ClientData)
     binds: [B:28:0x0043, B:30:0x0047, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UseTicketSnapshot(X.C0XNW r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            java.lang.String r0 = r6.LIZJ
            r5.remote_error = r0
            P extends X.0XNN<?> r0 = r6.LIZ
            r3 = 0
            if (r0 == 0) goto L8a
            C extends X.0XNO<?> r4 = r0.requestContent
            X.0XNM r4 = (X.C0XNM) r4
        L10:
            java.lang.String r2 = ""
            if (r4 == 0) goto L18
            java.lang.String r0 = r4.LIZLLL
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r5.local_error = r0
            if (r4 == 0) goto L88
            P extends X.0XNA r1 = r4.LIZ
            X.0XMw r1 = (X.C847600XMw) r1
            if (r1 == 0) goto L2d
            java.lang.String r0 = r1.LIZ
            if (r0 == 0) goto L2d
            java.lang.String r0 = X.C0XNP.LIZ(r0)
            if (r0 != 0) goto L2e
        L2d:
            r0 = r2
        L2e:
            r5.ticket = r0
            if (r1 == 0) goto L36
            java.lang.String r0 = r1.LIZIZ
            if (r0 != 0) goto L37
        L36:
            r0 = r2
        L37:
            r5.ticket_name = r0
            if (r4 == 0) goto L86
            java.lang.String r0 = r4.LJI
        L3d:
            java.lang.String r0 = X.C0XNP.LIZ(r0)
            r5.request_client_data = r0
            if (r4 == 0) goto L53
            com.bytedance.android.sdk.ticketguard.ClientData r3 = r4.LJFF
            if (r3 == 0) goto L53
            java.lang.String r0 = r3.requestContent
            if (r0 == 0) goto L53
            java.lang.String r0 = X.C0XNP.LIZ(r0)
            if (r0 != 0) goto L54
        L53:
            r0 = r2
        L54:
            r5.request_client_data_req_content = r0
            if (r3 == 0) goto L62
            java.lang.String r0 = r3.requestSign
            if (r0 == 0) goto L62
            java.lang.String r0 = X.C0XNP.LIZ(r0)
            if (r0 != 0) goto L63
        L62:
            r0 = r2
        L63:
            r5.request_client_data_req_sign = r0
            if (r3 == 0) goto L73
            long r0 = r3.timestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L74
        L73:
            r0 = r2
        L74:
            r5.request_client_data_timestamp = r0
            if (r3 == 0) goto L83
            java.lang.String r0 = r3.tsSign
            if (r0 == 0) goto L83
            java.lang.String r0 = X.C0XNP.LIZ(r0)
            if (r0 == 0) goto L83
            r2 = r0
        L83:
            r5.request_client_data_ts_sign = r2
            return
        L86:
            r0 = r3
            goto L3d
        L88:
            r1 = r3
            goto L2d
        L8a:
            r4 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.sdk.ticketguard.UseTicketSnapshot.<init>(X.0XNW):void");
    }
}
