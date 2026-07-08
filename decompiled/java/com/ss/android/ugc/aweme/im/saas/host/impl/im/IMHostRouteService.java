package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C2188811AlT;
import X.C666390QBx;
import X.C882400YjW;
import X.C883390Yl7;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostRouteApi;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes15.dex */
public final class IMHostRouteService implements IMHostRouteApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostRouteApi
    public final void LIZIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview/");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('/');
        C882400YjW.LIZ.getClass();
        C882400YjW.LJI();
        sbLIZ.append(C883390Yl7.LIZIZ());
        sbLIZ.append('/');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Regex regex = new Regex("/en/");
        SettingsManager.LIZLLL().getClass();
        smartRouteBuildRoute.withParam("url", regex.replace(SettingsManager.LJI("activity_status_help_url", "https://support.tiktok.com/en/account-and-privacy/account-privacy-settings/activity-status-on-tiktok"), strLIZIZ));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.withParam("use_webview_title", true);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostRouteApi
    public final void LIZ(Context context, User user) {
        C666390QBx.LIZJ = user;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//profile/follow_relation");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_uid", user.getSecUid());
        smartRouteBuildRoute.withParam("follow_relation_type", "muf_user");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "notification_page");
        smartRouteBuildRoute.open();
    }
}
