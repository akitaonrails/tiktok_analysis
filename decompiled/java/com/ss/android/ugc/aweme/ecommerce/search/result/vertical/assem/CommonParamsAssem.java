package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.AbstractC738140SxQ;
import X.C0QER;
import X.C0QR7;
import X.C0QXN;
import X.C0QXQ;
import X.C0QYF;
import X.C0QZR;
import X.C1558520qew;
import X.C2097608Jq;
import X.C650500PfM;
import X.C672650QZz;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class CommonParamsAssem extends AbstractC738140SxQ implements VerticalParamsBuildAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LL = 0;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 932331992) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x06ac  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalParamsBuildAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject KP() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.CommonParamsAssem.KP():org.json.JSONObject");
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalParamsBuildAbility
    public final Map<String, Object> ZZ0(SearchResultParam searchResultParam) {
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        C0QER searchEnterParam3;
        C0QER searchEnterParam4;
        String stringOrNullStrategy;
        String enterMethod;
        C0QER searchEnterParam5;
        C0QER searchEnterParam6;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER searchEnterParam7;
        C0QER searchEnterParam8;
        C0QER searchEnterParam9;
        ECSearchEntranceData ecSearchEntranceData2;
        C0QXN ecommerceNewUserModel;
        C0QER searchEnterParam10;
        String routeUri;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (searchResultParam != null && (searchEnterParam10 = searchResultParam.getSearchEnterParam()) != null && (routeUri = searchEnterParam10.getRouteUri()) != null) {
            linkedHashMap.put("route_uri", routeUri);
        }
        int[] iArr = C0QYF.LIZ;
        C0QER searchEnterParam11 = null;
        if (searchResultParam != null) {
            searchEnterParam = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam = null;
        }
        if (!C0QYF.LIZIZ(searchEnterParam)) {
            return linkedHashMap;
        }
        if (searchResultParam != null && (ecommerceNewUserModel = searchResultParam.getEcommerceNewUserModel()) != null && ecommerceNewUserModel.landingToNewUserPage) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (searchResultParam != null) {
            searchEnterParam2 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam2 = null;
        }
        linkedHashMap3.put("traffic_entrance", C0QR7.LJ(searchEnterParam2));
        if (searchResultParam != null) {
            searchEnterParam3 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam3 = null;
        }
        linkedHashMap3.put("search_entrance_second", C0QR7.LIZ(searchEnterParam3));
        if (searchResultParam != null) {
            searchEnterParam4 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam4 = null;
        }
        if (searchEnterParam4 == null || (ecSearchEntranceData2 = searchEnterParam4.getEcSearchEntranceData()) == null || (stringOrNullStrategy = ecSearchEntranceData2.getStringOrNullStrategy("vertical_search_scene")) == null) {
            stringOrNullStrategy = "goods_search";
        }
        linkedHashMap3.put("vertical_search_scene", stringOrNullStrategy);
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        } else {
            enterMethod = null;
        }
        linkedHashMap3.put("enter_method", enterMethod);
        C672650QZz.LIZ.getClass();
        Map mapLJ = C672650QZz.LJ(searchResultParam, "result_shop_lynx_params");
        if (mapLJ == null) {
            mapLJ = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapLJ);
        if (searchResultParam != null) {
            searchEnterParam5 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam5 = null;
        }
        linkedHashMap4.put("root_enter_from_type", Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam5)));
        linkedHashMap3.put("passThroughParams", linkedHashMap4);
        Map<String, Map<String, Object>> map = C0QXQ.LIZ;
        if (searchResultParam != null) {
            searchEnterParam6 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam6 = null;
        }
        Object obj = C0QXQ.LIZ(C650500PfM.LIZIZ(searchEnterParam6)).get("result_shop_lynx_common_params");
        if (obj != null) {
            linkedHashMap3.put("commonParams", obj);
        }
        linkedHashMap2.put("ecTrackParams", linkedHashMap3);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Map mapLJ2 = C672650QZz.LJ(searchResultParam, "result_shop_api_params");
        if (mapLJ2 != null) {
            linkedHashMap5.put("passThroughParams", mapLJ2);
        }
        if (searchResultParam != null && (searchEnterParam9 = searchResultParam.getSearchEnterParam()) != null) {
            ecSearchEntranceData = searchEnterParam9.getEcSearchEntranceData();
        } else {
            ecSearchEntranceData = null;
        }
        linkedHashMap5.put("api_version", C0QZR.LIZ(ecSearchEntranceData));
        if (searchResultParam != null) {
            searchEnterParam7 = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam7 = null;
        }
        if (!C650500PfM.LIZJ(searchEnterParam7)) {
            if (searchResultParam != null) {
                searchEnterParam8 = searchResultParam.getSearchEnterParam();
            } else {
                searchEnterParam8 = null;
            }
            Object obj2 = C0QXQ.LIZ(C650500PfM.LIZIZ(searchEnterParam8)).get("shop_api_version");
            if (obj2 != null) {
                linkedHashMap5.put("api_version", obj2);
            }
        }
        linkedHashMap2.put("ecApiParams", C2097608Jq.LJIIJ(new Pair("/aweme/v1/search/single/ecom/", linkedHashMap5), new Pair("/aweme/v1/search/stream/ecom/", linkedHashMap5)));
        if (searchResultParam != null) {
            searchEnterParam11 = searchResultParam.getSearchEnterParam();
        }
        linkedHashMap2.put("ecFeatureParams", C0QXQ.LIZ(C650500PfM.LIZIZ(searchEnterParam11)));
        linkedHashMap.putAll(linkedHashMap2);
        return linkedHashMap;
    }
}
