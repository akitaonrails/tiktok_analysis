package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BIO;
import X.C0CCZ;
import X.C0DOS;
import X.C0VZ0;
import X.C1847840yBa;
import X.C1847920yBi;
import X.C1848410yCV;
import X.C307260C2q;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS104S0100000_4;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class NxETInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NxETInitTask";
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
        C1847840yBa c1847840yBa = C1847840yBa.LIZ;
        Application application = C307260C2q.LIZ.getApplication();
        c1847840yBa.getClass();
        if (((Boolean) C0BIO.LIZIZ.invoke()).booleanValue()) {
            C0DOS.LIZ.getClass();
            if (!C1848410yCV.LIZ) {
                application.registerActivityLifecycleCallbacks(C1847920yBi.LL);
                C1848410yCV.LIZ = true;
            }
            C823050WQl.LIZIZ().submit(new ARunnableS104S0100000_4(application, 115));
        }
    }
}
