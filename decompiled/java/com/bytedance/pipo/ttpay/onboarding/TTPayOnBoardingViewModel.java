package com.bytedance.pipo.ttpay.onboarding;

import X.C0PEM;
import X.C1717120umk;
import X.C23250099c;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingViewModel;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnBoardingViewModel extends BaseWalletLandingViewModel {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2(java.lang.String r7, java.lang.String r8) throws org.json.JSONException {
        /*
            r6 = this;
            X.0ulp r0 = X.C1716550ulp.LIZ
            r0.getClass()
            X.0umg r4 = X.C1716550ulp.LJFF(r7)
            com.google.gson.n r3 = new com.google.gson.n
            r3.<init>()
            X.0uoL r0 = X.C1718110uoL.LIZ
            r0.getClass()
            org.json.JSONObject r5 = X.C1718110uoL.LIZJ(r7)
            r2 = 0
            if (r5 == 0) goto L50
            java.lang.String r0 = "credit_account_register_source"
            r5.put(r0, r8)
            java.lang.String r0 = "register_entrance"
            r5.put(r0, r8)
            if (r4 == 0) goto L9c
            java.lang.String r1 = r4.LJIJ
        L28:
            java.lang.String r0 = "pipo_product_code"
            r5.put(r0, r1)
            if (r4 == 0) goto L9a
            java.lang.String r1 = r4.LJIJ
        L31:
            java.lang.String r0 = "product_code"
            r5.put(r0, r1)
            X.0uus r0 = X.C1717770unn.LIZJ()
            android.content.Context r0 = r0.getApplicationContext()
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r0)
            if (r0 == 0) goto L98
            r1 = 1
        L45:
            java.lang.String r0 = "support_nfc"
            r5.put(r0, r1)
            java.lang.String r1 = X.C786410Ut5.J3(r5)
            if (r1 != 0) goto L52
        L50:
            java.lang.String r1 = ""
        L52:
            java.lang.String r0 = "risk_info"
            r3.LJJIIJ(r0, r1)
            X.0uv9 r0 = X.C1717770unn.LJIIIIZZ()
            java.lang.String r1 = r0.getCurrentRegionCode()
            java.lang.String r0 = "country_code"
            r3.LJJIIJ(r0, r1)
            if (r4 == 0) goto L96
            java.lang.String r1 = r4.LJIIIZ
        L68:
            java.lang.String r0 = "template_code"
            r3.LJJIIJ(r0, r1)
            if (r4 == 0) goto L71
            java.lang.String r2 = r4.LJIIIIZZ
        L71:
            java.lang.String r0 = "biz_entrance"
            r3.LJJIIJ(r0, r2)
            if (r4 == 0) goto L91
            java.lang.String r2 = r4.LJIJJ
            if (r2 == 0) goto L91
            int r0 = r2.length()
            if (r0 == 0) goto L91
            com.google.gson.n r1 = new com.google.gson.n
            r1.<init>()
            java.lang.String r0 = "schema_extra_param"
            r1.LJJIIJ(r0, r2)
            java.lang.String r0 = "extra_decision_param"
            r3.LJJIFFI(r0, r1)
        L91:
            java.lang.String r0 = r3.toString()
            return r0
        L96:
            r1 = r2
            goto L68
        L98:
            r1 = 0
            goto L45
        L9a:
            r1 = r2
            goto L31
        L9c:
            r1 = r2
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingViewModel.vQ2(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void xQ2(String str, String str2, String str3, PopOutInfo popOutInfo) {
        setState(AFwS268S0000000_26.get$arr$(45));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1717120umk(popOutInfo, str, str2, str3, this, null), 2);
    }
}
