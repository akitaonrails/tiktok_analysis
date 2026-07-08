package com.bytedance.pumbaa.aspect.apicalling.base;

import X.C09CT;
import X.C0WSN;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ProcessorConfig {

    @C09CT("api_sample_rate")
    public final Map<Integer, Float> apiSampleRate;

    @C09CT("default_sample_rate")
    public final Float defaultSampleRate;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("intercept_api_list")
    public final List<Integer> interceptApiList;

    @C09CT("skip_intercept_list_when_guard")
    public final boolean skipInterceptListWhenGuard;

    public ProcessorConfig() {
        this(false, null, null, null, true);
    }

    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", this.enable);
            jSONObject.put("intercept_api_list", this.interceptApiList);
            jSONObject.put("default_sample_rate", this.defaultSampleRate);
            jSONObject.put("api_sample_rate", this.apiSampleRate);
            jSONObject.put("skip_intercept_list_when_guard", this.skipInterceptListWhenGuard);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final boolean LIZ(int i) {
        Float f;
        Map<Integer, Float> map = this.apiSampleRate;
        if ((map != null && (f = map.get(Integer.valueOf(i))) != null) || (f = this.defaultSampleRate) != null) {
            return C0WSN.LIZ(f.floatValue());
        }
        return false;
    }

    public final boolean LIZIZ(int i) {
        List<Integer> list = this.interceptApiList;
        if (list == null || !list.contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }

    public ProcessorConfig(boolean z, List<Integer> list, Float f, Map<Integer, Float> map, boolean z2) {
        this.enable = z;
        this.interceptApiList = list;
        this.defaultSampleRate = f;
        this.apiSampleRate = map;
        this.skipInterceptListWhenGuard = z2;
    }
}
