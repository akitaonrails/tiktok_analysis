package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.C01GW;
import X.C0X52;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class TrustedFriendsApi {
    public static final TrustedFriendsApi LIZ = new TrustedFriendsApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(72));

    public interface Api {
        @InterfaceC1501170pAR("/passport/aaas/verify/")
        Object getVerifyingFriendsList(@InterfaceC1501070pAH("challenge_type") int i, @InterfaceC1501070pAH("action") int i2, @InterfaceC1501350pAj("x-tt-passport-csrf-token") String str, InterfaceC1364105Vn<? super C0X52<FetchNeedVerifyFriendListResponse>> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.account.login.trustedfriends.FetchNeedVerifyFriendListResponse>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C848690XRb
            if (r0 == 0) goto L20
            r6 = r9
            X.0XRb r6 = (X.C848690XRb) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L5c
        L20:
            X.0XRb r6 = new X.0XRb
            r6.<init>(r8, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi.LIZIZ     // Catch: java.lang.Exception -> L62
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L62
            com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi$Api r3 = (com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi.Api) r3     // Catch: java.lang.Exception -> L62
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L62
            r1.append(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "/passport/aaas/verify/"
            r1.append(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L62
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L62
            r1 = 8
            r0 = 9
            java.lang.Object r1 = r3.getVerifyingFriendsList(r1, r0, r2, r6)     // Catch: java.lang.Exception -> L62
            if (r1 != r5) goto L5f
            return r5
        L5c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L62
        L5f:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L62
            return r1
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.retrofit2.mime.TypedString r1 = new com.bytedance.retrofit2.mime.TypedString
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            X.08fh r2 = new X.08fh
            java.lang.String r3 = ""
            r4 = 404(0x194, float:5.66E-43)
            java.lang.String r5 = ""
            X.13BV r6 = X.C13BV.INSTANCE
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            X.0X52 r1 = X.C0X52.LIZIZ(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi.LIZ(X.05Vn):java.lang.Object");
    }
}
