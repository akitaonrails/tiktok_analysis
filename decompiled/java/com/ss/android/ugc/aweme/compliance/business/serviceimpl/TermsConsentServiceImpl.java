package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C102U;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;

/* JADX INFO: loaded from: classes29.dex */
public final class TermsConsentServiceImpl implements ITermsConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final TermsConsentInfo LIZ() {
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        if (complianceSettingLIZ != null) {
            return complianceSettingLIZ.getTermsConsentInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final TermsConsentInfo LIZIZ() {
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        if (complianceSettingLIZ != null) {
            return complianceSettingLIZ.getTermConsentInfoNewUsers();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final boolean LIZJ() {
        ComplianceSetting complianceSettingLIZ;
        C102U.LIZ.getClass();
        Boolean addTermsConsentForRegister = C102U.LJI;
        if (addTermsConsentForRegister == null && ((complianceSettingLIZ = C102U.LIZJ.LIZ()) == null || (addTermsConsentForRegister = complianceSettingLIZ.getAddTermsConsentForRegister()) == null)) {
            return false;
        }
        return addTermsConsentForRegister.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final void LIZLLL(boolean z) {
        C102U.LIZ.getClass();
        C102U.LJI = Boolean.valueOf(z);
    }
}
