package com.ss.android.ugc.aweme.account.login;

import X.C01GW;
import X.C0X52;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginByPassportTicketApi {
    public static final LoginByPassportTicketApi LIZ = new LoginByPassportTicketApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(69));

    public interface Api {
        @InterfaceC1501170pAR("/passport/user/login_by_passport_ticket/")
        Object loginByPassportTicket(@InterfaceC1501070pAH("passport_ticket") String str, @InterfaceC1501350pAj("x-tt-passport-csrf-token") String str2, InterfaceC1364105Vn<? super C0X52<LoginResponse>> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0XPP
            if (r0 == 0) goto L20
            r5 = r10
            X.0XPP r5 = (X.C0XPP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L58
        L20:
            X.0XPP r5 = new X.0XPP
            r5.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.LoginByPassportTicketApi.LIZIZ     // Catch: java.lang.Exception -> L5e
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.account.login.LoginByPassportTicketApi$Api r2 = (com.ss.android.ugc.aweme.account.login.LoginByPassportTicketApi.Api) r2     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L5e
            r1.append(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "/passport/user/login_by_passport_ticket/"
            r1.append(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L5e
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r2.loginByPassportTicket(r9, r0, r5)     // Catch: java.lang.Exception -> L5e
            if (r1 != r4) goto L5b
            return r4
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5e
        L5b:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L5e
            return r1
        L5e:
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.LoginByPassportTicketApi.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
