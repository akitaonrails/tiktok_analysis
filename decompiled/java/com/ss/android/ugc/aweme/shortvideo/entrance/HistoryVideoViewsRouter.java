package com.ss.android.ugc.aweme.shortvideo.entrance;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: loaded from: classes5.dex */
public final class HistoryVideoViewsRouter implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ;
        Integer numLIZ;
        if (str == null) {
            return Boolean.FALSE;
        }
        if (context == null) {
            return Boolean.FALSE;
        }
        if (bundle != null) {
            String string = bundle.getString("aweme_id");
            boolean z = false;
            if (string != null && string.length() != 0) {
                IPrivacyService iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
                if (iPrivacyService != null && (privacyUserSettingsV2LJIIIIZZ = iPrivacyService.LJIIIIZZ()) != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("video_view_history")) != null && numLIZ.intValue() == 1) {
                    z = true;
                }
                if (z) {
                    SmartRouter.buildRoute(context, "aweme://aweme/detail/" + string + "?notice_type=20092&enter_from=notification_page").open();
                } else {
                    SmartRouter.buildRoute(context, "aweme://aweme/detail/" + string + "?enter_from=notification_page").open();
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
