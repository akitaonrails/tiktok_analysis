package com.ss.android.ugc.aweme.legoImpl.task;

import X.C01GW;
import X.C0AGY;
import X.C0CCZ;
import X.C0VZ0;
import X.C0W70;
import X.C1777306xf;
import X.C1777406xg;
import X.C786410Ut5;
import X.C799570VYd;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC800110Va5;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class XVVRejectStrategy implements C0CCZ {
    public static final /* synthetic */ int LLILLL = 0;
    public volatile boolean LL = true;
    public final C0W70 LLILLJJLI = new InterfaceC800110Va5() { // from class: X.0W70
        @Override // X.InterfaceC800110Va5
        public final String scene() {
            return "XVV";
        }

        @Override // X.InterfaceC800110Va5
        public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
            EnumC799980VZs enumC799980VZsTriggerType;
            int i = C585500Mxo.LIZ;
            if (i >= 0 && i < ((Number) C1777306xf.LIZ.getValue()).longValue() && this.LIZ.LL && ((enumC799980VZsTriggerType = interfaceC800080Va2.triggerType()) == EnumC799980VZs.TASK_BACKGROUND || enumC799980VZsTriggerType == EnumC799980VZs.TASK_BOOT_FINISH)) {
                if (Intrinsics.LJFF(interfaceC800080Va2.key(), "DelayedPluginInitTask") && ((Boolean) C312770CNv.LIZ.getValue()).booleanValue()) {
                    return EnumC800210VaF.Normal;
                }
                try {
                    Thread.sleep(((Number) C1777406xg.LIZ.getValue()).longValue());
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return EnumC800210VaF.Normal;
            }
            return EnumC800210VaF.Normal;
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "XVVRejectStrategy";
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
        return (((Number) C1777306xf.LIZ.getValue()).longValue() == -1 || ((Number) C1777406xg.LIZ.getValue()).longValue() == -1) ? false : true;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        C0W70 c0w70 = this.LLILLJJLI;
        c799900VZk.getClass();
        C799900VZk.LIZ(c0w70);
        C01GW c01gw = C0AGY.LIZ;
        if (((Number) c01gw.getValue()).longValue() != -1) {
            C786410Ut5.LJLIIL(((Number) c01gw.getValue()).longValue(), C799570VYd.LIZJ(), new ARunnableS113S0100000_13(this, 186));
        }
    }
}
