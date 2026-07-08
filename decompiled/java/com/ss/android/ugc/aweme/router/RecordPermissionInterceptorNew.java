package com.ss.android.ugc.aweme.router;

import X.C1976907ol;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RecordPermissionInterceptorNew implements IInterceptor {
    public final String LL = "openShoot";
    public final String LLILLJJLI = "openRecord";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, this.LL) && !Intrinsics.LJFF(strLIZIZ, this.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r13, com.bytedance.router.RouteIntent r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.RecordPermissionInterceptorNew.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
