package com.ss.android.ugc.aweme.ml.feature;

import X.AbstractC1509490pNr;
import X.C0BMB;
import X.C0NAF;
import X.C0NAL;
import X.C0T30;
import X.C1086000eMo;
import X.C1509170pNL;
import X.C1509190pNN;
import X.C1509300pNY;
import X.C1509460pNo;
import X.C1509610pO3;
import X.C1509740pOG;
import X.C1509750pOH;
import X.C1509790pOL;
import X.C1509830pOP;
import X.C1510050pOl;
import X.C1510230pP3;
import X.C2188811AlT;
import X.C589200N9a;
import X.C589280N9i;
import X.C589440N9y;
import X.C609920Nw6;
import X.C740510T2z;
import X.InterfaceC588340N5s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.feature.contentscore.ScoreData;
import com.ss.android.ugc.aweme.ml.feature.expriment.CompensationMap;
import com.ss.android.ugc.aweme.ml.feature.expriment.EventDetail;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashApplogConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.TTMFeatureConfig;
import com.ss.android.ugc.aweme.ml.request.meta.ApplogConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashCommonConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashFeatureSetConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class MLDataCenterServiceImpl extends MLDataCenterService implements InterfaceC588340N5s {
    public static final /* synthetic */ int LIZJ = 0;
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void checkAndInit() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        C0T30 c0t30 = MLDataCenterService.Companion;
        c0t30.getClass();
        boolean z = MLDataCenterService.debug;
        long jCurrentTimeMillis = z ? System.currentTimeMillis() : 0L;
        C589200N9a c589200N9a = MLCommonService.Companion;
        c589200N9a.getClass();
        IMLCommonService iMLCommonService = C0NAL.LIZ;
        iMLCommonService.addCommonEventListener("play_prepare", this);
        c589200N9a.getClass();
        iMLCommonService.addCommonEventListener("play_call_playtime", this);
        c589200N9a.getClass();
        iMLCommonService.addCommonEventListener("play_stop", C1509740pOG.LIZIZ);
        c589200N9a.getClass();
        iMLCommonService.addCommonEventListener("live_play_prepare", this);
        checkAndInitPrfFeedMoveTrack(C1509830pOP.LIZ);
        c0t30.getClass();
        if (z) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkAndInit cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void addSceneModelConfig(C1510230pP3 c1510230pP3) {
        SmartSceneConfig smartSceneConfig;
        if (c1510230pP3 != null && (smartSceneConfig = c1510230pP3.LIZIZ) != null && smartSceneConfig.getFeatures() != null) {
            C1509170pNL c1509170pNL = C1509300pNY.LIZ;
            if (c1509170pNL == null) {
                c1509170pNL = C1509190pNN.LIZ;
            }
            c1509170pNL.LIZ(c1510230pP3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public final void checkAndInitPrfFeedMoveTrack(boolean z) {
        if (z && !C1509830pOP.LIZIZ) {
            C1509830pOP.LIZIZ = true;
            C589200N9a c589200N9a = MLCommonService.Companion;
            c589200N9a.getClass();
            IMLCommonService iMLCommonService = C0NAL.LIZ;
            iMLCommonService.addCommonEventListener("play_first_frame", this);
            c589200N9a.getClass();
            iMLCommonService.addCommonEventListener("on_view_pager_selected", this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0171 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:3:0x0005, B:4:0x0016, B:6:0x001e, B:8:0x0038, B:10:0x007d, B:11:0x009f, B:13:0x00b9, B:14:0x00c7, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:19:0x010c, B:21:0x0112, B:23:0x0120, B:25:0x0140, B:27:0x0151, B:28:0x0157, B:30:0x015d, B:31:0x016b, B:34:0x0176, B:36:0x017c, B:33:0x0171, B:37:0x018a), top: B:42:0x0005 }] */
    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject getFlashFeedFeatures(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl.getFlashFeedFeatures(java.lang.String):org.json.JSONObject");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void removeAwemeContentListForScore(List<String> list) {
        C1509750pOH.LIZ.getClass();
        for (String str : list) {
            C1509750pOH.LIZLLL.remove(str);
            C1509750pOH.LJFF.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void saveAwemeContentListForScore(List<? extends Aweme> list) throws JSONException {
        List<FeatureGroup> groups;
        String str;
        C1509750pOH.LIZ.getClass();
        if (C0BMB.LIZ()) {
            FeatureServiceManager.Companion.getClass();
            int i = 0;
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_vod", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
            for (Aweme aweme : list) {
                ConcurrentHashMap<String, ScoreData> concurrentHashMap = C1509750pOH.LIZLLL;
                if (!concurrentHashMap.containsKey(aweme.getAid()) && concurrentHashMap.get(aweme.getAid()) == null) {
                    ScoreData scoreData = new ScoreData(aweme.getAid(), new LinkedHashMap(), new LinkedHashMap(), 0L);
                    concurrentHashMap.put(aweme.getAid(), scoreData);
                    C1509750pOH.LJFF.add(aweme.getAid());
                    scoreData.setTs(System.currentTimeMillis());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aweme", aweme);
                    TTMFeatureConfig tTMFeatureConfig = C1509790pOL.LIZ().featureInput;
                    if (tTMFeatureConfig != null && (groups = tTMFeatureConfig.getGroups()) != null) {
                        for (FeatureGroup featureGroup : groups) {
                            String str2 = featureGroup.groupName;
                            if (str2 != null) {
                                FeatureServiceManager.Companion.getClass();
                                FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), str2, i, 2, null);
                                List<FeatureItem> list2 = featureGroup.features;
                                if (list2 != null) {
                                    Iterator<FeatureItem> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        String str3 = it2.next().name;
                                        if (str3 != null) {
                                            if (producer$default2 != null) {
                                                str = str3;
                                                Object feature$default = FeatureProducer.getFeature$default(producer$default2, str3, jSONObject, "content_score_input_feature", (ReturnCode) null, 8, (Object) null);
                                                if (feature$default != null) {
                                                    scoreData.features.put(str, feature$default);
                                                }
                                                i = 0;
                                            } else {
                                                str = str3;
                                            }
                                            if (!Intrinsics.LJFF(str, "content_type")) {
                                                Intrinsics.LJFF(str, "rec_skip");
                                            }
                                            i = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ScoreData scoreData2 = C1509750pOH.LIZLLL.get(aweme.getAid());
                    if (scoreData2 != null) {
                        scoreData2.toString();
                    }
                }
                i = 0;
            }
            if (list.size() > 5) {
                C1509750pOH.LIZ();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0385  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // X.InterfaceC588340N5s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r25, X.C1510130pOt r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl.LIZJ(java.lang.String, X.0pOt):void");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void onPythiaEvent(String str, Map<String, ? extends Object> map) {
        MLDataCenterService.Companion.getClass();
        if (!C609920Nw6.LIZ().open) {
            return;
        }
        if ((Intrinsics.LJFF(str, "boot") || Intrinsics.LJFF(str, "page_open")) && (!map.isEmpty())) {
            C589280N9i c589280N9i = new C589280N9i(str, null);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (c589280N9i.LIZJ == null) {
                    c589280N9i.LIZJ = new HashMap();
                }
                ((HashMap) c589280N9i.LIZJ).put(key, value);
            }
            C589440N9y c589440N9y = C0NAF.LIZIZ;
            if (c589440N9y != null) {
                c589440N9y.LJ.LIZIZ(c589280N9i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void setContentScoreIndex(String str, int i) {
        C1509750pOH.LIZ.getClass();
        C1509750pOH.LJI.put(str, Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final C740510T2z getFeedTrackRangeInfo(String str, int i, boolean z) {
        C1509610pO3.LIZIZ.getClass();
        ArrayList<AbstractC1509490pNr> arrayListLIZIZ = C1509610pO3.LJ.LIZIZ(i, str, z);
        if (arrayListLIZIZ != null) {
            C740510T2z c740510T2z = new C740510T2z();
            for (AbstractC1509490pNr abstractC1509490pNr : arrayListLIZIZ) {
                if (abstractC1509490pNr != null) {
                    c740510T2z.LIZ += C1509460pNo.LIZIZ(abstractC1509490pNr, "like");
                    c740510T2z.LIZIZ += C1509460pNo.LIZIZ(abstractC1509490pNr, "comment");
                    c740510T2z.LIZJ += C1509460pNo.LIZIZ(abstractC1509490pNr, "finish");
                    c740510T2z.LIZLLL += C1509460pNo.LIZIZ(abstractC1509490pNr, "head");
                    ListProtector.add(c740510T2z.LJ, 0, Long.valueOf(C1509460pNo.LIZJ(abstractC1509490pNr, "play_time")));
                }
            }
            return c740510T2z;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void onAppLogEvent(final String str, final JSONObject jSONObject, final String str2) {
        C1086000eMo.LIZ(new Runnable(str, str2, jSONObject) { // from class: X.0pOw
            public final /* synthetic */ String LL;
            public final /* synthetic */ JSONObject LLILLJJLI;

            {
                this.LLILLJJLI = jSONObject;
            }

            public final void LIZ() throws JSONException {
                Float f;
                boolean z;
                boolean z2;
                HashMap<String, List<String>> map;
                List<String> list;
                String str3 = this.LL;
                JSONObject jSONObject2 = this.LLILLJJLI;
                if (C00UJ.LIZ && (map = C00UJ.LIZIZ) != null && (list = map.get(str3)) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str4 : list) {
                        jSONObject3.putOpt(str4, C1510700pPo.LIZ().LIZJ(str4));
                    }
                    String strJ3 = C786410Ut5.J3(jSONObject3);
                    if (strJ3 != null) {
                        jSONObject2.putOpt("ext_portraits", strJ3);
                    }
                }
                if (C1196304m9.LIZ) {
                    List<FlashApplogConfig> list2 = (List) ((Map) C1196304m9.LIZIZ.getValue()).get(str3);
                    if (list2 != null) {
                        for (FlashApplogConfig flashApplogConfig : list2) {
                            C1510170pOx c1510170pOx = C1510170pOx.LIZ;
                            float f2 = flashApplogConfig.sample;
                            c1510170pOx.getClass();
                            if (C1510170pOx.LIZJ(f2)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("hit event:");
                                sbLIZ.append(str3);
                                C2188811AlT.LIZIZ(sbLIZ);
                                Map<String, String> map2 = flashApplogConfig.event_constraints;
                                if (map2 != null) {
                                    z2 = true;
                                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                                        if (!Intrinsics.LJFF(entry.getValue(), jSONObject2.opt(entry.getKey()))) {
                                            z2 = false;
                                        }
                                    }
                                } else {
                                    z2 = true;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("isMatch:");
                                sbLIZ2.append(z2);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (z2) {
                                    JSONObject jSONObject4 = null;
                                    for (String str5 : flashApplogConfig.featureSetList) {
                                        JSONObject jSONObject5 = new JSONObject();
                                        Map<String, String> map3 = flashApplogConfig.event_params;
                                        if (map3 != null) {
                                            for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                                                Object objOpt = jSONObject2.opt(entry2.getKey());
                                                if (objOpt != null) {
                                                    jSONObject5.put(entry2.getValue(), objOpt);
                                                }
                                            }
                                        }
                                        C1509850pOR c1509850pOR = C1509850pOR.LIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("flash_applog_");
                                        sbLIZ3.append(flashApplogConfig.event);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                        boolean zIsFlat = flashApplogConfig.isFlat();
                                        c1509850pOR.getClass();
                                        JSONObject jSONObjectLIZIZ = C1509850pOR.LIZIZ(str5, jSONObject5, strLIZIZ, zIsFlat);
                                        if (jSONObjectLIZIZ != null) {
                                            if (jSONObject4 == null) {
                                                jSONObject4 = jSONObjectLIZIZ;
                                            } else {
                                                Iterator<String> itKeys = jSONObjectLIZIZ.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    jSONObject4.put(next, next);
                                                }
                                            }
                                        }
                                    }
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("paramskey ");
                                    sbLIZ4.append(flashApplogConfig.paramsKey);
                                    sbLIZ4.append(" result:");
                                    sbLIZ4.append(jSONObject4);
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                    if (jSONObject4 != null) {
                                        jSONObject2.put(flashApplogConfig.paramsKey, jSONObject4);
                                    }
                                }
                            }
                        }
                    }
                    List<FlashCommonConfig> list3 = (List) ((Map) C1196304m9.LIZJ.getValue()).get(str3);
                    if (list3 != null) {
                        for (FlashCommonConfig flashCommonConfig : list3) {
                            ApplogConfig applogConfig = flashCommonConfig.applogConfig;
                            if (applogConfig != null && (f = applogConfig.sample) != null) {
                                float fFloatValue = f.floatValue();
                                C1510170pOx.LIZ.getClass();
                                if (C1510170pOx.LIZJ(fFloatValue)) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("hit event:");
                                    sbLIZ5.append(str3);
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                    Map<String, String> map4 = applogConfig.event_constraints;
                                    if (map4 != null) {
                                        z = true;
                                        for (Map.Entry<String, String> entry3 : map4.entrySet()) {
                                            if (!Intrinsics.LJFF(entry3.getValue(), jSONObject2.opt(entry3.getKey()))) {
                                                z = false;
                                            }
                                        }
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        for (FlashFeatureSetConfig flashFeatureSetConfig : flashCommonConfig.featureSetConfig) {
                                            JSONObject jSONObject6 = new JSONObject();
                                            Map<String, String> map5 = applogConfig.event_params;
                                            if (map5 != null) {
                                                for (Map.Entry<String, String> entry4 : map5.entrySet()) {
                                                    Object objOpt2 = jSONObject2.opt(entry4.getKey());
                                                    if (objOpt2 != null) {
                                                        jSONObject6.put(entry4.getValue(), objOpt2);
                                                    }
                                                }
                                            }
                                            FeatureServiceManager.Companion.getClass();
                                            FeatureServiceManager featureServiceManagerLIZ = C1510050pOl.LIZ();
                                            String str6 = flashFeatureSetConfig.featureSet;
                                            String strLIZIZ2 = flashCommonConfig.name;
                                            if (strLIZIZ2 == null) {
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("flash_applog_");
                                                sbLIZ6.append(applogConfig.event);
                                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                                            }
                                            JSONObject featureSet = featureServiceManagerLIZ.getFeatureSet(str6, strLIZIZ2, jSONObject6);
                                            if (featureSet != null) {
                                                jSONObject2.put(flashFeatureSetConfig.paramsKey, featureSet);
                                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                sbLIZ7.append("paramskey ");
                                                sbLIZ7.append(flashFeatureSetConfig.paramsKey);
                                                sbLIZ7.append(" result:");
                                                sbLIZ7.append(featureSet);
                                                C2188811AlT.LIZIZ(sbLIZ7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppLogEventHandler@3ef.handAppLogEventJson$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppLogEventHandler@3ef.handAppLogEventJson$1");
            }
        });
        C1086000eMo.LIZ(new Runnable(str, str2, jSONObject) { // from class: X.0pOZ
            public final /* synthetic */ String LL;
            public final /* synthetic */ JSONObject LLILLJJLI;

            {
                this.LLILLJJLI = jSONObject;
            }

            public final void LIZ() {
                Map<String, EventDetail> map;
                EventDetail eventDetail;
                Set<String> set = C1509900pOW.LIZ;
                final String str3 = this.LL;
                JSONObject jSONObject2 = this.LLILLJJLI;
                if (C1509900pOW.LIZ.contains(str3)) {
                    final C1510130pOt c1510130pOt = new C1510130pOt();
                    c1510130pOt.LIZIZ = jSONObject2;
                    C1511690pRP.LIZIZ(new Runnable() { // from class: X.0pOd
                        public final void LIZ() {
                            final String str4 = str3;
                            final C1510130pOt c1510130pOt2 = c1510130pOt;
                            C1086000eMo.LIZ(new Runnable() { // from class: X.0pOb
                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                public final void LIZ() {
                                    String strLIZ;
                                    String strLIZ2;
                                    String strLIZ3;
                                    String strLIZ4;
                                    String strLIZ5;
                                    String strLIZ6;
                                    String strLIZ7;
                                    String strLIZ8;
                                    String strLIZ9;
                                    String strLIZ10;
                                    String strLIZ11;
                                    String strLIZ12;
                                    String strLIZ13;
                                    String strLIZ14;
                                    String str5 = str4;
                                    C1510130pOt c1510130pOt3 = c1510130pOt2;
                                    if (C1509960pOc.LIZ.contains(str5)) {
                                        float f = 1.0f;
                                        switch (str5.hashCode()) {
                                            case -1330248535:
                                                if (str5.equals("click_comment_button") && (strLIZ = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO3 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ = C1509610pO3.LIZ(strLIZ);
                                                    if (abstractC1509490pNrLIZ != null) {
                                                        abstractC1509490pNrLIZ.addFeature("comment", Float.valueOf(1.0f), false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -1268958287:
                                                if (str5.equals("follow") && (strLIZ2 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO32 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ2 = C1509610pO3.LIZ(strLIZ2);
                                                    if (abstractC1509490pNrLIZ2 != null) {
                                                        abstractC1509490pNrLIZ2.addFeature("follow", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -1213756323:
                                                if (str5.equals("enter_tag_detail") && (strLIZ3 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO33 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ3 = C1509610pO3.LIZ(strLIZ3);
                                                    if (abstractC1509490pNrLIZ3 != null) {
                                                        abstractC1509490pNrLIZ3.addFeature("enter_tag", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -1115125979:
                                                if (str5.equals("click_more_button") && (strLIZ4 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO34 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ4 = C1509610pO3.LIZ(strLIZ4);
                                                    if (abstractC1509490pNrLIZ4 != null) {
                                                        abstractC1509490pNrLIZ4.addFeature("share", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -911017139:
                                                if (str5.equals("play_session_events") && (strLIZ5 = C1509410pNj.LIZ(c1510130pOt3)) != null && c1510130pOt3.LIZIZ("video_play_end") == 1) {
                                                    C1509610pO3 c1509610pO35 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ5 = C1509610pO3.LIZ(strLIZ5);
                                                    if (abstractC1509490pNrLIZ5 != null) {
                                                        Number numberLIZJ = c1510130pOt3.LIZJ("volume_change");
                                                        float fFloatValue = numberLIZJ != null ? numberLIZJ.floatValue() : 0.0f;
                                                        abstractC1509490pNrLIZ5.setFeature("volume_change", Float.valueOf(fFloatValue), false);
                                                        Number numberLIZJ2 = c1510130pOt3.LIZJ("volume_level");
                                                        abstractC1509490pNrLIZ5.setFeature("volume_level", Float.valueOf(numberLIZJ2 != null ? numberLIZJ2.floatValue() : 0.0f), false);
                                                        if (C1509460pNo.LIZ(abstractC1509490pNrLIZ5, "volume_label") >= 0.0f) {
                                                            abstractC1509490pNrLIZ5.setFeature("volume_label", Float.valueOf(0.0f), false);
                                                        } else {
                                                            if (fFloatValue > 0.0f) {
                                                                f = 2.0f;
                                                            } else if (fFloatValue < 0.0f) {
                                                                f = 3.0f;
                                                            }
                                                            abstractC1509490pNrLIZ5.setFeature("volume_label", Float.valueOf(f), false);
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -886186541:
                                                if (str5.equals("adjust_volumn")) {
                                                    try {
                                                        String strLIZLLL = c1510130pOt3.LIZLLL("group_id");
                                                        if (strLIZLLL != null) {
                                                            C1509610pO3 c1509610pO36 = C1509610pO3.LIZIZ;
                                                            AbstractC1509490pNr abstractC1509490pNrLIZ6 = C1509610pO3.LIZ(strLIZLLL);
                                                            if (abstractC1509490pNrLIZ6 != null) {
                                                                String strLIZLLL2 = c1510130pOt3.LIZLLL("to_status");
                                                                if (Intrinsics.LJFF(strLIZLLL2, "up")) {
                                                                    abstractC1509490pNrLIZ6.addFeature("volume_increase_cnt", Float.valueOf(1.0f), false);
                                                                } else if (Intrinsics.LJFF(strLIZLLL2, "down")) {
                                                                    abstractC1509490pNrLIZ6.addFeature("volume_decrease_cnt", Float.valueOf(1.0f), false);
                                                                }
                                                                abstractC1509490pNrLIZ6.setFeature("volume_label", Float.valueOf(-1.0f), false);
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C1337780kuu.LIZ(th, null, 6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            case -795864119:
                                                if (str5.equals("enter_personal_detail") && (strLIZ6 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO37 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ7 = C1509610pO3.LIZ(strLIZ6);
                                                    if (abstractC1509490pNrLIZ7 != null) {
                                                        abstractC1509490pNrLIZ7.addFeature("head", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -405326491:
                                                if (str5.equals("favourite_video") && (strLIZ7 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO38 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ8 = C1509610pO3.LIZ(strLIZ7);
                                                    if (abstractC1509490pNrLIZ8 != null) {
                                                        abstractC1509490pNrLIZ8.addFeature("favorite", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case -268651341:
                                                if (str5.equals("request_to_show_interval")) {
                                                    Number numberLIZJ3 = c1510130pOt3.LIZJ("request_latency");
                                                    long jLongValue = numberLIZJ3 != null ? numberLIZJ3.longValue() : 0L;
                                                    C1510180pOy.LIZIZ.getClass();
                                                    C1510180pOy.LIZJ = jLongValue;
                                                }
                                                break;
                                            case -17674694:
                                                if (str5.equals("video_play_finish") && (strLIZ8 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO39 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ9 = C1509610pO3.LIZ(strLIZ8);
                                                    if (abstractC1509490pNrLIZ9 != null) {
                                                        abstractC1509490pNrLIZ9.addFeature("finish", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 3321751:
                                                if (str5.equals("like") && (strLIZ9 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO310 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ10 = C1509610pO3.LIZ(strLIZ9);
                                                    if (abstractC1509490pNrLIZ10 != null) {
                                                        abstractC1509490pNrLIZ10.addFeature("like", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 664716235:
                                                if (str5.equals("click_report") && (strLIZ10 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO311 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ11 = C1509610pO3.LIZ(strLIZ10);
                                                    if (abstractC1509490pNrLIZ11 != null) {
                                                        abstractC1509490pNrLIZ11.addFeature("report", Float.valueOf(1.0f), false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1120107347:
                                                if (str5.equals("poi_click") && (strLIZ11 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO312 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ12 = C1509610pO3.LIZ(strLIZ11);
                                                    if (abstractC1509490pNrLIZ12 != null) {
                                                        abstractC1509490pNrLIZ12.addFeature("clk_poi", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1382290738:
                                                if (str5.equals("video_pause") && (strLIZ12 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO313 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ13 = C1509610pO3.LIZ(strLIZ12);
                                                    if (abstractC1509490pNrLIZ13 != null) {
                                                        abstractC1509490pNrLIZ13.addFeature("pause", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1438590386:
                                                if (str5.equals("enter_music_detail") && (strLIZ13 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO314 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ14 = C1509610pO3.LIZ(strLIZ13);
                                                    if (abstractC1509490pNrLIZ14 != null) {
                                                        abstractC1509490pNrLIZ14.addFeature("music", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1671642405:
                                                if (str5.equals("dislike") && (strLIZ14 = C1509410pNj.LIZ(c1510130pOt3)) != null) {
                                                    C1509610pO3 c1509610pO315 = C1509610pO3.LIZIZ;
                                                    AbstractC1509490pNr abstractC1509490pNrLIZ15 = C1509610pO3.LIZ(strLIZ14);
                                                    if (abstractC1509490pNrLIZ15 != null) {
                                                        abstractC1509490pNrLIZ15.addFeature("dislike", 1, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$1");
                                }
                            });
                            final String str5 = str3;
                            final C1510130pOt c1510130pOt3 = c1510130pOt;
                            C1086000eMo.LIZ(new Runnable() { // from class: X.0pOa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$2");
                                    try {
                                        C1509740pOG.LIZ(str5, c1510130pOt3);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$2");
                                }
                            });
                            final String str6 = str3;
                            final C1510130pOt c1510130pOt4 = c1510130pOt;
                            C1086000eMo.LIZ(new Runnable() { // from class: X.0pOe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$3");
                                    try {
                                        FeatureServiceManager.Companion.getClass();
                                        C1510050pOl.LIZ().handleAppLogEvent(str6, c1510130pOt4);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$3");
                                }
                            });
                            final String str7 = str3;
                            C1086000eMo.LIZ(new Runnable() { // from class: X.0pPT
                                public final void LIZ() {
                                    List<String> list;
                                    int i = C2519309u3.LIZ;
                                    if ((C2519309u3.LIZ & 1) != 1) {
                                        String str8 = str7;
                                        Iterator<Map.Entry<String, C1511480pR4>> it2 = C1511480pR4.LJIIZILJ.entrySet().iterator();
                                        while (it2.hasNext()) {
                                            C1511480pR4 value = it2.next().getValue();
                                            C1510500pPU c1510500pPU = value.LJIILIIL;
                                            if (c1510500pPU != null) {
                                                if (c1510500pPU.LIZ == 200 && Intrinsics.LJFF(c1510500pPU.LIZLLL, str8)) {
                                                    value.LJ(200);
                                                }
                                                List<Integer> list2 = c1510500pPU.LIZIZ;
                                                if (list2 != null && list2.contains(200) && (list = c1510500pPU.LJ) != null && list.contains(str8)) {
                                                    value.LJ(200);
                                                }
                                            }
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$4");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1$4");
                                }
                            });
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AppLogFeatureProducerHandler@144b.handAppLogEvent$1");
                        }
                    });
                }
                if (C1509900pOW.LIZJ || (map = ((CompensationMap) C1509990pOf.LIZIZ.getValue()).configMap) == null || (eventDetail = map.get(str3)) == null) {
                    return;
                }
                List<C1509920pOY> list = C1509900pOW.LIZIZ;
                String str4 = eventDetail.eventName;
                if (str4 != null) {
                    str3 = str4;
                }
                list.add(new C1509920pOY(eventDetail.sourceType, str3, jSONObject2));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppLogEventHandler@3ef.handAppLogEventJson$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppLogEventHandler@3ef.handAppLogEventJson$2");
            }
        });
    }
}
