package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CG6;
import X.C0VU1;
import X.C0VZ0;
import X.C830390Whp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC586170Myt;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ScopedIdInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ScopedIdInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
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
        return ((Boolean) C0CG6.LJIIJ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C830390Whp.LIZ.getClass();
        C830390Whp.LIZIZ();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0Who
                @Override // X.InterfaceC586170Myt
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    if (z) {
                        if (i != 1 && i != 2) {
                            return;
                        }
                        C830390Whp.LIZ.getClass();
                        C830390Whp.LIZIZ();
                    }
                }
            });
        }
    }
}
