package com.ss.android.ugc.aweme.dsp.subscribe.schema;

import X.C1976907ol;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MusicLoadingInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        String path;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = "";
        if (routeIntent == null || (uri2 = routeIntent.getUri()) == null || (host = uri2.getHost()) == null) {
            host = "";
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (path = uri.getPath()) != null) {
            str = path;
        }
        sbLIZ.append(str);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "music/ttm/subscribe/loading");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r5, com.bytedance.router.RouteIntent r6) throws java.lang.Throwable {
        /*
            r4 = this;
            if (r5 == 0) goto L8
            android.app.Activity r3 = X.C1388190mED.LIZ(r5)
            if (r3 != 0) goto Le
        L8:
            android.app.Activity r3 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            if (r3 == 0) goto L3e
        Le:
            if (r6 == 0) goto L3e
            android.content.Intent r0 = r6.getExtra()
            if (r0 == 0) goto L1f
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Exception -> L1b
            goto L22
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1f:
            r2 = 0
            if (r6 == 0) goto L3e
        L22:
            android.net.Uri r0 = r6.getUri()
            if (r0 == 0) goto L3e
            X.0iRu r1 = new X.0iRu
            r1.<init>(r3, r0, r2)
            r1.show()
            X.C785410UrT.LIZIZ(r1)
            com.ss.android.ugc.aweme.PopupMonitorServiceImpl r0 = com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJJJ(r1)
            X.C816490W1f.LIZ(r1)
        L3e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicLoadingInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
