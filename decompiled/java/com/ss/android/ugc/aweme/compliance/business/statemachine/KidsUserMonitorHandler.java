package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C08Q1;
import X.C0X4N;
import X.C0XE2;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C842860X4q;
import X.EnumC590010NCd;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsUserMonitorHandler implements UserStateHandler {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "pns_kid_user_monitor_handler";
    }

    public final void LJII() {
        if (C08Q1.LIZJ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "onUserUpdated");
        C20684815ws.LJIILLIIL("state_machine_kid_log_in", c2344009Gk.LIZ);
        C0X4N.LIZ.getClass();
        C0X4N.LIZJ("relaunch_task_login");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC590010NCd LIZ() {
        return EnumC590010NCd.PNS_USER_TYPE_KIDS;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final C0XE2 priority() {
        return C0XE2.FIRST_STEP;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "onUserRemoved");
        C20684815ws.LJIILLIIL("state_machine_kid_log_out", c2344009Gk.LIZ);
        C0X4N.LIZ.getClass();
        C842860X4q.LIZ.getClass();
        C842860X4q.LIZ("state_machine_logout");
        C0X4N.LIZLLL("state_machine_logout", false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        LJII();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "user", user);
        ((IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)).LJIIIIZZ("UserUpdate", bundle, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enterFrom", "onUserAdded");
        C20684815ws.LJIILLIIL("state_machine_kid_log_in", c2344009Gk.LIZ);
        C0X4N.LIZ.getClass();
        C0X4N.LIZJ("state_machine_login");
    }
}
