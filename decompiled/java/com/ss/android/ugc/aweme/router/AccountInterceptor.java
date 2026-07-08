package com.ss.android.ugc.aweme.router;

import X.C1697810uHb;
import X.C1976907ol;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountInterceptor implements IInterceptor {
    public final ArrayList<String> LL = C1697810uHb.LJ("mobile/phoneNumber", "password/change", "emailBind", "setAltLoginMethod");

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
        Iterator<String> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(strLIZIZ, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043 A[PHI: r8
      0x0043: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String), (r8v3 java.lang.String) binds: [B:23:0x0033, B:25:0x0039, B:27:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r18, com.bytedance.router.RouteIntent r19) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.AccountInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
