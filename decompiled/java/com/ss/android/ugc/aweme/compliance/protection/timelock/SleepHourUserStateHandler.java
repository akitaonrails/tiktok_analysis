package com.ss.android.ugc.aweme.compliance.protection.timelock;

import X.C0XE2;
import X.C1440005kM;
import X.C1571830r0P;
import X.C15YW;
import X.C15YX;
import X.C20536115Xj;
import X.C20544915aJ;
import X.C294510BgX;
import X.EnumC20538815Yk;
import X.EnumC590010NCd;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;

/* JADX INFO: loaded from: classes32.dex */
public final class SleepHourUserStateHandler implements UserStateHandler {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "sleep_hour_user_state_handler";
    }

    public static void LJII() {
        C15YW.LIZ.getClass();
        C15YW.LJIIIZ = null;
        EnumC20538815Yk enumC20538815Yk = EnumC20538815Yk.DISMISS;
        C15YW.LIZLLL = enumC20538815Yk;
        C15YW.LJ = "";
        C15YW.LJFF = "";
        C15YW.LJI = 0L;
        C15YW.LJII = false;
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJIIIIZZ(false);
        }
        C15YW.LJIIIIZZ = false;
        C1440005kM.LIZ(new C1571830r0P(enumC20538815Yk, "dismiss_by_user_change"));
        if (C294510BgX.LIZ()) {
            C20544915aJ.LIZ.getClass();
            C20544915aJ.LIZLLL(null);
        }
        C20536115Xj.LIZ.getClass();
        C20536115Xj.LIZJ = null;
        C20536115Xj.LJII = null;
        C15YX.LIZ.getClass();
        C15YX.LIZJ = null;
        C15YX.LIZLLL = -1L;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC590010NCd LIZ() {
        return EnumC590010NCd.PNS_USER_TYPE_NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final C0XE2 priority() {
        return C0XE2.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        LJII();
    }
}
