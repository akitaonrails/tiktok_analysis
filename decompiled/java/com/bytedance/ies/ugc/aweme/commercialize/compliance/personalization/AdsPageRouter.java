package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C0TOM;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;

/* JADX INFO: loaded from: classes13.dex */
public final class AdsPageRouter implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String string;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (context == null) {
            return Boolean.FALSE;
        }
        AdFreeSubscription adFreeSubscription = null;
        if (bundle != null) {
            string = bundle.getString("enter_from", "privacy_and_safety_settings");
        } else {
            string = null;
        }
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
        }
        if (adFreeSubscription != null && (num3 = adFreeSubscription.subscriptionMode) != null && num3.intValue() == 1 && (num4 = adFreeSubscription.subscriptionStatus) != null && num4.intValue() == 2) {
            str2 = "aweme://commercialize/compliance/subscription/subscription_ads_page";
        } else {
            str2 = "//commercialize/compliance/personalization/ads_page";
            if (adFreeSubscription != null) {
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str2);
            smartRouteBuildRoute.withParam("enter_from", string);
            smartRouteBuildRoute.open();
            return Boolean.TRUE;
        }
        Integer num5 = adFreeSubscription.productLine;
        if (num5 != null && num5.intValue() == 1 && (num = adFreeSubscription.subscriptionMode) != null && num.intValue() == 1 && (num2 = adFreeSubscription.subscriptionStatus) != null && num2.intValue() == 0) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//commercialize/compliance/subscription/ad_free_subscription_uk");
            smartRouteBuildRoute2.withParam("enter_from", string);
            smartRouteBuildRoute2.withParam("keyAdFreeUKTargetFragment", "pick_your_plan_page");
            smartRouteBuildRoute2.open();
            return Boolean.TRUE;
        }
        SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(context, str2);
        smartRouteBuildRoute3.withParam("enter_from", string);
        smartRouteBuildRoute3.open();
        return Boolean.TRUE;
    }
}
