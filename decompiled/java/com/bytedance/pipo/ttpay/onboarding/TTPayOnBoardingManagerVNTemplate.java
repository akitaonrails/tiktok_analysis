package com.bytedance.pipo.ttpay.onboarding;

import X.C123100dR;
import X.C1440005kM;
import X.C1716550ulp;
import X.C1716570ulr;
import X.C1717080umg;
import X.C19EG;
import X.C585330MxX;
import X.EnumC1717170ump;
import X.InterfaceC1717200ums;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnBoardingManagerVNTemplate extends TTPayOnBoardingManagerCommon {
    @Override // com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerCommon, com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        String str;
        super.LJIIJ(interfaceC1717200ums, obj);
        if (interfaceC1717200ums instanceof C1716570ulr) {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
            C1440005kM.LIZ(new C585330MxX());
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                LJIJJ(EnumC1717170ump.REFRESH);
            }
            if (c1717080umgLJFF != null && (str = c1717080umgLJFF.LJIILL) != null && C123100dR.LIZ(str)) {
                SmartRouter.buildRoute(this.LLJJI, str).open();
            }
        }
    }

    public TTPayOnBoardingManagerVNTemplate(C19EG c19eg, String str, String str2, WalletFlowDecision walletFlowDecision, String str3) {
        super(c19eg, str, str2, walletFlowDecision, str3 == null ? "" : str3);
    }
}
