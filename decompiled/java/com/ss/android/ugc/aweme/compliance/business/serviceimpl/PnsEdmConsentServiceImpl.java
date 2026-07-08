package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C1238720iL8;
import X.C1886650zCB;
import X.C1887120zCw;
import X.C1905870zhB;
import X.C1954807lC;
import X.EnumC1238710iL7;
import X.InterfaceC1364105Vn;
import X.InterfaceC251700yB;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse;
import com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService;

/* JADX INFO: loaded from: classes29.dex */
public final class PnsEdmConsentServiceImpl implements IPnsEdmConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final String LIZ(String str) {
        return C1905870zhB.LIZ(str).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final void LIZIZ(EnumC1238710iL7 enumC1238710iL7) {
        int i = C1238720iL8.LIZ[enumC1238710iL7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return;
            } else {
                C1886650zCB.LIZ.getClass();
                C1886650zCB.LIZIZ();
                return;
            }
        }
        ComplianceServiceProvider.LJIJJ().LJIJI(null, "email_consent", null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final boolean LIZLLL(String str) {
        return C1905870zhB.LIZ(str).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final void LJ(String str) {
        Keva keva = C1887120zCw.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva2 = C1887120zCw.LIZ;
        keva2.storeLong("email_consent_show_time", jCurrentTimeMillis);
        keva2.storeLong(str, System.currentTimeMillis());
        keva2.storeInt("email_consent_show_times", keva2.getInt("email_consent_show_times", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final void LIZJ(String str, InterfaceC251700yB interfaceC251700yB) {
        boolean zLIZLLL = LIZLLL(str);
        interfaceC251700yB.LIZ(zLIZLLL);
        if (zLIZLLL) {
            C1905870zhB.LIZ(str).LIZ(interfaceC251700yB);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService
    public final Object getEmailConsentAgreementInfo(String str, String str2, InterfaceC1364105Vn<? super EdmConsentAgreementResponse> interfaceC1364105Vn) {
        return C1886650zCB.LIZ.LIZ(str, str2, interfaceC1364105Vn);
    }
}
