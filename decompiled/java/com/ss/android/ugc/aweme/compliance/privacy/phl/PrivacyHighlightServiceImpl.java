package com.ss.android.ugc.aweme.compliance.privacy.phl;

import X.C0HFA;
import X.C446510Hf7;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyHighlightServiceImpl implements IPrivacyHighlightService {
    @Override // com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService
    public final Fragment LIZJ() {
        String str = PhlFragment._pnsPageId;
        return C0HFA.LIZ("new_user_journey");
    }

    @Override // com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService
    public final Fragment LJ() {
        String str = PhlFragment._pnsPageId;
        return C0HFA.LIZ("account_privacy_page");
    }

    @Override // com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService
    public final int LIZ() {
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getPrivacyHighlightsType();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService
    public final String LIZLLL() {
        String privacyHighlightsForTeensLink;
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (privacyHighlightsForTeensLink = complianceSettingLJIILLIIL.getPrivacyHighlightsForTeensLink()) == null) ? "" : privacyHighlightsForTeensLink;
    }

    @Override // com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService
    public final ViewModelProvider.Factory LIZIZ() {
        return C446510Hf7.LIZ;
    }
}
