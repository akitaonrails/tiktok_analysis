package com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode;

import X.EnumC1620106Vz;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorCareModeRouterAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//creator_care_mode/simplify_settings");
        smartRouteBuildRoute.withParam("enter_scene", EnumC1620106Vz.OLD_INBOX_SCHEMA.getValue());
        smartRouteBuildRoute.withParam("hide_filter_all", true);
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }
}
