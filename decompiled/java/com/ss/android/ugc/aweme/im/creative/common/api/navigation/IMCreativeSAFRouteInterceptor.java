package com.ss.android.ugc.aweme.im.creative.common.api.navigation;

import X.C1702560uPG;
import X.C1976907ol;
import X.C2188811AlT;
import X.C2274381E0m;
import X.C296250BjL;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class IMCreativeSAFRouteInterceptor implements IInterceptor {
    public static final String LL = a0.LJJJJZ("//", "//im/creative/camera");
    public static final String LLILLJJLI = a0.LJJJJZ("//", "//im/creative/camera/transparent");

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        if (!C296250BjL.LIZ()) {
            return false;
        }
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
        if (!Intrinsics.LJFF(strLIZIZ, LL) && !Intrinsics.LJFF(strLIZIZ, LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        Intent extra;
        if (context == null) {
            return false;
        }
        if (!C2274381E0m.LIZIZ.LIZJ(true, true)) {
            return true;
        }
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                bundle = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
        } else {
            bundle = new Bundle();
        }
        return C1702560uPG.LIZ.LIZ(context, bundle);
    }
}
