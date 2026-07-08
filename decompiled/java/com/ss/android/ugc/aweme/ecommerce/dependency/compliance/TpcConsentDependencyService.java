package com.ss.android.ugc.aweme.ecommerce.dependency.compliance;

import X.C04TD;
import X.C1915940zxQ;
import X.C1954807lC;
import X.EnumC1914030zuL;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService;

/* JADX INFO: loaded from: classes29.dex */
public final class TpcConsentDependencyService implements ITpcConsentDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService
    public EnumC1914030zuL getRegion() {
        int i = C1915940zxQ.LIZ[ComplianceServiceProvider.LJIILJJIL().LJIIL().ordinal()];
        if (i == 1) {
            return EnumC1914030zuL.US;
        }
        if (i == 2) {
            return EnumC1914030zuL.EU;
        }
        if (i == 3) {
            return EnumC1914030zuL.KR;
        }
        if (i == 4) {
            return EnumC1914030zuL.ROW;
        }
        if (i == 5) {
            return EnumC1914030zuL.UNKNOWN;
        }
        throw new C1954807lC();
    }

    public static ITpcConsentDependencyService createITpcConsentDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ITpcConsentDependencyService.class, z);
        if (objLIZ != null) {
            return (ITpcConsentDependencyService) objLIZ;
        }
        if (C04TD.h == null) {
            synchronized (ITpcConsentDependencyService.class) {
                if (C04TD.h == null) {
                    C04TD.h = new TpcConsentDependencyService();
                }
            }
        }
        return C04TD.h;
    }
}
