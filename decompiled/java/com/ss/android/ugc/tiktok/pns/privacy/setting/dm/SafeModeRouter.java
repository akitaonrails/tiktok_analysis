package com.ss.android.ugc.tiktok.pns.privacy.setting.dm;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class SafeModeRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//chatcontrol/setting");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
