package com.ss.android.ugc.aweme.account.api;

import X.C01GW;
import X.C2093608Ic;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangePasswordV2Api {
    public static final ChangePasswordV2Api LIZ = new ChangePasswordV2Api();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(65));

    public interface Api {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/password/change/v2/")
        Object changePassword(@InterfaceC1501150pAP Map<String, String> map, InterfaceC1364105Vn<? super ChangePasswordApiResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/password/change/v2/")
        Object changePassword(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501050pAF("passport_ticket") String str, InterfaceC1364105Vn<? super ChangePasswordApiResponse> interfaceC1364105Vn);
    }

    public static Map LIZJ(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("password", C2093608Ic.LIZIZ(str));
        map.put("mix_mode", "1");
        if (str2.length() == 0) {
            map.put("rules_version", "v2");
        } else {
            map.put("rule_strategies", str2);
        }
        if (str3 != null) {
            map.put("passport_ticket", str3);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C851890XbP
            if (r0 == 0) goto L20
            r5 = r11
            X.0XbP r5 = (X.C851890XbP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L70
        L20:
            X.0XbP r5 = new X.0XbP
            r5.<init>(r7, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.01GW r0 = com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.LIZIZ     // Catch: java.lang.Exception -> L76
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api$Api r3 = (com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.Api) r3     // Catch: java.lang.Exception -> L76
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L76
            r2.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "password"
            java.lang.String r0 = X.C2093608Ic.LIZIZ(r8)     // Catch: java.lang.Exception -> L76
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "mix_mode"
            java.lang.String r0 = "1"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L76
            int r0 = r9.length()     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 == 0) goto L62
            java.lang.String r1 = "rules_version"
            java.lang.String r0 = "v2"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L76
            goto L67
        L62:
            java.lang.String r0 = "rule_strategies"
            r2.put(r0, r9)     // Catch: java.lang.Exception -> L76
        L67:
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L76
            java.lang.Object r2 = r3.changePassword(r2, r10, r5)     // Catch: java.lang.Exception -> L76
            if (r2 != r6) goto L73
            return r6
        L70:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L76
        L73:
            com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse r2 = (com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse) r2     // Catch: java.lang.Exception -> L76
            return r2
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse r2 = new com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse
            r1 = 0
            java.lang.String r0 = ""
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.LIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C851900XbQ
            if (r0 == 0) goto L20
            r5 = r10
            X.0XbQ r5 = (X.C851900XbQ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L46
        L20:
            X.0XbQ r5 = new X.0XbQ
            r5.<init>(r6, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01GW r0 = com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.LIZIZ     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api$Api r1 = (com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.Api) r1     // Catch: java.lang.Exception -> L4c
            java.util.Map r0 = LIZJ(r7, r8, r9)     // Catch: java.lang.Exception -> L4c
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4c
            java.lang.Object r4 = r1.changePassword(r0, r5)     // Catch: java.lang.Exception -> L4c
            if (r4 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4c
        L49:
            com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse r4 = (com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse) r4     // Catch: java.lang.Exception -> L4c
            return r4
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse r4 = new com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse
            r1 = 0
            java.lang.String r0 = ""
            r4.<init>(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api.LIZIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
