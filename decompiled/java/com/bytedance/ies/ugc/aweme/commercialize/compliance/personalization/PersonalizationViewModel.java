package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C01GW;
import X.C0TOM;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PersonalizationViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(155));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(156));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(157));

    public final IComplianceSettingsService vQ2() {
        return (IComplianceSettingsService) this.LL.getValue();
    }

    public final MutableLiveData<Integer> wQ2() {
        return (MutableLiveData) this.LLILLJJLI.getValue();
    }

    public final void xQ2(int i) {
        AdFreeSubscription adFreeSubscription;
        ComplianceSetting complianceSetting;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        AdPersonalitySettings adPersonalitySettingsCopy = null;
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
            if (adFreeSubscription != null) {
                adFreeSubscription.setSubscriptionStatus(Integer.valueOf(i));
            }
        } else {
            adFreeSubscription = null;
        }
        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ2 != null) {
            adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ2.copy(adPersonalitySettingsLIZIZ2.mode, adPersonalitySettingsLIZIZ2.needPopUp, adPersonalitySettingsLIZIZ2.isFollowSystemConfig, adPersonalitySettingsLIZIZ2.description, adPersonalitySettingsLIZIZ2.title, adPersonalitySettingsLIZIZ2.copyWriting, adPersonalitySettingsLIZIZ2.isShowSettings, adPersonalitySettingsLIZIZ2.showInterestLabel, adPersonalitySettingsLIZIZ2.showInterestItemType, adPersonalitySettingsLIZIZ2.lat, adPersonalitySettingsLIZIZ2.promptStyle, adPersonalitySettingsLIZIZ2.isNpUser, adPersonalitySettingsLIZIZ2.unifiedMode, adPersonalitySettingsLIZIZ2.isTeenagerMode, adPersonalitySettingsLIZIZ2.isNewUser, adPersonalitySettingsLIZIZ2.PARevisingSwitch, adPersonalitySettingsLIZIZ2.unifiedModeTextData, adPersonalitySettingsLIZIZ2.isShowResetEntry, adPersonalitySettingsLIZIZ2.reset, adPersonalitySettingsLIZIZ2.isUseBalancePrompt, adPersonalitySettingsLIZIZ2.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ2.popUpStyle, adPersonalitySettingsLIZIZ2.contentType, adPersonalitySettingsLIZIZ2.abCopyWriting, adFreeSubscription, adPersonalitySettingsLIZIZ2.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ2.enableToggleDecoupling, adPersonalitySettingsLIZIZ2.hitDisconnectAdvExperiment);
        }
        IComplianceSettingsService iComplianceSettingsServiceVQ2 = vQ2();
        ComplianceSetting complianceSettingLJIILLIIL = vQ2().LJIILLIIL();
        if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
            complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
        }
        iComplianceSettingsServiceVQ2.LJJIIJ(complianceSetting);
    }
}
