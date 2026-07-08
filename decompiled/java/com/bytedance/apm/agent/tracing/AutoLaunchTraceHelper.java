package com.bytedance.apm.agent.tracing;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C787900UvU;
import X.C791160V1u;
import X.C792310V6f;
import X.C792400V6o;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AutoLaunchTraceHelper {
    public static long sAttachBaseContextEndTime = 0;
    public static long sAttachBaseContextStartTime = 0;
    public static long sConstructorEndTime = 0;
    public static long sConstructorStartTime = 0;
    public static boolean sIsValid = false;
    public static long sLauncherActivityCreateEndTime = 0;
    public static long sLauncherActivityCreateStartTime = 0;
    public static String sLauncherActivityName = null;
    public static long sLauncherActivityOnWindowFocusChangedTime = 0;
    public static long sLauncherActivityResumeEndTime = 0;
    public static long sLauncherActivityResumeStartTime = 0;
    public static long sLauncherActivityStartEndTime = 0;
    public static long sLauncherActivityStartStartTime = 0;
    public static long sMaxValidTimeMs = 15000;
    public static long sOnCreateEndTime;
    public static long sOnCreateStartTime;

    public static JSONArray assemblySpan() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_constructor");
        jSONObject.put("start", sConstructorStartTime);
        jSONObject.put("end", sConstructorEndTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_attachBaseContext");
        jSONObject2.put("start", sAttachBaseContextStartTime);
        jSONObject2.put("end", sAttachBaseContextEndTime);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "app_onCreate");
        jSONObject3.put("start", sOnCreateStartTime);
        jSONObject3.put("end", sOnCreateEndTime);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onCreate");
        jSONObject4.put("start", sLauncherActivityCreateStartTime);
        jSONObject4.put("end", sLauncherActivityCreateEndTime);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onResume");
        jSONObject5.put("start", sLauncherActivityResumeStartTime);
        jSONObject5.put("end", sLauncherActivityResumeEndTime);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("module_name", "base");
        jSONObject6.put("span_name", "activity_onStart");
        jSONObject6.put("start", sLauncherActivityStartStartTime);
        jSONObject6.put("end", sLauncherActivityStartEndTime);
        if (sLauncherActivityOnWindowFocusChangedTime > 0) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("module_name", "base");
            jSONObject7.put("span_name", "activity_onWindowFocusChanged");
            jSONObject7.put("start", sLauncherActivityOnWindowFocusChangedTime);
            jSONArray.put(jSONObject7);
        }
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        jSONArray.put(jSONObject6);
        return jSONArray;
    }

    public static void reportStats() {
        try {
            if (C792400V6o.LJIIJ == -1) {
                Context context = C792400V6o.LIZ;
                return;
            }
            long j = sLauncherActivityOnWindowFocusChangedTime - sConstructorStartTime;
            if (j <= 0 || j > sMaxValidTimeMs) {
                return;
            }
            JSONArray jSONArrayAssemblySpan = assemblySpan();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "launch_stats");
            jSONObject.put("start", sConstructorStartTime);
            jSONObject.put("end", sLauncherActivityOnWindowFocusChangedTime);
            jSONObject.put("spans", jSONArrayAssemblySpan);
            jSONObject.put("collect_from", 1);
            jSONObject.put("page_name", sLauncherActivityName);
            jSONObject.put("launch_mode", C792400V6o.LJIIJ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trace", jSONObject);
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("auto span: ");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C792310V6f.LJIIIZ().LIZJ(new C791160V1u("start_trace", "", null, null, jSONObject2));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void launcherActivityOnCreateEnd() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateEnd ");
        sbLIZ.append(sLauncherActivityCreateStartTime);
        sbLIZ.append(" ");
        sbLIZ.append(sLauncherActivityCreateEndTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityCreateEndTime == 0 && sIsValid) {
            sLauncherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResumeEnd ");
        sbLIZ.append(sLauncherActivityResumeStartTime);
        sbLIZ.append(" ");
        sbLIZ.append(sLauncherActivityResumeEndTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityResumeEndTime == 0 && sIsValid) {
            sLauncherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateStart(String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" onCreateStart ");
        sbLIZ.append(sLauncherActivityCreateStartTime);
        sbLIZ.append(" ");
        boolean z2 = false;
        if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityCreateStartTime == 0) {
            sLauncherActivityCreateStartTime = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" onCreateStart ");
            sbLIZ2.append(sLauncherActivityCreateStartTime);
            sbLIZ2.append("  ");
            sbLIZ2.append(sOnCreateEndTime);
            sbLIZ2.append(" ");
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                z2 = true;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                sIsValid = true;
                sLauncherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" onResume ");
        sbLIZ.append(sLauncherActivityResumeStartTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityResumeStartTime == 0 && sIsValid) {
            sLauncherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartEnd(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartEnd ");
        sbLIZ.append(sLauncherActivityStartStartTime);
        sbLIZ.append(" ");
        sbLIZ.append(sLauncherActivityStartEndTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityStartEndTime == 0 && sIsValid) {
            sLauncherActivityStartEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartStart(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" onStart ");
        sbLIZ.append(sLauncherActivityStartStartTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityStartStartTime == 0 && sIsValid) {
            sLauncherActivityStartStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnWindowFocusChanged ");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        sbLIZ.append(sLauncherActivityOnWindowFocusChangedTime);
        sbLIZ.append(" ");
        sbLIZ.append(sOnCreateStartTime);
        sbLIZ.append(" ");
        sbLIZ.append(sIsValid);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        if (sLauncherActivityOnWindowFocusChangedTime == 0 && sOnCreateStartTime > 0 && sIsValid) {
            sLauncherActivityOnWindowFocusChangedTime = System.currentTimeMillis();
            sLauncherActivityName = str;
            sIsValid = false;
        }
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("AutoLaunchTraceHelper@73ff.launcherActivityOnWindowFocusChangedStart$1");
                com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AutoLaunchTraceHelper@73ff.launcherActivityOnWindowFocusChangedStart$1");
            }

            public void com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1__run$___twin___() {
                AutoLaunchTraceHelper.reportStats();
            }

            public static void com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void assignAppTime(long j, long j2, long j3, long j4, long j5, long j6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assignAppTime: ");
        sbLIZ.append(sOnCreateEndTime);
        C2188811AlT.LIZIZ(sbLIZ);
        Context context = C792400V6o.LIZ;
        sConstructorStartTime = j;
        sConstructorEndTime = j2;
        sAttachBaseContextStartTime = j3;
        sAttachBaseContextEndTime = j4;
        sOnCreateStartTime = j5;
        sOnCreateEndTime = j6;
        if (j > 0) {
            long j7 = C792400V6o.LJIILIIL;
            if (j7 == 0 || j < j7) {
                C792400V6o.LJIILIIL = j;
            }
        }
    }
}
