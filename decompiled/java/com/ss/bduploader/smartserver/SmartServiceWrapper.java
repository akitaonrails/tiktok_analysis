package com.ss.bduploader.smartserver;

import X.AbstractC1511510pR7;
import X.C1509310pNZ;
import X.C1511420pQy;
import X.C1512100pS4;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SmartServiceWrapper implements SmartServiceInterface {
    public AbstractC1511510pR7 mMLSDKService;
    public String mMLSDKEngineType = "";
    public String mMLSDKServiceName = "";
    public String mMLSDKOutputType = "";
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void runAsync(Map map, SmartServiceListener smartServiceListener) {
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runAsyncJsonObject(JSONObject jSONObject, SmartServiceListener smartServiceListener) {
        return 0.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runSyncJsonObject(JSONObject jSONObject) {
        return 0.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void setIntValue(int i, int i2) {
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void configServer() {
        if (TextUtils.isEmpty(this.mMLSDKEngineType) || TextUtils.isEmpty(this.mMLSDKOutputType) || TextUtils.isEmpty(this.mMLSDKServiceName) || TextUtils.isEmpty(this.mIntelligentURL)) {
            return;
        }
        C1511420pQy.LIZ().getClass();
        this.mMLSDKService = null;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void preloadEnv() {
        AbstractC1511510pR7 abstractC1511510pR7 = this.mMLSDKService;
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.preloadEnv();
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public boolean serviceEnabled() {
        AbstractC1511510pR7 abstractC1511510pR7 = this.mMLSDKService;
        return abstractC1511510pR7 != null && abstractC1511510pR7.enable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runSync(Map map) {
        String str;
        Float f;
        C1509310pNZ c1509310pNZ = new C1509310pNZ();
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        for (Object obj : map.keySet()) {
            mapLIZIZ.put(obj, map.get(obj));
        }
        AbstractC1511510pR7 abstractC1511510pR7 = this.mMLSDKService;
        if (abstractC1511510pR7 == null || !abstractC1511510pR7.enable()) {
            return -1.0f;
        }
        C1512100pS4 c1512100pS4RunSync = this.mMLSDKService.runSync(c1509310pNZ);
        String str2 = this.mMLSDKOutputType;
        str2.getClass();
        if (!str2.equals("classify")) {
            if (!str2.equals("regression") || c1512100pS4RunSync == null || !c1512100pS4RunSync.LIZIZ() || (f = c1512100pS4RunSync.LIZLLL) == null) {
                return -1.0f;
            }
            return f.floatValue();
        }
        if (c1512100pS4RunSync == null || !c1512100pS4RunSync.LIZIZ() || (str = c1512100pS4RunSync.LIZIZ) == null) {
            return -1.0f;
        }
        if ("false".equals(str)) {
            return 0.0f;
        }
        if (!"true".equals(str)) {
            return -1.0f;
        }
        return 1.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public int getIntelligentInput(JSONObject jSONObject, C1509310pNZ c1509310pNZ) {
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        try {
            if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    mapLIZIZ.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    mapLIZIZ.put("init_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "init_rtt", 1)) / 1000.0d));
                    mapLIZIZ.put("close_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "close_rtt", 1)) / 1000.0d));
                    mapLIZIZ.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    mapLIZIZ.put("inner_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "inner", 1)) / 1000.0d));
                    mapLIZIZ.put("origin_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "origin", 1)) / 1000.0d));
                    String intelligentInputString = parseIntelligentInputString(jSONObject, "apply_start", 0);
                    String intelligentInputString2 = parseIntelligentInputString(jSONObject, "apply_end", 0);
                    if (!intelligentInputString2.isEmpty() && !intelligentInputString.isEmpty()) {
                        float fLongValue = CastLongProtector.valueOf(intelligentInputString2).longValue() - CastLongProtector.valueOf(intelligentInputString).longValue();
                        if (fLongValue < 0.0f) {
                            return -1;
                        }
                        mapLIZIZ.put("apply_duration", Float.valueOf(fLongValue));
                        String intelligentInputString3 = parseIntelligentInputString(jSONObject, "node_type", 0);
                        intelligentInputString3.getClass();
                        if (!intelligentInputString3.equals("Origin")) {
                            if (!intelligentInputString3.equals("Edge")) {
                                mapLIZIZ.put("node_type", Float.valueOf(0.0f));
                                return 0;
                            }
                            mapLIZIZ.put("node_type", Float.valueOf(1.0f));
                            return 0;
                        }
                        mapLIZIZ.put("node_type", Float.valueOf(2.0f));
                        return 0;
                    }
                }
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void setStringValue(int i, String str) {
        switch (i) {
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                this.mMLSDKEngineType = str;
                break;
            case 1001:
                this.mMLSDKServiceName = str;
                break;
            case 1002:
                this.mMLSDKOutputType = str;
                break;
            case 1003:
                this.mIntelligentURL = str;
                break;
        }
    }

    private float parseIntelligentInputFloat(JSONObject jSONObject, String str, int i) {
        double d;
        try {
            if (i == 1) {
                d = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info"), str);
            } else {
                d = JSONObjectProtectorUtils.getDouble(jSONObject, str);
            }
            return (float) d;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    private String parseIntelligentInputString(JSONObject jSONObject, String str, int i) {
        try {
            if (i == 1) {
                return JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info"), str);
            }
            return JSONObjectProtectorUtils.getString(jSONObject, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
