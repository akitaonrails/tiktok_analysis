package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C1520380pfQ;
import X.C486980J7w;
import X.C786410Ut5;
import android.app.Application;
import com.bytedance.android.livesdk.livesetting.other.LiveChainMonitorExcludeErrorCodesSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableTimeCostSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public class MonitorInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "monitor_init_task";
    }

    private void initHybridMonitor() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || iHostAppContext.context() == null || C786410Ut5.N3(iHostAppContext.context()) == null || !(C786410Ut5.N3(iHostAppContext.context()) instanceof Application)) {
            return;
        }
        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
        Application application = (Application) C786410Ut5.N3(iHostAppContext.context());
        c1520380pfQ.getClass();
        C1520380pfQ.LIZLLL(c1520380pfQ, application);
    }

    @Override // X.AbstractC20513081v
    public void run() {
        try {
            if (LiveMonitorSampleSetting.INSTANCE.isDolphinExperiment()) {
                C486980J7w.LIZ = LiveEnableTimeCostSetting.INSTANCE.enable();
            }
            EnterRoomLinkSession.LJI(LiveChainMonitorExcludeErrorCodesSetting.INSTANCE.getValue());
            initHybridMonitor();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
