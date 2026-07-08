package com.ss.android.ugc.aweme.nows.router;

import X.C01GW;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1976907ol;
import X.C19EG;
import X.C20191713zX;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.C591970NJr;
import X.C592470NLp;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.nowdummyspi.DummyNowsTabService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class NowsHostDfRouteInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(286));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static String LIZ(RouteIntent routeIntent) {
        String url;
        Uri uri;
        if (routeIntent == null || (((url = routeIntent.getUrl()) == null || !(!a0.LJJJIL(url))) && ((uri = routeIntent.getUri()) == null || (url = uri.toString()) == null || !(!a0.LJJJIL(url)) || url == null))) {
            return null;
        }
        return a0.LJLIIIL(a0.LJJLL('?', url, url)).toString();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String strLIZ = LIZ(routeIntent);
        if (strLIZ == null) {
            return false;
        }
        if (!Intrinsics.LJFF(strLIZ, "//social/nows/archive") && !Intrinsics.LJFF(strLIZ, "//social/nows/archive/feed") && !Intrinsics.LJFF(strLIZ, "//now/caption_edit")) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        pairArr[0] = new Pair("result", str2);
        pairArr[1] = new Pair("uri", str);
        C20684815ws.LJIILLIIL("social_fi_df_route", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strLIZ;
        Activity activityLIZ;
        if (routeIntent == null || !matchInterceptRules(routeIntent) || (strLIZ = LIZ(routeIntent)) == null) {
            return false;
        }
        String url = routeIntent.getUrl();
        if (url != null && (!a0.LJJJIL(url))) {
            strLIZ = url;
        }
        C20191713zX.LIZ.getClass();
        if (!C20191713zX.LIZ() && (C591970NJr.LIZIZ() instanceof DummyNowsTabService)) {
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            if (!(activityLIZ instanceof C19EG)) {
                activityLIZ = null;
            }
            LIZIZ(strLIZ, false);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(activityLIZ.getString(2131838322));
                c1389890mGx.LJIIJJI();
            }
            C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C592470NLp(null), 3);
            return true;
        }
        LIZIZ(strLIZ, true);
        return false;
    }
}
