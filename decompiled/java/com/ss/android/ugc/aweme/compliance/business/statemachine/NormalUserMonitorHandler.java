package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C08Q1;
import X.C0X4N;
import X.C0XE2;
import X.C20684815ws;
import X.C2344009Gk;
import X.C842860X4q;
import X.EnumC590010NCd;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public final class NormalUserMonitorHandler implements UserStateHandler {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "pns_user_monitor_handler";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC590010NCd LIZ() {
        return EnumC590010NCd.PNS_USER_TYPE_NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final C0XE2 priority() {
        return C0XE2.FIRST_STEP;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        if (C08Q1.LIZJ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enterFrom", "onUserUpdated");
            C20684815ws.LJIILLIIL("state_machine_kid_log_out", c2344009Gk.LIZ);
            C0X4N.LIZ.getClass();
            C842860X4q.LIZ.getClass();
            C842860X4q.LIZ("relaunch_task_logout");
            C0X4N.LIZLLL("relaunch_task_logout", false);
        }
    }
}
