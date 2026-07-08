package com.ss.android.ugc.aweme.ml.common;

import X.C00J6;
import X.C0N33;
import X.C0N9Z;
import X.C1227904rF;
import X.C1510050pOl;
import X.C1510800pPy;
import X.C1510830pQ1;
import X.C1510850pQ3;
import X.C1512160pSA;
import X.C1697810uHb;
import X.C1AF0;
import X.C2188811AlT;
import X.C7740030o;
import X.C786410Ut5;
import Y.ARunnableS11S0000100_9;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ml.ab.ClientAIBatchFeatureConfigMap;
import com.ss.android.ugc.aweme.ml.ab.ClientAiBatchFeatureConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ClientAIFeatureHelper {
    public static final ClientAIFeatureHelper INSTANCE = new ClientAIFeatureHelper();
    public static final HashMap<String, List<FeatureGroup>> featureConfigCache = new HashMap<>();

    public static final String getBatchInputLabeledByGroup(String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        Object objOpt;
        Integer num;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Type type = new TypeToken<List<? extends FeatureGroup>>() { // from class: X.0NRI
            }.getType();
            JSONObject jSONObject2 = new JSONObject();
            List<FeatureGroup> list = (List) C7740030o.LIZ().getGson().LJIIIIZZ(str, type);
            if (list != null) {
                for (FeatureGroup featureGroup : list) {
                    List<FeatureItem> list2 = featureGroup.features;
                    if (list2 != null && (str2 = featureGroup.groupName) != null) {
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer = C1510050pOl.LIZ().getProducer(str2, featureGroup.sourceType);
                        if (producer != null) {
                            producer.enableProducer((List<FeatureItem>) null);
                            for (FeatureItem featureItem : list2) {
                                String str4 = featureItem.trans;
                                if (str4 == null) {
                                    str4 = featureItem.name;
                                }
                                String strValueOf = String.valueOf(str4);
                                String str5 = featureItem.name;
                                if (str5 != null) {
                                    String str6 = featureItem.params;
                                    if (str6 == null) {
                                        Object feature$default = FeatureProducer.getFeature$default(producer, str5, (JSONObject) null, "vod_business", (ReturnCode) null, 10, (Object) null);
                                        if (feature$default instanceof Map) {
                                            for (Map.Entry entry : ((Map) feature$default).entrySet()) {
                                                Object key = entry.getKey();
                                                if (key instanceof String) {
                                                    str3 = (String) key;
                                                } else {
                                                    str3 = null;
                                                }
                                                if (str3 != null) {
                                                    jSONObject2.put(str3, entry.getValue());
                                                }
                                            }
                                        } else {
                                            jSONObject2.put(strValueOf, feature$default);
                                        }
                                    } else {
                                        try {
                                            JSONObject jSONObject3 = new JSONObject(str6);
                                            try {
                                                Object feature$default2 = FeatureProducer.getFeature$default(producer, str5, jSONObject3, "vod_business", (ReturnCode) null, 8, (Object) null);
                                                if (feature$default2 instanceof ArrayList) {
                                                    Object objOpt2 = jSONObject3.opt("params");
                                                    if (objOpt2 instanceof JSONObject) {
                                                        jSONObject = (JSONObject) objOpt2;
                                                    } else {
                                                        jSONObject = null;
                                                    }
                                                    if (jSONObject == null) {
                                                        objOpt = null;
                                                    } else {
                                                        objOpt = jSONObject.opt("range");
                                                    }
                                                    if (objOpt instanceof Integer) {
                                                        num = (Integer) objOpt;
                                                    } else {
                                                        num = null;
                                                    }
                                                    if (num != null) {
                                                        int iIntValue = num.intValue();
                                                        for (Object obj : (Iterable) feature$default2) {
                                                            iIntValue--;
                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                            sbLIZ.append(strValueOf);
                                                            sbLIZ.append('_');
                                                            sbLIZ.append(iIntValue);
                                                            jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                                                        }
                                                    }
                                                } else {
                                                    jSONObject2.put(strValueOf, feature$default2);
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                TryCatchGuardChecker.doCheck(th);
                                                C1AF0.LJFF(th, "client_ai_crash");
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (new SecureRandom().nextFloat() < 0.001f) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C1510800pPy c1510800pPy = C1510850pQ3.LIZ;
                if (c1510800pPy == null) {
                    c1510800pPy = C1510830pQ1.LIZ;
                }
                ExecutorService executorServiceLIZ = c1510800pPy.LIZ();
                if (executorServiceLIZ != null) {
                    executorServiceLIZ.execute(new ARunnableS11S0000100_9(jCurrentTimeMillis2, 0));
                }
            }
            return C786410Ut5.J3(jSONObject2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C1AF0.LJFF(th3, "client_ai_crash");
            return "";
        }
    }

    private final boolean isStringContentNotNull(String str) {
        if (!Intrinsics.LJFF(str, "null") && !Intrinsics.LJFF(str, "Null") && !Intrinsics.LJFF(str, "NULL")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.ss.ugc.clientai.core.api.FeatureProducer] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.ss.ugc.clientai.core.api.FeatureProducer] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.ss.ugc.clientai.core.api.FeatureProducer] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static final String getBatchInputByBiz(final String str, String str2, String str3) {
        ClientAiBatchFeatureConfig clientAiBatchFeatureConfig;
        boolean z;
        List<FeatureGroup> list;
        String str4;
        ?? r30;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object objOpt;
        Integer num;
        String str5;
        Map<String, ClientAiBatchFeatureConfig> map;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ClientAIBatchFeatureConfigMap clientAIBatchFeatureConfigMap = C00J6.LIZ;
            ?? r9 = 0;
            if (clientAIBatchFeatureConfigMap != null && (map = clientAIBatchFeatureConfigMap.map) != null) {
                clientAiBatchFeatureConfig = map.get(str);
            } else {
                clientAiBatchFeatureConfig = null;
            }
            HashMap<String, List<FeatureGroup>> map2 = featureConfigCache;
            if (map2.containsKey(str)) {
                list = map2.get(str);
            } else {
                if (clientAiBatchFeatureConfig == null) {
                    return "";
                }
                map2.put(str, null);
                OneSmartDataTrackConfig oneSmartDataTrackConfig = clientAiBatchFeatureConfig.dataTrackConfig;
                if (oneSmartDataTrackConfig != null) {
                    SmartDataTrackerService.Companion.getClass();
                    C1512160pSA.LIZ.configOneNewTrack(oneSmartDataTrackConfig);
                }
                if (clientAiBatchFeatureConfig.featureConfigJsonStr.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list = null;
                } else {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str6 = clientAiBatchFeatureConfig.featureConfigJsonStr;
                    Type type = new TypeToken<List<? extends FeatureGroup>>() { // from class: X.0NRJ
                    }.getType();
                    c1227904rF.getClass();
                    list = (List) C1227904rF.LIZJ(str6, type);
                }
                map2.put(str, list);
            }
            JSONObject jSONObject3 = new JSONObject();
            if (list != null) {
                int i = 0;
                for (FeatureGroup featureGroup : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        FeatureGroup featureGroup2 = featureGroup;
                        List<FeatureItem> list2 = featureGroup2.features;
                        if (list2 != null && (str4 = featureGroup2.groupName) != null) {
                            FeatureServiceManager.Companion.getClass();
                            ?? producer = C1510050pOl.LIZ().getProducer(str4, featureGroup2.sourceType);
                            if (producer != 0) {
                                producer.enableProducer(r9);
                                try {
                                    ?? r11 = producer;
                                    for (FeatureItem featureItem : list2) {
                                        String str7 = featureItem.trans;
                                        if (str7 == null) {
                                            str7 = featureItem.name;
                                        }
                                        String strValueOf = String.valueOf(str7);
                                        String str8 = featureItem.name;
                                        if (str8 != null) {
                                            String str9 = featureItem.params;
                                            if (str9 == null) {
                                                r30 = r11;
                                                try {
                                                    Object feature$default = FeatureProducer.getFeature$default((FeatureProducer) r11, str8, (JSONObject) null, str, (ReturnCode) null, 10, (Object) null);
                                                    if (feature$default instanceof Map) {
                                                        for (Map.Entry entry : ((Map) feature$default).entrySet()) {
                                                            Object key = entry.getKey();
                                                            if (key instanceof String) {
                                                                str5 = (String) key;
                                                            } else {
                                                                str5 = null;
                                                            }
                                                            if (str5 != null) {
                                                                try {
                                                                    jSONObject3.put(str5, entry.getValue());
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    try {
                                                                        TryCatchGuardChecker.doCheck(th);
                                                                        C1AF0.LJFF(th, "client_ai_crash");
                                                                        i = i2;
                                                                        r9 = 0;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        TryCatchGuardChecker.doCheck(th);
                                                                        C1AF0.LJFF(th, "client_ai_crash");
                                                                        return "";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        jSONObject3.put(strValueOf, feature$default);
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } else {
                                                r30 = r11;
                                                JSONObject jSONObject4 = new JSONObject(str9);
                                                if (jSONObject4.has("aid")) {
                                                    jSONObject4.put("aid", str2);
                                                } else if (jSONObject4.has("params")) {
                                                    Object obj = jSONObject4.get("params");
                                                    if (obj instanceof JSONObject) {
                                                        jSONObject = (JSONObject) obj;
                                                    } else {
                                                        jSONObject = null;
                                                    }
                                                    if (jSONObject == null) {
                                                        continue;
                                                    } else if (jSONObject.has("aid")) {
                                                        jSONObject.put("aid", str2);
                                                    }
                                                }
                                                try {
                                                    Object feature$default2 = FeatureProducer.getFeature$default((FeatureProducer) r30, str8, jSONObject4, str, (ReturnCode) null, 8, (Object) null);
                                                    if (feature$default2 instanceof List) {
                                                        if (Intrinsics.LJFF(str4, "f_feed")) {
                                                            int i3 = 0;
                                                            for (Object obj2 : (Iterable) feature$default2) {
                                                                int i4 = i3 + 1;
                                                                if (i3 >= 0) {
                                                                    if (obj2 instanceof List) {
                                                                        int i5 = 0;
                                                                        for (Object obj3 : (Iterable) obj2) {
                                                                            int i6 = i5 + 1;
                                                                            if (i5 >= 0) {
                                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                sbLIZ.append(strValueOf);
                                                                                sbLIZ.append('_');
                                                                                sbLIZ.append(i3);
                                                                                sbLIZ.append('_');
                                                                                sbLIZ.append(i5);
                                                                                jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ), obj3);
                                                                                i5 = i6;
                                                                            } else {
                                                                                C1697810uHb.LJIJI();
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                        sbLIZ2.append(strValueOf);
                                                                        sbLIZ2.append('_');
                                                                        sbLIZ2.append(i3);
                                                                        jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ2), obj2);
                                                                    }
                                                                    i3 = i4;
                                                                } else {
                                                                    C1697810uHb.LJIJI();
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            Object objOpt2 = jSONObject4.opt("params");
                                                            if (objOpt2 instanceof JSONObject) {
                                                                jSONObject2 = (JSONObject) objOpt2;
                                                            } else {
                                                                jSONObject2 = null;
                                                            }
                                                            if (jSONObject2 == null) {
                                                                objOpt = null;
                                                            } else {
                                                                objOpt = jSONObject2.opt("range");
                                                            }
                                                            if (objOpt instanceof Integer) {
                                                                num = (Integer) objOpt;
                                                            } else {
                                                                num = null;
                                                            }
                                                            if (num != null) {
                                                                int iIntValue = num.intValue();
                                                                for (Object obj4 : (Iterable) feature$default2) {
                                                                    iIntValue--;
                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                    sbLIZ3.append(strValueOf);
                                                                    sbLIZ3.append('_');
                                                                    sbLIZ3.append(iIntValue);
                                                                    jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ3), obj4);
                                                                }
                                                            }
                                                        }
                                                    } else if (feature$default2 instanceof h) {
                                                        int i7 = 0;
                                                        for (Object obj5 : (Iterable) feature$default2) {
                                                            int i8 = i7 + 1;
                                                            if (i7 >= 0) {
                                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                sbLIZ4.append(strValueOf);
                                                                sbLIZ4.append('_');
                                                                sbLIZ4.append(i7);
                                                                jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ4), (k) obj5);
                                                                i7 = i8;
                                                            } else {
                                                                C1697810uHb.LJIJI();
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        jSONObject3.put(strValueOf, feature$default2);
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C1AF0.LJFF(th, "client_ai_crash");
                                                    i = i2;
                                                    r9 = 0;
                                                }
                                            }
                                        } else {
                                            r30 = r11;
                                        }
                                        r11 = r30;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                continue;
                            }
                        }
                        i = i2;
                        r9 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw r9;
                    }
                }
            }
            INSTANCE.reportData(clientAiBatchFeatureConfig, str2, str3);
            if (new SecureRandom().nextFloat() < 0.001f) {
                final long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C1510800pPy c1510800pPy = C1510850pQ3.LIZ;
                if (c1510800pPy == null) {
                    c1510800pPy = C1510830pQ1.LIZ;
                }
                ExecutorService executorServiceLIZ = c1510800pPy.LIZ();
                if (executorServiceLIZ != null) {
                    executorServiceLIZ.execute(new Runnable() { // from class: X.0N9l
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ClientAIFeatureHelper@1ae7.getBatchInputByBiz$2");
                            try {
                                MLCommonService.Companion.getClass();
                                C0NAL.LIZ.reportEvent("ml_scene_run", new JSONObject().put(Scene.SCENE_SERVICE, str).put("data_cost", jCurrentTimeMillis2));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ClientAIFeatureHelper@1ae7.getBatchInputByBiz$2");
                        }
                    });
                }
            }
            return C786410Ut5.J3(jSONObject3);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private final void reportData(ClientAiBatchFeatureConfig clientAiBatchFeatureConfig, String str, String str2) {
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        if (clientAiBatchFeatureConfig != null && (oneSmartDataTrackConfig = clientAiBatchFeatureConfig.dataTrackConfig) != null) {
            SmartDataTrackerService.Companion.getClass();
            if (C1512160pSA.LIZ.enable(oneSmartDataTrackConfig.getScene())) {
                if (oneSmartDataTrackConfig.getTrackType() == 0) {
                    C0N33 c0n33 = new C0N33();
                    c0n33.LIZIZ = str;
                    c0n33.LJIIJ = C0N9Z.LIZ(str);
                    if (str2 != null && str2.length() != 0 && INSTANCE.isStringContentNotNull(str2)) {
                        JSONObject jSONObject = new JSONObject(str2);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c0n33.LIZIZ().put(next, jSONObject.opt(next));
                        }
                    }
                    SmartDataTrackerService.Companion.getClass();
                    C1512160pSA.LIZ.onScenePredictCheckOrRun(oneSmartDataTrackConfig.getScene(), c0n33);
                }
                if (oneSmartDataTrackConfig.getRealTriggerType() == 0) {
                    C0N33 c0n332 = new C0N33();
                    c0n332.LIZIZ = str;
                    c0n332.LJIIJ = C0N9Z.LIZ(str);
                    SmartDataTrackerService.Companion.getClass();
                    C1512160pSA.LIZ.onSceneRealCheckAndReport(oneSmartDataTrackConfig.getScene(), c0n332);
                }
            }
        }
    }
}
