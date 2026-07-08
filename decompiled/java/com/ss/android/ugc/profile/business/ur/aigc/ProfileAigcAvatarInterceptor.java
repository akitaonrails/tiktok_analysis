package com.ss.android.ugc.profile.business.ur.aigc;

import X.C1067920dte;
import X.C1390350mHh;
import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class ProfileAigcAvatarInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C1390350mHh Companion = new Object() { // from class: X.0mHh
    };

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//aivatar", false)) {
            return false;
        }
        return true;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        Bundle bundle;
        SmartRoute smartRouteBuildRoute;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        if (context == null || routeIntent == null || C1067920dte.LIZ()) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(extra, "fallback_user_id");
        } else {
            strINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = null;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null && (bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(extra2)) != null) {
            bundle = new Bundle(bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        } else {
            bundle = new Bundle();
        }
        bundle.remove("fallback_user_id");
        if (strINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
            smartRouteBuildRoute.addFlags(536870912);
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            smartRouteBuildRoute.withParam(bundle);
        } else {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", strINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_aigc_ProfileAigcAvatarInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
        return true;
    }
}
