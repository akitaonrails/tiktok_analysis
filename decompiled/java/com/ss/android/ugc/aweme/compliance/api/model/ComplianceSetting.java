package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceSetting extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("ad_personality_settings")
    public final AdPersonalitySettings adPersonalitySettings;

    @C09CT("add_terms_consent_for_register")
    public final Boolean addTermsConsentForRegister;

    @C09CT("set_appsflyer_sharing_block")
    public final Boolean afSharingBlock;

    @C09CT("age_gate_info")
    public final AgeGateInfo ageGateInfo;

    @C09CT("age_graduation_scenes")
    public final Map<String, Integer> ageGraduationScenes;

    @C09CT("age_verification_action")
    public final boolean ageVerificationAction;

    @C09CT("settings_black_menu_list")
    public final List<String> blackSetting;

    @C09CT("cmpl_enc")
    public final String complianceEncrypt;

    @C09CT("device_limit_register_expired_time")
    public final Long deviceLimitRegisterExpiredTime;

    @C09CT("enable_impressum")
    public final Integer enableImpressum;

    @C09CT("enable_terms_consent_popup")
    public final Boolean enableTermsConsentPopup;

    @C09CT("force_private_account")
    public final Boolean forcePrivateAccount;

    @C09CT("impressum_url")
    public final String impressumUrl;

    @C09CT("interface_control_settings")
    public final String interfaceControlSettingsString;

    @C09CT("mixed_age_consent_action")
    public final int isMixedAge;

    @C09CT("legal_entity_change_info")
    public final LegalEntityChangeInfo legalEntityChangeInfo;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("notify_parents_with_email")
    public final boolean notifyParentsWithEmail;

    @C09CT("notify_private_account")
    public final Integer notifyPrivateAccount;

    @C09CT("preference_settings")
    public final PreferenceSettings preferenceSettings;

    @C09CT("privacy_highlights_for_teens_link")
    public final String privacyHighlightsForTeensLink;

    @C09CT("privacy_highlights_type")
    public final int privacyHighlightsType;

    @C09CT("about_privacy_policy_url")
    public final String privacyPolicyUrl;

    @C09CT("private_account_prompt")
    public final int privateAccountPrompt;

    @C09CT("private_account_prompt_type")
    public final int privateAccountPromptType;

    @C09CT("auto_replay_count")
    public final int stopAutoPlayTimesThreshold;

    @C09CT("terms_consent_for_register_info_new_users")
    public final TermsConsentInfo termConsentInfoNewUsers;

    @C09CT("terms_consent_for_register_info")
    public final TermsConsentInfo termsConsentInfo;

    public ComplianceSetting() {
        this(null, 0, null, null, null, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
    }

    public final ComplianceSetting copy(List<String> list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String str5, int i, int i2, int i3, int i4, PreferenceSettings preferenceSettings, boolean z, boolean z2, Map<String, Integer> map, int i5) {
        return new ComplianceSetting(list, num, str, str2, adPersonalitySettings, num2, bool, bool2, bool3, termsConsentInfo, termsConsentInfo2, str3, ageGateInfo, logPbBean, legalEntityChangeInfo, bool4, str4, l, str5, i, i2, i3, i4, preferenceSettings, z, z2, map, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplianceSetting)) {
            return false;
        }
        ComplianceSetting complianceSetting = (ComplianceSetting) obj;
        return Intrinsics.LJFF(this.blackSetting, complianceSetting.blackSetting) && Intrinsics.LJFF(this.enableImpressum, complianceSetting.enableImpressum) && Intrinsics.LJFF(this.impressumUrl, complianceSetting.impressumUrl) && Intrinsics.LJFF(this.privacyPolicyUrl, complianceSetting.privacyPolicyUrl) && Intrinsics.LJFF(this.adPersonalitySettings, complianceSetting.adPersonalitySettings) && Intrinsics.LJFF(this.notifyPrivateAccount, complianceSetting.notifyPrivateAccount) && Intrinsics.LJFF(this.forcePrivateAccount, complianceSetting.forcePrivateAccount) && Intrinsics.LJFF(this.addTermsConsentForRegister, complianceSetting.addTermsConsentForRegister) && Intrinsics.LJFF(this.enableTermsConsentPopup, complianceSetting.enableTermsConsentPopup) && Intrinsics.LJFF(this.termsConsentInfo, complianceSetting.termsConsentInfo) && Intrinsics.LJFF(this.termConsentInfoNewUsers, complianceSetting.termConsentInfoNewUsers) && Intrinsics.LJFF(this.complianceEncrypt, complianceSetting.complianceEncrypt) && Intrinsics.LJFF(this.ageGateInfo, complianceSetting.ageGateInfo) && Intrinsics.LJFF(this.logPb, complianceSetting.logPb) && Intrinsics.LJFF(this.legalEntityChangeInfo, complianceSetting.legalEntityChangeInfo) && Intrinsics.LJFF(this.afSharingBlock, complianceSetting.afSharingBlock) && Intrinsics.LJFF(this.interfaceControlSettingsString, complianceSetting.interfaceControlSettingsString) && Intrinsics.LJFF(this.deviceLimitRegisterExpiredTime, complianceSetting.deviceLimitRegisterExpiredTime) && Intrinsics.LJFF(this.privacyHighlightsForTeensLink, complianceSetting.privacyHighlightsForTeensLink) && this.privacyHighlightsType == complianceSetting.privacyHighlightsType && this.privateAccountPrompt == complianceSetting.privateAccountPrompt && this.privateAccountPromptType == complianceSetting.privateAccountPromptType && this.isMixedAge == complianceSetting.isMixedAge && Intrinsics.LJFF(this.preferenceSettings, complianceSetting.preferenceSettings) && this.ageVerificationAction == complianceSetting.ageVerificationAction && this.notifyParentsWithEmail == complianceSetting.notifyParentsWithEmail && Intrinsics.LJFF(this.ageGraduationScenes, complianceSetting.ageGraduationScenes) && this.stopAutoPlayTimesThreshold == complianceSetting.stopAutoPlayTimesThreshold;
    }

    public int hashCode() {
        List<String> list = this.blackSetting;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.enableImpressum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.impressumUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.privacyPolicyUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdPersonalitySettings adPersonalitySettings = this.adPersonalitySettings;
        int iHashCode5 = (iHashCode4 + (adPersonalitySettings == null ? 0 : adPersonalitySettings.hashCode())) * 31;
        Integer num2 = this.notifyPrivateAccount;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.forcePrivateAccount;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.addTermsConsentForRegister;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableTermsConsentPopup;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        TermsConsentInfo termsConsentInfo = this.termsConsentInfo;
        int iHashCode10 = (iHashCode9 + (termsConsentInfo == null ? 0 : termsConsentInfo.hashCode())) * 31;
        TermsConsentInfo termsConsentInfo2 = this.termConsentInfoNewUsers;
        int iHashCode11 = (iHashCode10 + (termsConsentInfo2 == null ? 0 : termsConsentInfo2.hashCode())) * 31;
        String str3 = this.complianceEncrypt;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AgeGateInfo ageGateInfo = this.ageGateInfo;
        int iHashCode13 = (iHashCode12 + (ageGateInfo == null ? 0 : ageGateInfo.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode14 = (iHashCode13 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        LegalEntityChangeInfo legalEntityChangeInfo = this.legalEntityChangeInfo;
        int iHashCode15 = (iHashCode14 + (legalEntityChangeInfo == null ? 0 : legalEntityChangeInfo.hashCode())) * 31;
        Boolean bool4 = this.afSharingBlock;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.interfaceControlSettingsString;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.deviceLimitRegisterExpiredTime;
        int iHashCode18 = (((((((((((iHashCode17 + (l == null ? 0 : l.hashCode())) * 31) + this.privacyHighlightsForTeensLink.hashCode()) * 31) + this.privacyHighlightsType) * 31) + this.privateAccountPrompt) * 31) + this.privateAccountPromptType) * 31) + this.isMixedAge) * 31;
        PreferenceSettings preferenceSettings = this.preferenceSettings;
        return ((((((((iHashCode18 + (preferenceSettings != null ? preferenceSettings.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.ageVerificationAction)) * 31) + C786410Ut5.Z2(this.notifyParentsWithEmail)) * 31) + this.ageGraduationScenes.hashCode()) * 31) + this.stopAutoPlayTimesThreshold;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "ComplianceSetting(blackSetting=" + this.blackSetting + ", enableImpressum=" + this.enableImpressum + ", impressumUrl=" + this.impressumUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", adPersonalitySettings=" + this.adPersonalitySettings + ", notifyPrivateAccount=" + this.notifyPrivateAccount + ", forcePrivateAccount=" + this.forcePrivateAccount + ", addTermsConsentForRegister=" + this.addTermsConsentForRegister + ", enableTermsConsentPopup=" + this.enableTermsConsentPopup + ", termsConsentInfo=" + this.termsConsentInfo + ", termConsentInfoNewUsers=" + this.termConsentInfoNewUsers + ", complianceEncrypt=" + this.complianceEncrypt + ", ageGateInfo=" + this.ageGateInfo + ", logPb=" + this.logPb + ", legalEntityChangeInfo=" + this.legalEntityChangeInfo + ", afSharingBlock=" + this.afSharingBlock + ", interfaceControlSettingsString=" + this.interfaceControlSettingsString + ", deviceLimitRegisterExpiredTime=" + this.deviceLimitRegisterExpiredTime + ", privacyHighlightsForTeensLink=" + this.privacyHighlightsForTeensLink + ", privacyHighlightsType=" + this.privacyHighlightsType + ", privateAccountPrompt=" + this.privateAccountPrompt + ", privateAccountPromptType=" + this.privateAccountPromptType + ", isMixedAge=" + this.isMixedAge + ", preferenceSettings=" + this.preferenceSettings + ", ageVerificationAction=" + this.ageVerificationAction + ", notifyParentsWithEmail=" + this.notifyParentsWithEmail + ", ageGraduationScenes=" + this.ageGraduationScenes + ", stopAutoPlayTimesThreshold=" + this.stopAutoPlayTimesThreshold + ')';
    }

    public final AdPersonalitySettings getAdPersonalitySettings() {
        return this.adPersonalitySettings;
    }

    public final Boolean getAddTermsConsentForRegister() {
        return this.addTermsConsentForRegister;
    }

    public final Boolean getAfSharingBlock() {
        return this.afSharingBlock;
    }

    public final AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public final Map<String, Integer> getAgeGraduationScenes() {
        return this.ageGraduationScenes;
    }

    public final boolean getAgeVerificationAction() {
        return this.ageVerificationAction;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final Long getDeviceLimitRegisterExpiredTime() {
        return this.deviceLimitRegisterExpiredTime;
    }

    public final Integer getEnableImpressum() {
        return this.enableImpressum;
    }

    public final Boolean getEnableTermsConsentPopup() {
        return this.enableTermsConsentPopup;
    }

    public final Boolean getForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public final String getImpressumUrl() {
        return this.impressumUrl;
    }

    public final String getInterfaceControlSettingsString() {
        return this.interfaceControlSettingsString;
    }

    public final LegalEntityChangeInfo getLegalEntityChangeInfo() {
        return this.legalEntityChangeInfo;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final boolean getNotifyParentsWithEmail() {
        return this.notifyParentsWithEmail;
    }

    public final Integer getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public final PreferenceSettings getPreferenceSettings() {
        return this.preferenceSettings;
    }

    public final String getPrivacyHighlightsForTeensLink() {
        return this.privacyHighlightsForTeensLink;
    }

    public final int getPrivacyHighlightsType() {
        return this.privacyHighlightsType;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final int getPrivateAccountPrompt() {
        return this.privateAccountPrompt;
    }

    public final int getPrivateAccountPromptType() {
        return this.privateAccountPromptType;
    }

    public final int getStopAutoPlayTimesThreshold() {
        return this.stopAutoPlayTimesThreshold;
    }

    public final TermsConsentInfo getTermConsentInfoNewUsers() {
        return this.termConsentInfoNewUsers;
    }

    public final TermsConsentInfo getTermsConsentInfo() {
        return this.termsConsentInfo;
    }

    public final int isMixedAge() {
        return this.isMixedAge;
    }

    public ComplianceSetting(List<String> list, Integer num, String str, String str2, AdPersonalitySettings adPersonalitySettings, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, TermsConsentInfo termsConsentInfo, TermsConsentInfo termsConsentInfo2, String str3, AgeGateInfo ageGateInfo, LogPbBean logPbBean, LegalEntityChangeInfo legalEntityChangeInfo, Boolean bool4, String str4, Long l, String str5, int i, int i2, int i3, int i4, PreferenceSettings preferenceSettings, boolean z, boolean z2, Map<String, Integer> map, int i5) {
        this.blackSetting = list;
        this.enableImpressum = num;
        this.impressumUrl = str;
        this.privacyPolicyUrl = str2;
        this.adPersonalitySettings = adPersonalitySettings;
        this.notifyPrivateAccount = num2;
        this.forcePrivateAccount = bool;
        this.addTermsConsentForRegister = bool2;
        this.enableTermsConsentPopup = bool3;
        this.termsConsentInfo = termsConsentInfo;
        this.termConsentInfoNewUsers = termsConsentInfo2;
        this.complianceEncrypt = str3;
        this.ageGateInfo = ageGateInfo;
        this.logPb = logPbBean;
        this.legalEntityChangeInfo = legalEntityChangeInfo;
        this.afSharingBlock = bool4;
        this.interfaceControlSettingsString = str4;
        this.deviceLimitRegisterExpiredTime = l;
        this.privacyHighlightsForTeensLink = str5;
        this.privacyHighlightsType = i;
        this.privateAccountPrompt = i2;
        this.privateAccountPromptType = i3;
        this.isMixedAge = i4;
        this.preferenceSettings = preferenceSettings;
        this.ageVerificationAction = z;
        this.notifyParentsWithEmail = z2;
        this.ageGraduationScenes = map;
        this.stopAutoPlayTimesThreshold = i5;
    }
}
