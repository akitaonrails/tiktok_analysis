package com.ss.android.ugc.aweme.account.org.create;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class OrgAccountsInfoApi {
    public static final OrgAccountsInfoApi LIZ = new OrgAccountsInfoApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(84));

    public interface Api {
        @InterfaceC1501170pAR("/passport/org/account/create/precheck")
        Object createOrgAccountPreCheck(InterfaceC1364105Vn<? super PrecheckResponse> interfaceC1364105Vn);

        @InterfaceC1501170pAR("/passport/org/account/inapp_list/")
        Object fetchOrgAccounts(@InterfaceC1501120pAM("query_scene") String str, InterfaceC1364105Vn<? super OrgAccountsInfoResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1682780ttM
            if (r0 == 0) goto L20
            r4 = r9
            X.0ttM r4 = (X.C1682780ttM) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.0ttM r4 = new X.0ttM
            r4.<init>(r8, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi$Api r1 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.Api) r1     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "in_app"
            java.lang.Object r1 = r1.fetchOrgAccounts(r0, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse r1 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse r1 = new com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse
            r3 = 0
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse$Data r2 = new com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse$Data
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.create.PrecheckResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1682790ttN
            if (r0 == 0) goto L20
            r4 = r6
            X.0ttN r4 = (X.C1682790ttN) r4
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
            X.0ttN r4 = new X.0ttN
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi$Api r0 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.Api) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.createOrgAccountPreCheck(r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.org.create.PrecheckResponse r3 = (com.ss.android.ugc.aweme.account.org.create.PrecheckResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.create.PrecheckResponse r3 = new com.ss.android.ugc.aweme.account.org.create.PrecheckResponse
            r2 = 0
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.account.org.create.PrecheckResponse$Data r0 = new com.ss.android.ugc.aweme.account.org.create.PrecheckResponse$Data
            r0.<init>(r2, r2)
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi.LIZIZ(X.05Vn):java.lang.Object");
    }
}
