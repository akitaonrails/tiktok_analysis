package com.ss.android.ugc.aweme.ml.feature;

import X.C0R1F;
import X.C1227904rF;
import X.C1337780kuu;
import X.C2123108Tl;
import X.C282630B5x;
import X.RunnableC514701zV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ClientAIConfigCenterImpl implements ClientAIConfigCenter {
    public static final /* synthetic */ int LIZJ = 0;
    public final Map<String, SmartSceneConfig> LIZIZ = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter
    public final void init() {
        if (((Boolean) C282630B5x.LIZ.getValue()).booleanValue() && ((ConcurrentHashMap) this.LIZIZ).isEmpty()) {
            LJ("keva_client_ai_sample_collect");
            LJ("keva_client_ai_inference");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter
    public final Map<String, SmartSceneConfig> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter
    public final SmartSceneConfig LIZ(String str) {
        SmartSceneConfig smartSceneConfig = (SmartSceneConfig) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (smartSceneConfig == null) {
            C2123108Tl.LIZ.execute(new RunnableC514701zV(str, 6));
        }
        return smartSceneConfig;
    }

    public final void LJ(String str) {
        try {
            String strLIZIZ = C0R1F.LIZIZ(str);
            if (strLIZIZ.length() > 0) {
                C1227904rF.LIZ.getClass();
                List<SmartSceneConfig> list = (List) C1227904rF.LIZLLL().LJIIIIZZ(strLIZIZ, new TypeToken<List<? extends SmartSceneConfig>>() { // from class: X.0R1E
                }.getType());
                if (list == null) {
                    return;
                }
                for (SmartSceneConfig smartSceneConfig : list) {
                    if (smartSceneConfig != null) {
                        Map<String, SmartSceneConfig> map = this.LIZIZ;
                        String scene = smartSceneConfig.getScene();
                        if (scene != null) {
                            ((ConcurrentHashMap) map).put(scene, smartSceneConfig);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0R1F.LIZJ(str);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter
    public final void LIZJ(Map<String, String> map, n nVar) {
        if (!((Boolean) C282630B5x.LIZ.getValue()).booleanValue()) {
            return;
        }
        LJFF(nVar, "client_ai_sample_collect_configs", "keva_client_ai_sample_collect", map, "collect_task_detail");
        LJFF(nVar, "client_ai_model_inference_configs", "keva_client_ai_inference", map, "inference_task_detail");
    }

    public static void LIZLLL(Map map, String str, k kVar) {
        k kVarLJJIIZ;
        String strLJIL;
        if (!(kVar instanceof h)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar2 : kVar.LJIIL()) {
            if (kVar2 != null && (kVarLJJIIZ = kVar2.LJIILIIL().LJJIIZ("name")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                arrayList.add(strLJIL);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        map.put(str, arrayList.toString());
    }

    public static void LJFF(n nVar, String str, String str2, Map map, String str3) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                if (kVarLJJIIZ instanceof h) {
                    LIZLLL(map, str3, kVarLJJIIZ);
                    C0R1F.LIZLLL(str2, kVarLJJIIZ.toString());
                    return;
                }
                return;
            }
            C0R1F.LIZJ(str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0R1F.LIZJ(str2);
            C1337780kuu.LIZ(th, null, 6);
        }
    }
}
