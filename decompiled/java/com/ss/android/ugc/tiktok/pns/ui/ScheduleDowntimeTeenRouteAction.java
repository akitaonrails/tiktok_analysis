package com.ss.android.ugc.tiktok.pns.ui;

import X.C018G;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleDowntimeTeenRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strLIZIZ = C018G.LIZIZ(str, "user_name");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://lynxview/?channel=fe_tns_reminder&bundle=teen-screen-downtime-setting-show-page/template.js&dynamic=1&hide_nav_bar=1&should_full_screen=1&hide_status_bar=0&use_spark=1");
        smartRouteBuildRoute.withParam("user_name", strLIZIZ);
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }
}
