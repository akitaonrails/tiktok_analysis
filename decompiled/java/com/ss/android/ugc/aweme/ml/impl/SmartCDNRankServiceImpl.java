package com.ss.android.ugc.aweme.ml.impl;

import X.C0R1F;
import X.C1485890oln;
import X.C1485900olo;
import X.C20684815ws;
import X.C2188811AlT;
import X.C581910Ms1;
import X.C786410Ut5;
import X.C842470X3d;
import X.C842480X3e;
import X.C844470XAv;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.SmartCDNRankMLModel;
import com.ss.android.ugc.aweme.ml.ab.SmartCDNStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartCDNRankServiceImpl implements SmartCDNRankService {
    public static final /* synthetic */ int LIZJ = 0;
    public List<C1485890oln> LIZIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartCDNRankService
    public final C842470X3d LIZIZ() {
        SmartCDNRankMLModel smartCDNRankMLModelLIZ = C581910Ms1.LIZ();
        if (!(smartCDNRankMLModelLIZ != null && smartCDNRankMLModelLIZ.getEnabled())) {
            return null;
        }
        String strLIZIZ = C0R1F.LIZIZ("smart_cdn_rank_result");
        if (strLIZIZ.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strLIZIZ);
            return new C842470X3d(LIZJ(JSONObjectProtectorUtils.getJSONArray(jSONObject, "rank_wifi")), LIZJ(JSONObjectProtectorUtils.getJSONArray(jSONObject, "rank_other")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List LIZJ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
            arrayList.add(new C842480X3e(JSONObjectProtectorUtils.getInt(jSONObject, "cdn"), JSONObjectProtectorUtils.getInt(jSONObject, "score")));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartCDNRankService
    public final void LIZ(C1485890oln c1485890oln) throws JSONException {
        int calcuate_throttle;
        final String str;
        SmartCDNRankMLModel smartCDNRankMLModelLIZ;
        SmartCDNStrategyConfig strategy_config;
        SmartCDNRankMLModel smartCDNRankMLModelLIZ2;
        List<Integer> main_cdn_list;
        SmartCDNRankMLModel smartCDNRankMLModelLIZ3 = C581910Ms1.LIZ();
        int i = 0;
        if (smartCDNRankMLModelLIZ3 == null || !smartCDNRankMLModelLIZ3.getEnabled() || ((ArrayList) c1485890oln.LIZLLL).isEmpty()) {
            return;
        }
        SmartCDNRankMLModel smartCDNRankMLModelLIZ4 = C581910Ms1.LIZ();
        if (smartCDNRankMLModelLIZ4 != null) {
            calcuate_throttle = smartCDNRankMLModelLIZ4.getCalcuate_throttle();
        } else {
            calcuate_throttle = 2;
        }
        ((ArrayList) this.LIZIZ).add(c1485890oln);
        if (((ArrayList) this.LIZIZ).size() >= calcuate_throttle) {
            SmartCDNRankMLModel smartCDNRankMLModelLIZ5 = C581910Ms1.LIZ();
            if (smartCDNRankMLModelLIZ5 != null && (str = smartCDNRankMLModelLIZ5.packageUrl) != null && (smartCDNRankMLModelLIZ = C581910Ms1.LIZ()) != null && (strategy_config = smartCDNRankMLModelLIZ.getStrategy_config()) != null && (smartCDNRankMLModelLIZ2 = C581910Ms1.LIZ()) != null && (main_cdn_list = smartCDNRankMLModelLIZ2.getMain_cdn_list()) != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject2.put("cdn_qos", jSONArray);
                for (C1485890oln c1485890oln2 : (ArrayList) this.LIZIZ) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("network_type", c1485890oln2.LIZ);
                    jSONObject3.put("ff_duration", c1485890oln2.LIZIZ);
                    jSONObject3.put("block_count", i);
                    jSONObject3.put("block_duration", 0L);
                    jSONObject3.put("video_duration", c1485890oln2.LIZJ);
                    JSONArray jSONArray2 = new JSONArray();
                    for (C1485900olo c1485900olo : (ArrayList) c1485890oln2.LIZLLL) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("cdn_code", c1485900olo.LIZ);
                        jSONObject4.put("size", c1485900olo.LIZIZ);
                        jSONObject4.put("dur", c1485900olo.LIZJ);
                        jSONArray2.put(jSONObject4);
                    }
                    jSONObject3.put("download_info", jSONArray2);
                    jSONArray.put(jSONObject3);
                    i = 0;
                }
                jSONObject.put("raw_data", jSONObject2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator<Integer> it2 = main_cdn_list.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next().intValue());
                }
                jSONObject.put("main_cdn_list", jSONArray3);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("name", strategy_config.getName());
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("n_records", strategy_config.getN_records());
                jSONObject6.put("exploration_ratio", Float.valueOf(strategy_config.getExploration_ratio()));
                jSONObject6.put("n_samples", strategy_config.getN_samples());
                jSONObject6.put("mu", strategy_config.getMu());
                jSONObject6.put("sigma", strategy_config.getSigma());
                jSONObject6.put("score_norm_ratio", Float.valueOf(strategy_config.getScore_norm_ratio()));
                jSONObject6.put("score_min_threshold", strategy_config.getScore_min_threshold());
                jSONObject6.put("score_max_threshold", strategy_config.getScore_max_threshold());
                jSONObject5.put("parameter", jSONObject6);
                jSONObject.put("strategy_config", jSONObject5);
                final long jUptimeMillis = SystemClock.uptimeMillis();
                C844470XAv.LIZ.getClass();
                PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 3600.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.impl.SmartCDNRankServiceImpl$calculateCdnScores$1
                    @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                    public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) throws JSONException {
                        int code;
                        int code2;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cdn rank execute result: duration=");
                        sbLIZ.append(jUptimeMillis2);
                        sbLIZ.append(" resultCode=");
                        sbLIZ.append(pTYError);
                        sbLIZ.append(" output=");
                        JSONObject params = null;
                        if (pTYTaskData != null) {
                            params = pTYTaskData.getParams();
                        }
                        sbLIZ.append(params);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (z && pTYTaskData != null && pTYTaskData.getParams() != null) {
                            String strJ3 = C786410Ut5.J3(pTYTaskData.getParams());
                            SmartCDNRankServiceImpl smartCDNRankServiceImpl = this;
                            if (pTYError != null) {
                                code2 = pTYError.getCode();
                            } else {
                                code2 = 0;
                            }
                            String str2 = str;
                            smartCDNRankServiceImpl.getClass();
                            SmartCDNRankServiceImpl.LIZLLL(0, jUptimeMillis2, code2, str2, strJ3);
                            this.getClass();
                            if (strJ3.length() > 0) {
                                C0R1F.LIZLLL("smart_cdn_rank_result", strJ3);
                                return;
                            }
                            return;
                        }
                        SmartCDNRankServiceImpl smartCDNRankServiceImpl2 = this;
                        if (pTYError != null) {
                            code = pTYError.getCode();
                        } else {
                            code = -1;
                        }
                        String str3 = str;
                        smartCDNRankServiceImpl2.getClass();
                        SmartCDNRankServiceImpl.LIZLLL(-1, jUptimeMillis2, code, str3, null);
                        this.getClass();
                    }
                });
            }
            this.LIZIZ = new ArrayList();
        }
    }

    public static void LIZLLL(int i, long j, int i2, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "cdn_rank");
        jSONObject.put("model_name", str);
        jSONObject.put("duration", j);
        jSONObject.put("success", i);
        jSONObject.put("sdk_success", i2);
        if (str2 != null) {
            jSONObject.put("s_result", str2);
        }
        C20684815ws.LJIJ("ml_scene_run", jSONObject);
    }
}
