package com.ss.android.ugc.aweme.compliance.business.engagementcount;

import X.C20684815ws;
import X.C2344009Gk;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes3.dex */
public final class EngagementCountRequestRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "inbox");
        C20684815ws.LJIILLIIL("click_request_permission_post_counts_banner", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://lynxview/?channel=fe_tns_filter_keywords&bundle=teen-engagement-counts/template.js&hide_nav_bar=1&should_full_screen=1&dynamic=1&use_spark=1&wait_gecko_update=1&use_forest=1&max_use_duration=0&enable_canvas=1&digital_wellbeing_dark_mode_reload=1&use_spark=1&opt_title=0&screen_orientation=auto");
        smartRouteBuildRoute.withParam("engagement_count_status", "off");
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }
}
