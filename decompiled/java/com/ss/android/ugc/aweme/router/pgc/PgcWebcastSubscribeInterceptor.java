package com.ss.android.ugc.aweme.router.pgc;

import X.C04TD;
import X.C098200Yq;
import X.C0K6P;
import X.C105000aW;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1973307oB;
import X.C1976907ol;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C511650K4t;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PgcSchemaInterceptServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcWebcastSubscribeInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || !Intrinsics.LJFF(uri.getHost(), "webcast_subscribe")) {
            return false;
        }
        if (!C13LP.LJJJJ(uri.getPath(), C511650K4t.LIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        PgcSchemaInterceptService pgcSchemaInterceptService;
        Uri uri;
        Bundle extras;
        ?? linkedHashMap;
        String string;
        Object obj;
        Object c098200Yq;
        Context contextLIZIZ = context;
        if (routeIntent == null || ((Boolean) C105000aW.LIZ.getValue()).booleanValue()) {
            return false;
        }
        Object objLIZ = C04TD.LIZ(PgcSchemaInterceptService.class, false);
        if (objLIZ != null) {
            pgcSchemaInterceptService = (PgcSchemaInterceptService) objLIZ;
        } else {
            if (C04TD.G5 == null) {
                synchronized (PgcSchemaInterceptService.class) {
                    if (C04TD.G5 == null) {
                        C04TD.G5 = new PgcSchemaInterceptServiceImpl();
                    }
                }
            }
            pgcSchemaInterceptService = C04TD.G5;
        }
        if (pgcSchemaInterceptService == null) {
            return false;
        }
        if ((contextLIZIZ == null && (contextLIZIZ = pgcSchemaInterceptService.LIZIZ()) == null) || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        int i = 16;
        if (extras == null) {
            linkedHashMap = C2097608Jq.LJ();
        } else {
            Set<String> setKeySet = extras.keySet();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : setKeySet) {
                try {
                    obj = extras.get((String) obj2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (OutOfMemoryError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(obj2, string);
            }
        }
        String originUrl = routeIntent.getOriginUrl();
        if ((originUrl == null || a0.LJJJIL(originUrl)) && ((originUrl = routeIntent.getUrl()) == null || a0.LJJJIL(originUrl))) {
            originUrl = uri.toString();
        }
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(queryParameterNames, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (Object obj3 : queryParameterNames) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) obj3);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            linkedHashMap2.put(obj3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        Object obj4 = linkedHashMap.get("enter_from");
        String str = (String) obj4;
        if (str == null || a0.LJJJIL(str)) {
            obj4 = null;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = (String) obj4;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            Object obj5 = linkedHashMap.get("enter_from_merge");
            String str2 = (String) obj5;
            if (str2 == null || a0.LJJJIL(str2)) {
                obj5 = null;
            }
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = (String) obj5;
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null && (((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) && (((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance")) == null))) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
        }
        C0K6P c0k6p = new C0K6P(contextLIZIZ, originUrl, uri, linkedHashMap2, linkedHashMap, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        try {
            c098200Yq = Boolean.valueOf(pgcSchemaInterceptService.LIZ(c0k6p));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("path", c0k6p.LIZJ.getPath()), new Pair("schema", c0k6p.LIZIZ));
            C1973307oB.LIZ.getClass();
            C1973307oB.LIZJ(5, "PgcWebcastSubInterceptor", "intercept webcast_subscribe failed", thM5exceptionOrNullimpl, mapLJIIIIZZ);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
