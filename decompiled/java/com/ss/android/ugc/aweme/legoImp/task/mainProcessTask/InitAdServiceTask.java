package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import X.C0CCZ;
import X.C0VZ0;
import X.C104100aN;
import X.C1602860roS;
import X.C1BWL;
import X.C303960Bvm;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class InitAdServiceTask implements C0CCZ {
    public static final InitAdServiceTask LL = new InitAdServiceTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAdServiceTask";
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
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ() ? !C104100aN.LIZ().isNewUser() : !((Boolean) C303960Bvm.LIZJ.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ() && C104100aN.LIZ().isNewUser()) {
            return;
        }
        ((IInitAllService) ServiceManager.get().getService(IInitAllService.class)).LJIIIIZZ(C1BWL.LIZ());
    }
}
