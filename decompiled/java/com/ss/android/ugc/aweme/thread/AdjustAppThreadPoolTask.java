package com.ss.android.ugc.aweme.thread;

import X.C01GW;
import X.C0AEI;
import X.C0AZG;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2188811AlT;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes5.dex */
public final class AdjustAppThreadPoolTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AdjustAppThreadPoolTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int corePoolSize;
        C01GW c01gw = C0AZG.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            ((Number) c01gw.getValue()).intValue();
            ((Number) c01gw.getValue()).intValue();
        }
        try {
            int iIntValue = ((Number) C0AEI.LIZ.getValue()).intValue();
            ExecutorService executorServiceLIZJ = C823050WQl.LIZJ();
            if ((executorServiceLIZJ instanceof ThreadPoolExecutor) && iIntValue > (corePoolSize = ((ThreadPoolExecutor) executorServiceLIZJ).getCorePoolSize())) {
                int i = (iIntValue * 2) + 1;
                ((ThreadPoolExecutor) executorServiceLIZJ).setCorePoolSize(iIntValue);
                ((ThreadPoolExecutor) executorServiceLIZJ).setMaximumPoolSize(i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("v2 help default origin:");
                sbLIZ.append(corePoolSize);
                sbLIZ.append(" core:");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" max:");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
