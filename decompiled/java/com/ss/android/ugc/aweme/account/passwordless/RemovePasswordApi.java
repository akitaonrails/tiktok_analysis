package com.ss.android.ugc.aweme.account.passwordless;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class RemovePasswordApi {
    public static final RemovePasswordApi LIZ = new RemovePasswordApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(85));

    public interface Api {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/user/remove_password/")
        Object removePassword(@InterfaceC1501050pAF("entrance") String str, @InterfaceC1501050pAF("passport_ticket") String str2, InterfaceC1364105Vn<? super RemovePasswordApiResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1669840tYU
            if (r0 == 0) goto L20
            r4 = r8
            X.0tYU r4 = (X.C1669840tYU) r4
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
            X.0tYU r4 = new X.0tYU
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi$Api r0 = (com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi.Api) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.removePassword(r6, r7, r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse r3 = (com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse r3 = new com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
