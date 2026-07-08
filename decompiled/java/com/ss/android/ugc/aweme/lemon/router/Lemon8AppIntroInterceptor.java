package com.ss.android.ugc.aweme.lemon.router;

import X.AbstractC1387200mCc;
import X.C0AMG;
import X.C1065120dp8;
import X.C1065200dpG;
import X.C1388190mED;
import X.C178200mK;
import X.C1906580ziK;
import X.C1976907ol;
import X.C1EE0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C286760BLu;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.util.Logger;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8AppIntroInterceptor implements IInterceptor {
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
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Lemon8AppIntroInterceptor] matchInterceptRules uri = ");
        sbLIZ2.append(strLIZIZ);
        Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ2));
        if (!((Boolean) C0AMG.LIZ.getValue()).booleanValue()) {
            Logger.d("Lemon8AppIntro", "[Lemon8AppIntroInterceptor] matchInterceptRules don't intercept");
            return false;
        }
        return u.LJJIIJZLJL(strLIZIZ, C1065200dpG.LIZ().lemon8SchemaIntro, false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        String host;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Intent extra;
        Uri uri3;
        Set<String> queryParameterNames;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        Uri uri4;
        Uri uri5;
        Uri uri6;
        String path = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        Logger.d("Lemon8AppIntro", String.valueOf(uri));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (routeIntent != null && (uri6 = routeIntent.getUri()) != null) {
            host = uri6.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri5 = routeIntent.getUri()) != null) {
            path = uri5.getPath();
        }
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C1065120dp8 c1065120dp8 = C1065120dp8.LIZ;
        if (routeIntent == null || (uri4 = routeIntent.getUri()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "pid")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        c1065120dp8.getClass();
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "tiktok_inbox") && C286760BLu.LIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("uri", strLIZIZ);
            c2344009Gk.LJIIIIZZ("node", "node_router");
            C20684815ws.LJIILLIIL("lemon8_notice_important_node", c2344009Gk.LIZ);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ(Scene.SCENE_SERVICE, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c2344009Gk2.LJIIIIZZ("uri", strLIZIZ);
        c2344009Gk2.LJIIIIZZ("node", "node_router");
        C20684815ws.LJIILLIIL("lemon8_ug_important_node", c2344009Gk2.LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri3)) != null) {
            for (String str2 : queryParameterNames) {
                Uri uri7 = routeIntent.getUri();
                if (uri7 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri7, str2)) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Lemon8AppIntroInterceptor] onInterceptRoute key = ");
                sbLIZ2.append(str2);
                sbLIZ2.append(" : value = ");
                sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ2));
                linkedHashMap.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            }
        }
        if (linkedHashMap.get("amp_extra") != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Lemon8AppIntroInterceptor] addExtraParams before amp_extra = ");
            sbLIZ3.append((String) linkedHashMap.get("amp_extra"));
            Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ3));
            ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ((String) linkedHashMap.get("amp_extra"));
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    String stringExtra = extra.getStringExtra("notice_id_for_comment");
                    if (stringExtra != null && stringExtra.length() > 0 && concurrentHashMapLIZ != null) {
                        concurrentHashMapLIZ.putIfAbsent("notice_id_for_comment", stringExtra);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C844470XAv.LIZ.getClass();
            int i = C844470XAv.LJIIJ;
            if (concurrentHashMapLIZ != null) {
                concurrentHashMapLIZ.putIfAbsent("app_id", String.valueOf(i));
            }
            String strLIZIZ2 = C178200mK.LIZIZ(concurrentHashMapLIZ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[Lemon8AppIntroInterceptor] addExtraParams after amp_extra = ");
            sbLIZ4.append(strLIZIZ2);
            Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ4));
            if (strLIZIZ2 == null) {
                strLIZIZ2 = "";
            }
            linkedHashMap.put("amp_extra", strLIZIZ2);
        }
        if ((context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) || ((abstractC1387200mCcLJFF = C1906580ziK.LJFF()) != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null)) {
            C1EE0.LIZIZ.LJIIJJI(activityLIZ, linkedHashMap);
            return true;
        }
        C1065120dp8 c1065120dp82 = C1065120dp8.LIZ;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "pid")) != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        }
        C1065120dp8.LIZJ(c1065120dp82, str, "error_miss_act", null, null, null, null, null, 248);
        return true;
    }
}
