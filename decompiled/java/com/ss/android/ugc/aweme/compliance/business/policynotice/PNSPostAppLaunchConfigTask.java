package com.ss.android.ugc.aweme.compliance.business.policynotice;

import X.C0CCZ;
import X.C0VZ0;
import X.C0XQ7;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PNSPostAppLaunchConfigTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PNSPostAppLaunchConfigTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ComplianceServiceProvider.LJIJI().LJ();
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null) {
            iGatekeeperService.LJIIL("hotlaunch");
        }
        if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "normal_app_launch");
            C20684815ws.LJIILLIIL("app_launch_km_monitor_online", c2344009Gk.LIZ);
        }
    }
}
