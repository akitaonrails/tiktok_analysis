package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1BVK;
import X.C1BVL;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public class InitTaskManager implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitTaskManager";
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
        C1BVL c1bvl = new C1BVL();
        ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
        if (executorServiceLIZLLL == null) {
            executorServiceLIZLLL = C786410Ut5.d4(4);
        }
        c1bvl.LIZ = executorServiceLIZLLL;
        C1BVK c1bvkLIZIZ = C1BVK.LIZIZ();
        c1bvkLIZIZ.getClass();
        c1bvkLIZIZ.LIZIZ = c1bvl.LIZ;
        c1bvkLIZIZ.LIZ = true;
    }
}
