package com.bytedance.pumbaa;

import X.C04TD;
import X.C098200Yq;
import X.C0WS5;
import X.C0WS6;
import X.C0WS7;
import X.C0WSB;
import X.C0WSF;
import X.C0WSL;
import X.C189200o6;
import X.C308480C7i;
import X.C813160Vv8;
import X.C822890WPv;
import X.C823280WRi;
import X.C823320WRm;
import X.C839130Wvv;
import X.C839190Ww1;
import X.C839280WwA;
import X.C839500WwW;
import X.C839540Wwa;
import X.C839590Wwf;
import X.C839650Wwl;
import X.C839730Wwt;
import X.ExecutorC822880WPu;
import X.InterfaceC839820Wx2;
import X.InterfaceC839830Wx3;
import android.app.Application;
import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.pumbaa.api.IPumbaaService;
import com.bytedance.pumbaa.base.ICommonService;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.common.interfaces.IAppLog;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS68S0100100_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaServiceImpl implements IPumbaaService {
    public C839190Ww1 LIZ;
    public C839540Wwa LIZIZ;
    public C839500WwW LIZJ;
    public C839650Wwl LIZLLL;
    public C0WSB LJ;
    public boolean LJFF;

    public static IPumbaaService LJI() {
        Object objLIZ = C04TD.LIZ(IPumbaaService.class, false);
        if (objLIZ != null) {
            return (IPumbaaService) objLIZ;
        }
        if (C04TD.LJJIJL == null) {
            synchronized (IPumbaaService.class) {
                if (C04TD.LJJIJL == null) {
                    C04TD.LJJIJL = new PumbaaServiceImpl();
                }
            }
        }
        return C04TD.LJJIJL;
    }

    public final void LJIIIIZZ() {
        Function0<SettingsModel> function0;
        SettingsModel settingsModelInvoke;
        Object c098200Yq;
        C839500WwW c839500WwW = this.LIZJ;
        if (c839500WwW == null || (function0 = c839500WwW.LIZ) == null || (settingsModelInvoke = function0.invoke()) == null) {
            return;
        }
        try {
            C839280WwA.LIZ(settingsModelInvoke);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void LJ() {
        Object c098200Yq;
        try {
            for (ICommonService iCommonService : ServiceManager.get().getServices(ICommonService.class)) {
                if (!(iCommonService instanceof PumbaaServiceImpl)) {
                    iCommonService.LJ();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZJ(C839190Ww1 c839190Ww1, C839540Wwa c839540Wwa, C839500WwW c839500WwW, C839650Wwl c839650Wwl) {
        Object c098200Yq;
        try {
            LJIIIZ(c839190Ww1, c839540Wwa, c839500WwW, c839650Wwl);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LJIIIIZZ("old pumbaa init error", thM5exceptionOrNullimpl);
        }
    }

    public final void LJIIIZ(C839190Ww1 c839190Ww1, C839540Wwa c839540Wwa, C839500WwW c839500WwW, C839650Wwl c839650Wwl) {
        C0WS7 c0ws7LJFF;
        C839130Wvv c839130Wvv;
        C0WSB c0wsb;
        C0WS7 c0ws7LJFF2;
        C839130Wvv c839130Wvv2;
        Function0<SettingsModel> function0;
        InterfaceC839820Wx2 interfaceC839820Wx2;
        C0WS7 c0ws7LJFF3;
        C839130Wvv c839130Wvv3;
        InterfaceC839830Wx3 interfaceC839830Wx3;
        Function0<C839590Wwf> function02;
        Application application;
        Object c098200Yq;
        ExecutorC822880WPu executorC822880WPu;
        C839130Wvv c839130Wvv4;
        boolean z;
        C0WSB c0wsb2;
        C0WS7 c0ws7LJIIIIZZ;
        try {
            C0WS6 c0ws6 = new C0WS6();
            c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
            c0ws6.LIZJ = Debug.threadCpuTimeNanos();
            long j = c0ws6.LIZ;
            boolean zBooleanValue = false;
            if (!PumbaaPerformanceTrackManager.LJIIIZ.get()) {
                PumbaaPerformanceTrackManager.LJFF(C0WSL.LIZ(), (String) C308480C7i.LIZLLL(String.class, "pns_pumbaa_perf_expr_tag", null), Boolean.FALSE, c839540Wwa.LIZ.LJJIIZI, new AwS68S0100100_13(c839540Wwa, j, 0));
                z = true;
            } else {
                z = false;
            }
            Pair pairLJ = PumbaaPerformanceTrackManager.LJ(false);
            if (pairLJ != null) {
                zBooleanValue = ((Boolean) pairLJ.getSecond()).booleanValue();
            }
            this.LJFF = zBooleanValue;
            if (pairLJ == null) {
                c0wsb2 = null;
            } else {
                c0wsb2 = (C0WSB) pairLJ.getFirst();
            }
            this.LJ = c0wsb2;
            if (!this.LJFF && c0wsb2 != null) {
                c0wsb2.LJIIJ(c0ws6);
            }
            c0ws6.LIZ();
            C0WSB c0wsb3 = this.LJ;
            if (c0wsb3 != null) {
                c0ws7LJIIIIZZ = c0wsb3.LJIIIIZZ("init_perf_inside", c0ws6);
            } else {
                c0ws7LJIIIIZZ = null;
            }
            if (!z && c0ws7LJIIIIZZ != null) {
                c0ws7LJIIIIZZ.LJ = "not_do_init";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("initAndStartPerformanceTracker_error", th);
        }
        C0WSB c0wsb4 = this.LJ;
        if (c0wsb4 != null) {
            c0ws7LJFF = c0wsb4.LJFF("load_data");
        } else {
            c0ws7LJFF = null;
        }
        SystemClock.elapsedRealtimeNanos();
        this.LIZ = c839190Ww1;
        this.LIZJ = c839500WwW;
        this.LIZLLL = c839650Wwl;
        C839130Wvv c839130Wvv5 = c839540Wwa.LIZ;
        ILogger iLogger = c839130Wvv5.LJIJJLI;
        if (iLogger == null) {
            iLogger = (ILogger) ServiceManager.get().getService(ILogger.class);
        }
        IAppLog iAppLog = c839130Wvv5.LJIL;
        if (iAppLog == null) {
            iAppLog = (IAppLog) ServiceManager.get().getService(IAppLog.class);
        }
        IEventMonitor iEventMonitor = c839130Wvv5.LJJ;
        if (iEventMonitor == null) {
            iEventMonitor = (IEventMonitor) ServiceManager.get().getService(IEventMonitor.class);
        }
        IStore iStore = c839130Wvv5.LJJI;
        if (iStore == null) {
            iStore = (IStore) ServiceManager.get().getService(IStore.class);
        }
        IExceptionMonitor iExceptionMonitor = c839130Wvv5.LJJIFFI;
        if (iExceptionMonitor == null) {
            iExceptionMonitor = (IExceptionMonitor) ServiceManager.get().getService(IExceptionMonitor.class);
        }
        Object service = c839130Wvv5.LJJII;
        if (service == null) {
            service = ServiceManager.get().getService(IRuleEngineService.class);
        }
        this.LIZIZ = new C839540Wwa(new C839130Wvv(c839130Wvv5.LIZ, c839130Wvv5.LIZIZ, c839130Wvv5.LIZJ, c839130Wvv5.LIZLLL, c839130Wvv5.LJ, c839130Wvv5.LJFF, c839130Wvv5.LJI, c839130Wvv5.LJII, c839130Wvv5.LJIIIIZZ, c839130Wvv5.LJIIIZ, c839130Wvv5.LJIIJ, c839130Wvv5.LJIIJJI, c839130Wvv5.LJIIL, c839130Wvv5.LJIILIIL, c839130Wvv5.LJIILJJIL, c839130Wvv5.LJIILL, c839130Wvv5.LJIILLIIL, c839130Wvv5.LJIIZILJ, c839130Wvv5.LJIJ, c839130Wvv5.LJIJI, c839130Wvv5.LJIJJ, iLogger, iAppLog, iEventMonitor, iStore, iExceptionMonitor, service, null, c839130Wvv5.LJJIIJ, c839130Wvv5.LJJIIJZLJL, c839130Wvv5.LJJIIZ, c839130Wvv5.LJJIIZI, c839130Wvv5.LJJIJ, c839130Wvv5.LJJIJIIJI), c839540Wwa.LIZIZ);
        SystemClock.elapsedRealtimeNanos();
        if (c0ws7LJFF != null) {
            c0ws7LJFF.stop();
        }
        C0WSB c0wsb5 = this.LJ;
        if (c0wsb5 == null) {
            C813160Vv8.LIZIZ();
        } else {
            C0WS7 c0ws7LJFF4 = c0wsb5.LJFF("page_stack_init");
            C813160Vv8.LIZIZ();
            C0WSF c0wsf = c0wsb5.LJI;
            C0WSF c0wsf2 = C0WSF.EXCEEDED;
            if (c0wsf == c0wsf2) {
                c0ws7LJFF4.LJFF = c0wsf2;
            }
            c0ws7LJFF4.stop();
        }
        C0WSB c0wsb6 = this.LJ;
        if (c0wsb6 == null) {
            C823320WRm c823320WRm = C823320WRm.LIZ;
            C839540Wwa c839540Wwa2 = this.LIZIZ;
            if (c839540Wwa2 != null) {
                c839130Wvv4 = c839540Wwa2.LIZ;
            } else {
                c839130Wvv4 = null;
            }
            c823320WRm.getClass();
            C823320WRm.LIZIZ(c839190Ww1, c839130Wvv4);
        } else {
            C0WS7 c0ws7LJFF5 = c0wsb6.LJFF("global_feature_init");
            C823320WRm c823320WRm2 = C823320WRm.LIZ;
            C839540Wwa c839540Wwa3 = this.LIZIZ;
            if (c839540Wwa3 != null) {
                c839130Wvv = c839540Wwa3.LIZ;
            } else {
                c839130Wvv = null;
            }
            c823320WRm2.getClass();
            C823320WRm.LIZIZ(c839190Ww1, c839130Wvv);
            C0WSF c0wsf3 = c0wsb6.LJI;
            C0WSF c0wsf4 = C0WSF.EXCEEDED;
            if (c0wsf3 == c0wsf4) {
                c0ws7LJFF5.LJFF = c0wsf4;
            }
            c0ws7LJFF5.stop();
        }
        C839190Ww1 c839190Ww12 = this.LIZ;
        if (c839190Ww12 != null && (application = c839190Ww12.LIZ) != null) {
            try {
                synchronized (PumbaaEfficientThread.class) {
                    try {
                        PumbaaEfficientThread.LIZIZ();
                        executorC822880WPu = PumbaaEfficientThread.LLILLL;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C822890WPv.LIZIZ(application, executorC822880WPu);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
            }
        }
        C0WSB c0wsb7 = this.LJ;
        if (c0wsb7 == null) {
            LJIIIIZZ();
        } else {
            C0WS7 c0ws7LJFF6 = c0wsb7.LJFF("cache_init");
            LJIIIIZZ();
            C0WSF c0wsf5 = c0wsb7.LJI;
            C0WSF c0wsf6 = C0WSF.EXCEEDED;
            if (c0wsf5 == c0wsf6) {
                c0ws7LJFF6.LJFF = c0wsf6;
            }
            c0ws7LJFF6.stop();
        }
        for (ICommonService iCommonService : ServiceManager.get().getServices(ICommonService.class)) {
            if (iCommonService instanceof INetworkService) {
                C0WSB c0wsb8 = this.LJ;
                if (c0wsb8 != null) {
                    c0ws7LJFF2 = c0wsb8.LJFF("network_init");
                } else {
                    c0ws7LJFF2 = null;
                }
                SystemClock.elapsedRealtimeNanos();
                C839540Wwa c839540Wwa4 = this.LIZIZ;
                if (c839540Wwa4 != null) {
                    c839130Wvv2 = c839540Wwa4.LIZ;
                } else {
                    c839130Wvv2 = null;
                }
                C839500WwW c839500WwW2 = this.LIZJ;
                if (c839500WwW2 != null) {
                    function0 = c839500WwW2.LIZ;
                } else {
                    function0 = null;
                }
                C839650Wwl c839650Wwl2 = this.LIZLLL;
                if (c839650Wwl2 != null) {
                    interfaceC839820Wx2 = c839650Wwl2.LIZ;
                } else {
                    interfaceC839820Wx2 = null;
                }
                iCommonService.LIZJ(c839190Ww1, c839130Wvv2, function0, interfaceC839820Wx2);
                SystemClock.elapsedRealtimeNanos();
                if (c0ws7LJFF2 != null) {
                    c0ws7LJFF2.stop();
                }
            } else if (iCommonService instanceof IRuleEngineService) {
                C0WSB c0wsb9 = this.LJ;
                if (c0wsb9 != null) {
                    c0ws7LJFF3 = c0wsb9.LJFF("rule_engin_init");
                } else {
                    c0ws7LJFF3 = null;
                }
                SystemClock.elapsedRealtimeNanos();
                C839540Wwa c839540Wwa5 = this.LIZIZ;
                if (c839540Wwa5 != null) {
                    c839130Wvv3 = c839540Wwa5.LIZ;
                    interfaceC839830Wx3 = c839540Wwa5.LIZIZ;
                } else {
                    c839130Wvv3 = null;
                    interfaceC839830Wx3 = null;
                }
                C839730Wwt c839730Wwt = new C839730Wwt(c839130Wvv3, interfaceC839830Wx3);
                C839500WwW c839500WwW3 = this.LIZJ;
                if (c839500WwW3 != null) {
                    function02 = c839500WwW3.LIZIZ;
                } else {
                    function02 = null;
                }
                iCommonService.LIZJ(c839190Ww1, c839730Wwt, function02, null);
                SystemClock.elapsedRealtimeNanos();
                if (c0ws7LJFF3 != null) {
                    c0ws7LJFF3.stop();
                }
            }
        }
        SystemClock.elapsedRealtimeNanos();
        if (!this.LJFF && (c0wsb = this.LJ) != null) {
            c0wsb.LJIILJJIL();
        }
    }
}
