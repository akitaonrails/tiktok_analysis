package com.ss.android.ugc.aweme.ecommerce.search.service;

import X.C08JS;
import X.C098200Yq;
import X.C0A9C;
import X.C0C64;
import X.C0C8V;
import X.C1507790pL7;
import X.C189200o6;
import X.C2097608Jq;
import X.C2232408os;
import X.C256700A4e;
import X.C276360AsM;
import X.C291400BbW;
import X.C299290BoF;
import X.C308790C8n;
import X.C341050DYp;
import X.C786410Ut5;
import X.C844470XAv;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcSearchClientFeatureConfig;
import com.ss.android.ugc.aweme.ab.EcUserActMultiDataMaxLengthAB;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class EcSearchFeedCardServiceImpl implements IEcSearchFeedCardService {
    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final Map<String, Object> LIZ() throws JSONException {
        Double d;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "feed_ecom_search_card");
        jSONObject.put("step", "insert_search_card_params");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_card", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        if (((Boolean) C276360AsM.LIZ.getValue()).booleanValue()) {
            SignalMonitor.LIZ.getClass();
            JSONObject jSONObject3 = new JSONObject();
            LinkedHashMap linkedHashMap = (LinkedHashMap) SignalMonitor.LIZLLL;
            SignalMonitor.SignalRecord signalRecord = (SignalMonitor.SignalRecord) linkedHashMap.get("card_show_cnt");
            jSONObject3.put("card_show_cnt", signalRecord != null ? signalRecord.cnt : 0);
            SignalMonitor.SignalRecord signalRecord2 = (SignalMonitor.SignalRecord) linkedHashMap.get("search_card_show_cnt");
            jSONObject3.put("search_card_show_cnt", signalRecord2 != null ? signalRecord2.cnt : 0);
            SignalMonitor.SignalRecord signalRecord3 = (SignalMonitor.SignalRecord) linkedHashMap.get("card_click_cnt");
            jSONObject3.put("card_click_cnt", signalRecord3 != null ? signalRecord3.cnt : 0);
            SignalMonitor.SignalRecord signalRecord4 = (SignalMonitor.SignalRecord) linkedHashMap.get("search_card_click_cnt");
            jSONObject3.put("search_card_click_cnt", signalRecord4 != null ? signalRecord4.cnt : 0);
            SignalMonitor.SignalRecord signalRecord5 = (SignalMonitor.SignalRecord) linkedHashMap.get("video_play_cnt");
            jSONObject3.put("video_play_cnt", signalRecord5 != null ? signalRecord5.cnt : 0);
            SignalMonitor.SignalRecord signalRecord6 = (SignalMonitor.SignalRecord) linkedHashMap.get("ecom_video_play_cnt");
            jSONObject3.put("ecom_video_play_cnt", signalRecord6 != null ? signalRecord6.cnt : 0);
            SignalMonitor.SignalRecord signalRecord7 = (SignalMonitor.SignalRecord) linkedHashMap.get("ecom_live_show_cnt");
            jSONObject3.put("ecom_live_show_cnt", signalRecord7 != null ? signalRecord7.cnt : 0);
            SignalMonitor.SignalRecord signalRecord8 = (SignalMonitor.SignalRecord) linkedHashMap.get("ad_video_play_cnt");
            jSONObject3.put("ad_video_play_cnt", signalRecord8 != null ? signalRecord8.cnt : 0);
            SignalMonitor.SignalRecord signalRecord9 = (SignalMonitor.SignalRecord) linkedHashMap.get("show_bubble_cnt");
            jSONObject3.put("has_show_with_bubble", (signalRecord9 != null ? signalRecord9.cnt : 0) > 0);
            SignalMonitor.SignalRecord signalRecord10 = (SignalMonitor.SignalRecord) linkedHashMap.get("show_red_dot_cnt");
            jSONObject3.put("has_show_with_red_dot", (signalRecord10 != null ? signalRecord10.cnt : 0) > 0);
            jSONObject3.put("visit_mall_cnt_in_1day", SignalMonitor.LIZIZ(1, "visit_mall_cnt"));
            jSONObject3.put("visit_mall_cnt_in_3day", SignalMonitor.LIZIZ(3, "visit_mall_cnt"));
            jSONObject3.put("visit_mall_cnt_in_7day", SignalMonitor.LIZIZ(7, "visit_mall_cnt"));
            jSONObject3.put("cold_start_cnt_today", SignalMonitor.LIZIZ(1, "cold_start_cnt"));
            jSONObject3.put("stay_time", new Date().getTime() - CastLongProtector.parseLong(SignalMonitor.LIZJ));
            jSONObject2.put("ecom_fyp_search_card_signal", jSONObject3);
        }
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ecom_suggest_source", "ecom_feed"), new Pair("search_card_param", jSONObject2));
        String strLJIILL = null;
        if (!((Boolean) C0A9C.LIZ.getValue()).booleanValue()) {
            if (((Boolean) C256700A4e.LIZ.getValue()).booleanValue()) {
                String strLIZLLL = LIZLLL(null);
                mapLJIIJ.put("ecom_user_actions", strLIZLLL != null ? strLIZLLL : "");
            }
            return mapLJIIJ;
        }
        C2232408os c2232408os = C341050DYp.LIZ;
        Map<String, Double> map = C291400BbW.LIZ;
        String value = C0C8V.FYP_EC_SEARCH_CARD.getValue();
        Map map2 = (Map) C291400BbW.LIZIZ.getValue();
        int iDoubleValue = (map2 == null || (d = (Double) map2.get(value)) == null) ? 0 : (int) d.doubleValue();
        EcUserActMultiDataMaxLengthAB.Config config = (EcUserActMultiDataMaxLengthAB.Config) EcUserActMultiDataMaxLengthAB.LIZ.getValue();
        try {
            Map<String, LinkedList<Map<String, Object>>> map3 = C341050DYp.LJFF;
            if (!map3.isEmpty()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map3).entrySet()) {
                    if (iDoubleValue < 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    } else if (iDoubleValue < ((LinkedList) entry.getValue()).size()) {
                        linkedHashMap2.put(entry.getKey(), ((LinkedList) entry.getValue()).subList(0, iDoubleValue));
                    } else {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                strLJIILL = C08JS.LIZIZ().LJIILL(C341050DYp.LJFF(linkedHashMap2, config));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        String strLIZLLL2 = LIZLLL(strLJIILL);
        mapLJIIJ.put("ecom_user_actions", strLIZLLL2 != null ? strLIZLLL2 : "");
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final List<String> LIZJ() {
        return (List) C299290BoF.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final void initSignalMonitor() {
        SignalMonitor.LIZ.getClass();
        SignalMonitor.LIZJ();
    }

    public static String LIZLLL(String str) {
        Object c098200Yq;
        JSONObject jSONObject;
        IKVStore iKVStoreCreateInMemoryKVStore;
        Object valueForKey;
        if (!((Boolean) C256700A4e.LIZ.getValue()).booleanValue()) {
            return str;
        }
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EcSearchClientFeatureConfig ecSearchClientFeatureConfig = C308790C8n.LIZ;
            EcSearchClientFeatureConfig ecSearchClientFeatureConfig2 = (EcSearchClientFeatureConfig) c0c64LJIILLIIL.LJJII(EcSearchClientFeatureConfig.class, ecSearchClientFeatureConfig, "ecom_search_client_features_settings", true);
            if (ecSearchClientFeatureConfig2 != null) {
                ecSearchClientFeatureConfig = ecSearchClientFeatureConfig2;
            }
            List<String> list = ecSearchClientFeatureConfig.features;
            if (list != null) {
                for (String str2 : list) {
                    C844470XAv.LIZ.getClass();
                    IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
                    if (featureCore != null && (iKVStoreCreateInMemoryKVStore = featureCore.createInMemoryKVStore("gec_search_feature")) != null && (valueForKey = iKVStoreCreateInMemoryKVStore.getValueForKey(str2)) != null) {
                        jSONObject.put(str2, valueForKey);
                    }
                }
            }
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 != null) {
            return str3;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService
    public final void LIZIZ(List<? extends Aweme> list) {
        CardInsertInfo cardInsertInfo;
        LynxTemplate lynxTemplate;
        String bizData;
        CardInsertInfo cardInsertInfo2;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (aweme2 != null && (cardInsertInfo2 = aweme2.getCardInsertInfo()) != null && ((List) C299290BoF.LIZJ.getValue()).contains(String.valueOf(cardInsertInfo2.getCardType()))) {
                    arrayList.add(aweme);
                }
            }
            for (Aweme aweme3 : arrayList) {
                if (aweme3 != null && (cardInsertInfo = aweme3.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo.getLynxTemplate()) != null && (bizData = lynxTemplate.getBizData()) != null) {
                    EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                    HashMap mapLJI = C2097608Jq.LJI(new Pair("bizData", bizData));
                    ecomResourceBystander.getClass();
                    EcomResourceBystander.LJIILLIIL(mapLJI, "/self_define/aweme/v2/feed/", null, null, null);
                }
            }
        }
    }
}
