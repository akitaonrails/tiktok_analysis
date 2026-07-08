package com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils;

import X.C098200Yq;
import X.C1707840uXm;
import X.C1707910uXt;
import X.C1707970uXz;
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
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRouteV2Interceptor implements IInterceptor {
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
        if (!Intrinsics.LJFF(host, "pipo") || !u.LJIIZILJ(routeIntent.getPath(), "/cashier/pay_finish", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1707840uXm c1707840uXm;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pay_request_id");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            if (routeIntent != null) {
            }
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PayRouteV2Interceptor onInterceptRoute");
            sbLIZ.append(" invoke for payRequestId: ");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                return true;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            CashierKey cashierKey = new CashierKey(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            Runnable runnable = (Runnable) ((LinkedHashMap) C1707910uXt.LIZLLL).get(cashierKey);
            if (runnable != null) {
                C1707910uXt.LJ.removeCallbacks(runnable);
            }
            C1707910uXt.LJIIIIZZ.add(cashierKey);
            C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PayRouteV2Interceptor onInterceptRoute");
            sbLIZ2.append(" begin pay");
            c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
            C1708720uZC c1708720uZCLIZ3 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("QueryHandler beginQueryPay");
            sbLIZ3.append(" invoke");
            c1708720uZCLIZ3.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) C1707970uXz.LIZ).get(cashierKey.toString());
                if (weakReference != null && (c1707840uXm = (C1707840uXm) weakReference.get()) != null) {
                    c1707840uXm.LJFF(cashierKey);
                } else {
                    C1708720uZC c1708720uZCLIZ4 = C1708710uZB.LIZ("Cashier");
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("QueryHandler beginQueryPay");
                    sbLIZ4.append(" exception, ");
                    sbLIZ4.append(cashierKey);
                    c1708720uZCLIZ4.LIZ(4, C2188811AlT.LIZIZ(sbLIZ4));
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return true;
            }
        }
        Uri uri2 = routeIntent.getUri();
        if (uri2 != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "notification_id");
        }
        C1708720uZC c1708720uZCLIZ5 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("PayRouteV2Interceptor onInterceptRoute");
        sbLIZ5.append(" invoke for payRequestId: ");
        sbLIZ5.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c1708720uZCLIZ5.LIZ(4, C2188811AlT.LIZIZ(sbLIZ5));
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
        }
        return true;
    }
}
