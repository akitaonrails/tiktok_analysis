package com.ss.android.ugc.aweme.legoImp.task;

import X.C08BO;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1602860roS;
import X.C2104108Md;
import X.C2187451AjH;
import X.C2344809Gs;
import X.C2407009bw;
import X.C2427709fH;
import X.C282270B4n;
import X.C294900BhA;
import X.C786410Ut5;
import X.C827300Wcq;
import X.C827510WdB;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2344709Gr;
import X.InterfaceC799590VYf;
import Y.AObjectS57S0000000_4;
import Y.AObjectS66S0000000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public class CrashSdkInitTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CrashSdkInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static boolean LIZ() {
        if (C2187451AjH.LJIIJ()) {
            return true;
        }
        AObjectS57S0000000_4 aObjectS57S0000000_4 = new AObjectS57S0000000_4(2);
        C1602860roS.LIZ.getClass();
        return Boolean.TRUE.equals(C1492110ovp.LIZJ("newUserAlogOpt", aObjectS57S0000000_4, C1602860roS.LJ() ? new AObjectS66S0000000_13(2) : C1602860roS.LIZJ(1L) ? new AObjectS66S0000000_13(3) : aObjectS57S0000000_4, ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LIZLLL(1L)));
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public CrashSdkInitTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2407009bw.LIZ();
        if (C827510WdB.LIZ()) {
            if (((Boolean) C282270B4n.LIZ.getValue()).booleanValue()) {
                ALog.setZstdOptType(1);
            }
            try {
                ArrayList arrayList = new ArrayList();
                final boolean zLIZ = LIZ();
                arrayList.add(new InterfaceC2344709Gr(zLIZ) { // from class: X.0Wcs
                    public final boolean LIZ;

                    @Override // X.InterfaceC2344709Gr
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final void lw() {
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final boolean isEnable() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = zLIZ;
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final void init(Context context2) {
                        String absolutePath;
                        long jIntValue = 20971520;
                        if (C1336210ksN.LIZ()) {
                            jIntValue = ((Number) C2250201D5m.LJIIJ.getValue()).intValue() * 1048576;
                        }
                        File fileLJI = C2427709fH.LJI(context2);
                        C827310Wcr c827310Wcr = new C827310Wcr(C786410Ut5.N3(context2));
                        c827310Wcr.LIZIZ = (int) jIntValue;
                        c827310Wcr.LIZJ = 2097152;
                        if (fileLJI != null) {
                            absolutePath = fileLJI.getAbsolutePath();
                        } else {
                            absolutePath = null;
                        }
                        c827310Wcr.LJ = absolutePath;
                        boolean z = true;
                        c827310Wcr.LJII = true;
                        c827310Wcr.LJIIIIZZ = ((Boolean) C291960BcQ.LIZ.getValue()).booleanValue();
                        c827310Wcr.LJIIIZ = true;
                        c827310Wcr.LJIIJ = ((Number) C1842607Jo.LIZ.getValue()).intValue();
                        c827310Wcr.LJIIJJI = ((Boolean) C0AIS.LIZ.getValue()).booleanValue();
                        C827360Wcw c827360WcwLIZ = c827310Wcr.LIZ();
                        ALog.setsPackageClassName(C2344809Gs.class.getCanonicalName());
                        ALog.addNativeFuncAddrCallback(new InterfaceC827270Wcn() { // from class: X.0Wd8
                            @Override // X.InterfaceC827270Wcn
                            public final void LIZ(long j) {
                                Npth.setAlogFlushV2Addr(ALog.getAlogNativeFlushV2FuncAddr());
                                Npth.setAlogLogDirAddr(ALog.getAlogNativeLogStoreDirFuncAddr());
                                C0CO1.LIZ().setAlogFuncAddr(j);
                            }
                        });
                        ALog.setOuterExecutorService(C823050WQl.LJ());
                        ALog.init(c827360WcwLIZ);
                        C844470XAv.LIZ.getClass();
                        if (!TextUtils.equals(C844470XAv.LJIILL, "local_test") && !TextUtils.equals(C844470XAv.LJIILL, "local_test_av")) {
                            z = false;
                        }
                        ALog.setDebug(z);
                        AbstractC827810Wdf.LIZ = new AbstractC827810Wdf() { // from class: X.0WdG
                        };
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final void LIZLLL(String str, Throwable th) {
                        ALog.e(str, th);
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final void LIZ(int i, String str, String str2) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        if (i == 6) {
                                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
                                            return;
                                        }
                                        return;
                                    }
                                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
                                    return;
                                }
                                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
                                return;
                            }
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
                            return;
                        }
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
                    }

                    @Override // X.InterfaceC2344709Gr
                    public final void LIZJ(String str, String str2, Exception exc) {
                        ALog.e(str, str2, exc);
                    }
                });
                C2344809Gs.LIZJ(C786410Ut5.N3(context), arrayList);
                if (C294900BhA.LIZ() && C2104108Md.LIZLLL(context)) {
                    File fileLJI = C2427709fH.LJI(context);
                    C827300Wcq c827300Wcq = C827300Wcq.LIZ;
                    if (C827300Wcq.LIZIZ == null) {
                        synchronized (c827300Wcq) {
                            try {
                                if (C827300Wcq.LIZIZ == null) {
                                    c827300Wcq.getClass();
                                    C827300Wcq.LIZIZ = C827300Wcq.LIZ(context, fileLJI);
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } else {
                        c827300Wcq.getClass();
                    }
                    C827300Wcq.LJFF.scheduleWithFixedDelay(new Runnable() { // from class: X.0Wcy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("FeedALogInstance@b15b.startScheduledFlush$1");
                            try {
                                try {
                                    C827300Wcq.LIZ.getClass();
                                    C827300Wcq.LIZIZ();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("FeedALogInstance@b15b.startScheduledFlush$1");
                        }
                    }, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
            }
            Thread.setDefaultUncaughtExceptionHandler(new C08BO(Thread.getDefaultUncaughtExceptionHandler()));
            new Runnable() { // from class: X.0VXR
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("AlogInitTask@639a.run");
                    if (ALog.isInitSuccess()) {
                        Npth.enableALogCollector(ALog.sConfig.LJFF, new C0VXQ() { // from class: X.0VXS
                        }, new C0VXN());
                    }
                    C1C7U.LIZIZ("AlogInitTask@639a.run");
                }
            }.run();
        }
    }
}
