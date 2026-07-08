package com.ss.android.ugc.tiktok.addyours.route;

import X.C1233040iBy;
import X.C1720106oR;
import X.C1976907ol;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C304900BxI;
import X.C703302op;
import X.C730000SkI;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class LegacyQnaRouteInterceptor implements IInterceptor {
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
        if (!Intrinsics.LJFF(host, "qna")) {
            if (routeIntent != null) {
                String url = routeIntent.getUrl();
                if (url == null || !a0.LJJIIZI(url, "aweme://user/qna/profile", false)) {
                    String url2 = routeIntent.getUrl();
                    if (url2 != null && a0.LJJIIZI(url2, "aweme://user/ask", false)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        String stringExtra;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptRoute, routeIntent=");
        sbLIZ.append(routeIntent);
        C1720106oR.LJI("LegacyQnaRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        if (context == null) {
            return false;
        }
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && a0.LJJIIZI(url, "aweme://qna/detail", false)) {
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                try {
                    stringExtra = extra.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (C703302op.LIZ(stringExtra) && C304900BxI.LIZ()) {
                    String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                    C730000SkI.LIZIZ.LIZIZ(1);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("//add_yours/hub/");
                    sbLIZ2.append(curUserId);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2));
                    smartRouteBuildRoute.withParam("show_topic_detail", 1);
                    smartRouteBuildRoute.withParam("topic_id", stringExtra);
                    smartRouteBuildRoute.withParam("is_from_qa", true);
                    smartRouteBuildRoute.withParam(routeIntent.getExtra());
                    smartRouteBuildRoute.open();
                    return true;
                }
            } else {
                stringExtra = null;
                if (C703302op.LIZ(stringExtra)) {
                    String curUserId2 = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                    C730000SkI.LIZIZ.LIZIZ(1);
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("//add_yours/hub/");
                    sbLIZ22.append(curUserId2);
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ22));
                    smartRouteBuildRoute2.withParam("show_topic_detail", 1);
                    smartRouteBuildRoute2.withParam("topic_id", stringExtra);
                    smartRouteBuildRoute2.withParam("is_from_qa", true);
                    smartRouteBuildRoute2.withParam(routeIntent.getExtra());
                    smartRouteBuildRoute2.open();
                    return true;
                }
            }
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131845725);
        c1233040iBy.LIZLLL();
        return true;
    }
}
