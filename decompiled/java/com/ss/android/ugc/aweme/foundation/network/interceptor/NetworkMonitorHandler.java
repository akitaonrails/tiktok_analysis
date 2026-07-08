package com.ss.android.ugc.aweme.foundation.network.interceptor;

import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkMonitorHandler implements NetworkPartner.ResponseHandler {
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0XS7<?> r10, X.C1499330p7T r11) {
        /*
            r9 = this;
            boolean r0 = r10.LIZIZ()
            r8 = 0
            r7 = 1
            java.lang.String r6 = ""
            if (r0 == 0) goto La5
            T r2 = r10.LJII
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse r2 = (com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse) r2
            if (r2 == 0) goto La2
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L9d
            r3 = 0
        L1b:
            r0 = r6
            r1 = r6
        L1d:
            r2 = 6
            kotlin.Pair[] r5 = new kotlin.Pair[r2]
            java.lang.String r4 = java.lang.String.valueOf(r3)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "status"
            r3.<init>(r2, r4)
            r5[r8] = r3
            X.0XLG r3 = r10.LJ
            java.lang.String r2 = "X-Tt-Logid"
            java.lang.String r4 = r3.LIZJ(r2)
            if (r4 != 0) goto L38
            r4 = r6
        L38:
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "log_id"
            r3.<init>(r2, r4)
            r5[r7] = r3
            X.0X9S<?> r2 = r11.LIZ
            if (r2 == 0) goto L52
            com.bytedance.retrofit2.client.Request r2 = r2.request()
            if (r2 == 0) goto L52
            java.lang.String r2 = r2.getPath()
            if (r2 == 0) goto L52
            r6 = r2
        L52:
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "path"
            r3.<init>(r2, r6)
            r2 = 2
            r5[r2] = r3
            long r6 = java.lang.System.currentTimeMillis()
            X.0ozn r2 = r11.LIZIZ
            if (r2 == 0) goto L98
            long r2 = r2.LJIILIIL
        L66:
            long r6 = r6 - r2
            java.lang.String r4 = java.lang.String.valueOf(r6)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "duration"
            r3.<init>(r2, r4)
            r2 = 3
            r5[r2] = r3
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "error_code"
            r3.<init>(r2, r1)
            r1 = 4
            r5[r1] = r3
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "error_message"
            r2.<init>(r1, r0)
            r0 = 5
            r5[r0] = r2
            java.util.Map r1 = X.C2097608Jq.LJIIJ(r5)
            X.0ulR r0 = X.C1716310ulR.LIZ
            r0.getClass()
            java.lang.String r0 = "rd_pipo_network"
            X.C1716310ulR.LIZLLL(r0, r1)
            return
        L98:
            long r2 = java.lang.System.currentTimeMillis()
            goto L66
        L9d:
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = r2.errorMsg
            goto Lad
        La2:
            r3 = 1
            goto L1b
        La5:
            int r0 = r10.LIZJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r10.LIZLLL
        Lad:
            r3 = 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler.LIZ(X.0XS7, X.0p7T):void");
    }
}
