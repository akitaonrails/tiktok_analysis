package com.ss.android.ugc.aweme.ogc.news;

import X.AbstractC1387200mCc;
import X.C0N2J;
import X.C1066750drl;
import X.C1066760drm;
import X.C1388190mED;
import X.C1906580ziK;
import X.C19513411Wa;
import X.C19513511Wb;
import X.C19640311sn;
import X.C1976907ol;
import X.InterfaceC19603111mn;
import X.InterfaceC710290Rtb;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes30.dex */
public final class NewsRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String host;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (host = uri.getHost()) != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -443788673) {
                if (iHashCode == 1113772 && host.equals("news_anchor_iab")) {
                    return true;
                }
                return false;
            }
            if (host.equals("article_sticker_iab")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        Uri uri;
        String host;
        C19640311sn c19640311snLIZJ;
        InterfaceC19603111mn consumer;
        C1066750drl c1066750drlLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && routeIntent != null && (uri = routeIntent.getUri()) != null && (host = uri.getHost()) != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -443788673) {
                if (iHashCode == 1113772 && host.equals("news_anchor_iab")) {
                    InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
                    if (interfaceC710290RtbLIZ != null && (c1066750drlLIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZ()) != null) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        HashMap map = new HashMap();
                        for (String str : UriProtector.getQueryParameterNames(uri)) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                            }
                            map.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        }
                        c1066750drlLIZ.LIZJ(activityLIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new C1066760drm(map));
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (host.equals("article_sticker_iab")) {
                IArticleStickerService.Companion.getClass();
                INewsService.LIZ.getClass();
                INewsService value = C0N2J.LIZIZ.getValue();
                if (value != null && (c19640311snLIZJ = value.LIZJ()) != null && (consumer = c19640311snLIZJ.getConsumer()) != null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    HashMap map2 = new HashMap();
                    for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                        }
                        map2.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    }
                    consumer.LIZ(activityLIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, map2);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
