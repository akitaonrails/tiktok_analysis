package com.ss.android.ugc.aweme.compliance.privacy.route;

import X.C1207504nx;
import X.C1893740zNc;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsMainRedirectInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C1893740zNc Companion = new Object() { // from class: X.0zNc
    };

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Intent extra;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        Uri uri;
        if (!C1207504nx.LIZ()) {
            return false;
        }
        String strLIZIZ = null;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(strLIZIZ, "privacy/setting/v2/main")) {
            return true;
        }
        if (!Intrinsics.LJFF(strLIZIZ, "privacy/setting/page")) {
            return false;
        }
        Intent extra2 = routeIntent.getExtra();
        if ((extra2 == null || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(extra2, "target")) == null || !(!a0.LJJJIL(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra))) && ((extra = routeIntent.getExtra()) == null || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(extra, "page_tag")) == null)) {
            return false;
        }
        return Intrinsics.LJFF(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, "main");
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_route_PrivacySettingsMainRedirectInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        if (context == null) {
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting");
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            smartRouteBuildRoute.withParam(extra);
        }
        smartRouteBuildRoute.open();
        return true;
    }
}
