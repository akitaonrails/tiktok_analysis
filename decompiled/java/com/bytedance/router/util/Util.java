package com.bytedance.router.util;

import X.C2188811AlT;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RoutesConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class Util {
    public static String getRealRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return "//" + uri.getAuthority() + uri.getPath();
            }
            return str;
        }
        return null;
    }

    public static String getRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
            }
            return "//" + uri.getAuthority() + uri.getPath();
        }
        return null;
    }

    public static boolean isLegalUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return UriProtector.parse(str).isHierarchical();
    }

    public static Map<String, String> sliceUrlParams(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.e("Slice url params but the url is null!!!");
            return Collections.EMPTY_MAP;
        }
        Uri uri = UriProtector.parse(str);
        if (!uri.isHierarchical()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!TextUtils.isEmpty(str2)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                map.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        return map;
    }

    public static String completeUrl(String str, String str2) {
        if (TextUtils.isEmpty(UriProtector.parse(str2).getScheme())) {
            if (str2.startsWith("//")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(':');
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("://");
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str2;
    }

    public static boolean isLegalUrl(String str, RoutesConfig routesConfig) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!uri.isHierarchical()) {
            return false;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (scheme.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
