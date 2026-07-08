package com.ss.android.ugc.aweme.compliance.privacy.route;

import X.C098200Yq;
import X.C1207504nx;
import X.C189200o6;
import X.C1893730zNb;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ContactsAndLocationRedirectInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C1893730zNb Companion = new Object() { // from class: X.0zNb
    };

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        String strLIZIZ;
        Uri uri;
        if (!C1207504nx.LIZ()) {
            return false;
        }
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        if (!Intrinsics.LJFF(strLIZIZ, "location/permisstion_setting") && !Intrinsics.LJFF(strLIZIZ, "location_services/setting") && !Intrinsics.LJFF(strLIZIZ, "usercontact/setting") && !Intrinsics.LJFF(strLIZIZ, "setting/findcontact")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Object c098200Yq;
        Intent extra;
        if (context == null) {
            return false;
        }
        try {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/page?page_tag=contacts_and_location");
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                smartRouteBuildRoute.withParam(extra);
            }
            smartRouteBuildRoute.open();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m8isSuccessimpl(c098200Yq);
    }
}
