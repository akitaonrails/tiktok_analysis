package com.bytedance.apm.agent.monitor;

import X.C1C7U;
import X.C2179971ATj;
import X.C787900UvU;
import X.C787960Uva;
import X.C790240UzG;
import X.C791160V1u;
import X.C792310V6f;
import X.InterfaceC792320V6g;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorTool {
    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.4
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("MonitorTool@d7cc.monitorStart$2");
                        com_bytedance_apm_agent_monitor_MonitorTool$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("MonitorTool@d7cc.monitorStart$2");
                    }

                    public void com_bytedance_apm_agent_monitor_MonitorTool$4__run$___twin___() {
                        C792310V6f.LJIIIZ().LIZJ(new C791160V1u("start", "", jSONObject, null, jSONObject2));
                    }

                    public static void com_bytedance_apm_agent_monitor_MonitorTool$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                        try {
                            anonymousClass4.com_bytedance_apm_agent_monitor_MonitorTool$4__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void monitorUIAction(final String str, final String str2, final JSONObject jSONObject) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("MonitorTool@d7cc.monitorUIAction$1");
                com_bytedance_apm_agent_monitor_MonitorTool$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("MonitorTool@d7cc.monitorUIAction$1");
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$1__run$___twin___() {
                C792310V6f c792310V6fLJIIIZ = C792310V6f.LJIIIZ();
                final String str3 = str;
                final String str4 = str2;
                final JSONObject jSONObject2 = jSONObject;
                c792310V6fLJIIIZ.LIZJ(new InterfaceC792320V6g(str3, str4, jSONObject2) { // from class: X.0Uzu
                    public final String LIZ;
                    public final String LIZIZ;
                    public final JSONObject LIZJ;
                    public JSONObject LIZLLL = null;

                    @Override // X.InterfaceC792320V6g
                    public final boolean LIZIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC792320V6g
                    public final String LIZLLL() {
                        return "ui_action";
                    }

                    @Override // X.InterfaceC792320V6g
                    public final String LJ() {
                        return "ui_action";
                    }

                    @Override // X.InterfaceC792320V6g
                    public final JSONObject LIZ() {
                        try {
                            if (this.LIZLLL == null) {
                                this.LIZLLL = new JSONObject();
                            }
                            this.LIZLLL.put("log_type", "ui_action");
                            this.LIZLLL.put("action", this.LIZ);
                            this.LIZLLL.put("page", this.LIZIZ);
                            this.LIZLLL.put("context", this.LIZJ);
                            return this.LIZLLL;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }

                    @Override // X.InterfaceC792320V6g
                    public final boolean LIZJ(JSONObject jSONObject3) {
                        return C790620Uzs.LIZ("ui");
                    }

                    {
                        this.LIZ = str3;
                        this.LIZIZ = str4;
                        this.LIZJ = jSONObject2;
                    }
                });
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_apm_agent_monitor_MonitorTool$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static void reportTraceTime(final String str, final String str2, final long j) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.5
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("MonitorTool@d7cc.reportTraceTime$1");
                com_bytedance_apm_agent_monitor_MonitorTool$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("MonitorTool@d7cc.reportTraceTime$1");
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$5__run$___twin___() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Scene.SCENE_SERVICE, str);
                    C792310V6f.LJIIIZ().LIZJ(new C791160V1u("page_load", "page_load", jSONObject, jSONObject2, null));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                try {
                    anonymousClass5.com_bytedance_apm_agent_monitor_MonitorTool$5__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static void monitorStart(final JSONObject jSONObject, long j, long j2) {
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.3
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("MonitorTool@d7cc.monitorStart$1");
                    com_bytedance_apm_agent_monitor_MonitorTool$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("MonitorTool@d7cc.monitorStart$1");
                }

                public void com_bytedance_apm_agent_monitor_MonitorTool$3__run$___twin___() {
                    C792310V6f.LJIIIZ().LIZJ(new C791160V1u("start", "", jSONObject, null, jSONObject2));
                }

                public static void com_bytedance_apm_agent_monitor_MonitorTool$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    try {
                        anonymousClass3.com_bytedance_apm_agent_monitor_MonitorTool$3__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void monitorPerformance(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("MonitorTool@d7cc.monitorPerformance$1");
                com_bytedance_apm_agent_monitor_MonitorTool$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("MonitorTool@d7cc.monitorPerformance$1");
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$2__run$___twin___() {
                C792310V6f.LJIIIZ().LIZJ(new C791160V1u(str, "", jSONObject, jSONObject2, jSONObject3));
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_bytedance_apm_agent_monitor_MonitorTool$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.6
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("MonitorTool@d7cc.monitorSLA$1");
                com_bytedance_apm_agent_monitor_MonitorTool$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("MonitorTool@d7cc.monitorSLA$1");
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$6__run$___twin___() {
                C787960Uva.LIZ.LIZJ(new C790240UzG("api_all", j, j2, str, str2, str3, i, jSONObject));
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                try {
                    anonymousClass6.com_bytedance_apm_agent_monitor_MonitorTool$6__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
