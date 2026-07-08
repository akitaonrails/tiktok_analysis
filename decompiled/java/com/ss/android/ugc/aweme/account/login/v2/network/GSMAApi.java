package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485705rj;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501370pAl;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GSMAApi {
    public static final GSMAApi LIZ = new GSMAApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(35));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(36));

    public interface Api {
        @InterfaceC1501200pAU("/passport/mobile/gsma/status")
        Object LIZ(@InterfaceC1501120pAM("mobile") String str, @InterfaceC1501120pAM("mix_mode") int i, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2, InterfaceC1364105Vn<? super GSMAStatusResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU
        Object LIZIZ(@InterfaceC1485705rj String str, InterfaceC1364105Vn<? super SendGSMACodeResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/passport/mobile/send_gsma_code")
        @InterfaceC1501300pAe
        Object getGSMARedirectUrl(@InterfaceC1501100pAK("mobile") String str, @InterfaceC1501100pAK("type") String str2, @InterfaceC1501100pAK("mix_mode") int i, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str3, InterfaceC1364105Vn<? super GetGSMARedirectUrlResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, boolean r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1238850iLL
            if (r0 == 0) goto L20
            r6 = r10
            X.0iLL r6 = (X.C1238850iLL) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L68
        L20:
            X.0iLL r6 = new X.0iLL
            r6.<init>(r7, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            if (r9 == 0) goto L34
            goto L3d
        L34:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZJ     // Catch: java.lang.Exception -> L6e
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L6e
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r3 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r3     // Catch: java.lang.Exception -> L6e
            goto L45
        L3d:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZIZ     // Catch: java.lang.Exception -> L6e
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L6e
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r3 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r3     // Catch: java.lang.Exception -> L6e
        L45:
            java.lang.String r2 = X.C2093608Ic.LIZIZ(r8)     // Catch: java.lang.Exception -> L6e
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L6e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L6e
            r1.append(r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "/passport/mobile/gsma/status"
            r1.append(r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L6e
            java.lang.Object r2 = r3.LIZ(r2, r4, r0, r6)     // Catch: java.lang.Exception -> L6e
            if (r2 != r5) goto L6b
            return r5
        L68:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L6e
        L6b:
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusResponse r2 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusResponse) r2     // Catch: java.lang.Exception -> L6e
            return r2
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusResponse r2 = new com.ss.android.ugc.aweme.account.login.v2.network.GSMAStatusResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, boolean r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1238860iLM
            if (r0 == 0) goto L20
            r4 = r8
            X.0iLM r4 = (X.C1238860iLM) r4
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
            goto L4e
        L20:
            X.0iLM r4 = new X.0iLM
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L34
            goto L3d
        L34:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZJ     // Catch: java.lang.Exception -> L54
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L54
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r0 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r0     // Catch: java.lang.Exception -> L54
            goto L45
        L3d:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZIZ     // Catch: java.lang.Exception -> L54
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L54
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r0 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r0     // Catch: java.lang.Exception -> L54
        L45:
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L54
            java.lang.Object r3 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Exception -> L54
            if (r3 != r2) goto L51
            return r2
        L4e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L54
        L51:
            com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeResponse r3 = (com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeResponse) r3     // Catch: java.lang.Exception -> L54
            return r3
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeResponse r3 = new com.ss.android.ugc.aweme.account.login.v2.network.SendGSMACodeResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZJ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, int r11, boolean r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlResponse> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1238840iLK
            if (r0 == 0) goto L20
            r8 = r13
            X.0iLK r8 = (X.C1238840iLK) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L71
        L20:
            X.0iLK r8 = new X.0iLK
            r8.<init>(r9, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            if (r12 == 0) goto L34
            goto L3d
        L34:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZJ     // Catch: java.lang.Exception -> L77
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r3 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r3     // Catch: java.lang.Exception -> L77
            goto L45
        L3d:
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZIZ     // Catch: java.lang.Exception -> L77
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi$Api r3 = (com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.Api) r3     // Catch: java.lang.Exception -> L77
        L45:
            java.lang.String r4 = X.C2093608Ic.LIZIZ(r10)     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch: java.lang.Exception -> L77
            java.lang.String r5 = X.C2093608Ic.LIZIZ(r0)     // Catch: java.lang.Exception -> L77
            r8.LLILLL = r1     // Catch: java.lang.Exception -> L77
            r6 = 1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L77
            r1.append(r0)     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = "/passport/mobile/send_gsma_code"
            r1.append(r0)     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L77
            java.lang.Object r3 = r3.getGSMARedirectUrl(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L77
            if (r3 != r2) goto L74
            return r2
        L71:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L77
        L74:
            com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlResponse r3 = (com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlResponse) r3     // Catch: java.lang.Exception -> L77
            return r3
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlResponse r3 = new com.ss.android.ugc.aweme.account.login.v2.network.GetGSMARedirectUrlResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.network.GSMAApi.LIZ(java.lang.String, int, boolean, X.05Vn):java.lang.Object");
    }
}
