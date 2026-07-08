package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C11JF;
import X.C2456309jt;
import X.C786410Ut5;
import X.C799570VYd;
import X.C801100Vbg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC800110Va5;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class PushStartupTaskRejectStrategy implements C0CCZ {
    public final C801100Vbg LL = new InterfaceC800110Va5() { // from class: X.0Vbg
        @Override // X.InterfaceC800110Va5
        public final String scene() {
            return "PushStartup";
        }

        @Override // X.InterfaceC800110Va5
        public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
            if (interfaceC800080Va2.triggerType() == EnumC799980VZs.TASK_BACKGROUND) {
                try {
                    Thread.sleep(ColdBootPushStartupExperiment.LIZ().taskSleepTime);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return EnumC800210VaF.Normal;
                }
            }
            return EnumC800210VaF.Normal;
        }
    };
    public C11JF LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PushStartupTaskRejectStrategy";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        if (ColdBootPushStartupExperiment.LIZ().taskRejectStrategyV2) {
            return C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ();
        }
        return false;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS113S0100000_13(this, 185));
    }
}
