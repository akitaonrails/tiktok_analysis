package com.bytedance.pitaya.cep_engine;

import X.C0VCZ;
import X.C1305150k4H;
import X.C1305180k4K;
import X.C1305190k4L;
import X.C2097608Jq;
import android.content.Context;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;
import com.bytedance.pitaya.cep_engine.port.CepCallback;
import com.bytedance.pitaya.cep_engine.port.CepFunction;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class CepEngineManager implements CepKeeper {
    public static final CepEngineManager INSTANCE;
    public static volatile boolean isInit;
    public static Map<String, String> subModuleList;

    public static final native void nativeConfigEngine(JSONObject jSONObject);

    public static final native void nativeOnEvent(String str, String str2, String str3, String str4, JSONObject jSONObject, long j);

    public static final native CepResult nativeProcessEvent(String str, String str2, String str3, String str4, JSONObject jSONObject, long j);

    public static final native void nativeRegisterCallback(String str, String str2, String str3, CepCallback cepCallback);

    public static final native void nativeRegisterFunction(String str, String str2, String str3, CepFunction cepFunction);

    public static final native CepResult nativeRegisterRule(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2);

    public static final native CepResult nativeRegisterRules(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2);

    public static final native void nativeUnregisterCallback(String str, String str2, String str3);

    public static final native void nativeUnregisterFunction(String str, String str2, String str3);

    public static final native void nativeUnregisterRule(String str, String str2, String str3);

    private final void tryLoadSubModule() {
        Object objInvoke;
        try {
            Method declaredMethod = CepSubModule.class.getDeclaredMethod("load", new Class[0]);
            if (declaredMethod != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : subModuleList.entrySet()) {
                    try {
                        objInvoke = declaredMethod.invoke(Class.forName(entry.getValue()).newInstance(), new Object[0]);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (objInvoke != null) {
                        ((Boolean) objInvoke).booleanValue();
                        if (!((Boolean) objInvoke).booleanValue()) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                subModuleList = linkedHashMap;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void loadSubModules() {
        synchronized (this) {
            try {
                INSTANCE.tryLoadSubModule();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    static {
        CepEngineManager cepEngineManager = new CepEngineManager();
        INSTANCE = cepEngineManager;
        subModuleList = C2097608Jq.LJIIIIZZ(new Pair("cep_ast", "com.bytedance.pitaya.cep_ast.CepASTLoader"), new Pair("cep_ttm", "com.bytedance.pitaya.cep_ttm.CepTTMLoader"), new Pair("cep_fast", "com.bytedance.pitaya.cep_fast.CepFastLoader"));
        cepEngineManager.init();
    }

    public final void init() {
        if (isInit) {
            return;
        }
        synchronized (this) {
            try {
                try {
                    JniCaller.init();
                } finally {
                }
                INSTANCE.tryLoadSubModule();
                isInit = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void configEngine(Context context, C1305180k4K c1305180k4K) throws JSONException {
        if (!isInit) {
            return;
        }
        C1305150k4H c1305150k4H = C1305150k4H.LIZ;
        final String str = c1305180k4K.LIZ;
        final String str2 = c1305180k4K.LIZIZ;
        final String str3 = c1305180k4K.LIZJ;
        final String str4 = c1305180k4K.LIZLLL;
        c1305150k4H.getClass();
        SDKMonitorUtils.setConfigUrl("8327", Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
        SDKMonitorUtils.setDefaultReportUrl("8327", Collections.singletonList("https://mon.isnssdk.com/monitor/collect/"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host_aid", str).put("device_id", str2).put("channel", str3).put("app_version", str4).put("sdk_version", "1.7.28.cn-je-r21e");
        SDKMonitorUtils.initMonitor(context, "8327", jSONObject, new C0VCZ() { // from class: X.08S0
            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                return C2097608Jq.LJIIJ(new Pair("oversea", "1"), new Pair("device_id", str2), new Pair("host_aid", str), new Pair("channel", str3), new Pair("app_version", str4), new Pair("sdk_version", "1.7.28.cn-je-r21e"));
            }

            @Override // X.C0VCZ
            public final String getSessionId() {
                return "";
            }
        });
        C1305150k4H.LIZIZ = SDKMonitorUtils.getInstance("8327");
        Npth.addAttachUserData(new AttachUserData() { // from class: X.0k1k
            @Override // com.bytedance.crash.AttachUserData
            public final Map getUserData(CrashType crashType) {
                String strCollectCrashInfo;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    strCollectCrashInfo = JniCaller.collectCrashInfo();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strCollectCrashInfo = null;
                }
                if (strCollectCrashInfo != null) {
                    linkedHashMap.put("cep_crash_info", strCollectCrashInfo);
                }
                return linkedHashMap;
            }
        }, CrashType.ALL);
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeConfigEngine(c1305180k4K.LJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void unregisterCallback(String str, String str2) {
        unregisterCallback("default", str, str2);
    }

    public final void unregisterFunction(String str, String str2) {
        unregisterFunction("default", str, str2);
    }

    public final void unregisterRule(String str, String str2) {
        unregisterRule("default", str, str2);
    }

    public final void registerCallback(String str, String str2, CepCallback cepCallback) {
        registerCallback("default", str, str2, cepCallback);
    }

    public final void registerFunction(String str, String str2, CepFunction cepFunction) {
        registerFunction("default", str, str2, cepFunction);
    }

    public final CepResult registerRules(String str, JSONObject jSONObject, C1305190k4L c1305190k4L) {
        return registerRules("default", str, jSONObject, c1305190k4L);
    }

    public final void unregisterCallback(String str, String str2, String str3) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeUnregisterCallback(str, str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void unregisterFunction(String str, String str2, String str3) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeUnregisterFunction(str, str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void unregisterRule(String str, String str2, String str3) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeUnregisterRule(str, str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void registerCallback(String str, String str2, String str3, CepCallback cepCallback) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeRegisterCallback(str, str2, str3, cepCallback);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void registerFunction(String str, String str2, String str3, CepFunction cepFunction) {
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            nativeRegisterFunction(str, str2, str3, cepFunction);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final CepResult registerRule(String str, String str2, JSONObject jSONObject, C1305190k4L c1305190k4L) {
        return registerRule("default", str, str2, jSONObject, c1305190k4L);
    }

    public final CepResult registerRules(String str, String str2, JSONObject jSONObject, C1305190k4L c1305190k4L) {
        CepResult cepResultNativeRegisterRules;
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            cepResultNativeRegisterRules = nativeRegisterRules(str, str2, jSONObject, new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (cepResultNativeRegisterRules == null) {
            return new CepResult(false, str2, "", "can not find libCepEngine.so", "", null);
        }
        return cepResultNativeRegisterRules;
    }

    public final void onEvent(String str, String str2, String str3, JSONObject jSONObject, long j) {
        onEvent("default", str, str2, str3, jSONObject, j);
    }

    public final CepResult processEvent(String str, String str2, String str3, JSONObject jSONObject, long j) {
        return processEvent("default", str, str2, str3, jSONObject, j);
    }

    public final CepResult registerRule(String str, String str2, String str3, JSONObject jSONObject, C1305190k4L c1305190k4L) {
        CepResult cepResultNativeRegisterRule;
        JniCaller jniCaller = JniCaller.LIZ;
        try {
            cepResultNativeRegisterRule = nativeRegisterRule(str, str2, str3, jSONObject, new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (cepResultNativeRegisterRule == null) {
            return new CepResult(false, str2, str3, "can not find libCepEngine.so", "", null);
        }
        return cepResultNativeRegisterRule;
    }

    public final void onEvent(String str, String str2, String str3, String str4, JSONObject jSONObject, long j) {
        long jCurrentTimeMillis = j;
        JniCaller jniCaller = JniCaller.LIZ;
        if (jCurrentTimeMillis == -1) {
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        nativeOnEvent(str, str2, str3, str4, jSONObject, jCurrentTimeMillis);
    }

    public final CepResult processEvent(String str, String str2, String str3, String str4, JSONObject jSONObject, long j) {
        long jCurrentTimeMillis = j;
        JniCaller jniCaller = JniCaller.LIZ;
        String str5 = str3;
        String str6 = str2;
        if (jCurrentTimeMillis == -1) {
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        str6 = str6;
        str5 = str5;
        CepResult cepResultNativeProcessEvent = nativeProcessEvent(str, str6, str5, str4, jSONObject, jCurrentTimeMillis);
        if (cepResultNativeProcessEvent == null) {
            return new CepResult(false, str6, str5, "can not find libCepEngine.so", "", null);
        }
        return cepResultNativeProcessEvent;
    }
}
