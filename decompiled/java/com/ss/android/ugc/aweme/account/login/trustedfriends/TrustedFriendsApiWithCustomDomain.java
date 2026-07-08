package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.C01GW;
import X.C0X52;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class TrustedFriendsApiWithCustomDomain {
    public static final TrustedFriendsApiWithCustomDomain LIZ = new TrustedFriendsApiWithCustomDomain();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(73));

    public interface Api {
        @InterfaceC1501170pAR("/passport/aaas/authenticate/")
        @InterfaceC1501310pAf({"x-tt-bypass-dp: 1"})
        Object fetchRecoveryVerificationStatus(@InterfaceC1501070pAH("passport_ticket") String str, @InterfaceC1501070pAH("pseudo_id") String str2, @InterfaceC1501070pAH("challenge_type") int i, @InterfaceC1501070pAH("action") int i2, @InterfaceC1501350pAj("x-tt-passport-csrf-token") String str3, InterfaceC1364105Vn<? super C0X52<RecoveryVerificationStatusResponse>> interfaceC1364105Vn);

        @InterfaceC1501170pAR("/passport/user/login_by_passport_ticket/")
        @InterfaceC1501310pAf({"x-tt-bypass-dp: 1"})
        Object loginByPassportTicket(@InterfaceC1501070pAH("passport_ticket") String str, @InterfaceC1501350pAj("x-tt-passport-csrf-token") String str2, InterfaceC1364105Vn<? super C0X52<LoginResponse>> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0XPN
            if (r0 == 0) goto L20
            r4 = r10
            X.0XPN r4 = (X.C0XPN) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L8c
        L20:
            X.0XPN r4 = new X.0XPN
            r4.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            int r0 = r9.length()
            if (r0 != 0) goto L65
            r0 = 1
        L38:
            java.lang.String r6 = "/passport/user/login_by_passport_ticket/"
            if (r0 == 0) goto L67
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r1 = "use_case"
            java.lang.String r0 = "trusted_friends_recovery"
            r7.put(r1, r0)
            java.lang.String r0 = "api_endpoint"
            r7.put(r0, r6)
            java.lang.String r1 = "missing_param"
            java.lang.String r0 = "passport_ticket"
            r7.put(r1, r0)
            java.lang.String r2 = r7.toString()
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            java.lang.String r0 = "AccountApiRequestError"
            com.bytedance.crash.Npth.reportBizException(r0, r1, r2, r7, r3)
            goto L67
        L65:
            r0 = 0
            goto L38
        L67:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.LIZIZ     // Catch: java.lang.Exception -> L92
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L92
            com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain$Api r2 = (com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.Api) r2     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L92
            r1.append(r0)     // Catch: java.lang.Exception -> L92
            r1.append(r6)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L92
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L92
            java.lang.Object r1 = r2.loginByPassportTicket(r9, r0, r4)     // Catch: java.lang.Exception -> L92
            if (r1 != r5) goto L8f
            return r5
        L8c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L92
        L8f:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L92
            return r1
        L92:
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryVerificationStatusResponse>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C0XPM
            if (r0 == 0) goto L20
            r10 = r14
            X.0XPM r10 = (X.C0XPM) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L5d
        L20:
            X.0XPM r10 = new X.0XPM
            r10.<init>(r11, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.LIZIZ     // Catch: java.lang.Exception -> L63
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> L63
            com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain$Api r4 = (com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.Api) r4     // Catch: java.lang.Exception -> L63
            r7 = 8
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L63
            r1.append(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = "/passport/aaas/authenticate/"
            r1.append(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
            java.lang.String r9 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L63
            r10.LLILLL = r2     // Catch: java.lang.Exception -> L63
            r6 = r13
            r5 = r12
            r8 = r7
            java.lang.Object r1 = r4.fetchRecoveryVerificationStatus(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L63
            if (r1 != r3) goto L60
            return r3
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
        L60:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L63
            return r1
        L63:
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
