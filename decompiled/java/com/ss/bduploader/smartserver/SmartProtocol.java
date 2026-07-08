package com.ss.bduploader.smartserver;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SmartProtocol extends SmartAbstract {
    public SmartServiceInterface mIntelligentService;
    public int mSpeedTestUseVCN = -1;
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void configServer() {
        this.mIntelligentService.setStringValue(LSPassThroughRecordSizeConfig.DEFAULT, "mlsdk");
        this.mIntelligentService.setStringValue(1001, "smart_upload_protocol");
        this.mIntelligentService.setStringValue(1002, "classify");
        this.mIntelligentService.setStringValue(1003, this.mIntelligentURL);
        this.mIntelligentService.configServer();
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void init() {
        this.mIntelligentService = new SmartServiceWrapper();
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void preloadEnv() {
        SmartServiceInterface smartServiceInterface = this.mIntelligentService;
        if (smartServiceInterface != null) {
            smartServiceInterface.preloadEnv();
        }
    }

    public Map getIntelligentInput(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    map.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    map.put("init_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "init_rtt", 1)) / 1000.0d));
                    map.put("close_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "close_rtt", 1)) / 1000.0d));
                    map.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    map.put("inner_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "inner", 1)) / 1000.0d));
                    map.put("origin_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "origin", 1)) / 1000.0d));
                    String intelligentInputString = parseIntelligentInputString(jSONObject, "apply_start", 0);
                    String intelligentInputString2 = parseIntelligentInputString(jSONObject, "apply_end", 0);
                    if (!intelligentInputString2.isEmpty() && !intelligentInputString.isEmpty()) {
                        float fLongValue = CastLongProtector.valueOf(intelligentInputString2).longValue() - CastLongProtector.valueOf(intelligentInputString).longValue();
                        if (fLongValue < 0.0f) {
                            return null;
                        }
                        map.put("apply_duration", Float.valueOf(fLongValue));
                        String intelligentInputString3 = parseIntelligentInputString(jSONObject, "node_type", 0);
                        intelligentInputString3.getClass();
                        if (!intelligentInputString3.equals("Origin")) {
                            if (!intelligentInputString3.equals("Edge")) {
                                map.put("node_type", Float.valueOf(0.0f));
                                return map;
                            }
                            map.put("node_type", Float.valueOf(1.0f));
                            return map;
                        }
                        map.put("node_type", Float.valueOf(2.0f));
                        return map;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void parseUrl(String str) {
        try {
            this.mIntelligentURL = JSONObjectProtectorUtils.getString(new JSONObject(str), "intelligent_protocol_url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.mIntelligentURL = "";
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public int predictClassificationSync(JSONObject jSONObject) {
        Map intelligentInput;
        if (!this.mIntelligentService.serviceEnabled() || (intelligentInput = getIntelligentInput(jSONObject)) == null) {
            return -1;
        }
        return (int) this.mIntelligentService.runSync(intelligentInput);
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void setUrl(String str) {
        this.mIntelligentURL = str;
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
