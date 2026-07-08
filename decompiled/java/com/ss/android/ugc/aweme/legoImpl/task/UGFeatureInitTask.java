package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1604060rqO;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1604050rqN;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.IPopupMonitorApiService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import com.tiktok.kmp.active.manager.IKMPActiveDaysService;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UGFeatureInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UGFeatureInitTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().uGFeatureInitTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!((ITpcConsentService) ServiceManager.get().getService(ITpcConsentService.class)).LIZJ()) {
            ComplianceServiceProvider.LJIJI().LJFF(context);
        }
        ((INewUserModeService) ServiceManager.get().getService(INewUserModeService.class)).LIZJ();
        IKMPActiveDaysService iKMPActiveDaysService = (IKMPActiveDaysService) PluggableExtentionKt.pluggableSpi$default(IKMPActiveDaysService.class, false, false, false, 14, null);
        if (iKMPActiveDaysService != null) {
            iKMPActiveDaysService.LIZ("app_launch");
        }
        ((IPopupMonitorApiService) ServiceManager.get().getService(IPopupMonitorApiService.class)).LIZJ().LJIIZILJ();
        C1604060rqO.LIZ.getClass();
        InterfaceC1604050rqN interfaceC1604050rqN = C1604060rqO.LIZIZ;
        if (interfaceC1604050rqN != null) {
            interfaceC1604050rqN.LIZ();
        }
    }
}
