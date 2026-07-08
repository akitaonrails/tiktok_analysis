package com.ss.android.ugc.aweme.simkit.impl;

import X.C0C83;
import X.C1126604au;
import X.C1468580oJs;
import X.C1471680oOs;
import X.C1474810oTv;
import X.C1474930oU7;
import X.C1474940oU8;
import X.C1475000oUE;
import X.C1475650oVH;
import X.C1475700oVM;
import X.C1476910oXJ;
import X.C1476930oXL;
import X.C1477750oYf;
import X.C1478040oZ8;
import X.C1478160oZK;
import X.C1478190oZN;
import X.C1478210oZP;
import X.C1478300oZY;
import X.C1478310oZZ;
import X.C1478410oZj;
import X.C1480850odf;
import X.C1480860odg;
import X.C1481110oe5;
import X.C1481610oet;
import X.C1483610oi7;
import X.C1487040one;
import X.C1C7U;
import X.C1EOQ;
import X.C1EOR;
import X.C2188811AlT;
import X.C607330Nrv;
import X.C786410Ut5;
import X.C807400Vlq;
import X.InterfaceC1478200oZO;
import X.InterfaceC1482870ogv;
import X.InterfaceC1484530ojb;
import X.InterfaceC1484830ok5;
import X.InterfaceC468940IaC;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS123S0100000_23;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public class MediaBox implements InterfaceC1484530ojb {
    public ISimKitConfig LIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C1476910oXJ LIZIZ = new C1476910oXJ();

    @Override // X.InterfaceC1484530ojb
    public final InterfaceC468940IaC LIZ() {
        return ((InterfaceC1478200oZO) C1126604au.LIZ("com.ss.android.ugc.aweme.ttkvideoplayer.StrategyCenterService")).LIZ();
    }

    @Override // X.InterfaceC1484530ojb
    public final void LIZIZ() {
        SimRadar.traceGroup("SimKitBGInit").LIZ("bg-init").LIZ();
        if (this.LIZ == null) {
            this.LIZ = (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        C1475650oVH.LIZ().LIZLLL(new C1471680oOs(this));
        if (!this.LIZ.getPreloaderExperiment().enableMDLInitDelay()) {
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1475700oVM.LIZ();
            Objects.requireNonNull(interfaceC1482870ogvLIZ);
            C1474940oU8 c1474940oU8 = new C1474940oU8("TASK_PRELOAD_MANAGER_SERVICE_INIT", new ARunnableS123S0100000_23(interfaceC1482870ogvLIZ, 142));
            C1474930oU7.LJII = this.LIZ.getSimPlayerExperiment().isCbofCache();
            if (!(((Boolean) C1474810oTv.LLJJIJIIJIL.getValue()).booleanValue() && C1474930oU7.LJII)) {
                C1C7U.LIZ("Task@f5b4.task$1L");
                c1474940oU8.LIZIZ.run();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c1474940oU8.LIZ);
                sbLIZ.append("] executed");
                SimRadar.keyScan("CBOF", C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                C1C7U.LIZIZ("Task@f5b4.task$1L");
            } else if (((Boolean) C1474810oTv.Y3.getValue()).booleanValue()) {
                int iIntValue = ((Number) C1474810oTv.LLJJIJI.getValue()).intValue();
                if (iIntValue > 0) {
                    C807400Vlq.LJ().schedule(new ARunnableS123S0100000_23(c1474940oU8, 93), iIntValue, TimeUnit.MICROSECONDS);
                } else {
                    C1C7U.LIZ("Task@f5b4.task$1L");
                    c1474940oU8.LIZIZ.run();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(c1474940oU8.LIZ);
                    sbLIZ2.append("] executed");
                    SimRadar.keyScan("CBOF", C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
                    C1C7U.LIZIZ("Task@f5b4.task$1L");
                }
            } else {
                C1474930oU7.LIZ.add(new ARunnableS123S0100000_23(c1474940oU8, 95));
            }
        }
        if (this.LIZ.getSimPlayerExperiment().PlayeAbEnableCustomizeThreadPoolExp() == 1) {
            C1475650oVH.LIZ().LJ(C1475000oUE.LIZLLL);
        }
        C1481110oe5.LIZ = this.LIZ.getAppConfig().isDebug();
        this.LIZ.getAppConfig().isDebug();
        SimRadar.traceGroup("SimKitBGInit").LIZ("bg-init").end();
    }

    @Override // X.InterfaceC1484530ojb
    public final ISimKitConfig getConfig() {
        ISimKitConfig iSimKitConfig = this.LIZ;
        return iSimKitConfig == null ? (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class) : iSimKitConfig;
    }

    @Override // X.InterfaceC1484530ojb
    public final C1476910oXJ LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1484530ojb
    public final InterfaceC1484830ok5 LIZJ(C1478410oZj c1478410oZj) {
        if (c1478410oZj != null && c1478410oZj.LIZIZ) {
            if (c1478410oZj.LIZ == 2) {
                if (!((Boolean) C1474810oTv.c6.getValue()).booleanValue() && !c1478410oZj.LJII) {
                    return new C1EOQ(c1478410oZj.LIZJ);
                }
                return new C1EOR(c1478410oZj.LIZJ);
            }
            return new C1483610oi7(c1478410oZj);
        }
        return C1478210oZP.LIZ.LIZ;
    }

    @Override // X.InterfaceC1484530ojb
    public final void LIZLLL(Context context, SimKitConfigImpl simKitConfigImpl) {
        if (this.LIZJ.getAndSet(true)) {
            return;
        }
        Application application = C1475000oUE.LIZ;
        C1475000oUE c1475000oUE = C1468580oJs.LIZ;
        Application application2 = (Application) C786410Ut5.N3(context);
        c1475000oUE.getClass();
        if (C1475000oUE.LIZ == null) {
            C1480860odg.LIZ = application2;
            C1475000oUE.LIZ = application2;
            application2.registerActivityLifecycleCallbacks(new C1487040one());
        }
        this.LIZ = simKitConfigImpl;
        C1475000oUE.LJFF = simKitConfigImpl.getAppConfig();
        C1475000oUE.LJI = simKitConfigImpl.getMonitor();
        C1475000oUE.LJII = simKitConfigImpl.getEvent();
        C1475000oUE.LJIIIIZZ = simKitConfigImpl.getALog();
        C1475000oUE.LJIIJ = simKitConfigImpl.getRadarTransmitter();
        C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
        c1478040oZ8.LIZ = simKitConfigImpl.getSimPlayerExperiment();
        c1478040oZ8.LIZIZ = new C1477750oYf(simKitConfigImpl.getSimPlayerConfig());
        C1478190oZN.LIZ = new C1478300oZY(new C1478310oZZ(simKitConfigImpl.getVideoPreloaderManagerConfig()));
        C1480850odf.LIZJ.LIZIZ = simKitConfigImpl.getPlayerGlobalConfig();
        C1481610oet.LIZIZ = simKitConfigImpl.getSimReporterConfig();
        C1476930oXL.LIZ().LIZIZ(simKitConfigImpl);
        ((InterfaceC1478200oZO) C1126604au.LIZ("com.ss.android.ugc.aweme.ttkvideoplayer.StrategyCenterService")).LIZIZ(simKitConfigImpl);
        PlayerSettingService.init(simKitConfigImpl.PlayerSettingService(), simKitConfigImpl.getAppConfig().isDebug());
        synchronized (C1478160oZK.LIZJ) {
            try {
                C1478160oZK.LIZLLL = C1475700oVM.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0C83.INS.init();
        C1475000oUE.LIZLLL.submit(new ARunnableS119S0100000_19(this, 173));
        SimRadar.traceGroup("SimKitInit").LIZIZ("SimKitInitFinished");
    }
}
