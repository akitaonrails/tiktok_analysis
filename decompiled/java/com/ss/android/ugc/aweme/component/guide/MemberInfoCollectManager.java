package com.ss.android.ugc.aweme.component.guide;

import X.C1548870qPN;
import X.C1716030ukz;
import X.C1716450ulf;
import X.C1716550ulp;
import X.C2188811AlT;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import com.ss.android.ugc.aweme.biz.wallet.network.model.Step;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MemberInfoCollectManager extends BaseRegisterManager {
    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final boolean LJIILL(Step step, List<Step> list) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final Function0<String> LIZLLL() {
        C1716550ulp c1716550ulp = C1716550ulp.LIZ;
        String str = this.LL;
        c1716550ulp.getClass();
        return new AwS427S0200000_26(this, C1716550ulp.LJFF(str), 11);
    }

    public static void LJIJ(boolean z) {
        new C1548870qPN().LJ("close_info_collect_guide", "{}");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEventCloseGuidePage_");
        sbLIZ.append(C1716450ulf.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(C1716450ulf.LIZ());
        C1716030ukz.LIZJ(C2188811AlT.LIZIZ(sbLIZ), false);
        if (C1716450ulf.LIZIZ()) {
            C1716030ukz.LIZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIIZ(InterfaceC1717160umo interfaceC1717160umo) {
        LJIILJJIL();
        C1716030ukz.LIZ = true;
        interfaceC1717160umo.LJ();
        C1716030ukz.LIZJ("on_all_steps_execute_finish", false);
        LJIJ(true);
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
        boolean z;
        if (Intrinsics.LJFF(interfaceC1717200ums.LJI(), "COLLECT_INFO_PAGE") && Intrinsics.LJFF(obj, "collect_info_page_user_skip")) {
            C1716030ukz.LIZ = false;
            InterfaceC1717160umo interfaceC1717160umoLIZ = interfaceC1717200ums.LIZ();
            if (interfaceC1717160umoLIZ != null) {
                interfaceC1717160umoLIZ.LJ();
            }
            LJIJ(false);
            return;
        }
        if (!Intrinsics.LJFF(obj, "create_bio_risk_blocked") && !Intrinsics.LJFF(obj, "create_bio_auth_limit_reached") && !Intrinsics.LJFF(obj, "create_bio_unavailable")) {
            z = false;
        } else {
            z = true;
        }
        if (Intrinsics.LJFF(interfaceC1717200ums.LJI(), "CREATE_BIO") && z) {
            C1716030ukz.LIZ = false;
            InterfaceC1717160umo interfaceC1717160umoLIZ2 = interfaceC1717200ums.LIZ();
            if (interfaceC1717160umoLIZ2 != null) {
                interfaceC1717160umoLIZ2.LJ();
            }
            LJIJ(false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MemberInfoCollectManager(WalletFlowDecision walletFlowDecision, String str, String str2, String str3) {
        String str4 = str3;
        super(str, str4 == null ? "" : str4, walletFlowDecision, "info_collect", str2 != null ? str2 : "", null, null, 96);
    }
}
