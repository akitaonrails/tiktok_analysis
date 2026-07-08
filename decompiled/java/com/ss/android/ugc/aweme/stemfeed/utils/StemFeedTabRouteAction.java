package com.ss.android.ugc.aweme.stemfeed.utils;

import X.C10EU;
import X.EnumC1570580qyO;
import X.EnumC1879480z0c;
import X.EnumC1915270zwL;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedTabRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String string;
        boolean z;
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService;
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            return Boolean.TRUE;
        }
        if (ComplianceServiceProvider.LJJI().LJJIJ() == EnumC1915270zwL.NOT_SHOW) {
            return Boolean.TRUE;
        }
        if (FeedMultiTabOrderSettings.LIZ().contains("homepage_stem") && ComplianceServiceProvider.LJJI().LJJIJ().isOn() && !C10EU.LJIILIIL()) {
            if (bundle != null) {
                string = bundle.getString("enter_from");
                String string2 = bundle.getString("show_badge");
                if (string2 != null) {
                    z = true;
                    if (!Boolean.parseBoolean(string2)) {
                    }
                    if (Intrinsics.LJFF(string, "reward_flow") && (pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null)) != null) {
                        pnSDigitalWellbeingSDKService.LIZLLL(EnumC1879480z0c.STEM_FEED_TASK, null);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
                    smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.STEM.getValue());
                    smartRouteBuildRoute.withParam("enterFrom", string);
                    smartRouteBuildRoute.withParam("showBadge", z);
                    smartRouteBuildRoute.open();
                }
            } else {
                string = null;
            }
            z = false;
            if (Intrinsics.LJFF(string, "reward_flow")) {
                pnSDigitalWellbeingSDKService.LIZLLL(EnumC1879480z0c.STEM_FEED_TASK, null);
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//main");
            smartRouteBuildRoute2.withParam("tab", EnumC1570580qyO.STEM.getValue());
            smartRouteBuildRoute2.withParam("enterFrom", string);
            smartRouteBuildRoute2.withParam("showBadge", z);
            smartRouteBuildRoute2.open();
        } else {
            SmartRouter.buildRoute(context, "//contentpreference").open();
        }
        return Boolean.TRUE;
    }
}
