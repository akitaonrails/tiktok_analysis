package com.ss.android.ugc.aweme.aigc.offline.push.system;

import X.C01GW;
import X.C085T;
import X.C0C64;
import X.C0LC0;
import X.C0LEC;
import X.C0LZF;
import X.C0LZK;
import X.C0LZL;
import X.C0PEM;
import X.C1976907ol;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCOfflineRouteInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(55));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(56));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String str;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        C0LZK c0lzkLIZIZ = C0LEC.LIZIZ(uri);
        if (c0lzkLIZIZ != null) {
            str = c0lzkLIZIZ.LIZ;
        } else {
            str = null;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_business_type_prefix_match_killswitch", false)) {
            if (str == null || !u.LJJIIJZLJL(str, "EFFECT_AIGC_", false)) {
                return false;
            }
        } else if (!Intrinsics.LJFF(str, "EFFECT_AIGC_I2V") && !Intrinsics.LJFF(str, "EFFECT_AIGC_FL2V") && !Intrinsics.LJFF(str, "EFFECT_AIGC_CLOUD_EDITING") && !Intrinsics.LJFF(str, "EFFECT_AIGC_CLOUD_EDITING_M2") && (!C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_noti_optim_enabled", true, false) || !Intrinsics.LJFF(str, "EFFECT_AIGC_I2I"))) {
            return false;
        }
        return true;
    }

    public static void LIZ(Context context, RouteIntent routeIntent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Draft is null from ");
        sbLIZ.append(routeIntent.getUrl());
        sbLIZ.append(", going to fallback page");
        C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        SmartRouter.buildRoute(context, "//studio/aigc").open();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C0LZK c0lzkLIZIZ;
        Activity activityLIZ;
        Uri uri;
        String url = null;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            c0lzkLIZIZ = C0LEC.LIZIZ(uri);
        } else {
            c0lzkLIZIZ = null;
        }
        if (c0lzkLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Message is null from ");
            if (routeIntent != null) {
                url = routeIntent.getUrl();
            }
            sbLIZ.append(url);
            sbLIZ.append(", interceptor return false");
            C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onInterceptRoute businessType=");
        sbLIZ2.append(c0lzkLIZIZ.LIZ);
        sbLIZ2.append(", serverTaskId=");
        sbLIZ2.append(c0lzkLIZIZ.LIZIZ);
        sbLIZ2.append(", isSuccess=");
        sbLIZ2.append(c0lzkLIZIZ.LIZLLL);
        sbLIZ2.append(", route = ");
        sbLIZ2.append(routeIntent.getUri());
        sbLIZ2.append(", message From: ");
        sbLIZ2.append(c0lzkLIZIZ.LIZJ);
        C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
        if (!c0lzkLIZIZ.LIZLLL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Entering failure branch, serverTaskId=");
            sbLIZ3.append(c0lzkLIZIZ.LIZIZ);
            C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ3));
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LZF(c0lzkLIZIZ, this, routeIntent, context, null), 3);
            return true;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Entering success branch, serverTaskId=");
        sbLIZ4.append(c0lzkLIZIZ.LIZIZ);
        C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ4));
        if (context != null && (activityLIZ = C085T.LIZ(context)) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LZL(c0lzkLIZIZ, this, activityLIZ, null), 3);
            return true;
        }
        C0LC0.LIZ("AIGCOfflineRouteInterceptor", "context?.activity is null, cannot proceed with success branch");
        return true;
    }
}
