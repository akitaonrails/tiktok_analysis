package com.ss.android.ugc.aweme.app.application.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C10EU;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CheckUpdateChangeDeviceIDTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CheckUpdateChangeDeviceIDTask";
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
        return ColdBootTasksDegradeExperiment.LIZ().checkUpdateChangeDeviceIDTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!ComplianceServiceProvider.LJII().LJII()) {
            if (C10EU.LJIIIIZZ()) {
                ComplianceServiceProvider.LJII().LJI(true);
            }
            ComplianceServiceProvider.LJII().LJIL();
            ComplianceServiceProvider.LJII().LJIIL(context);
            return;
        }
        ComplianceServiceProvider.LJII().LJIIL(context);
    }
}
