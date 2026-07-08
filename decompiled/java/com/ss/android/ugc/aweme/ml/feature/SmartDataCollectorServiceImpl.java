package com.ss.android.ugc.aweme.ml.feature;

import X.AbstractC19994813Le;
import X.C0NAL;
import X.C0QQG;
import X.C1337780kuu;
import X.C13BV;
import X.C13LP;
import X.C1509290pNX;
import X.C1509310pNZ;
import X.C1510050pOl;
import X.C1510130pOt;
import X.C1510150pOv;
import X.C1511360pQs;
import X.C1511370pQt;
import X.C1511380pQu;
import X.C20684815ws;
import X.C2188811AlT;
import X.C261400AMg;
import X.C261410AMh;
import X.C786410Ut5;
import X.InterfaceC1510030pOj;
import X.InterfaceC588340N5s;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService;
import com.ss.android.ugc.aweme.ml.infra.CollectingTimingConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartDataCollectorServiceImpl implements SmartDataCollectorService, InterfaceC588340N5s, InterfaceC1510030pOj {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Map<String, C1511370pQt> LIZIZ = new ConcurrentHashMap();
    public final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService
    public final void init() {
        Map<String, SmartSceneConfig> mapLIZIZ;
        if (C261410AMh.LIZ() && !(!((ConcurrentHashMap) this.LIZIZ).isEmpty())) {
            try {
                ClientAIConfigCenter.LIZ.getClass();
                ClientAIConfigCenter value = C0QQG.LIZIZ.getValue();
                if (value == null || (mapLIZIZ = value.LIZIZ()) == null || mapLIZIZ.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, SmartSceneConfig> entry : mapLIZIZ.entrySet()) {
                    LIZLLL(entry.getKey(), entry.getValue());
                }
                if (((ConcurrentHashMap) this.LIZIZ).isEmpty()) {
                    return;
                }
                MLCommonService.Companion.getClass();
                IMLCommonService iMLCommonService = C0NAL.LIZ;
                iMLCommonService.addCommonEventListener("play_first_frame", this);
                iMLCommonService.addCommonEventListener("play_stop", this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
            }
        }
    }

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService
    public final void LIZ(String str, C1509310pNZ c1509310pNZ) {
        C1511370pQt c1511370pQt;
        SmartSceneConfig smartSceneConfig;
        CollectingTimingConfig collectTiming;
        JSONObject jSONObjectLIZJ;
        Aweme awemeLIZ;
        if (!C261410AMh.LIZ() || (c1511370pQt = (C1511370pQt) ((ConcurrentHashMap) this.LIZIZ).get(str)) == null || (collectTiming = (smartSceneConfig = c1511370pQt.LIZ).getCollectTiming()) == null || AbstractC19994813Le.Default.nextFloat() >= collectTiming.sampleRate) {
            return;
        }
        try {
            String inputFeatureSetName = smartSceneConfig.getInputFeatureSetName();
            if (inputFeatureSetName == null || (jSONObjectLIZJ = C1509290pNX.LIZJ(inputFeatureSetName, c1509310pNZ, str)) == null) {
                return;
            }
            if (smartSceneConfig.getRemoveZero()) {
                JSONObject jSONObject = new JSONObject();
                Iterator<String> itKeys = jSONObjectLIZJ.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectLIZJ.opt(next);
                    if (!(objOpt instanceof Number) || ((Number) objOpt).floatValue() != 0.0f) {
                        jSONObject.put(next, objOpt);
                    }
                }
                jSONObjectLIZJ = jSONObject;
            }
            JSONObject jSONObjectPut = new JSONObject().put("project_id", str);
            String aid = c1509310pNZ.LIZIZ;
            if (aid == null && ((awemeLIZ = C1511360pQs.LIZ(c1509310pNZ)) == null || (aid = awemeLIZ.getAid()) == null)) {
                aid = "";
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("run_key", aid).put("features", C786410Ut5.J3(jSONObjectLIZJ));
            c1511370pQt.LIZIZ.add(new C1511380pQu(smartSceneConfig.getCollectUploadInterval(), jSONObjectPut2));
            if (c1511370pQt.LIZIZ.size() > c1511370pQt.LIZJ) {
                c1511370pQt.LIZIZ.removeFirst();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" collectTrainingData reportJson:");
            sbLIZ.append(jSONObjectPut2);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService
    public final void LIZIZ(String str, C1509310pNZ c1509310pNZ) {
        C1511370pQt c1511370pQt;
        String outputFeatureSetName;
        JSONObject jSONObjectLIZJ;
        if (!C261410AMh.LIZ() || (c1511370pQt = (C1511370pQt) ((ConcurrentHashMap) this.LIZIZ).get(str)) == null || c1511370pQt.LIZIZ.isEmpty()) {
            return;
        }
        try {
            ArrayList<C1511380pQu> arrayList = new ArrayList();
            for (C1511380pQu c1511380pQu : c1511370pQt.LIZIZ) {
                if (c1511380pQu.LIZIZ <= 0) {
                    arrayList.add(c1511380pQu);
                }
                c1511380pQu.LIZIZ--;
            }
            if (!(!arrayList.isEmpty()) || (outputFeatureSetName = c1511370pQt.LIZ.getOutputFeatureSetName()) == null || (jSONObjectLIZJ = C1509290pNX.LIZJ(outputFeatureSetName, c1509310pNZ, str)) == null) {
                return;
            }
            for (C1511380pQu c1511380pQu2 : arrayList) {
                c1511380pQu2.LIZ.put("real", C786410Ut5.J3(jSONObjectLIZJ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" labelAndUploadForTraining reportJson:");
                sbLIZ.append(c1511380pQu2.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C20684815ws.LJIJ("on_device_ml_feature_house_label", c1511380pQu2.LIZ);
            }
            c1511370pQt.LIZIZ.removeAll(C13LP.LLIIJI(arrayList));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        String str2;
        String str3;
        if (c1510130pOt == null) {
            return;
        }
        if (!Intrinsics.LJFF(str, "play_first_frame") && !Intrinsics.LJFF(str, "play_stop")) {
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
            CollectingTimingConfig collectTiming = ((C1511370pQt) entry.getValue()).LIZ.getCollectTiming();
            ArrayList arrayList = null;
            if (collectTiming != null) {
                str2 = collectTiming.eventName;
            } else {
                str2 = null;
            }
            CollectingTimingConfig uploadTiming = ((C1511370pQt) entry.getValue()).LIZ.getUploadTiming();
            if (uploadTiming != null) {
                str3 = uploadTiming.eventName;
            } else {
                str3 = null;
            }
            List<CollectingTimingConfig> uploadTimingList = ((C1511370pQt) entry.getValue()).LIZ.getUploadTimingList();
            if (uploadTimingList != null) {
                arrayList = new ArrayList();
                Iterator<CollectingTimingConfig> it2 = uploadTimingList.iterator();
                while (it2.hasNext()) {
                    String str4 = it2.next().eventName;
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                }
            }
            String str5 = (String) entry.getKey();
            if (Intrinsics.LJFF(str3, str) || ((arrayList != null && arrayList.contains(str)) || Intrinsics.LJFF(str2, str))) {
                C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
                c1509310pNZ.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                c1509310pNZ.LIZJ = c1510130pOt.LIZLLL("enter_type");
                if (Intrinsics.LJFF(str3, str) || (arrayList != null && arrayList.contains(str))) {
                    LIZIZ(str5, c1509310pNZ);
                }
                if (Intrinsics.LJFF(str2, str)) {
                    LIZ(str5, c1509310pNZ);
                }
            }
        }
    }

    public final void LIZLLL(String str, SmartSceneConfig smartSceneConfig) {
        String outputFeatureSetName;
        CollectingTimingConfig collectTiming;
        String str2;
        CollectingTimingConfig uploadTiming;
        if (!C261410AMh.LIZ() || ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return;
        }
        String inputFeatureSetName = smartSceneConfig.getInputFeatureSetName();
        boolean z = false;
        if (inputFeatureSetName != null && inputFeatureSetName.length() != 0 && (outputFeatureSetName = smartSceneConfig.getOutputFeatureSetName()) != null && outputFeatureSetName.length() != 0 && (collectTiming = smartSceneConfig.getCollectTiming()) != null && (str2 = collectTiming.eventName) != null) {
            List<CollectingTimingConfig> uploadTimingList = smartSceneConfig.getUploadTimingList();
            if (uploadTimingList == null || uploadTimingList.isEmpty()) {
                z = true;
            }
            String str3 = null;
            if (z && ((uploadTiming = smartSceneConfig.getUploadTiming()) == null || uploadTiming.eventName == null)) {
                return;
            }
            this.LIZJ.add(str2);
            CopyOnWriteArraySet<String> copyOnWriteArraySet = this.LIZJ;
            CollectingTimingConfig uploadTiming2 = smartSceneConfig.getUploadTiming();
            if (uploadTiming2 != null) {
                str3 = uploadTiming2.eventName;
            }
            copyOnWriteArraySet.add(str3);
            List<CollectingTimingConfig> uploadTimingList2 = smartSceneConfig.getUploadTimingList();
            if (uploadTimingList2 != null) {
                Iterator<CollectingTimingConfig> it2 = uploadTimingList2.iterator();
                while (it2.hasNext()) {
                    this.LIZJ.add(it2.next().eventName);
                }
            }
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(this);
            ((ConcurrentHashMap) this.LIZIZ).put(str, new C1511370pQt(smartSceneConfig));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addDataCollectingTask ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        List<CollectingTimingConfig> uploadTimingList;
        List<CollectingTimingConfig> uploadTimingList2;
        if (this.LIZJ.contains(str)) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                SmartSceneConfig smartSceneConfig = ((C1511370pQt) entry.getValue()).LIZ;
                String str2 = (String) entry.getKey();
                if (((Boolean) C261400AMg.LIZ.getValue()).booleanValue()) {
                    CollectingTimingConfig collectTiming = smartSceneConfig.getCollectTiming();
                    if (collectTiming != null) {
                        if (LJ(str, c1510130pOt, collectTiming)) {
                            LIZ(str2, new C1509310pNZ(0));
                        }
                        if (smartSceneConfig.getUploadTiming() != null || ((uploadTimingList = smartSceneConfig.getUploadTimingList()) != null && !uploadTimingList.isEmpty())) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(smartSceneConfig.getUploadTiming());
                            List<CollectingTimingConfig> uploadTimingList3 = smartSceneConfig.getUploadTimingList();
                            if (uploadTimingList3 == null) {
                                uploadTimingList3 = C13BV.INSTANCE;
                            }
                            arrayList.addAll(uploadTimingList3);
                            Iterator it2 = ((ArrayList) C13LP.LJJJJLI(arrayList)).iterator();
                            while (it2.hasNext()) {
                                if (LJ(str, c1510130pOt, (CollectingTimingConfig) it2.next())) {
                                    LIZIZ(str2, new C1509310pNZ(0));
                                }
                            }
                        }
                    }
                } else if (smartSceneConfig.getUploadTiming() != null || ((uploadTimingList2 = smartSceneConfig.getUploadTimingList()) != null && !uploadTimingList2.isEmpty())) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(smartSceneConfig.getUploadTiming());
                    List<CollectingTimingConfig> uploadTimingList4 = smartSceneConfig.getUploadTimingList();
                    if (uploadTimingList4 == null) {
                        uploadTimingList4 = C13BV.INSTANCE;
                    }
                    arrayList2.addAll(uploadTimingList4);
                    Iterator it3 = ((ArrayList) C13LP.LJJJJLI(arrayList2)).iterator();
                    while (it3.hasNext()) {
                        if (LJ(str, c1510130pOt, (CollectingTimingConfig) it3.next())) {
                            LIZIZ(str2, new C1509310pNZ(0));
                        }
                    }
                    CollectingTimingConfig collectTiming2 = smartSceneConfig.getCollectTiming();
                    if (collectTiming2 != null && LJ(str, c1510130pOt, collectTiming2)) {
                        LIZ(str2, new C1509310pNZ(0));
                    }
                }
            }
        }
    }

    public static boolean LJ(String str, C1510130pOt c1510130pOt, CollectingTimingConfig collectingTimingConfig) {
        String string;
        try {
            if (Intrinsics.LJFF(collectingTimingConfig.eventName, str)) {
                String str2 = collectingTimingConfig.constraints;
                if (str2 == null || str2.length() == 0) {
                    return true;
                }
                if (collectingTimingConfig.LIZ == null) {
                    String str3 = collectingTimingConfig.constraints;
                    if (str3 == null) {
                        return true;
                    }
                    collectingTimingConfig.LIZ = new JSONObject(str3);
                }
                JSONObject jSONObject = collectingTimingConfig.LIZ;
                if (jSONObject == null) {
                    return true;
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt != null) {
                        string = objOpt.toString();
                    } else {
                        string = null;
                    }
                    if (!Intrinsics.LJFF(c1510130pOt.LIZLLL(next), string)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
        return false;
    }
}
