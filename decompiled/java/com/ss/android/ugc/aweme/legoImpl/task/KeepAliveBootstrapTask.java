package com.ss.android.ugc.aweme.legoImpl.task;

import X.C086T;
import X.C0CCZ;
import X.C0VZ0;
import X.C0W71;
import X.C0W72;
import X.C0X35;
import X.C11JF;
import X.C1906580ziK;
import X.C1BWL;
import X.C786410Ut5;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC800110Va5;
import Y.ARunnableS18S0100100_13;
import Y.AfS149S0200000_13;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class KeepAliveBootstrapTask implements C0CCZ {
    public C11JF LLILLJJLI;
    public final C0W71 LL = new InterfaceC800110Va5() { // from class: X.0W71
        @Override // X.InterfaceC800110Va5
        public final String scene() {
            return "KeepAliveBootstrapTask";
        }

        @Override // X.InterfaceC800110Va5
        public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
            if (interfaceC800080Va2.triggerType() == EnumC799980VZs.TASK_BACKGROUND) {
                return EnumC800210VaF.Suspend;
            }
            return EnumC800210VaF.Normal;
        }
    };
    public boolean LLILLL = false;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KeepAliveBootstrapTask";
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
        Intent intentLIZ;
        String str;
        Keva.getRepo("ColdBootHelper").storeLong(C0X35.LJII, 0L);
        if (ColdBootPushStartupExperiment.LIZ().keepAliveEntries != null && !ColdBootPushStartupExperiment.LIZ().keepAliveEntries.isEmpty() && (intentLIZ = C086T.LIZ()) != null && intentLIZ.getAction() != null && intentLIZ.getComponent() != null) {
            for (ColdBootPushStartupExperiment.KeepAliveEntry keepAliveEntry : ColdBootPushStartupExperiment.LIZ().keepAliveEntries) {
                if (keepAliveEntry != null && (str = keepAliveEntry.action) != null && keepAliveEntry.component != null && str.equals(intentLIZ.getAction()) && keepAliveEntry.component.equals(intentLIZ.getComponent().getShortClassName())) {
                    this.LLILLL = keepAliveEntry.suspendTasks;
                    if (keepAliveEntry.keepAliveInterval > 0) {
                        Application applicationLIZ = C1BWL.LIZ();
                        long j = keepAliveEntry.keepAliveInterval;
                        if (applicationLIZ != null && C0W72.LIZ.compareAndSet(false, true)) {
                            try {
                                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS18S0100100_13(j, applicationLIZ, 6));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    long j2 = keepAliveEntry.killSelfInterval;
                    if (j2 > 0) {
                        Keva.getRepo("ColdBootHelper").storeLong(C0X35.LJII, j2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!this.LLILLL) {
            return;
        }
        C799900VZk c799900VZk = C799900VZk.LIZ;
        C0W71 c0w71 = this.LL;
        c799900VZk.getClass();
        this.LLILLJJLI = (C11JF) C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(new AfS149S0200000_13(C799900VZk.LIZ(c0w71), this, 21));
    }
}
