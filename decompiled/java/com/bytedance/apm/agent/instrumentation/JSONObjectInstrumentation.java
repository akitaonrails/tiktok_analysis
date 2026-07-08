package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.tracing.TraceMachine;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class JSONObjectInstrumentation {
    public static JSONObject init(String str) {
        TraceMachine.enterMethod("JSONObject", "init", "json_trace");
        JSONObject jSONObject = new JSONObject(str);
        TraceMachine.exitMethod();
        return jSONObject;
    }
}
