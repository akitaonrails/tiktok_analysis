package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C0NAL;
import X.C1510130pOt;
import X.C1510150pOv;
import X.C1510500pPU;
import X.C1511100pQS;
import X.C1511300pQm;
import X.C1511340pQq;
import X.C1511480pR4;
import X.C2214201BlK;
import X.InterfaceC1488230opZ;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import X.InterfaceC588340N5s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPlaytimePredictServiceImpl extends SmartPlaytimePredictService implements InterfaceC588340N5s {
    public static final /* synthetic */ int LJFF = 0;
    public final Map<String, C1511100pQS> LIZIZ = new ConcurrentHashMap();
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
        List<OnePlaytimePredictConfig> serviceList;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        SmartPlaytimePredictConfig playtimePredictServiceConfig = SmartPlaytimePredictExperiment.INSTANCE.getPlaytimePredictServiceConfig();
        if (playtimePredictServiceConfig == null || (serviceList = playtimePredictServiceConfig.getServiceList()) == null || serviceList.isEmpty()) {
            return;
        }
        Iterator<OnePlaytimePredictConfig> it2 = serviceList.iterator();
        while (it2.hasNext()) {
            configOneNewService(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
        SmartSceneConfig sceneConfig;
        String scene;
        C1511480pR4 c1511480pR4;
        if (onePlaytimePredictConfig == null || (sceneConfig = onePlaytimePredictConfig.getSceneConfig()) == null || (scene = sceneConfig.getScene()) == null || ((ConcurrentHashMap) this.LIZIZ).containsKey(scene)) {
            return;
        }
        SmartMLSceneService.Companion.getClass();
        C1511300pQm.LIZ.configSceneModel(scene, onePlaytimePredictConfig.getSceneConfig());
        ((ConcurrentHashMap) this.LIZIZ).put(scene, new C1511100pQS(scene, onePlaytimePredictConfig));
        if (!this.LIZLLL && onePlaytimePredictConfig.getTrigger() == 2) {
            this.LIZLLL = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_call_playtime", this);
        } else if (!this.LJ && onePlaytimePredictConfig.getTrigger() == 1) {
            this.LJ = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_first_frame", this);
        }
        final OnePlaytimePredictRealConfig realConfig = onePlaytimePredictConfig.getRealConfig();
        if (realConfig != null && (c1511480pR4 = C1511480pR4.LJIIZILJ.get(scene)) != null) {
            InterfaceC1488230opZ interfaceC1488230opZ = new InterfaceC1488230opZ(realConfig) { // from class: X.0pQQ
                public final OnePlaytimePredictRealConfig LIZ;

                {
                    this.LIZ = realConfig;
                }

                @Override // X.InterfaceC1488230opZ
                public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) throws JSONException {
                    String str;
                    MLDataCenterService.Companion.getClass();
                    int iLongValue = 0;
                    C740510T2z feedTrackRangeInfo = C1349505Px.LIZ.getFeedTrackRangeInfo(null, this.LIZ.getCount(), false);
                    if (feedTrackRangeInfo == null) {
                        return true;
                    }
                    if (feedTrackRangeInfo.LJ.size() <= 0) {
                        return false;
                    }
                    ArrayList<Long> arrayList = feedTrackRangeInfo.LJ;
                    int type = this.LIZ.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type != 4) {
                                        if (type == 5) {
                                            C08XD.LJIL(arrayList);
                                            iLongValue = (int) ((Number) ListProtector.get(arrayList, arrayList.size() / 2)).longValue();
                                        }
                                    } else {
                                        Iterator<Long> it2 = arrayList.iterator();
                                        iLongValue = 1000000000;
                                        while (it2.hasNext()) {
                                            long jLongValue = it2.next().longValue();
                                            if (jLongValue < iLongValue) {
                                                iLongValue = (int) jLongValue;
                                            }
                                        }
                                    }
                                } else {
                                    Iterator<Long> it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        long jLongValue2 = it3.next().longValue();
                                        if (jLongValue2 > iLongValue) {
                                            iLongValue = (int) jLongValue2;
                                        }
                                    }
                                }
                            } else {
                                Iterator<Long> it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    iLongValue += (int) it4.next().longValue();
                                }
                                iLongValue /= arrayList.size();
                            }
                        } else {
                            Iterator<Long> it5 = arrayList.iterator();
                            while (it5.hasNext()) {
                                iLongValue += (int) it5.next().longValue();
                            }
                        }
                        if (iLongValue >= this.LIZ.getDuration()) {
                            str = "gt";
                        } else {
                            str = "lt";
                        }
                        jSONObject.put("ss_result", str);
                        jSONObject.put("ff_result", Float.valueOf(iLongValue));
                        return true;
                    }
                    JSONArray jSONArray = new JSONArray();
                    Iterator<Long> it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        jSONArray.put(it6.next().longValue());
                    }
                    jSONObject.put("ss_result", jSONArray.toString());
                    return true;
                }
            };
            C1510500pPU c1510500pPU = new C1510500pPU(0, null, 0, 31);
            c1510500pPU.LIZ = realConfig.getTrackType();
            c1510500pPU.LIZJ = realConfig.getOffset() + realConfig.getCount();
            c1511480pR4.LJII(c1510500pPU, interfaceC1488230opZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return false;
        }
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
        if (str != null && str.length() != 0 && ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            SmartMLSceneService.Companion.getClass();
            C1511300pQm.LIZ.ensureEnvAvailable(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final boolean isEnvReady(String str) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return false;
        }
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null) {
            return c1511340pQqLastSuccessRunResult.LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        Aweme awemeLIZ;
        Aweme awemeLIZ2;
        if (Intrinsics.LJFF(str, "play_first_frame")) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                if (((C1511100pQS) entry.getValue()).LIZIZ.getTrigger() == 1) {
                    String str2 = (String) entry.getKey();
                    if (c1510130pOt != null) {
                        awemeLIZ2 = C1510150pOv.LIZ(c1510130pOt);
                    } else {
                        awemeLIZ2 = null;
                    }
                    predictWithAweme(str2, awemeLIZ2, null, null);
                }
            }
            return;
        }
        if (Intrinsics.LJFF(str, "play_call_playtime")) {
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                if (((C1511100pQS) entry2.getValue()).LIZIZ.getTrigger() == 2) {
                    String str3 = (String) entry2.getKey();
                    if (c1510130pOt != null) {
                        awemeLIZ = C1510150pOv.LIZ(c1510130pOt);
                    } else {
                        awemeLIZ = null;
                    }
                    predictWithAweme(str3, awemeLIZ, null, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final float lastPredictFloatResult(String str, float f) {
        Float f2;
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null && (f2 = c1511340pQqLastSuccessRunResult.LIZLLL) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final String lastPredictResultLabel(String str, String str2) {
        String str3;
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null && (str3 = c1511340pQqLastSuccessRunResult.LIZIZ) != null) {
            return str3;
        }
        return str2;
    }

    public static void LIZ(String str, C0N33 c0n33, InterfaceC1511190pQb interfaceC1511190pQb) {
        SmartMLSceneService.Companion.getClass();
        ISmartMLSceneService iSmartMLSceneService = C1511300pQm.LIZ;
        C1511340pQq c1511340pQqLastSuccessRunResult = iSmartMLSceneService.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null) {
            if (interfaceC1511190pQb != null) {
                interfaceC1511190pQb.LIZ(true, 0, c1511340pQqLastSuccessRunResult, c0n33);
            }
        } else {
            int iLastRunErrorCode = iSmartMLSceneService.lastRunErrorCode(str);
            if (interfaceC1511190pQb == null) {
                return;
            }
            interfaceC1511190pQb.LIZ(false, iLastRunErrorCode, null, c0n33);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC1511190pQb interfaceC1511190pQb) {
        predictWithAweme(str, aweme, null, interfaceC1511190pQb);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
        if (str != null && str.length() != 0 && ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            C1511100pQS c1511100pQS = (C1511100pQS) ((ConcurrentHashMap) this.LIZIZ).get(str);
            if (c1511100pQS == null) {
                if (interfaceC1511190pQb != null) {
                    interfaceC1511190pQb.LIZ(false, -1, null, c0n33);
                    return;
                }
                return;
            }
            if (C2214201BlK.LJIIJJI) {
                LIZ(str, c0n33, interfaceC1511190pQb);
                return;
            }
            if (c1511100pQS.LIZIZ.getSkipCount() > 0 && c1511100pQS.LIZJ < c1511100pQS.LIZIZ.getSkipCount()) {
                c1511100pQS.LIZJ++;
                LIZ(str, c0n33, interfaceC1511190pQb);
                return;
            }
            if (c1511100pQS.LIZIZ.getRunTimeGap() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - c1511100pQS.LIZLLL < c1511100pQS.LIZIZ.getRunTimeGap()) {
                    LIZ(str, c0n33, interfaceC1511190pQb);
                    return;
                }
                c1511100pQS.LIZLLL = jCurrentTimeMillis;
            }
            if (c1511100pQS.LIZIZ.getRunFeedGap() > 0) {
                if (c1511100pQS.LJ < c1511100pQS.LIZIZ.getRunFeedGap()) {
                    c1511100pQS.LJ++;
                    LIZ(str, c0n33, interfaceC1511190pQb);
                    return;
                }
                c1511100pQS.LJ = 0;
            }
            c1511100pQS.LJFF++;
            SmartMLSceneService.Companion.getClass();
            C1511300pQm.LIZ.runDelay(str, c1511100pQS.LIZIZ.getRunDelay(), c0n33, null, interfaceC1511190pQb);
            return;
        }
        if (interfaceC1511190pQb != null) {
            interfaceC1511190pQb.LIZ(false, -1, null, c0n33);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
        C0N33 c0n33 = new C0N33();
        c0n33.LJIIJ = aweme;
        predict(str, c0n33, null, interfaceC1511190pQb);
    }
}
