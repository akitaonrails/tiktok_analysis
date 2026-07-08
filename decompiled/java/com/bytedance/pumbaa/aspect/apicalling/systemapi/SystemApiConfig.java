package com.bytedance.pumbaa.aspect.apicalling.systemapi;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.pumbaa.aspect.apicalling.base.ProcessorConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SystemApiConfig extends ProcessorConfig {

    @C09CT("enable_local_guard_strategy")
    public final boolean enableLocalGuardStrategy;

    @C09CT("enable_local_intercept_strategy")
    public final boolean enableLocalInterceptStrategy;

    @C09CT("guard_fields")
    public final List<String> guardFields;

    public SystemApiConfig() {
        this(false, null, null, null, false, false, false, null);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObjectLIZJ = LIZJ();
        jSONObjectLIZJ.put("enable_local_intercept_strategy", this.enableLocalInterceptStrategy);
        jSONObjectLIZJ.put("enable_local_guard_strategy", this.enableLocalGuardStrategy);
        jSONObjectLIZJ.put("guard_fields", this.guardFields);
        return C786410Ut5.J3(jSONObjectLIZJ);
    }

    public SystemApiConfig(boolean z, List<Integer> list, Float f, Map<Integer, Float> map, boolean z2, boolean z3, boolean z4, List<String> list2) {
        super(z, list, f, map, z2);
        this.enableLocalInterceptStrategy = z3;
        this.enableLocalGuardStrategy = z4;
        this.guardFields = list2;
    }
}
