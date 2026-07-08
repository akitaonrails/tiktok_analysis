package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C1976907ol;
import X.C912503hT;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPipoIntercepter implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "pipo");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        if (routeIntent != null) {
            path = routeIntent.getPath();
        } else {
            path = null;
        }
        if (Intrinsics.LJFF(path, "/get_appeal_link")) {
            PaymentAppealHelper.LIZ.getClass();
            C912503hT c912503hT = PaymentAppealHelper.LIZIZ;
            if (c912503hT != null) {
                PaymentAppealHelper.LJ(c912503hT);
            }
            PaymentAppealHelper.LIZIZ = null;
            return true;
        }
        return false;
    }
}
