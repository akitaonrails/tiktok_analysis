package com.ss.android.ugc.aweme.biz.wallet.biz.landing.base;

import X.C01GW;
import X.C0PEM;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1717090umh;
import X.C1717130uml;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public class BaseWalletLandingViewModel extends AssemViewModel<C1717130uml> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(36));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1717130uml(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String vQ2(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.gson.n r2 = new com.google.gson.n
            r2.<init>()
            X.0uoL r0 = X.C1718110uoL.LIZ
            r0.getClass()
            org.json.JSONObject r1 = X.C1718110uoL.LIZJ(r4)
            if (r1 == 0) goto L20
            java.lang.String r0 = "credit_account_register_source"
            r1.put(r0, r5)
            java.lang.String r0 = "register_entrance"
            r1.put(r0, r5)
            java.lang.String r1 = X.C786410Ut5.J3(r1)
            if (r1 != 0) goto L22
        L20:
            java.lang.String r1 = ""
        L22:
            java.lang.String r0 = "risk_info"
            r2.LJJIIJ(r0, r1)
            X.0uv9 r0 = X.C1717770unn.LJIIIIZZ()
            java.lang.String r1 = r0.getCurrentRegionCode()
            java.lang.String r0 = "country_code"
            r2.LJJIIJ(r0, r1)
            X.0uus r0 = X.C1717770unn.LIZJ()
            java.lang.String r1 = r0.getAppName()
            java.lang.String r0 = "app_name"
            r2.LJJIIJ(r0, r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingViewModel.vQ2(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void wQ2(String str, String str2, boolean z) {
        C1716550ulp.LIZ.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
        if (c1717080umgLJFF == null) {
            setState(AFwS268S0000000_26.get$arr$(99));
        } else {
            setState(AFwS268S0000000_26.get$arr$(100));
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1717090umh(this, str, str2, z, c1717080umgLJFF, null), 2);
        }
    }
}
