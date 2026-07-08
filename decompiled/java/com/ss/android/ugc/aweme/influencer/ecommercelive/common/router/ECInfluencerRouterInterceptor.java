package com.ss.android.ugc.aweme.influencer.ecommercelive.common.router;

import X.AbstractC1387200mCc;
import X.C07MW;
import X.C1388190mED;
import X.C1976907ol;
import X.C19EG;
import X.C290160BYw;
import X.C520150Kab;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECInfluencerRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static FragmentManager LIZ(Context context) {
        C19EG c19egLIZIZ;
        FragmentManager fragmentManagerLJ;
        C19EG c19egLIZIZ2;
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            if (context != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) != null) {
                return c19egLIZIZ2.getSupportFragmentManager();
            }
            return null;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZ = C520150Kab.LIZ(context);
        if (abstractC1387200mCcLIZ != null && (fragmentManagerLJ = abstractC1387200mCcLIZ.LJ()) != null) {
            return fragmentManagerLJ;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return c19egLIZIZ.getSupportFragmentManager();
        }
        return null;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "ec");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r12, com.bytedance.router.RouteIntent r13) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.router.ECInfluencerRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
