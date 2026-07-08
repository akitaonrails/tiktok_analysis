package com.ss.android.ugc.aweme.relation.ffp.nearby.network;

import X.C1687730u1L;
import X.C1687750u1N;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectNowMatchAPI {
    public static final int $stable = 0;
    public static final ConnectNowMatchAPI INSTANCE = new ConnectNowMatchAPI();

    public final Object getMatchedUsers(List<C1687730u1L> list, InterfaceC1364105Vn<? super MutualRelationListResponse> interfaceC1364105Vn) {
        return runNetWorkSafely(new C1687750u1N(System.currentTimeMillis(), list, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object runNetWorkSafely(kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super R>, ? extends java.lang.Object> r7, X.InterfaceC1364105Vn<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2180208gS
            if (r0 == 0) goto L21
            r5 = r8
            X.08gS r5 = (X.C2180208gS) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2b
            goto L27
        L21:
            X.08gS r5 = new X.08gS
            r5.<init>(r6, r8)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L47
            return r2
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r2)
            X.08gQ r2 = new X.08gQ     // Catch: java.lang.Exception -> L47
            r2.<init>(r7, r3)     // Catch: java.lang.Exception -> L47
            r5.LLILLL = r0     // Catch: java.lang.Exception -> L47
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r5)     // Catch: java.lang.Exception -> L47
            if (r2 != r4) goto L46
            return r4
        L46:
            return r2
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowMatchAPI.runNetWorkSafely(kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
