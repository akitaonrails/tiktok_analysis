package com.ss.android.ugc.aweme.xtrace;

import X.C0C64;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.EnumC12974055w;
import X.InterfaceC2088008Fy;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.dtrace.IDtrace;
import java.io.PrintStream;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class DTraceHelper {
    public static volatile boolean isTraced;
    public static volatile boolean useTraceMode;

    public static h getTestConfig() {
        h hVar = new h();
        n nVar = new n();
        nVar.LJJIIJ("className", "android.os.BinderProxy");
        nVar.LJJIIJ("methodName", "transact");
        nVar.LJJIIJ("methodSign", "int,android.os.Parcel,android.os.Parcel,int");
        Boolean bool = Boolean.FALSE;
        nVar.LJJII(bool, "isConstructor");
        nVar.LJJIII(7, "action");
        hVar.LJJIFFI(nVar);
        n nVar2 = new n();
        nVar2.LJJIIJ("className", "android.util.Log");
        nVar2.LJJIIJ("methodName", "d");
        nVar2.LJJIIJ("methodSign", "java.lang.String,java.lang.String");
        nVar2.LJJII(bool, "isConstructor");
        nVar2.LJJIII(2, "action");
        hVar.LJJIFFI(nVar2);
        return hVar;
    }

    public static void startHook() {
        h hVar = (h) SettingsManager.LIZLLL().LJIIIIZZ("dynamic_trace_config", h.class, null);
        if (hVar == null) {
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trace config:");
        sbLIZ.append(hVar.toString());
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        ((IDtrace) PluggableExtentionKt.pluggableSpi(IDtrace.class)).LIZJ(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.08Fx] */
    public static void doTrace(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && Process.is64Bit() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_xtrace", true, false) && SettingsManager.LIZLLL().LJIIIIZZ("dynamic_trace_config", h.class, null) != null) {
            Npth.addTag("dtrace_enable", "true");
            useTraceMode = C0C64.LJIILLIIL().LJIIIZ(31744, "use_trace_mode_default", true, false);
            try {
                Class<?> cls = Class.forName("jv6.a");
                cls.getDeclaredMethod("install", Context.class).invoke(cls, context);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                System.err.println(th);
            }
            ((IDtrace) PluggableExtentionKt.pluggableSpi(IDtrace.class)).LIZ(Boolean.valueOf(useTraceMode));
            if (!isTraced) {
                ((IDtrace) PluggableExtentionKt.pluggableSpi(IDtrace.class)).LIZIZ(new InterfaceC2088008Fy() { // from class: X.08Fx
                });
                if (((IDtrace) PluggableExtentionKt.pluggableSpi(IDtrace.class)).init(context).booleanValue()) {
                    System.err.println("init trace success");
                    try {
                        startHook();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        PrintStream printStream = System.err;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("startHook failed:");
                        sbLIZ.append(th2);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                isTraced = true;
            }
        }
    }

    public static void reportEvent2Tea(int i, Map<String, Object> map) {
        try {
            if (((IDtrace) PluggableExtentionKt.pluggableSpi(IDtrace.class)).LIZLLL(i, EnumC12974055w.TrackingPoint).booleanValue() && map != null && !map.isEmpty()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    c2344009Gk.LJ(entry.getValue(), entry.getKey());
                }
                C20684815ws.LJIILLIIL("dtrace_dynamic_tracking_point", c2344009Gk.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
