package com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox;

import X.C2188811AlT;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes20.dex */
public final class GuideSwitchCreatorInboxRouterAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open: ");
        sbLIZ.append(str);
        sbLIZ.append(", context: ");
        sbLIZ.append(context);
        C2188811AlT.LIZIZ(sbLIZ);
        if (context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting");
            smartRouteBuildRoute.withParam("scroll_to_item_and_highlight", "switchInboxMode");
            smartRouteBuildRoute.withParam("previous_page", "notification_page");
            smartRouteBuildRoute.open();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
