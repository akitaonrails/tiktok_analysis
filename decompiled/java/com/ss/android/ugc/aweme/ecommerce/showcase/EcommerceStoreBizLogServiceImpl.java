package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1697810uHb;
import X.C1AQS;
import X.C2010707uD;
import X.C2344009Gk;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.ShopEntranceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceStoreBizLogServiceImpl implements IEcommerceStoreBizLogService {
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZLLL(Map<String, Object> map) throws JSONException {
        C2010707uD.LIZLLL("tiktokec_shop_entrance_click", map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LJ(JSONObject jSONObject) throws JSONException {
        C2010707uD.LJ("tiktokec_stay_shop", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LJFF(Map<String, ? extends Object> map) throws JSONException {
        C2010707uD.LIZLLL("tiktokec_enter_shop", map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LJI(int i, boolean z, boolean z2) throws JSONException {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "is_same_user");
        c2344009Gk.LIZJ(i, "type");
        c2344009Gk.LJ(Boolean.valueOf(z2), "view_valid");
        C2010707uD.LJFF(c2344009Gk, "rd_tiktokec_shop_tab_user_updated");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZJ(Bundle bundle, Map<String, String> map, Map<String, ? extends Object> map2, boolean z) throws JSONException {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        String str2;
        ArrayList<String> arrayListLJ = C1697810uHb.LJ("enter_from", "page_name", "entrance_type", "author_id", "follow_status", "search_id", "search_result_id", "previous_page", "list_source_content_id", "has_red_dot", "source_previous_page");
        ArrayList<String> arrayListLJ2 = C1697810uHb.LJ("search_id", "search_result_id", "previous_page", "list_source_content_id");
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_self", str);
        String name = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        jSONObject.put("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        for (String str3 : arrayListLJ) {
            if (bundle != null) {
                try {
                    Object obj = bundle.get(str3);
                    if (obj != null) {
                        jSONObject.put(str3, obj);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        for (String str4 : arrayListLJ2) {
            if (map != null && (str2 = map.get(str4)) != null) {
                jSONObject.put(str4, str2);
            }
        }
        for (Map.Entry entry : ((HashMap) map2).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C2010707uD.LJ("tiktokec_showcase_entrance_click", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZIZ(User user, boolean z, String str, String str2, Map map) throws JSONException {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("page_name", "follow");
        c2344009Gk.LJIIIIZZ("source_previous_page", "follow");
        c2344009Gk.LJIIIIZZ("entrance_type", "visit_shop");
        String uid = user.getUid();
        if (uid == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_self", str3);
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        c2344009Gk.LIZJ(user.getFollowStatus(), "follow_status");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    c2344009Gk.LJFF((String) entry.getKey(), value.toString());
                }
            }
        }
        C2010707uD.LJFF(c2344009Gk, "tiktokec_showcase_entrance_show");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService
    public final void LIZ(User user, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, ? extends Object> map) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        ShopEntranceInfo.ShopCreatorTypeEnum creatorType;
        String mobString;
        String name = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        String str10 = "";
        Map<String, String> mapFetchSearchParams = ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).fetchSearchParams(str3, "");
        String str11 = mapFetchSearchParams.get("search_id");
        String str12 = mapFetchSearchParams.get("search_result_id");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_name", str2);
        c2344009Gk.LJIIIIZZ("source_previous_page", str2);
        c2344009Gk.LJIIIIZZ("is_self", String.valueOf(num));
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("entrance_info", str4);
        c2344009Gk.LJIIIIZZ("entrance_type", str9);
        c2344009Gk.LJIIIIZZ("source_page_type", str5);
        if (str6 != null) {
            str11 = str6;
        }
        c2344009Gk.LJIIIIZZ("search_id", str11);
        if (str7 != null) {
            str12 = str7;
        }
        c2344009Gk.LJIIIIZZ("search_result_id", str12);
        c2344009Gk.LJIIIIZZ("list_source_content_id", str8);
        c2344009Gk.LJIIIIZZ("shop_id", str);
        if (user != null) {
            c2344009Gk.LJFF("author_id", user.getUid());
            ShopEntranceInfo shopEntrance = user.getShopEntrance();
            if (shopEntrance != null && (creatorType = shopEntrance.getCreatorType()) != null && (mobString = creatorType.getMobString()) != null) {
                str10 = mobString;
            }
            c2344009Gk.LJFF("author_type", str10);
            c2344009Gk.LIZJ(user.getFollowStatus(), "follow_status");
        }
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    c2344009Gk.LJFF(entry.getKey(), value.toString());
                }
            }
        }
        C2010707uD.LJFF(c2344009Gk, "tiktokec_shop_entrance_show");
    }
}
