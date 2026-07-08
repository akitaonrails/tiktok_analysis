package com.bytedance.mt.protector.impl;

import X.C08FA;
import X.C08FD;
import X.C08FE;
import X.C08FG;
import X.C09EU;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class UriProtector extends C08FE<String> {
    public static C08FG protectorType = C08FG.URI;

    public static String getQueryParameter(Uri uri, String str) {
        return com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (C09EU.LIZIZ()) {
            try {
                return uri.getQueryParameterNames();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object objTryProtect = C08FE.tryProtect(protectorType, th, String.class);
                if (objTryProtect != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(objTryProtect);
                    return hashSet;
                }
                throw th;
            }
        }
        return uri.getQueryParameterNames();
    }

    public static Uri parse(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Uri.parse(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str2 = (String) C08FE.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Uri.parse(str2);
                }
                throw th;
            }
        }
        return Uri.parse(str);
    }

    public static String com_bytedance_mt_protector_impl_UriProtector__getQueryParameter$___twin___(Uri uri, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return uri.getQueryParameter(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str2 = (String) C08FE.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return str2;
                }
                throw th;
            }
        }
        return uri.getQueryParameter(str);
    }

    public static String com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(Uri uri, String str) {
        if (C08FD.LIZ) {
            LruCache<Uri, Map<String, String>> lruCache = C08FA.LIZ;
            if (uri != null && !TextUtils.isEmpty(str)) {
                if ("aid".equals(str) && !TextUtils.isEmpty(C08FA.LIZJ)) {
                    return C08FA.LIZJ;
                }
                if ("device_id".equals(str) && !TextUtils.isEmpty(C08FA.LIZLLL)) {
                    return C08FA.LIZLLL;
                }
                try {
                    String str2 = (String) C08FA.LIZ(uri).get(str);
                    if (!C08FA.LJ && "device_id".equals(str) && !TextUtils.isEmpty(str2)) {
                        C08FA.LIZLLL = str2;
                        C08FA.LJ = true;
                    }
                    if (C08FA.LJFF || !"aid".equals(str) || TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                    C08FA.LIZJ = str2;
                    C08FA.LJFF = true;
                    return str2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return com_bytedance_mt_protector_impl_UriProtector__getQueryParameter$___twin___(uri, str);
    }

    public static List<String> getQueryParameters(Uri uri, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return uri.getQueryParameters(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object objTryProtect = C08FE.tryProtect(protectorType, th, String.class);
                if (objTryProtect != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objTryProtect);
                    return arrayList;
                }
                throw th;
            }
        }
        return uri.getQueryParameters(str);
    }
}
