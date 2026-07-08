package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings;

import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1920707fh;
import X.C1976907ol;
import X.C2097608Jq;
import X.C417201jm;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptorConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class TEARouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static boolean LIZJ(Uri uri) {
        TEARouterInterceptorConfig.TEARouterInterceptorConfigModel tEARouterInterceptorConfigModel;
        List<String> list;
        if (Intrinsics.LJFF(C417201jm.LIZIZ(uri, "disable_tea_intercept"), "1")) {
            return false;
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            tEARouterInterceptorConfigModel = TEARouterInterceptorConfig.LIZ;
            TEARouterInterceptorConfig.TEARouterInterceptorConfigModel tEARouterInterceptorConfigModel2 = (TEARouterInterceptorConfig.TEARouterInterceptorConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_affiliate_creator_route_interceptor_config", TEARouterInterceptorConfig.TEARouterInterceptorConfigModel.class, tEARouterInterceptorConfigModel);
            if (tEARouterInterceptorConfigModel2 != null) {
                tEARouterInterceptorConfigModel = tEARouterInterceptorConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            tEARouterInterceptorConfigModel = TEARouterInterceptorConfig.LIZ;
        }
        if (tEARouterInterceptorConfigModel.enable && (list = tEARouterInterceptorConfigModel.interceptSchema) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LIZIZ(it2.next(), uri.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || uri.isOpaque() || !LIZJ(uri)) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(Uri uri, List list) {
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof TEARouterInterceptorConfig.Status) {
                    TEARouterInterceptorConfig.Status status = (TEARouterInterceptorConfig.Status) obj;
                    if (!LIZIZ(status.value, C417201jm.LIZIZ(uri, status.key))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZIZ(String str, String str2) {
        if (str != null && str2 != null && !Intrinsics.LJFF(str, "") && !Intrinsics.LJFF(str2, "")) {
            return new Regex(str).containsMatchIn(str2);
        }
        return false;
    }

    public static boolean LIZLLL(Uri uri, TEARouterInterceptorConfig.Interceptor interceptor) {
        boolean zLJJIIJZLJL;
        TEARouterInterceptorConfig.InterceptSchema interceptSchema;
        List<String> list;
        String path;
        List<TEARouterInterceptorConfig.LynxPath> list2;
        if (!(interceptor instanceof TEARouterInterceptorConfig.Interceptor) || interceptor.interceptSchema == null) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            zLJJIIJZLJL = u.LJJIIJZLJL(host, "lynxview", false);
        } else {
            zLJJIIJZLJL = false;
        }
        if (zLJJIIJZLJL) {
            TEARouterInterceptorConfig.InterceptSchema interceptSchema2 = interceptor.interceptSchema;
            if (interceptSchema2 != null && (list2 = interceptSchema2.lynxPath) != null) {
                for (TEARouterInterceptorConfig.LynxPath lynxPath : list2) {
                    if (LIZIZ(lynxPath.channel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) && LIZIZ(lynxPath.bundle, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle")) && LIZ(uri, interceptor.params)) {
                        return true;
                    }
                }
            }
        } else if (C417201jm.LIZLLL(uri) && (interceptSchema = interceptor.interceptSchema) != null && (list = interceptSchema.h5Path) != null) {
            for (String str : list) {
                Uri uriLIZJ = C417201jm.LIZJ(uri);
                if (uriLIZJ != null) {
                    path = uriLIZJ.getPath();
                } else {
                    path = null;
                }
                if (LIZIZ(str, path) && LIZ(uri, interceptor.params)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if (r10 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        return true;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.ViewGroup] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r14, com.bytedance.router.RouteIntent r15) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static String LJ(List list, Uri uri, n nVar) {
        String str;
        Object next;
        Uri uriLJI;
        Map<String, String> mapLJ;
        String str2;
        String str3;
        String string;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            str = "";
            if (it2.hasNext()) {
                next = it2.next();
                List<TEARouterInterceptorConfig.Status> list2 = ((TEARouterInterceptorConfig.Interceptor) next).status;
                if (list2 == null) {
                    break;
                }
                for (TEARouterInterceptorConfig.Status status : list2) {
                    String str4 = status.value;
                    k kVarLJJIIZ = nVar.LJJIIZ(status.key);
                    if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
                        string = "";
                    }
                    if (!LIZIZ(str4, string)) {
                        break;
                    }
                }
                break loop0;
            }
            next = null;
            break;
        }
        TEARouterInterceptorConfig.Interceptor interceptor = (TEARouterInterceptorConfig.Interceptor) next;
        if (interceptor == null) {
            uriLJI = uri;
        } else {
            String str5 = interceptor.redirectSchema;
            if (str5 != null && str5.length() != 0) {
                uriLJI = UriProtector.parse(interceptor.redirectSchema);
            } else {
                uriLJI = uri;
            }
            List<String> list3 = interceptor.moveParams;
            if (list3 != null && !list3.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Uri uriLIZJ = C417201jm.LIZJ(uri);
                if (uriLIZJ != null) {
                    mapLJ = C417201jm.LJFF(uriLIZJ);
                } else {
                    mapLJ = C2097608Jq.LJ();
                }
                linkedHashMap.putAll(mapLJ);
                linkedHashMap.putAll(C417201jm.LJFF(uri));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (interceptor.moveParams.contains(entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                uriLJI = C417201jm.LIZ(uriLJI, linkedHashMap2);
            }
            List<String> list4 = interceptor.removeParams;
            if (list4 != null && !list4.isEmpty()) {
                uriLJI = C417201jm.LJI(uriLJI, interceptor.removeParams);
            }
        }
        Uri uriLIZ = C417201jm.LIZ(C417201jm.LJI(uriLJI, Collections.singletonList("need_tea_intercept")), C2097608Jq.LJIIIIZZ(new Pair("disable_tea_intercept", "1"), new Pair("tea_init_time", String.valueOf(System.currentTimeMillis()))));
        if (interceptor != null || Intrinsics.LJFF(C417201jm.LIZIZ(uri, "need_tea_intercept"), "1")) {
            Pair[] pairArr = new Pair[5];
            if (interceptor != null) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("redirect_status", str2);
            pairArr[1] = new Pair("is_native", "1");
            if (interceptor != null && (str3 = interceptor.name) != null) {
                str = str3;
            }
            pairArr[2] = new Pair("interceptor_name", str);
            pairArr[3] = new Pair("cur_schema", uri.toString());
            pairArr[4] = new Pair("redirect_schema", uriLIZ);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            mapLJIIJ.putAll(C417201jm.LJ(uri));
            mapLJIIJ.putAll(new C1920707fh(nVar));
            LJFF(uri, "rd_tea_intercept", mapLJIIJ);
        }
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "start"));
        mapLJIIJ2.putAll(C417201jm.LJ(uriLIZ));
        LJFF(uriLIZ, "rd_tea_open", mapLJIIJ2);
        return uriLIZ.toString();
    }

    public static void LJFF(Uri uri, String str, Map map) throws JSONException {
        String str2;
        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        String host = uri.getHost();
        if (host != null && u.LJJIIJZLJL(host, "lynxview", false)) {
            str2 = "tiktok_ecom_affiliate";
        } else {
            str2 = "ecom_tiktok_h5";
        }
        c1520360pfO.LIZIZ = str2;
        c1520360pfO.LIZIZ(0);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        c1520360pfO.LIZLLL = jSONObject;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        c1520380pfQ.getClass();
        C1520380pfQ.LIZ(c1520350pfNLIZ);
    }
}
