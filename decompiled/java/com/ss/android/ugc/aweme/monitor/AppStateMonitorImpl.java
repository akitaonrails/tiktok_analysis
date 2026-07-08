package com.ss.android.ugc.aweme.monitor;

import X.C01GW;
import X.C09JN;
import X.C1906580ziK;
import X.C1906650ziR;
import X.C452501pT;
import X.C807400Vlq;
import X.RunnableC1904620zfA;
import android.app.Activity;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.monitor.AppStateMonitorImpl;
import com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AppStateMonitorImpl implements IAppStateMonitor {
    public static final /* synthetic */ int LJI = 0;
    public volatile int LIZIZ;
    public volatile boolean LJ;
    public ScheduledExecutorService LIZ = C807400Vlq.LJ();
    public final RunnableC1904620zfA LIZJ = new Runnable() { // from class: X.0zfA
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("AppStateMonitorImpl@6c32.runnable$1");
            try {
                this.LL.LIZIZ++;
                if (this.LL.LIZIZ >= 1) {
                    SpeedModeServiceImpl.LIZLLL().stop();
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("AppStateMonitorImpl@6c32.runnable$1");
        }
    };
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1906650ziR());
    public volatile boolean LJFF = true;

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZ() {
        this.LJFF = false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZIZ() {
        this.LIZIZ = 0;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZLLL() {
        this.LIZIZ = 0;
        ScheduledExecutorService scheduledExecutorService = this.LIZ;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.LIZ.shutdownNow();
        }
        this.LIZ = C807400Vlq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void d8() {
        this.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void init() {
        C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new C09JN() { // from class: X.0zyS
            @Override // X.C09JN
            public final void accept(Object obj) {
                Activity activityLIZIZ;
                C1C7U.LIZ("AppStateMonitorImpl@6c32.init$1");
                if (((Boolean) obj).booleanValue()) {
                    AppStateMonitorImpl appStateMonitorImpl = this.LL;
                    appStateMonitorImpl.LIZIZ = 0;
                    if (appStateMonitorImpl.LJFF) {
                        appStateMonitorImpl.LIZ.scheduleAtFixedRate(appStateMonitorImpl.LIZJ, 1L, 1L, TimeUnit.MINUTES);
                    }
                    TTNetInit.OnAppActivitySuspend();
                } else {
                    this.LL.LIZLLL();
                    TTNetInit.OnAppActiviyResume();
                    if (((Boolean) C310320CEk.LIZJ.getValue()).booleanValue()) {
                        AppStateMonitorImpl appStateMonitorImpl2 = this.LL;
                        if (!appStateMonitorImpl2.LJ) {
                            appStateMonitorImpl2.LJ = true;
                            appStateMonitorImpl2.LIZ.scheduleAtFixedRate((Runnable) appStateMonitorImpl2.LIZLLL.getValue(), 0L, 5L, TimeUnit.SECONDS);
                        }
                    }
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && C1388190mED.LIZIZ(activityLIZIZ) != null) {
                        C0S78.LIZLLL(true, AFwS217S0000000_28.get$arr$(258));
                    }
                }
                C1C7U.LIZIZ("AppStateMonitorImpl@6c32.init$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final int LIZJ() {
        return this.LIZIZ;
    }
}
