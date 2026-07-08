package com.ss.android.ugc.aweme.pipo.cashier.common.bind.utils;

import X.C098200Yq;
import X.C1707970uXz;
import X.C1708220uYO;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C189200o6;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class BindRouteV2Interceptor implements IInterceptor {
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
        if (!Intrinsics.LJFF(host, "pipo") || !u.LJIIZILJ(routeIntent.getPath(), "/cashier/bind_finish", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        C1708220uYO c1708220uYO;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind route v2 onInterceptRoute, with uri: ");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        sbLIZ.append(uri);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" invoke");
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "bind_request_id");
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            return true;
        }
        C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" begin query");
        c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
        Uri uri3 = routeIntent.getUri();
        if (uri3 != null) {
            C1708720uZC c1708720uZCLIZ3 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("QueryHandler beginBindQuery");
            sbLIZ4.append(" invoke");
            c1708720uZCLIZ3.LIZ(4, C2188811AlT.LIZIZ(sbLIZ4));
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "bind_request_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) C1707970uXz.LIZIZ).get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                if (weakReference != null && (c1708220uYO = (C1708220uYO) weakReference.get()) != null) {
                    c1708220uYO.LJ(uri3);
                } else {
                    C1708720uZC c1708720uZCLIZ4 = C1708710uZB.LIZ("Cashier");
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("QueryHandler beginBindQuery");
                    sbLIZ5.append(" exception: ");
                    sbLIZ5.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    c1708720uZCLIZ4.LIZ(4, C2188811AlT.LIZIZ(sbLIZ5));
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return true;
    }
}
