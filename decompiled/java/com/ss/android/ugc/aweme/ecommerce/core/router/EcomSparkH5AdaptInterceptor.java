package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C1976907ol;
import X.C2188811AlT;
import X.C2509909sX;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class EcomSparkH5AdaptInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_spark"), "1") && !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_from"), "ecom")) {
                return true;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "use_spark=1", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("business_from");
                sbLIZ.append("=ecom");
                if (!a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String scheme;
        String authority;
        Set<String> queryParameterNames;
        if (routeIntent == null) {
            return false;
        }
        for (String str : a0.LJJLIIIJ(C2509909sX.LIZ, new char[]{','}, false, 0, 6)) {
            if (str.length() > 0 && (uri = routeIntent.getUri()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null && a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str, false)) {
                Uri uri2 = routeIntent.getUri();
                Uri.Builder builder = new Uri.Builder();
                String path = null;
                if (uri2 != null) {
                    scheme = uri2.getScheme();
                } else {
                    scheme = null;
                }
                Uri.Builder builderScheme = builder.scheme(scheme);
                if (uri2 != null) {
                    authority = uri2.getAuthority();
                } else {
                    authority = null;
                }
                Uri.Builder builderEncodedAuthority = builderScheme.encodedAuthority(authority);
                if (uri2 != null) {
                    path = uri2.getPath();
                }
                builderEncodedAuthority.encodedPath(path);
                if (uri2 != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri2)) != null) {
                    for (String str2 : queryParameterNames) {
                        builder.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str2));
                    }
                }
                builder.appendQueryParameter("target_handler", "ecom,crossPlatform");
                builder.appendQueryParameter("business_from", "ecom");
                routeIntent.setUrl(builder.build().toString());
                return false;
            }
        }
        return false;
    }
}
