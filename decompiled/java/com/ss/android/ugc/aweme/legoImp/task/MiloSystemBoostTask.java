package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0AFY;
import X.C0CCZ;
import X.C0VZ0;
import X.C1057260dcS;
import X.C1702140uOa;
import X.C1702150uOb;
import X.C1BCA;
import X.C2187451AjH;
import X.C2188091AkJ;
import X.C2188121AkM;
import X.C282100B3w;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1702110uOX;
import X.InterfaceC1702120uOY;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.sysoptimizer.perflock.PerfLockBooster;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.anr.FrameworkPerfLockParams;
import com.ss.android.ugc.aweme.legoImp.task.CpuUsagePerfLockConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class MiloSystemBoostTask implements C0CCZ {
    public static final C1702150uOb LL = new InterfaceC1702110uOX() { // from class: X.0uOb
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
            C1512840pTG c1512840pTG3 = c1512840pTG2;
            EnumC1006810cJ5 enumC1006810cJ5 = c1512840pTG.LIZ;
            EnumC1006810cJ5 enumC1006810cJ52 = c1512840pTG3.LIZ;
            if (enumC1006810cJ5 != enumC1006810cJ52) {
                if (enumC1006810cJ52.compareTo(EnumC1006810cJ5.High) >= 0) {
                    JatoXL.doYoungGcOpt(0.75d);
                } else if (c1512840pTG3.LIZ == EnumC1006810cJ5.Low) {
                    JatoXL.doYoungGcOpt(0.25d);
                } else {
                    JatoXL.doYoungGcOpt(0.5d);
                }
            }
        }
    };
    public static final C1702140uOa LLILLJJLI = new InterfaceC1702120uOY() { // from class: X.0uOa
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
            C1512820pTE c1512820pTE3 = c1512820pTE2;
            EnumC1006810cJ5 enumC1006810cJ5 = c1512820pTE.LIZ;
            EnumC1006810cJ5 enumC1006810cJ52 = c1512820pTE3.LIZ;
            if (enumC1006810cJ5 != enumC1006810cJ52) {
                if (enumC1006810cJ52.compareTo(EnumC1006810cJ5.High) >= 0) {
                    JatoXL.doYoungGcOpt(0.25d);
                } else if (c1512820pTE3.LIZ == EnumC1006810cJ5.Low) {
                    JatoXL.doYoungGcOpt(0.75d);
                } else {
                    JatoXL.doYoungGcOpt(0.5d);
                }
            }
        }
    };
    public static final C2188091AkJ LLILLL = new InterfaceC1702110uOX() { // from class: X.1AkJ
        public long LL;
        public long LLILLJJLI;

        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
            int i;
            CpuUsagePerfLockConfig cpuUsagePerfLockConfig;
            double d;
            C1512840pTG c1512840pTG3 = c1512840pTG2;
            C01GW c01gw = C2188121AkM.LIZ;
            CpuUsagePerfLockConfig cpuUsagePerfLockConfig2 = (CpuUsagePerfLockConfig) c01gw.getValue();
            if (cpuUsagePerfLockConfig2 != null && (i = cpuUsagePerfLockConfig2.perflockTime) > 0 && (cpuUsagePerfLockConfig = (CpuUsagePerfLockConfig) c01gw.getValue()) != null) {
                if (c1512840pTG3.LIZIZ >= cpuUsagePerfLockConfig.thresholdLevel && System.currentTimeMillis() - this.LL > i) {
                    this.LL = System.currentTimeMillis();
                    FrameworkPerfLockParams frameworkPerfLockParams = (FrameworkPerfLockParams) C2188111AkL.LIZ.getValue();
                    if (frameworkPerfLockParams != null && frameworkPerfLockParams.enable) {
                        C844470XAv.LIZ.getClass();
                        PerfLockBooster.boostByFrameworkPerfLock(C844470XAv.LIZ(), frameworkPerfLockParams.type, frameworkPerfLockParams.perflockParmaString, i);
                    } else {
                        AnonymousClass0810.LIZ.LIZ(i, null);
                    }
                    long j = this.LLILLJJLI + 1;
                    this.LLILLJJLI = j;
                    if (C2519009u0.LIZ > 0) {
                        double d2 = c1512840pTG3.LIZIZ;
                        CpuUsagePerfLockConfig cpuUsagePerfLockConfig3 = (CpuUsagePerfLockConfig) c01gw.getValue();
                        if (cpuUsagePerfLockConfig3 != null) {
                            d = cpuUsagePerfLockConfig3.thresholdLevel;
                        } else {
                            d = 0.0d;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("count", j);
                            jSONObject.put("cpu_usage", d2);
                            jSONObject.put("threshold", d);
                            C20684815ws.LJIJ("cpu_usage_perflock_report", jSONObject);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MiloSystemBoostTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        CpuUsagePerfLockConfig cpuUsagePerfLockConfig = (CpuUsagePerfLockConfig) C2188121AkM.LIZ.getValue();
        if (cpuUsagePerfLockConfig != null && cpuUsagePerfLockConfig.enable) {
            C2188091AkJ c2188091AkJ = LLILLL;
            long j = cpuUsagePerfLockConfig.interval;
            C1057260dcS c1057260dcS = new C1057260dcS();
            c1057260dcS.LIZJ = cpuUsagePerfLockConfig.mediumLevel;
            c1057260dcS.LIZIZ = cpuUsagePerfLockConfig.highLevel;
            c1057260dcS.LIZ = cpuUsagePerfLockConfig.criticalLevel;
            C1BCA.LJIJ(c2188091AkJ, true, j, c1057260dcS.LIZ());
        }
        if (Build.VERSION.SDK_INT < 29 || !Process.is64Bit()) {
            return;
        }
        C01GW c01gw = C282100B3w.LIZ;
        if (((Number) c01gw.getValue()).doubleValue() > 0.0d) {
            JatoXL.doYoungGcOpt(((Number) c01gw.getValue()).doubleValue());
        }
        if (C0AFY.LIZIZ) {
            if (!C2187451AjH.LJIIJ() && ((Number) C0AFY.LIZ.getValue()).intValue() != 3) {
                z = false;
            } else {
                z = true;
            }
            C1702140uOa c1702140uOa = LLILLJJLI;
            C1702150uOb c1702150uOb = LL;
            if (z) {
                C1BCA.LJIIZILJ(c1702150uOb, true, 0L);
                C1BCA.LJJ(c1702140uOa, true, 0L);
            } else if (((Number) C0AFY.LIZ.getValue()).intValue() == 1) {
                C1BCA.LJIIZILJ(c1702150uOb, true, 0L);
            } else {
                C1BCA.LJJ(c1702140uOa, true, 0L);
            }
        }
    }
}
