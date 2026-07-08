package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C01GW;
import X.C0XE2;
import X.C0XUA;
import X.C0XUB;
import X.C13LE;
import X.C452501pT;
import X.EnumC19283910cP;
import X.EnumC590010NCd;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;

/* JADX INFO: loaded from: classes14.dex */
public final class ConsentFrameworkUserStateMachineHandler implements UserStateHandler {
    public final C01GW LIZ;
    public final C01GW LIZIZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "consent_framework_user_state_handler";
    }

    public ConsentFrameworkUserStateMachineHandler() {
        C13LE.LIZ(ConsentFrameworkUserStateMachineHandler.class).LJI();
        this.LIZ = C452501pT.LIZIZ(new C0XUB());
        this.LIZIZ = C452501pT.LIZIZ(new C0XUA());
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC590010NCd LIZ() {
        return EnumC590010NCd.PNS_USER_TYPE_NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final C0XE2 priority() {
        return C0XE2.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LJFF("onUserRemoved", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LJFF("onUserActivated", true);
        }
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LIZIZ.getValue();
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJII(EnumC19283910cP.SWITCH_ACCOUNT_ACTIVATE);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJIIIIZZ("onUserAdded");
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LIZIZ.getValue();
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJII(EnumC19283910cP.LOGIN_ACCOUNT);
        }
    }
}
