package com.ss.android.ugc.aweme.search.performance.core.utils;

import X.C01GW;
import X.C0PB6;
import X.C0PEM;
import X.C1976907ol;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLandingPagePreloadHelper {
    public static final SearchLandingPagePreloadHelper LIZ = new SearchLandingPagePreloadHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(348));

    public static final class SearchLandingPagePreloadInterceptor implements IInterceptor {
        @Override // com.bytedance.router.interceptor.IInterceptor
        public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
            return C1976907ol.LIZ(this, routeIntent);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            SearchLandingPagePreloadHelper.LIZ.getClass();
            return Intrinsics.LJFF(SearchLandingPagePreloadHelper.LIZ(routeIntent), "aweme/detail");
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0PB6(routeIntent, null), 3);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r4
      0x000d: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.bytedance.router.RouteIntent r6) {
        /*
            java.lang.String r5 = ""
            if (r6 == 0) goto La
            java.lang.String r4 = r6.getHost()
            if (r4 != 0) goto Ld
        La:
            r4 = r5
            if (r6 == 0) goto L3a
        Ld:
            java.lang.String r3 = r6.getPath()
            if (r3 == 0) goto L3a
            r0 = 366(0x16e, float:5.13E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r2 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            int r0 = r3.length()
            r1 = 1
            if (r0 <= 0) goto L49
            char r0 = X.C13LN.LJLLL(r3)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
            java.lang.String r3 = X.C13LN.LJLL(r1, r3)
            if (r3 != 0) goto L49
        L3a:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            return r0
        L49:
            r5 = r3
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper.LIZ(com.bytedance.router.RouteIntent):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r6, java.lang.String r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0PB7
            if (r0 == 0) goto L25
            r4 = r9
            X.0PB7 r4 = (X.C0PB7) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2b
            java.lang.Object r8 = r4.LL
            X.C155000ia.LIZIZ(r3)
            goto L41
        L25:
            X.0PB7 r4 = new X.0PB7
            r4.<init>(r5, r9)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r8
            r4.LLILZ = r0
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r6, r4)
            if (r0 != r2) goto L41
            return r2
        L41:
            X.01GW r0 = com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper.LIZIZ     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L64
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L64
            java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Exception -> L64
            X.145g r1 = (X.C202082145g) r1     // Catch: java.lang.Exception -> L64
            if (r1 == 0) goto L68
            X.0PB8 r0 = r1.LL     // Catch: java.lang.Exception -> L64
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L64
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L64
            if (r0 != 0) goto L68
            com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard r0 = new com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard     // Catch: java.lang.Exception -> L64
            r0.<init>()     // Catch: java.lang.Exception -> L64
            r1.LIZ(r0)     // Catch: java.lang.Exception -> L64
            goto L68
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper.LIZIZ(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
