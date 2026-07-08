package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1BYP;
import X.C2427009fA;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2427109fB;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class InitStorageManagerTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(new C1BYP());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitStorageManagerTask";
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
        C2427009fA.LIZ = new InterfaceC2427109fB() { // from class: X.1BYQ
            @Override // X.InterfaceC2427109fB
            public final C2427209fC get() {
                return (C2427209fC) this.LIZ.LL.getValue();
            }
        };
    }
}
