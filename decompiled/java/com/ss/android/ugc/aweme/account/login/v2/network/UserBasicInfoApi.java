package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class UserBasicInfoApi {
    public static final UserBasicInfoApi LIZ = new UserBasicInfoApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(79));

    public interface Api {
        @InterfaceC1501240pAY("/passport/user/basic_info/")
        @InterfaceC1501300pAe
        Object getLongAvatarUrl(@InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK("username") String str, @InterfaceC1501100pAK("avatar_url") String str2, @InterfaceC1501100pAK("avatar_uri") String str3, @InterfaceC1501100pAK("expires") Integer num, @InterfaceC1501070pAH("target_region") String str4, InterfaceC1364105Vn<? super LongAvatarUrlResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse> r18) {
        /*
            r11 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C848190XPd
            if (r0 == 0) goto L22
            r10 = r3
            X.0XPd r10 = (X.C848190XPd) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.LLILLL = r2
        L14:
            java.lang.Object r3 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L4c
        L22:
            X.0XPd r10 = new X.0XPd
            r10.<init>(r11, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi.LIZIZ     // Catch: java.lang.Exception -> L52
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L52
            com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi$Api r3 = (com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi.Api) r3     // Catch: java.lang.Exception -> L52
            r10.LLILLL = r1     // Catch: java.lang.Exception -> L52
            r9 = r17
            r8 = r16
            r7 = r15
            r6 = r14
            r5 = r13
            r4 = r12
            java.lang.Object r3 = r3.getLongAvatarUrl(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L52
            if (r3 != r2) goto L4f
            return r2
        L4c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L52
        L4f:
            com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse r3 = (com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse) r3     // Catch: java.lang.Exception -> L52
            return r3
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse r3 = new com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi.LIZ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }
}
