package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C093Y;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSKidStateMachineInitTask implements C0CCZ {
    public final HashSet<String> LL = C093Y.LIZJ("pns_kid_user_monitor_handler", "pns_user_monitor_handler");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PNSKidStateMachineInitTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        for (UserStateHandler userStateHandler : ServiceManager.get().getServices(UserStateHandler.class)) {
            if (this.LL.contains(userStateHandler.key())) {
                PNSUserStateManager.LIZIZ().LIZ(userStateHandler);
            }
        }
        PNSUserStateManager.LIZIZ().initService();
    }
}
