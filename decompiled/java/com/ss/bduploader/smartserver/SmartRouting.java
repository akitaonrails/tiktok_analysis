package com.ss.bduploader.smartserver;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SmartRouting extends SmartAbstract {
    public SmartServiceInterface mIntelligentService;
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void configServer() {
        this.mIntelligentService.setStringValue(LSPassThroughRecordSizeConfig.DEFAULT, "mlsdk");
        this.mIntelligentService.setStringValue(1001, "smart_upload_tcp_quic");
        this.mIntelligentService.setStringValue(1002, "regression");
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
            if (JSONObjectProtectorUtils.getInt(jSONObject, "est_file_size") > 0 && JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    map.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    map.put("speed_test_protocol", Float.valueOf(parseIntelligentInputFloat(jSONObject, "speed_test_protocol", 0)));
                    map.put("init_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "init_rtt", 1)) / 1000.0d));
                    map.put("close_rtt", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "close_rtt", 1)) / 1000.0d));
                    map.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    map.put("inner_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "inner", 1)) / 1000.0d));
                    map.put("origin_time", Double.valueOf(((double) parseIntelligentInputFloat(jSONObject, "origin", 1)) / 1000.0d));
                    map.put("est_file_size", Float.valueOf(parseIntelligentInputFloat(jSONObject, "est_file_size", 0)));
                    return map;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Map getIntelligentInputTTNet(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (JSONObjectProtectorUtils.getInt(jSONObject, "est_file_size") > 0 && JSONObjectProtectorUtils.getJSONObject(jSONObject, "tcp_domain") != null && JSONObjectProtectorUtils.getJSONObject(jSONObject, "quic_domain") != null) {
                List listAsList = Arrays.asList("tcp", "quic");
                List<String> listAsList2 = Arrays.asList("SeverSpeed", "speed", "duration", "routing_request_log.timing.detailed_duration.inner", "routing_request_log.timing.detailed_duration.send", "routing_request_log.timing.detailed_duration.ttfb", "routing_request_log.timing.request.duration");
                List<String> listAsList3 = Arrays.asList("routing_request_log.nqe.http_rtt", "routing_request_log.nqe.tcp_rtt", "routing_request_log.nqe.downlink_throughput", "routing_request_log.nqe.real_net_type", "routing_request_log.nqe.effective_net_type");
                for (int i = 0; i < listAsList.size(); i++) {
                    String str = (String) listAsList.get(i);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("_domain");
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, C2188811AlT.LIZIZ(sbLIZ));
                    for (String str2 : listAsList2) {
                        String[] strArrSplit = str2.split("\\.");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append("_");
                        sbLIZ2.append(strArrSplit[strArrSplit.length - 1].toLowerCase(Locale.US));
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        if (str2.equals("duration")) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append("_bd");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        float valueForKey = getValueForKey(jSONObject2, str2);
                        if (valueForKey != -1.0f) {
                            map.put(strLIZIZ, Float.valueOf(valueForKey));
                        } else {
                            return null;
                        }
                    }
                }
                for (String str3 : listAsList3) {
                    map.put(str3.split("\\.")[r1.length - 1].toLowerCase(Locale.US), Float.valueOf(getValueForKey(JSONObjectProtectorUtils.getJSONObject(jSONObject, "tcp_domain"), str3)));
                }
                float intelligentInputFloat = parseIntelligentInputFloat(jSONObject, "est_file_size", 0);
                if (intelligentInputFloat <= 0.0f) {
                    return null;
                }
                map.put("est_file_size", Float.valueOf(intelligentInputFloat));
                return map;
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
            this.mIntelligentURL = JSONObjectProtectorUtils.getString(new JSONObject(str), "intelligent_model_url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.mIntelligentURL = "";
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public float predictSpeedSync(JSONObject jSONObject) {
        if (this.mIntelligentService.serviceEnabled()) {
            Map map = new HashMap();
            try {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "routing_using_vcn") == 1) {
                    map = getIntelligentInput(jSONObject);
                } else {
                    if (JSONObjectProtectorUtils.getInt(jSONObject, "routing_using_vcn") == 0) {
                        map = getIntelligentInputTTNet(jSONObject);
                    }
                    return this.mIntelligentService.runSync(map);
                }
                if (map == null) {
                    return -1.0f;
                }
                return this.mIntelligentService.runSync(map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void setUrl(String str) {
        this.mIntelligentURL = str;
    }

    private float getValueForKey(JSONObject jSONObject, String str) {
        String[] strArrSplit = str.split("\\.");
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            try {
                jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject, strArrSplit[i]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1.0f;
            }
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (!jSONObject.has(str2)) {
            return -1.0f;
        }
        return (float) JSONObjectProtectorUtils.getDouble(jSONObject, str2);
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
}
