package com.ss.android.ugc.aweme.account.otl;

import X.C01GW;
import X.C080U;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174808fa;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class WebAuthSyncLoginApi {
    public static final WebAuthSyncLoginApi LIZ = new WebAuthSyncLoginApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(90));

    public interface Api {
        @InterfaceC1501160pAQ("/passport/oidc/app2web/auth/")
        Object getWebAuthToken(@InterfaceC1501120pAM("nonce") String str, @InterfaceC1501120pAM("state") String str2, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501120pAM("client_id") String str3, InterfaceC1364105Vn<? super WebAuthTokenResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C0WW3
            if (r0 == 0) goto L20
            r10 = r15
            X.0WW3 r10 = (X.C0WW3) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r2 = r10.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L71
        L20:
            X.0WW3 r10 = new X.0WW3
            r10.<init>(r11, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.01GW r0 = com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi.LIZIZ     // Catch: java.lang.Exception -> L77
            java.lang.Object r5 = r0.getValue()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi$Api r5 = (com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi.Api) r5     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = "/passport/oidc/app2web/auth/"
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L77
            r8.<init>()     // Catch: java.lang.Exception -> L77
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L77
            r1.append(r0)     // Catch: java.lang.Exception -> L77
            r1.append(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L77
            boolean r0 = X.C123100dR.LIZ(r2)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L65
            X.080U r1 = new X.080U     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = "x-tt-passport-csrf-token"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L77
            r8.add(r1)     // Catch: java.lang.Exception -> L77
        L65:
            r10.LLILLL = r3     // Catch: java.lang.Exception -> L77
            r9 = r14
            r7 = r13
            r6 = r12
            java.lang.Object r2 = r5.getWebAuthToken(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L77
            if (r2 != r4) goto L74
            return r4
        L71:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L77
        L74:
            com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse r2 = (com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse) r2     // Catch: java.lang.Exception -> L77
            return r2
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse r2 = new com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L85
            java.lang.String r1 = ""
        L85:
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginApi.LIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
