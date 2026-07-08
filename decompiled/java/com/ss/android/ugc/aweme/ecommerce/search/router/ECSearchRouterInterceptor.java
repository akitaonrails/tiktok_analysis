package com.ss.android.ugc.aweme.ecommerce.search.router;

import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[ORIG_RETURN, RETURN] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L68
            java.lang.String r1 = r4.getHost()
        L7:
            java.lang.String r0 = "search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L65
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/photo"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
        L1b:
            java.lang.String r2 = r4.getHost()
        L1f:
            java.lang.String r0 = "ec"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L6a
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search/middle"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search_popup"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search_septuple"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/photo_search/result"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6a
        L63:
            r0 = 1
            return r0
        L65:
            if (r4 == 0) goto L1f
            goto L1b
        L68:
            r1 = r2
            goto L7
        L6a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.router.ECSearchRouterInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e9, code lost:
    
        if (r2 != null) goto L72;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b A[PHI: r2
      0x017b: PHI (r2v8 android.net.Uri) = (r2v6 android.net.Uri), (r2v10 android.net.Uri) binds: [B:107:0x015a, B:115:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.router.ECSearchRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
