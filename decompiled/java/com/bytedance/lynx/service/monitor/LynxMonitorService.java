package com.bytedance.lynx.service.monitor;

import X.C01GW;
import X.C1285920jZG;
import X.C1289470jez;
import X.C1300130jwB;
import X.C1322370kW3;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1522030pi5;
import X.C2188811AlT;
import X.C452501pT;
import X.C846560XIw;
import X.InterfaceC1289820jfY;
import X.InterfaceC1301330jy7;
import android.content.Context;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.lynx.service.monitor.LynxMonitorService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.TraceEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxMonitorService implements InterfaceC1289820jfY {
    public static volatile boolean SDK_VERSION_REPORTED;
    public static C1522030pi5 lynxServiceConfig;
    public static final LynxMonitorService INSTANCE = new LynxMonitorService();
    public static final AtomicBoolean initLock = new AtomicBoolean(false);
    public static final C01GW lynxSdkVersion$delegate = C452501pT.LIZIZ(new C1300130jwB());

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:5:0x000b, B:7:0x0015, B:50:0x0091, B:9:0x0020, B:11:0x0024, B:13:0x0028, B:15:0x003a, B:16:0x003c, B:21:0x0046, B:22:0x0048, B:26:0x004f, B:27:0x0051, B:31:0x0058, B:32:0x005a, B:36:0x0061, B:37:0x0063, B:41:0x006a, B:42:0x006c, B:44:0x0070, B:45:0x0072, B:49:0x008e, B:48:0x0086, B:46:0x007f), top: B:59:0x000b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ensureInitialize() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = com.bytedance.lynx.service.monitor.LynxMonitorService.initLock
            r4 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r4, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Class<X.0pfQ> r1 = X.C1520380pfQ.class
            java.lang.String r0 = "LIZIZ"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L20
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L97
            X.0pfQ r0 = X.C1520380pfQ.LIZ     // Catch: java.lang.Throwable -> L97
            boolean r0 = r1.getBoolean(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L91
        L20:
            X.0pi5 r0 = com.bytedance.lynx.service.monitor.LynxMonitorService.lynxServiceConfig     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L91
            android.app.Application r1 = r0.LIZ     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L91
            X.0pfQ r0 = X.C1520380pfQ.LIZ     // Catch: java.lang.Throwable -> L97
            r0.getClass()     // Catch: java.lang.Throwable -> L97
            X.C1520380pfQ.LIZLLL(r0, r1)     // Catch: java.lang.Throwable -> L97
            X.0pfU r3 = new X.0pfU     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            X.0pi5 r2 = com.bytedance.lynx.service.monitor.LynxMonitorService.lynxServiceConfig     // Catch: java.lang.Throwable -> L97
            r1 = 0
            if (r2 == 0) goto L3f
            java.lang.String r0 = r2.LJIIIZ     // Catch: java.lang.Throwable -> L97
        L3c:
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> L97
            goto L41
        L3f:
            r0 = r1
            goto L3c
        L41:
            if (r2 == 0) goto L44
            goto L46
        L44:
            r0 = r1
            goto L48
        L46:
            java.lang.String r0 = r2.LJIIIIZZ     // Catch: java.lang.Throwable -> L97
        L48:
            r3.LIZLLL = r0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L4d
            goto L4f
        L4d:
            r0 = r1
            goto L51
        L4f:
            java.lang.String r0 = r2.LIZLLL     // Catch: java.lang.Throwable -> L97
        L51:
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L56
            goto L58
        L56:
            r0 = r1
            goto L5a
        L58:
            java.lang.String r0 = r2.LJI     // Catch: java.lang.Throwable -> L97
        L5a:
            r3.LIZJ = r0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L5f
            goto L61
        L5f:
            r0 = r1
            goto L63
        L61:
            java.lang.String r0 = r2.LJ     // Catch: java.lang.Throwable -> L97
        L63:
            r3.LJ = r0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L68
            goto L6a
        L68:
            r0 = r1
            goto L6c
        L6a:
            java.lang.String r0 = r2.LJFF     // Catch: java.lang.Throwable -> L97
        L6c:
            r3.LJFF = r0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L72
            java.lang.String r1 = r2.LJII     // Catch: java.lang.Throwable -> L97
        L72:
            r3.LJI = r1     // Catch: java.lang.Throwable -> L97
            com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L97
            X.0pg3 r1 = new X.0pg3     // Catch: java.lang.Throwable -> L97
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L97
            X.C1520380pfQ.LJI = r1     // Catch: java.lang.Throwable -> L97
            android.app.Application r0 = X.C1520380pfQ.LJIIJ     // Catch: java.lang.Throwable -> L85
            r1.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> L85
            goto L8e
        L85:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "startup_handle"
            X.C1520960pgM.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L97
        L8e:
            X.C1520380pfQ.LJ()     // Catch: java.lang.Throwable -> L97
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L97
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L97
            goto La3
        L97:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        La3:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto Lc2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LynxMonitorService ensureInitialize:"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxMonitorService"
            com.lynx.base.log.LynxLog.e(r0, r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.monitor.LynxMonitorService.ensureInitialize():void");
    }

    private final String getLynxSdkVersion() {
        return (String) lynxSdkVersion$delegate.getValue();
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public Class getServiceClass() {
        return InterfaceC1289820jfY.class;
    }

    public final void initialize(C1522030pi5 c1522030pi5) {
        lynxServiceConfig = c1522030pi5;
    }

    @Override // X.InterfaceC1289820jfY
    public void reportImageInfo(C1322370kW3 c1322370kW3) {
        String str;
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportImageInfo");
        try {
            JSONObject jSONObjectPut = new JSONObject().put("res_load_start", c1322370kW3.LJI).put("res_load_finish", c1322370kW3.LJII);
            if (c1322370kW3.LIZJ) {
                str = "success";
            } else {
                str = "failed";
            }
            String str2 = "missing";
            InterfaceC1301330jy7 interfaceC1301330jy7 = (InterfaceC1301330jy7) C1285920jZG.LIZJ().LIZ(InterfaceC1301330jy7.class);
            if (interfaceC1301330jy7 != null) {
                int iIsLocalResource = interfaceC1301330jy7.isLocalResource(c1322370kW3.LIZ);
                if (iIsLocalResource != 0) {
                    if (iIsLocalResource == 1) {
                        str2 = "gecko";
                    }
                } else {
                    str2 = "cdn";
                }
            }
            JSONObject jSONObjectPut2 = new JSONObject().put("res_load_perf", jSONObjectPut).put("res_info", new JSONObject().put("res_src", c1322370kW3.LIZ).put("res_state", str).put("res_scene", "lynx_image").put("res_from", str2).put("res_size", Float.valueOf(c1322370kW3.LJFF)).put("is_memory", c1322370kW3.LJ)).put("res_loader_info", new JSONObject().put("res_loader_name", "Lynx").put("res_loader_version", LynxEnv.inst().getLynxVersion()));
            int i = c1322370kW3.LIZLLL;
            if (i != 0 && !c1322370kW3.LIZJ) {
                jSONObjectPut2.put("res_load_error", new JSONObject().put("net_library_error_code", c1322370kW3.LIZLLL).put("res_loader_error_code", C846560XIw.LIZIZ(i)));
            }
            reportResourceStatus(c1322370kW3.LIZIZ.get(), "res_loader_perf", jSONObjectPut2, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        TraceEvent.LJII("LynxMonitorServiceProxy.reportImageInfo");
    }

    @Override // X.InterfaceC1289820jfY
    public void reportCrashGlobalContextTag(final String str, final String str2) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportCrashGlobalContextTag");
        try {
            if (!SDK_VERSION_REPORTED) {
                Npth.registerSdk(2951, getLynxSdkVersion());
                Npth.addTag("lynx_sdk_version", getLynxSdkVersion());
                SDK_VERSION_REPORTED = true;
            }
            Npth.addTag("lynx_sdk_version", getLynxSdkVersion());
            Npth.addTag(str, str2);
            Npth.addAttachUserData(new AttachUserData() { // from class: X.0pi6
                @Override // com.bytedance.crash.AttachUserData
                public final Map getUserData(CrashType crashType) {
                    return LynxMonitorService.m137reportCrashGlobalContextTag$lambda22(str, str2, crashType);
                }
            }, CrashType.ALL);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxMonitorService reportCrashGlobalContextTag:");
            sbLIZ.append(e.getMessage());
            LynxLog.e("LynxMonitorService", C2188811AlT.LIZIZ(sbLIZ));
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LynxMonitorService reportCrashGlobalContextTag:");
            sbLIZ2.append(e2.getMessage());
            LynxLog.e("LynxMonitorService", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LynxMonitorService reportCrashGlobalContextTag:");
            sbLIZ3.append(e3.getMessage());
            LynxLog.e("LynxMonitorService", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (UnsupportedOperationException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("LynxMonitorService reportCrashGlobalContextTag:");
            sbLIZ4.append(e4.getMessage());
            LynxLog.e("LynxMonitorService", C2188811AlT.LIZIZ(sbLIZ4));
        }
        TraceEvent.LJII("LynxMonitorServiceProxy.reportCrashGlobalContextTag");
    }

    @Override // X.InterfaceC1289820jfY
    public void reportImageStatus(String str, JSONObject jSONObject) throws JSONException {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportImageStatus");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("timeMetrics");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
            }
        }
        jSONObject2.put("image_load_success_rate", jSONObject.optInt("successRate", -1));
        jSONObject2.put("memory_cost", jSONObject.optLong("memoryCost", -1L));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("image_url", jSONObject.optString("image_url", ""));
        formatEventReporter(null, str, jSONObject, jSONObject2, jSONObject3);
        TraceEvent.LJII("LynxMonitorServiceProxy.reportImageStatus");
    }

    public void reportTrailEvent(String str, JSONObject jSONObject) throws JSONException {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportImageStatus");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("page_config");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("metric");
        if (jSONObjectOptJSONObject2 != null) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("metrics");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject3.put(next2, jSONObjectOptJSONObject3.get(next2));
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("setup_timing");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys3 = jSONObjectOptJSONObject4.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    jSONObject3.put(next3, jSONObjectOptJSONObject4.get(next3));
                }
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("extra_timing");
            if (jSONObjectOptJSONObject5 != null) {
                Iterator<String> itKeys4 = jSONObjectOptJSONObject5.keys();
                while (itKeys4.hasNext()) {
                    String next4 = itKeys4.next();
                    jSONObject3.put(next4, jSONObjectOptJSONObject5.get(next4));
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject2.optJSONObject("update_timings");
            if (jSONObjectOptJSONObject6 != null) {
                Iterator<String> itKeys5 = jSONObjectOptJSONObject6.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    jSONObject3.put(next5, jSONObjectOptJSONObject6.get(next5));
                }
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject2.optJSONObject("memory");
            if (jSONObjectOptJSONObject7 != null) {
                Iterator<String> itKeys6 = jSONObjectOptJSONObject7.keys();
                while (itKeys6.hasNext()) {
                    String next6 = itKeys6.next();
                    jSONObject3.put(next6, jSONObjectOptJSONObject7.get(next6));
                }
            }
        }
        formatEventReporter(null, str, jSONObject, jSONObject3, jSONObject2);
        TraceEvent.LJII("LynxMonitorServiceProxy.reportImageStatus");
    }

    /* JADX INFO: renamed from: reportCrashGlobalContextTag$lambda-22, reason: not valid java name */
    public static final Map m137reportCrashGlobalContextTag$lambda22(String str, String str2, CrashType crashType) {
        HashMap map = new HashMap();
        map.put("lynx_sdk_version", INSTANCE.getLynxSdkVersion());
        map.put(str, str2);
        return map;
    }

    public void reportResourceStatus(LynxView lynxView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportResourceStatus");
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.handleNativeInfo(lynxView, str, jSONObject);
        TraceEvent.LJII("LynxMonitorServiceProxy.reportResourceStatus");
    }

    public void formatEventReporter(LynxView lynxView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        String str2;
        String str3;
        TraceEvent.LIZLLL("LynxMonitorServiceProxy.formatEventReporter");
        ensureInitialize();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metric");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("url", jSONObjectOptJSONObject.optString("url", ""));
        jSONObject4.put("bid", "LynxInspector");
        jSONObject4.put("pid", "Lynx");
        if (jSONObject3 != null) {
            jSONObject3.put("type", "Lynx");
            jSONObject3.put("trigger", str);
            C1522030pi5 c1522030pi5 = lynxServiceConfig;
            if (c1522030pi5 == null || (str3 = c1522030pi5.LJIIIIZZ) == null) {
                str3 = "";
            }
            jSONObject3.put("channel", jSONObject.optString("channel", str3));
            jSONObject3.put("url", jSONObjectOptJSONObject.optString("url", ""));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        c1520360pfO.LIZIZ = "LynxInspector";
        c1520360pfO.LIZLLL = jSONObject3;
        c1520360pfO.LJ = jSONObject2;
        c1520360pfO.LJII = jSONObject4;
        c1520360pfO.LJFF = jSONObjectOptJSONObject2;
        c1520360pfO.LIZIZ(0);
        C1522030pi5 c1522030pi52 = lynxServiceConfig;
        if (c1522030pi52 != null) {
            str2 = c1522030pi52.LIZLLL;
        } else {
            str2 = null;
        }
        c1520360pfO.LJIIIZ = str2;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        if (lynxView != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom(lynxView, c1520350pfNLIZ);
        } else {
            C1520380pfQ.LIZ.getClass();
            C1520380pfQ.LIZ(c1520350pfNLIZ);
        }
        TraceEvent.LJII("LynxMonitorServiceProxy.formatEventReporter");
    }
}
