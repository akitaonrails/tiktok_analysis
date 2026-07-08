package com.ss.android.ugc.aweme.commercialize.ba.impl.ui;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes5.dex */
public final class AdsInboxAnchorRoute implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String string;
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ttba_ads_inbox_product_anchor_attach_notice", "");
        if (strLJI.length() > 0) {
            String string2 = null;
            if (1 != 0) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLJI);
                if (bundle != null) {
                    string = bundle.getString("item_id", "");
                } else {
                    string = null;
                }
                smartRouteBuildRoute.withParam("item_id", string);
                if (bundle != null) {
                    string2 = bundle.getString("link_id", "");
                }
                smartRouteBuildRoute.withParam("link_id", string2);
                smartRouteBuildRoute.open();
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
