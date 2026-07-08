package com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel;

import X.C004I;
import X.C291001Au;
import X.C786410Ut5;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class MyProfileGuideState implements C004I {
    public static final int $stable = 8;
    public final boolean avatarHasLoaded;
    public final Integer currentDownloadSetting;
    public final boolean hasGuideShowed;
    public final boolean hasPermissionPopUp;
    public final boolean hasSurveyDetermined;
    public final Boolean isPostAndDraftEmpty;
    public final boolean needPromptEmailAndPhoneBind;
    public final boolean needShow3PBindingPopUp;
    public final boolean needShowArtistNewReleaseNotice;
    public final boolean needShowBindPhoneNumberNotice;
    public final Boolean needShowDiskManagerGuide;
    public final boolean needShowEmailPopUp;
    public final boolean needShowFanSpotlightGuide;
    public final boolean needShowIncentivePostPopUp;
    public final boolean needShowMusicOfflineNotice;
    public final boolean needShowOutreachBanner;
    public final boolean needShowPasskey;
    public final boolean needShowPopSuitePopup;
    public final boolean needShowProfileBindingPromptBottomBanner;
    public final boolean needShowProfileHVAPopUp;
    public final boolean needShowProfileWalletPopUp;
    public final boolean needShowSaveLoginInfoPopUp;
    public final boolean needShowSmartLockService;
    public final boolean needShowSyncNicknameUsername;
    public final boolean postListHasLoaded;
    public final SurveyData surveyData;
    public final C291001Au<Unit> triggerShowCopyrightViolationSnackBarEvent;
    public final boolean vcdGuideLoaded;
    public final boolean waitingOutreachBanner;

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, false, false, true, null, true, true, true, true, false, true, true, true, true, true, true, false, true, true, true, true, false, null);
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C291001Au<Unit> c291001Au, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, Boolean bool2) {
        return new MyProfileGuideState(z, z2, z3, z4, surveyData, bool, num, z5, z6, z7, c291001Au, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyProfileGuideState)) {
            return false;
        }
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return this.hasGuideShowed == myProfileGuideState.hasGuideShowed && this.postListHasLoaded == myProfileGuideState.postListHasLoaded && this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded && this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined && Intrinsics.LJFF(this.surveyData, myProfileGuideState.surveyData) && Intrinsics.LJFF(this.needShowDiskManagerGuide, myProfileGuideState.needShowDiskManagerGuide) && Intrinsics.LJFF(this.currentDownloadSetting, myProfileGuideState.currentDownloadSetting) && this.vcdGuideLoaded == myProfileGuideState.vcdGuideLoaded && this.hasPermissionPopUp == myProfileGuideState.hasPermissionPopUp && this.needShowBindPhoneNumberNotice == myProfileGuideState.needShowBindPhoneNumberNotice && Intrinsics.LJFF(this.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent) && this.needShowEmailPopUp == myProfileGuideState.needShowEmailPopUp && this.needPromptEmailAndPhoneBind == myProfileGuideState.needPromptEmailAndPhoneBind && this.needShowSaveLoginInfoPopUp == myProfileGuideState.needShowSaveLoginInfoPopUp && this.needShowArtistNewReleaseNotice == myProfileGuideState.needShowArtistNewReleaseNotice && this.needShowMusicOfflineNotice == myProfileGuideState.needShowMusicOfflineNotice && this.needShowSyncNicknameUsername == myProfileGuideState.needShowSyncNicknameUsername && this.needShowProfileHVAPopUp == myProfileGuideState.needShowProfileHVAPopUp && this.needShowProfileWalletPopUp == myProfileGuideState.needShowProfileWalletPopUp && this.needShowPasskey == myProfileGuideState.needShowPasskey && this.needShowSmartLockService == myProfileGuideState.needShowSmartLockService && this.needShowPopSuitePopup == myProfileGuideState.needShowPopSuitePopup && this.needShowFanSpotlightGuide == myProfileGuideState.needShowFanSpotlightGuide && this.needShow3PBindingPopUp == myProfileGuideState.needShow3PBindingPopUp && this.needShowProfileBindingPromptBottomBanner == myProfileGuideState.needShowProfileBindingPromptBottomBanner && this.needShowIncentivePostPopUp == myProfileGuideState.needShowIncentivePostPopUp && this.waitingOutreachBanner == myProfileGuideState.waitingOutreachBanner && this.needShowOutreachBanner == myProfileGuideState.needShowOutreachBanner && Intrinsics.LJFF(this.isPostAndDraftEmpty, myProfileGuideState.isPostAndDraftEmpty);
    }

    public int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.hasGuideShowed) * 31) + C786410Ut5.Z2(this.postListHasLoaded)) * 31) + C786410Ut5.Z2(this.avatarHasLoaded)) * 31) + C786410Ut5.Z2(this.hasSurveyDetermined)) * 31;
        SurveyData surveyData = this.surveyData;
        int iHashCode = (iZ2 + (surveyData == null ? 0 : surveyData.hashCode())) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.currentDownloadSetting;
        int iHashCode3 = (((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.vcdGuideLoaded)) * 31) + C786410Ut5.Z2(this.hasPermissionPopUp)) * 31) + C786410Ut5.Z2(this.needShowBindPhoneNumberNotice)) * 31;
        C291001Au<Unit> c291001Au = this.triggerShowCopyrightViolationSnackBarEvent;
        int iHashCode4 = (((((((((((((((((((((((((((((((((((iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.needShowEmailPopUp)) * 31) + C786410Ut5.Z2(this.needPromptEmailAndPhoneBind)) * 31) + C786410Ut5.Z2(this.needShowSaveLoginInfoPopUp)) * 31) + C786410Ut5.Z2(this.needShowArtistNewReleaseNotice)) * 31) + C786410Ut5.Z2(this.needShowMusicOfflineNotice)) * 31) + C786410Ut5.Z2(this.needShowSyncNicknameUsername)) * 31) + C786410Ut5.Z2(this.needShowProfileHVAPopUp)) * 31) + C786410Ut5.Z2(this.needShowProfileWalletPopUp)) * 31) + C786410Ut5.Z2(this.needShowPasskey)) * 31) + C786410Ut5.Z2(this.needShowSmartLockService)) * 31) + C786410Ut5.Z2(this.needShowPopSuitePopup)) * 31) + C786410Ut5.Z2(this.needShowFanSpotlightGuide)) * 31) + C786410Ut5.Z2(this.needShow3PBindingPopUp)) * 31) + C786410Ut5.Z2(this.needShowProfileBindingPromptBottomBanner)) * 31) + C786410Ut5.Z2(this.needShowIncentivePostPopUp)) * 31) + C786410Ut5.Z2(this.waitingOutreachBanner)) * 31) + C786410Ut5.Z2(this.needShowOutreachBanner)) * 31;
        Boolean bool2 = this.isPostAndDraftEmpty;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "MyProfileGuideState(hasGuideShowed=" + this.hasGuideShowed + ", postListHasLoaded=" + this.postListHasLoaded + ", avatarHasLoaded=" + this.avatarHasLoaded + ", hasSurveyDetermined=" + this.hasSurveyDetermined + ", surveyData=" + this.surveyData + ", needShowDiskManagerGuide=" + this.needShowDiskManagerGuide + ", currentDownloadSetting=" + this.currentDownloadSetting + ", vcdGuideLoaded=" + this.vcdGuideLoaded + ", hasPermissionPopUp=" + this.hasPermissionPopUp + ", needShowBindPhoneNumberNotice=" + this.needShowBindPhoneNumberNotice + ", triggerShowCopyrightViolationSnackBarEvent=" + this.triggerShowCopyrightViolationSnackBarEvent + ", needShowEmailPopUp=" + this.needShowEmailPopUp + ", needPromptEmailAndPhoneBind=" + this.needPromptEmailAndPhoneBind + ", needShowSaveLoginInfoPopUp=" + this.needShowSaveLoginInfoPopUp + ", needShowArtistNewReleaseNotice=" + this.needShowArtistNewReleaseNotice + ", needShowMusicOfflineNotice=" + this.needShowMusicOfflineNotice + ", needShowSyncNicknameUsername=" + this.needShowSyncNicknameUsername + ", needShowProfileHVAPopUp=" + this.needShowProfileHVAPopUp + ", needShowProfileWalletPopUp=" + this.needShowProfileWalletPopUp + ", needShowPasskey=" + this.needShowPasskey + ", needShowSmartLockService=" + this.needShowSmartLockService + ", needShowPopSuitePopup=" + this.needShowPopSuitePopup + ", needShowFanSpotlightGuide=" + this.needShowFanSpotlightGuide + ", needShow3PBindingPopUp=" + this.needShow3PBindingPopUp + ", needShowProfileBindingPromptBottomBanner=" + this.needShowProfileBindingPromptBottomBanner + ", needShowIncentivePostPopUp=" + this.needShowIncentivePostPopUp + ", waitingOutreachBanner=" + this.waitingOutreachBanner + ", needShowOutreachBanner=" + this.needShowOutreachBanner + ", isPostAndDraftEmpty=" + this.isPostAndDraftEmpty + ')';
    }

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasPermissionPopUp() {
        return this.hasPermissionPopUp;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final boolean getNeedPromptEmailAndPhoneBind() {
        return this.needPromptEmailAndPhoneBind;
    }

    public final boolean getNeedShow3PBindingPopUp() {
        return this.needShow3PBindingPopUp;
    }

    public final boolean getNeedShowArtistNewReleaseNotice() {
        return this.needShowArtistNewReleaseNotice;
    }

    public final boolean getNeedShowBindPhoneNumberNotice() {
        return this.needShowBindPhoneNumberNotice;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getNeedShowEmailPopUp() {
        return this.needShowEmailPopUp;
    }

    public final boolean getNeedShowFanSpotlightGuide() {
        return this.needShowFanSpotlightGuide;
    }

    public final boolean getNeedShowIncentivePostPopUp() {
        return this.needShowIncentivePostPopUp;
    }

    public final boolean getNeedShowMusicOfflineNotice() {
        return this.needShowMusicOfflineNotice;
    }

    public final boolean getNeedShowOutreachBanner() {
        return this.needShowOutreachBanner;
    }

    public final boolean getNeedShowPasskey() {
        return this.needShowPasskey;
    }

    public final boolean getNeedShowPopSuitePopup() {
        return this.needShowPopSuitePopup;
    }

    public final boolean getNeedShowProfileBindingPromptBottomBanner() {
        return this.needShowProfileBindingPromptBottomBanner;
    }

    public final boolean getNeedShowProfileHVAPopUp() {
        return this.needShowProfileHVAPopUp;
    }

    public final boolean getNeedShowProfileWalletPopUp() {
        return this.needShowProfileWalletPopUp;
    }

    public final boolean getNeedShowSaveLoginInfoPopUp() {
        return this.needShowSaveLoginInfoPopUp;
    }

    public final boolean getNeedShowSmartLockService() {
        return this.needShowSmartLockService;
    }

    public final boolean getNeedShowSyncNicknameUsername() {
        return this.needShowSyncNicknameUsername;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public final C291001Au<Unit> getTriggerShowCopyrightViolationSnackBarEvent() {
        return this.triggerShowCopyrightViolationSnackBarEvent;
    }

    public final boolean getVcdGuideLoaded() {
        return this.vcdGuideLoaded;
    }

    public final boolean getWaitingOutreachBanner() {
        return this.waitingOutreachBanner;
    }

    public final Boolean isPostAndDraftEmpty() {
        return this.isPostAndDraftEmpty;
    }

    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C291001Au<Unit> c291001Au, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, Boolean bool2) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = surveyData;
        this.needShowDiskManagerGuide = bool;
        this.currentDownloadSetting = num;
        this.vcdGuideLoaded = z5;
        this.hasPermissionPopUp = z6;
        this.needShowBindPhoneNumberNotice = z7;
        this.triggerShowCopyrightViolationSnackBarEvent = c291001Au;
        this.needShowEmailPopUp = z8;
        this.needPromptEmailAndPhoneBind = z9;
        this.needShowSaveLoginInfoPopUp = z10;
        this.needShowArtistNewReleaseNotice = z11;
        this.needShowMusicOfflineNotice = z12;
        this.needShowSyncNicknameUsername = z13;
        this.needShowProfileHVAPopUp = z14;
        this.needShowProfileWalletPopUp = z15;
        this.needShowPasskey = z16;
        this.needShowSmartLockService = z17;
        this.needShowPopSuitePopup = z18;
        this.needShowFanSpotlightGuide = z19;
        this.needShow3PBindingPopUp = z20;
        this.needShowProfileBindingPromptBottomBanner = z21;
        this.needShowIncentivePostPopUp = z22;
        this.waitingOutreachBanner = z23;
        this.needShowOutreachBanner = z24;
        this.isPostAndDraftEmpty = bool2;
    }
}
