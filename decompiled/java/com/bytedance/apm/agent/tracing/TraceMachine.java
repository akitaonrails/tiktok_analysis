package com.bytedance.apm.agent.tracing;

import X.C2140508a3;
import X.C2188811AlT;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TraceMachine {
    public static ThreadLocal<Stack<Trace>> traceStackThreadLocal = new ThreadLocal<>();
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static AgentLog log = AgentLogManager.getAgentLog();

    public static void exitMethod() {
        exitMethod("");
    }

    public static void exitMethod(String str) {
        if (traceStackThreadLocal.get() == null) {
            return;
        }
        Stack<Trace> stack = traceStackThreadLocal.get();
        if (!stack.isEmpty()) {
            Trace tracePop = stack.pop();
            tracePop.setExitTime(System.currentTimeMillis());
            tracePop.setExtraData(str);
            handleCost(tracePop);
        }
    }

    public static void handleCost(Trace trace) {
        boolean z;
        try {
            long j = trace.entryTime;
            long j2 = trace.exitTime;
            long jLongValue = Long.valueOf(j2 - j).longValue();
            if (jLongValue > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", j);
                jSONObject.put("end_time", j2);
                JSONObject jSONObject2 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject2.put(trace.methodName, jLongValue);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(trace.className);
                    sbLIZ.append("#");
                    sbLIZ.append(trace.methodName);
                    jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ), jLongValue);
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject3.put(Scene.SCENE_SERVICE, trace.scene);
                    HashSet<String> hashSet = sMethodSet;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(trace.className);
                    sbLIZ2.append(trace.methodName);
                    if (!hashSet.contains(C2188811AlT.LIZIZ(sbLIZ2))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject3.put("is_first", z);
                    HashSet<String> hashSet2 = sMethodSet;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(trace.className);
                    sbLIZ3.append(trace.methodName);
                    hashSet2.add(C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    jSONObject3.put("is_main", C2140508a3.LIZ());
                }
                jSONObject.put("extra_data", trace.extraData);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void enterMethod(String str, String str2, String str3) {
        enterMethod(str, str, str2, str3);
    }

    public static void enterMethod(String str, String str2, String str3, String str4) {
        Trace trace = new Trace(str, str2, str3, System.currentTimeMillis(), str4);
        if (traceStackThreadLocal.get() == null) {
            Stack<Trace> stack = new Stack<>();
            stack.push(trace);
            traceStackThreadLocal.set(stack);
            return;
        }
        traceStackThreadLocal.get().push(trace);
    }
}
