package com.ss.android.ugc.aweme.ecommerce.router;

import X.C0C64;
import X.C1507830pLB;
import X.C1523470pkP;
import X.C1523480pkQ;
import X.C1523490pkR;
import X.C1976907ol;
import X.C2232408os;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomRouteInjectConfigModel;
import com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS232S0300000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomRouteInjectInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (routeIntent == null) {
            return false;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcomRouteInjectConfigModel ecomRouteInjectConfigModel = C1523490pkR.LIZ;
        EcomRouteInjectConfigModel ecomRouteInjectConfigModel2 = (EcomRouteInjectConfigModel) c0c64LJIILLIIL.LJJII(EcomRouteInjectConfigModel.class, ecomRouteInjectConfigModel, "ecom_route_inject", true);
        if (ecomRouteInjectConfigModel2 != null) {
            ecomRouteInjectConfigModel = ecomRouteInjectConfigModel2;
        }
        Iterator<EcomRouteConfigModel> it2 = ecomRouteInjectConfigModel.routes.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(routeIntent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZ(RouteIntent routeIntent, List list) {
        Object next;
        String str;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((EcomRouteConfigModel) next).LIZIZ(routeIntent)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EcomRouteConfigModel ecomRouteConfigModel = (EcomRouteConfigModel) next;
        if (ecomRouteConfigModel != null && (str = ecomRouteConfigModel.scene) != null) {
            C2232408os c2232408os = C1507830pLB.LIZ;
            C1507830pLB.LIZ(str);
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            C1523480pkQ c1523480pkQ = new C1523480pkQ(uri);
            C1523470pkP c1523470pkP = C1523470pkP.LIZ;
            AwS232S0300000_23 awS232S0300000_23 = new AwS232S0300000_23(c1523480pkQ, this, routeIntent, 4);
            c1523470pkP.getClass();
            C1523470pkP.LIZIZ(uri, c1523480pkQ, awS232S0300000_23);
            Uri uri2 = c1523480pkQ.LIZ;
            if (uri2 != null && uri2 != uri) {
                routeIntent.setUrl(uri2.toString());
                return false;
            }
            return false;
        }
        return false;
    }
}
