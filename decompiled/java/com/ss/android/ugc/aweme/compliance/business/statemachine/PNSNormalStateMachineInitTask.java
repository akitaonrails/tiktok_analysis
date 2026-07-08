package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C093Y;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSNormalStateMachineInitTask implements C0CCZ, InterfaceC799590VYf {
    public final HashSet<String> LL = C093Y.LIZJ("pns_kid_user_monitor_handler", "gatekeeper_user_state_handler", "consent_framework_user_state_handler", "geoblocking_user_state_handler", "policy_framework_monitor_handler", "sleep_hour_user_state_handler");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PNSNormalStateMachineInitTask";
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
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            Set<UserStateHandler> services = ServiceManager.get().getServices(UserStateHandler.class);
            if (services != null) {
                for (UserStateHandler userStateHandler : services) {
                    if (this.LL.contains(userStateHandler.key())) {
                        PNSUserStateManager.LIZIZ().LIZ(userStateHandler);
                    }
                }
                PNSUserStateManager.LIZIZ().initService();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
