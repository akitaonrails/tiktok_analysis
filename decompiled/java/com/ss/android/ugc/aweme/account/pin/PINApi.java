package com.ss.android.ugc.aweme.account.pin;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class PINApi {
    public static final PINApi LIZ = new PINApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(86));

    public interface Api {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/passport/org/account/pin/reset/")
        Object resetPIN(@InterfaceC1501100pAK("pin") String str, @InterfaceC1501370pAl("x-tt-passport-ticket") String str2, InterfaceC1364105Vn<? super PINResponse> interfaceC1364105Vn);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/passport/org/account/pin/set/")
        Object setPIN(@InterfaceC1501100pAK("pin") String str, InterfaceC1364105Vn<? super PINResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, boolean r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.pin.PINResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1682770ttL
            if (r0 == 0) goto L24
            r6 = r10
            X.0ttL r6 = (X.C1682770ttL) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L32
            if (r0 == r3) goto L4c
            if (r0 != r4) goto L2a
            goto L67
        L24:
            X.0ttL r6 = new X.0ttL
            r6.<init>(r7, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            if (r9 == 0) goto L52
            X.01GW r0 = com.ss.android.ugc.aweme.account.pin.PINApi.LIZIZ     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.account.pin.PINApi$Api r1 = (com.ss.android.ugc.aweme.account.pin.PINApi.Api) r1     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = X.C2093608Ic.LIZIZ(r8)     // Catch: java.lang.Exception -> L6d
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r1.resetPIN(r0, r2, r6)     // Catch: java.lang.Exception -> L6d
            if (r1 != r5) goto L4f
            return r5
        L4c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6d
        L4f:
            com.ss.android.ugc.aweme.account.pin.PINResponse r1 = (com.ss.android.ugc.aweme.account.pin.PINResponse) r1     // Catch: java.lang.Exception -> L6d
            return r1
        L52:
            X.01GW r0 = com.ss.android.ugc.aweme.account.pin.PINApi.LIZIZ     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.account.pin.PINApi$Api r1 = (com.ss.android.ugc.aweme.account.pin.PINApi.Api) r1     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = X.C2093608Ic.LIZIZ(r8)     // Catch: java.lang.Exception -> L6d
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r1.setPIN(r0, r6)     // Catch: java.lang.Exception -> L6d
            if (r1 != r5) goto L6a
            return r5
        L67:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6d
        L6a:
            com.ss.android.ugc.aweme.account.pin.PINResponse r1 = (com.ss.android.ugc.aweme.account.pin.PINResponse) r1     // Catch: java.lang.Exception -> L6d
            return r1
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.pin.PINResponse r1 = new com.ss.android.ugc.aweme.account.pin.PINResponse
            com.ss.android.ugc.aweme.account.pin.PINResponse$Data r0 = new com.ss.android.ugc.aweme.account.pin.PINResponse$Data
            r0.<init>(r2, r2)
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.pin.PINApi.LIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
