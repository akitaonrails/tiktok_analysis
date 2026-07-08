package com.ss.android.ugc.aweme.legoImp.task.anr;

import X.C0CCZ;
import X.C0VSF;
import X.C0VZ0;
import X.C20684815ws;
import X.C2104408Mg;
import X.C2188161AkQ;
import X.C2188181AkS;
import X.C276790At3;
import X.C277910Aur;
import X.C279270Ax3;
import X.C279280Ax4;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import com.bytedance.common.jato.boost.GCOptionOpt;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.sysoptimizer.allocatorx.HeapGcRegulator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.GcOptionConfig;
import com.ss.android.ugc.aweme.experiment.HeapGcRegulatorConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AnrBootFinishTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AnrBootFinishTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static String LIZ() {
        BufferedReader bufferedReader;
        if (!((Boolean) C279280Ax4.LIZ.getValue()).booleanValue()) {
            return "notopen";
        }
        String str = "other";
        try {
            bufferedReader = new BufferedReader(new C0VSF("/proc/self/maps"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (line.contains("Concurrent mark-compact compaction buffers")) {
                            str = "CMC";
                            break;
                        }
                        if (line.contains("concurrent copying gc mark stack")) {
                            str = "CC";
                            break;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        break;
                    }
                    return str;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
            return str;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        GcOptionConfig gcOptionConfig;
        HeapGcRegulatorConfig heapGcRegulatorConfig;
        if (Boolean.valueOf(C2104408Mg.LIZJ(context)).booleanValue()) {
            if (((Number) C277910Aur.LIZ.getValue()).intValue() == 1 && (heapGcRegulatorConfig = (HeapGcRegulatorConfig) C2188181AkS.LIZ.getValue()) != null && heapGcRegulatorConfig.enable) {
                HeapGcRegulator.optimize(context, heapGcRegulatorConfig.ratioHigh, heapGcRegulatorConfig.ratioLow, heapGcRegulatorConfig.alphaHigh, heapGcRegulatorConfig.alphaLow);
            }
            if (((Number) C276790At3.LIZ.getValue()).intValue() == 1 && (gcOptionConfig = (GcOptionConfig) C2188161AkQ.LIZ.getValue()) != null) {
                long jMaxMemory = Runtime.getRuntime().maxMemory();
                if (jMaxMemory < 536870912) {
                    float f = gcOptionConfig.clearSoftRefLimitPercentLow;
                    float f2 = gcOptionConfig.adjGcTypeLimitPercentLow;
                    if (f > 0.0f || f2 > 0.0f) {
                        float f3 = jMaxMemory;
                        GCOptionOpt.LIZLLL().LIZIZ((long) (f * f3), (long) (f3 * f2));
                    }
                } else {
                    float f4 = gcOptionConfig.clearSoftRefLimitPercent;
                    float f5 = gcOptionConfig.adjGcTypeLimitPercent;
                    if (f4 > 0.0f || f5 > 0.0f) {
                        float f6 = jMaxMemory;
                        GCOptionOpt.LIZLLL().LIZIZ((long) (f4 * f6), (long) (f6 * f5));
                    }
                }
            }
            if (((Boolean) C279270Ax3.LIZ.getValue()).booleanValue()) {
                try {
                    String strValueOf = String.valueOf(DeviceInfoUtils.LIZ());
                    int i = Build.VERSION.SDK_INT;
                    String strLIZ = LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("apex_art_version", strValueOf);
                    jSONObject.put("sdk_int", i);
                    jSONObject.put("gc_name", strLIZ);
                    C20684815ws.LJIJ("apex_art_version_report", jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
