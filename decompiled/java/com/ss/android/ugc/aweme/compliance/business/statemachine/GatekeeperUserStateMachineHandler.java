package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C64;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0XE2;
import X.C0XQ7;
import X.C1110504Vz;
import X.C14EU;
import X.C1518590pcX;
import X.C1518640pcc;
import X.C1518650pcd;
import X.C1915580zwq;
import X.C1915620zwu;
import X.C312240CLu;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1518670pcf;
import X.EnumC590010NCd;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class GatekeeperUserStateMachineHandler implements UserStateHandler {
    public String LIZ;
    public long LIZIZ;
    public final C01GW LIZJ;
    public User LIZLLL;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "gatekeeper_user_state_handler";
    }

    public GatekeeperUserStateMachineHandler() {
        C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.FIRST_UI_FRAME, "", new AwS572S0100000_28(this, 148), true));
        this.LIZJ = C452501pT.LIZIZ(new C1915580zwq());
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
        String uid;
        C1518590pcX.LIZ();
        User user2 = this.LIZLLL;
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, user.getUid())) {
            this.LIZLLL = null;
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null) {
            iGatekeeperService.reset();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "user", user);
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null) {
            iGatekeeperService.LJIIIIZZ("UserUpdate", bundle, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
        C1518590pcX.LIZ();
        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
        if (iComplianceDependServiceLIZ != null && iComplianceDependServiceLIZ.LIZ()) {
            return;
        }
        LJII(this, user, false, 4);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        C1518590pcX.LIZ();
        if (Intrinsics.LJFF(Boolean.valueOf(C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "enable_uc_compliance_handler", true, false)), Boolean.TRUE) && ((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
            this.LIZLLL = user;
            LJII(this, user, true, 2);
        } else {
            LJII(this, user, false, 6);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPostRegistrationFinishEvent(C1915620zwu c1915620zwu) {
        User user = this.LIZLLL;
        if (user == null) {
            return;
        }
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser != null && Intrinsics.LJFF(curUser.getUid(), user.getUid())) {
            this.LIZLLL = null;
            IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
            if (iGatekeeperService != null) {
                iGatekeeperService.reset();
                return;
            }
            return;
        }
        this.LIZLLL = null;
    }

    public static void LJII(GatekeeperUserStateMachineHandler gatekeeperUserStateMachineHandler, User user, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        gatekeeperUserStateMachineHandler.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Intrinsics.LJFF(user.getUid(), gatekeeperUserStateMachineHandler.LIZ) && jElapsedRealtime - gatekeeperUserStateMachineHandler.LIZIZ < 4000) {
            return;
        }
        gatekeeperUserStateMachineHandler.LIZ = user.getUid();
        gatekeeperUserStateMachineHandler.LIZIZ = jElapsedRealtime;
        C1518640pcc c1518640pcc = C1518650pcd.LIZIZ;
        if (c1518640pcc != null) {
            synchronized (c1518640pcc) {
                c1518640pcc.LIZIZ = 0;
                ((LinkedHashMap) c1518640pcc.LIZLLL).clear();
            }
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (!z && iGatekeeperService != null) {
            iGatekeeperService.reset();
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "user", user);
        bundle.putBoolean("is_after_login", true);
        if (z2 && iGatekeeperService != null) {
            iGatekeeperService.LJIIIIZZ("UserUpdate", bundle, null);
        }
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) gatekeeperUserStateMachineHandler.LIZJ.getValue();
        if (tTKUserCommunicationService == null) {
            return;
        }
        tTKUserCommunicationService.LJIIJJI(EnumC1518670pcf.SCENE_LOGIN.getValue(), null, null);
    }
}
