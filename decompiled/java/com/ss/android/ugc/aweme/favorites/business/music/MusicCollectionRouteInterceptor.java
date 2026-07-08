package com.ss.android.ugc.aweme.favorites.business.music;

import X.AbstractC848400XPy;
import X.C0KYJ;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1388190mED;
import X.C1976907ol;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ILoginService;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class MusicCollectionRouteInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C0KYJ Companion = new Object() { // from class: X.0KYJ
    };

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !u.LJJIIJZLJL(string, "aweme://lynxview", false) || !a0.LJJIIZI(string, "discovery_music_collection_privacy_setting", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZ;
        Keva.getRepo("music_collection_privacy").storeBoolean("force_enable", true);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "capcut");
        C20684815ws.LJIILLIIL("enter_favorite_sound_permission", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://privacy/setting/page?target=favorite_music");
        smartRouteBuildRoute.withParam("enter_from", "capcut");
        smartRouteBuildRoute.open();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            C0XQS c0xqs = new C0XQS();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                c0xqs.LIZ = activityLIZ;
                c0xqs.LIZIZ = "discovery_music_collection_privacy_setting";
                c0xqs.LIZJ = "capcut";
                iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return true;
    }
}
