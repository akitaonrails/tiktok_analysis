package com.bytedance.pipo.ttpay.onboarding;

import X.C123100dR;
import X.C1440005kM;
import X.C1716550ulp;
import X.C1716570ulr;
import X.C1717080umg;
import X.C585330MxX;
import X.EnumC1717170ump;
import X.InterfaceC1717200ums;
import com.bytedance.router.SmartRouter;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnBoardingManagerIDV2 extends TTPayOnBoardingManagerCommon {
    @Override // com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerCommon, com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) throws JSONException {
        if (interfaceC1717200ums instanceof C1716570ulr) {
            LJIJJ(EnumC1717170ump.CLOSE);
            C1440005kM.LIZ(new C585330MxX());
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
            if (c1717080umgLJFF != null) {
                String str2 = c1717080umgLJFF.LJIIJ;
                if (str2 != null && C123100dR.LIZ(str2)) {
                    SmartRouter.buildRoute(this.LLJJI, str2).open();
                }
                String str3 = c1717080umgLJFF.LJIIJJI;
                if (str3 != null && C123100dR.LIZ(str3)) {
                    SmartRouter.buildRoute(this.LLJJI, str3).open();
                }
            }
        }
    }
}
