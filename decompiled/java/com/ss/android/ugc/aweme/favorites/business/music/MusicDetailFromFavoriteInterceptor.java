package com.ss.android.ugc.aweme.favorites.business.music;

import X.C0C64;
import X.C1976907ol;
import X.C629460OmW;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailFromFavoriteInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C629460OmW Companion = new Object() { // from class: X.0OmW
    };

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "favorite_music_detail_interceptor_setting", true, true) || routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = null;
        if (extra != null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(extra, "extra_music_from");
        } else {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = null;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(extra2, "aweme_id");
        }
        if (!Intrinsics.LJFF("personal_homepage", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) || strINVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null) {
            return false;
        }
        return u.LJJIIJZLJL(url, "aweme://music/detail", false);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_favorites_business_music_MusicDetailFromFavoriteInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        if (context == null || routeIntent == null || (url = routeIntent.getUrl()) == null || a0.LJJIIZI(url, "is_favourite_music=", false)) {
            return false;
        }
        try {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, UriProtector.parse(url).buildUpon().appendQueryParameter("is_favourite_music", "1").build().toString());
            smartRouteBuildRoute.withParam(routeIntent.getExtra());
            smartRouteBuildRoute.open();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
