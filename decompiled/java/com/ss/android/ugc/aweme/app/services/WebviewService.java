package com.ss.android.ugc.aweme.app.services;

import X.C1388190mED;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes3.dex */
public final class WebviewService implements IWebViewService {
    @Override // com.ss.android.ugc.aweme.app.services.IWebViewService
    public final void LIZ(Context context, String str, boolean z) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            smartRouteBuildRoute.addFlags(268435456);
        }
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.withParam("hide_nav_bar", z);
        smartRouteBuildRoute.open();
    }
}
