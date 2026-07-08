package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C20508081q;
import X.C786410Ut5;
import X.C799900VZk;
import X.C800150Va9;
import X.C800290VaN;
import X.C823050WQl;
import X.ChoreographerFrameCallbackC854650Xfr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC800110Va5;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ColdBootRejectStrategyV2 implements C0CCZ {
    public static final /* synthetic */ int LLILLL = 0;
    public C800150Va9 LL;
    public final C800290VaN LLILLJJLI = new InterfaceC800110Va5() { // from class: X.0VaN
        @Override // X.InterfaceC800110Va5
        public final String scene() {
            return "Main";
        }

        @Override // X.InterfaceC800110Va5
        public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
            if (interfaceC800080Va2.triggerType() == EnumC799980VZs.TASK_BACKGROUND && !Looper.getMainLooper().isCurrentThread()) {
                long jLongValue = ((Number) C0CD2.LJJJJZI.getValue()).longValue();
                if (jLongValue != 50 && jLongValue > 0) {
                    try {
                        Thread.sleep(jLongValue);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return EnumC800210VaF.Normal;
                }
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
        return "ColdBootRejectStrategyV2";
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

    public final void LIZ() {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        getClass();
        c799900VZk.getClass();
        C799900VZk.LJI("Main");
        if (this.LL != null) {
            C823050WQl.LIZIZ().execute(new ARunnableS113S0100000_13(this, 184));
        }
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Number) C0CD2.LJJJJZ.getValue()).intValue() != -1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iIntValue = ((Number) C0CD2.LJJJJZ.getValue()).intValue();
        if (iIntValue == 1) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            C800290VaN c800290VaN = this.LLILLJJLI;
            c799900VZk.getClass();
            this.LL = C799900VZk.LIZ(c800290VaN);
            C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC854650Xfr(this, 0));
        }
        if (iIntValue == 2) {
            C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC854650Xfr(this, 1));
            if (((Number) C0CD2.LJJLIL.getValue()).intValue() != -1) {
                C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS113S0100000_13(this, 182));
            } else {
                C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS113S0100000_13(this, 183));
            }
        }
        if (iIntValue == 3) {
            C799900VZk c799900VZk2 = C799900VZk.LIZ;
            C800290VaN c800290VaN2 = this.LLILLJJLI;
            c799900VZk2.getClass();
            this.LL = C799900VZk.LIZ(c800290VaN2);
            C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS113S0100000_13(this, 183));
        }
    }
}
