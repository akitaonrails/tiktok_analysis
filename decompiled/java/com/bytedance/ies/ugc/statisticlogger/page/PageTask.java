package com.bytedance.ies.ugc.statisticlogger.page;

import X.C0CCZ;
import X.C0QFK;
import X.C0QFM;
import X.C0QFN;
import X.C0VZ0;
import X.C2207101BZs;
import X.C2211621BhA;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2211721BhK;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class PageTask implements C0CCZ {
    public static final PageTask LL = new PageTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PageTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0QFM c0qfm = C0QFM.LIZ;
        c0qfm.getClass();
        final C2207101BZs c2207101BZs = new C2207101BZs();
        final C0QFN c0qfn = new C0QFN(c0qfm);
        C2211621BhA.LIZ.getClass();
        ((CopyOnWriteArrayList) C2211621BhA.LJIIIZ.getValue()).add(new InterfaceC2211721BhK() { // from class: X.1BZr
            @Override // X.InterfaceC2211721BhK
            public final void LIZ(C0QFT c0qft) {
            }

            @Override // X.InterfaceC2211721BhK
            public final void LIZLLL(C0QFT c0qft) {
            }

            @Override // X.InterfaceC2211721BhK
            public final void LIZIZ(C0QFT c0qft) {
                c0qfn.invoke(c0qft);
            }

            @Override // X.InterfaceC2211721BhK
            public final void LIZJ(C0QFT c0qft) {
                c2207101BZs.invoke(c0qft);
            }
        });
        ((CopyOnWriteArrayList) C2211621BhA.LJIIJ.getValue()).add(new C0QFK());
    }
}
