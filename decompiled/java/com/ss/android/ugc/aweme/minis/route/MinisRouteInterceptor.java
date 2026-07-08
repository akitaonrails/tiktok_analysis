package com.ss.android.ugc.aweme.minis.route;

import X.C1017903yT;
import X.C1227904rF;
import X.C123100dR;
import X.C1258204w8;
import X.C1546500qLY;
import X.C1546560qLe;
import X.C1547430qN3;
import X.C1554440qYM;
import X.C1720106oR;
import X.C1976907ol;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192731Arn;
import X.C2195181Avk;
import X.C2196331Axb;
import X.C2196361Axe;
import X.C2196371Axf;
import X.C2196441Axm;
import X.C2196681AyA;
import X.C2196701AyC;
import X.EnumC2192711Arl;
import X.EnumC2196421Axk;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisRouteInterceptor implements IInterceptor {
    public volatile boolean LL;
    public String LLILLJJLI;
    public C2195181Avk LLILLL;

    public MinisRouteInterceptor() {
        AccountUserService accountUserServiceLJIIJ;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new C1554440qYM(this, 0));
        MinisConfigSettings.HotLoad hotLoad = MinisConfigSettings.LIZ().hotLoad;
        boolean z = hotLoad != null ? hotLoad.enable : true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRouteInterceptor, hotLoad MinisRouteInterceptor hotLoad:");
        sbLIZ.append(MinisConfigSettings.LIZ().hotLoad);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            C1547430qN3.LIZ.getClass();
            C1546500qLY.LJII(C1546560qLe.LIZ, C1547430qN3.LJIIIIZZ);
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleInitSparkReuseRegistration, registerReuseConfig, old cacheUserId:");
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(", curUserId:");
            sbLIZ2.append(curUserId);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LLILLJJLI = curUserId;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String host2;
        if (routeIntent != null && (host = routeIntent.getHost()) != null) {
            String url = null;
            if (host.equals("minis") && this != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("matchInterceptRules, host:");
                if (routeIntent != null) {
                    host2 = routeIntent.getHost();
                } else {
                    host2 = null;
                }
                sbLIZ.append(host2);
                sbLIZ.append(", url:");
                if (routeIntent != null) {
                    url = routeIntent.getUrl();
                }
                sbLIZ.append(url);
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(final android.content.Context r18, com.bytedance.router.RouteIntent r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.route.MinisRouteInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public final void LIZ(Context context, SchemaParserData schemaParserData, boolean z, long j, C2196441Axm c2196441Axm, MinisMetaResp minisMetaResp) throws JSONException {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        EnumC2192711Arl enumC2192711Arl = schemaParserData.minisStage;
        C2196371Axf c2196371Axf = new C2196371Axf(false, false, false, false, -1, C1017903yT.LIZ(), EnumC2192711Arl.MINIS_STAGE_PROD, new HashMap(), 0L, 0L, 0L, 0L, null, null);
        c2196371Axf.setFlowStartTime(System.currentTimeMillis());
        if (!z && c2196441Axm != null && c2196441Axm.getStartTime() > 0) {
            c2196371Axf.setFlowStartTime(c2196441Axm.getStartTime());
            c2196371Axf.recordStage(c2196441Axm);
        }
        System.currentTimeMillis();
        C2195181Avk c2195181Avk = new C2195181Avk(EnumC2196421Axk.SCHEMA_HANDLER, false);
        this.LLILLL = c2195181Avk;
        c2195181Avk.setStartTime(System.currentTimeMillis());
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZ(true);
        schemaParserData.LIZIZ();
        Keva repo = Keva.getRepo("minis_im_card");
        String string = repo.getString("minis_entrance_click", null);
        if (C123100dR.LIZ(string)) {
            C1227904rF.LIZ.getClass();
            C1258204w8 c1258204w8 = (C1258204w8) C1227904rF.LIZIZ(string, C1258204w8.class);
            repo.clear();
            C2196701AyC c2196701AyC = C2196701AyC.LIZ;
            Map<String, Object> map = c1258204w8.LJ;
            if (map != null) {
                obj = map.get("minis_id");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Map<String, Object> map2 = c1258204w8.LJ;
            if (map2 != null) {
                obj2 = map2.get("enter_method");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            Map<String, Object> map3 = c1258204w8.LJ;
            if (map3 != null) {
                obj3 = map3.get("collection_id");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            Map<String, Object> map4 = c1258204w8.LJ;
            if (map4 != null) {
                obj4 = map4.get("minis_type");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            c2196701AyC.getClass();
            C2196701AyC.LJI(str, str2, str3, str4, null);
        }
        JSONArray jSONArray = C2196361Axe.LIZ;
        C2196361Axe.LIZLLL(schemaParserData);
        C2196361Axe.LJIILL(true, j, schemaParserData);
        C2195181Avk c2195181Avk2 = this.LLILLL;
        if (c2195181Avk2 != null) {
            c2195181Avk2.setEndTime(System.currentTimeMillis());
        }
        C2195181Avk c2195181Avk3 = this.LLILLL;
        if (c2195181Avk3 != null) {
            c2195181Avk3.setSuccess(true);
        }
        C2195181Avk c2195181Avk4 = this.LLILLL;
        if (c2195181Avk4 != null) {
            c2196371Axf.setVersionStage(enumC2192711Arl);
            c2196371Axf.recordStage(c2195181Avk4);
        }
        C2196441Axm c2196441Axm2 = new C2196441Axm(EnumC2196421Axk.ACTIVITY_CREATE, true, 0, "", 0L, 0L);
        c2196441Axm2.setStartTime(System.currentTimeMillis());
        c2196371Axf.recordStage(c2196441Axm2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realHandleRoute, schemaData:");
        sbLIZ.append(schemaParserData);
        C1720106oR.LIZ("minis-MinisInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        switch (C2192731Arn.LIZ[enumC2192711Arl.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (context != null) {
                    try {
                        C2196681AyA.LIZ.getClass();
                        C2196681AyA.LIZLLL(context, schemaParserData, c2196371Axf, minisMetaResp);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("realHandleRoute, openGameActivity error:");
                        sbLIZ2.append(e);
                        C1720106oR.LIZ("minis-MinisInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                break;
            case 4:
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//minis_internal/audit");
                smartRouteBuildRoute.withParam("intent_key_minis_schema_data", schemaParserData);
                smartRouteBuildRoute.withParam("intent_key_minis_load_perf_data", c2196371Axf);
                smartRouteBuildRoute.withParam("intent_key_minis_meta_data_from_token_link", minisMetaResp);
                smartRouteBuildRoute.withAnimation(0, R.anim.jd);
                smartRouteBuildRoute.open();
                break;
            case 5:
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//minis_internal/preview");
                smartRouteBuildRoute2.withParam("intent_key_minis_schema_data", schemaParserData);
                smartRouteBuildRoute2.withParam("intent_key_minis_load_perf_data", c2196371Axf);
                smartRouteBuildRoute2.withParam("intent_key_minis_meta_data_from_token_link", minisMetaResp);
                smartRouteBuildRoute2.withAnimation(0, R.anim.jd);
                smartRouteBuildRoute2.open();
                break;
            case 6:
                SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(context, "//minis_internal/debug");
                smartRouteBuildRoute3.withParam("intent_key_minis_schema_data", schemaParserData);
                smartRouteBuildRoute3.withParam("intent_key_minis_load_perf_data", c2196371Axf);
                smartRouteBuildRoute3.withParam("intent_key_minis_meta_data_from_token_link", minisMetaResp);
                smartRouteBuildRoute3.withAnimation(0, R.anim.jd);
                smartRouteBuildRoute3.open();
                break;
            default:
                if (context != null) {
                    try {
                        C2196681AyA.LIZ.getClass();
                        C2196681AyA.LIZLLL(context, schemaParserData, c2196371Axf, minisMetaResp);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("realHandleRoute, openGameActivity error:");
                        sbLIZ3.append(e2);
                        C1720106oR.LIZ("minis-MinisInterceptor", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                break;
        }
        JSONArray jSONArray2 = C2196361Axe.LIZ;
        C2196361Axe.LJIIJ(schemaParserData);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("handleRoute, versionStage:");
        sbLIZ4.append(enumC2192711Arl);
        sbLIZ4.append(", finish");
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
