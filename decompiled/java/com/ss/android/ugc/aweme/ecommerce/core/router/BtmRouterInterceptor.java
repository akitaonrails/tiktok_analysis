package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C1120604Zw;
import X.C1523660pki;
import X.C1523880pl4;
import X.C1976907ol;
import X.C1AQS;
import X.C21246818Cs;
import X.C786410Ut5;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public final class BtmRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (routeIntent != null) {
            try {
                Uri uri = routeIntent.getUri();
                if (uri != null && uri.isHierarchical()) {
                    C01GW c01gw = C1523660pki.LIZIZ;
                    if (((RouterParamsFilterConfig) c01gw.getValue()).filterConfig.isEmpty()) {
                        return false;
                    }
                    String string = uri.toString();
                    if (!u.LJJIIJZLJL(string, "aweme://ec/", false)) {
                        return false;
                    }
                    Iterator<String> it2 = ((RouterParamsFilterConfig) c01gw.getValue()).blockInterceptorUrls.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI(string, it2.next(), false)) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        if (routeIntent != null) {
            try {
                Uri uri = routeIntent.getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                    linkedHashSet.addAll(UriProtector.getQueryParameterNames(uri));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean z2 = false;
                    for (FilterParamInfo filterParamInfo : ((RouterParamsFilterConfig) C1523660pki.LIZIZ.getValue()).filterConfig) {
                        String str3 = filterParamInfo.filterKey;
                        if (str3.length() != 0) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(a0.LJJLIIIJILLIZJL(str3, new String[]{e3.d}, 0, 6));
                            if (LIZ(uri, linkedHashSet, linkedHashMap, arrayList2, filterParamInfo)) {
                                arrayList.add(filterParamInfo);
                                z2 = true;
                            }
                        }
                    }
                    String name = null;
                    if (z2) {
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        for (String str4 : linkedHashSet) {
                            String str5 = (String) linkedHashMap.get(str4);
                            if (str5 != null && str5.length() != 0) {
                                builderClearQuery.appendQueryParameter(str4, str5);
                            } else {
                                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str4).iterator();
                                while (it2.hasNext()) {
                                    builderClearQuery.appendQueryParameter(str4, it2.next());
                                }
                            }
                        }
                        String string = builderClearQuery.toString();
                        if (((RouterParamsFilterConfig) C1523660pki.LIZIZ.getValue()).filterEventUpload == 1) {
                            C21246818Cs btmPageInfo = BtmSDK.INSTANCE.getBtmPageInfo(null);
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            if (btmPageInfo != null) {
                                str = btmPageInfo.LIZIZ;
                            } else {
                                str = null;
                            }
                            jSONObject2.put("btm", str);
                            if (btmPageInfo != null) {
                                str2 = btmPageInfo.LIZ;
                            } else {
                                str2 = null;
                            }
                            jSONObject2.put("btm_show_id", str2);
                            jSONObject.putOpt("current_page", jSONObject2);
                            jSONObject.putOpt("origin_url", routeIntent.getUrl());
                            jSONObject.putOpt("replace_url", string);
                            Uri uri2 = routeIntent.getUri();
                            if (uri2 == null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                            } else {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "source_btm_token");
                            }
                            jSONObject.putOpt("source_btm_token", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            jSONObject.putOpt("filter_params", arrayList);
                            C1523880pl4 c1523880pl4 = new C1523880pl4("ec_router_params_filter", jSONObject);
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String name2 = ILogDependencyService.class.getName();
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                                }
                                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                            }
                            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3WithAppLogNewUtils(c1523880pl4.LIZ, jSONObject);
                        }
                        if (string != null && string.length() != 0) {
                            routeIntent.setUrl(string);
                        }
                    }
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static boolean LIZIZ(JSONObject jSONObject, List list, FilterParamInfo filterParamInfo) throws JSONException {
        List<String> list2 = filterParamInfo.retainParams;
        List<String> list3 = filterParamInfo.filterParams;
        ArrayList arrayList = (ArrayList) list;
        boolean z = false;
        if (arrayList.size() == 1 && list3.isEmpty() && list2.isEmpty()) {
            String str = (String) ListProtector.get(list, 0);
            if (!jSONObject.has(str)) {
                return false;
            }
            jSONObject.remove(str);
            return true;
        }
        if (arrayList.isEmpty()) {
            if (!list3.isEmpty()) {
                for (String str2 : list3) {
                    if (jSONObject.has(str2)) {
                        jSONObject.remove(str2);
                        z = true;
                    }
                }
                return z;
            }
            if (!(!list2.isEmpty())) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!list2.contains(next)) {
                    jSONObject.remove(next);
                    z = true;
                }
            }
            return z;
        }
        String str3 = (String) ListProtector.remove(list, 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str3);
        if (jSONObjectOptJSONObject != null) {
            boolean zLIZIZ = LIZIZ(jSONObjectOptJSONObject, list, filterParamInfo);
            if (!zLIZIZ) {
                return zLIZIZ;
            }
            jSONObject.putOpt(str3, jSONObjectOptJSONObject);
            return zLIZIZ;
        }
        String strOptString = jSONObject.optString(str3);
        if (strOptString == null || strOptString.length() == 0) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject(strOptString);
        boolean zLIZIZ2 = LIZIZ(jSONObject2, list, filterParamInfo);
        if (!zLIZIZ2) {
            return zLIZIZ2;
        }
        jSONObject.putOpt(str3, C786410Ut5.J3(jSONObject2));
        return zLIZIZ2;
    }

    public static boolean LIZ(Uri uri, Set set, Map map, List list, FilterParamInfo filterParamInfo) throws JSONException {
        String str;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        List<String> list2 = filterParamInfo.retainParams;
        List<String> list3 = filterParamInfo.filterParams;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == 1 && list3.isEmpty() && list2.isEmpty()) {
            Object obj = ListProtector.get(list, 0);
            if (!set.contains(obj)) {
                return false;
            }
            set.remove(obj);
            return true;
        }
        if (arrayList.isEmpty() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (str = (String) ListProtector.remove(list, 0)))) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        boolean zLIZIZ = LIZIZ(jSONObject, list, filterParamInfo);
        if (!zLIZIZ) {
            return zLIZIZ;
        }
        map.put(str, C786410Ut5.J3(jSONObject));
        return zLIZIZ;
    }
}
