package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BIB;
import X.C0C5A;
import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C1781506yL;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ABCacheOptInitTask implements C0CCZ {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABCacheOptInitTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().abCacheOptInitTask;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        System.currentTimeMillis();
        C0C5A.LIZJ().LJIIIIZZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ab_lib_empty_call_opt", true, false);
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ab_call_opt", true, false);
        C0BIB.LIZ = zLJIIIZ;
        if (zLJIIIZ) {
            try {
                C1781506yL.LIZ = zLJIIIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0BIB.LIZ = false;
                C1781506yL.LIZ = false;
            }
        }
    }
}
