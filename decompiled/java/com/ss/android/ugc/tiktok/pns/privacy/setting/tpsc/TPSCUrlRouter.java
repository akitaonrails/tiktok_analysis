package com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class TPSCUrlRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String str2;
        if (a0.LJJIIZI(str, "privacy/setting", false)) {
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.isLogin()) {
                str2 = "main";
            } else {
                str2 = "unlogin_main";
            }
        } else if (a0.LJJIIZI(str, "chatcontrol/setting", false)) {
            str2 = "direct_message";
        } else if (!a0.LJJIIZI(str, "commentcontrol/setting", false) && !a0.LJJIIZI(str, "filtercomments", false)) {
            if (a0.LJJIIZI(str, "setting/download", false)) {
                str2 = "download";
            } else if (a0.LJJIIZI(str, "duetcontrol/setting", false)) {
                str2 = "duet";
            } else if (a0.LJJIIZI(str, "privacy/following_visibility", false)) {
                str2 = "following_list_permission";
            } else if (a0.LJJIIZI(str, "mylikelistcontrol/setting", false)) {
                str2 = "liked_videos_permission";
            } else if (a0.LJJIIZI(str, "profileviewhistory/settings", false)) {
                str2 = "profile_view_history";
            } else if (a0.LJJIIZI(str, "stitchcontrol/setting", false)) {
                str2 = "stitch";
            } else if (a0.LJJIIZI(str, "privacy/suggest_account", false)) {
                str2 = "sug_to_others";
            } else if (a0.LJJIIZI(str, "mentioncontrol/setting", false)) {
                str2 = "mention";
            } else {
                if (a0.LJJIIZI(str, "videoviewhistory/settings", false)) {
                    str2 = "video_view_history";
                }
                return null;
            }
        } else {
            str2 = "comment";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/page");
        smartRouteBuildRoute.withParam("target", str2);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
        return null;
    }
}
