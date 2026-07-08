package com.ss.android.ugc.aweme.router;

import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public final class MixDetailInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "mix/detail", false);
    }

    public static boolean LIZ(Context context, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mix_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "playlist_previous_page");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "chat";
        }
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        iMixFeedService.LJIJ(context, null, null, "from_profile_mix_list", "click_chat_card", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, true, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, Boolean.TRUE, "");
        iMixFeedService.LJIILIIL("chat", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, null, 0.0f, "click_chat_card", null, null, null, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        sbLIZ.append(System.currentTimeMillis());
        iMixFeedService.LJIILL("chat", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, null, "click_chat_card", null, null, String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()), null, null);
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String stringExtra;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (context == null || routeIntent == null) {
            return false;
        }
        Uri uri = routeIntent.getUri();
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_share")) != null && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true") && LIZ(context, uri)) {
            return true;
        }
        Uri uri2 = routeIntent.getUri();
        if (uri2 == null) {
            uri2 = Uri.EMPTY;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null && extra.hasExtra("mix_video_list_params")) {
            return false;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null) {
            try {
                stringExtra = extra2.getStringExtra("refer");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        if (!Intrinsics.LJFF(stringExtra, "notification_page") || !LIZ(context, uri2)) {
            return false;
        }
        return true;
    }
}
