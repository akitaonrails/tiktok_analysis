package com.ss.android.ugc.tiktok.pns.ui;

import X.C018G;
import X.C20684815ws;
import X.C2344009Gk;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes28.dex */
public final class ScheduleDowntimeRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strLIZIZ = C018G.LIZIZ(str, "user_name");
        String strLIZIZ2 = C018G.LIZIZ(str, "sec_user_id");
        String strLIZIZ3 = C018G.LIZIZ(str, "start_hour");
        String strLIZIZ4 = C018G.LIZIZ(str, "start_min");
        String strLIZIZ5 = C018G.LIZIZ(str, "end_hour");
        String strLIZIZ6 = C018G.LIZIZ(str, "end_min");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://lynxview?channel=tns_familypairing&bundle=parent_review_permission/template.js&hide_nav_bar=1&should_full_screen=1&dynamic=1&use_spark=1&wait_gecko_update=1&use_forest=1&max_use_duration=0&enable_canvas=1&digital_wellbeing_dark_mode_reload=1&screen_time_breaks=0&screen_time_breaks_type=0&should_show_stb=0&should_show_sd=1&sd_status=1&enter_from=family_pairing_parent&use_spark=1&opt_title=0&screen_orientation=auto&dataflowId=402685958");
        smartRouteBuildRoute.withParam("user_name", strLIZIZ);
        smartRouteBuildRoute.withParam("sec_user_id", strLIZIZ2);
        smartRouteBuildRoute.withParam("start_hour", strLIZIZ3);
        smartRouteBuildRoute.withParam("start_min", strLIZIZ4);
        smartRouteBuildRoute.withParam("end_hour", strLIZIZ5);
        smartRouteBuildRoute.withParam("end_min", strLIZIZ6);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "inbox");
        C20684815ws.LJIILLIIL("show_downtime_exception_request", c2344009Gk.LIZ);
        return Boolean.TRUE;
    }
}
