package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501160pAQ;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyCredentialsApi {
    public static final PasskeyCredentialsApi LIZ = new PasskeyCredentialsApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(84));

    public interface Api {
        @InterfaceC1501160pAQ("/passport/fido2/credentials/")
        Object getCredentials(InterfaceC1364105Vn<? super PasskeyCredentialsApiResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1886400zBm
            if (r0 == 0) goto L20
            r4 = r6
            X.0zBm r4 = (X.C1886400zBm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L42
        L20:
            X.0zBm r4 = new X.0zBm
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi$Api r0 = (com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi.Api) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.getCredentials(r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse r3 = (com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse r3 = new com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi.LIZ(X.05Vn):java.lang.Object");
    }
}
