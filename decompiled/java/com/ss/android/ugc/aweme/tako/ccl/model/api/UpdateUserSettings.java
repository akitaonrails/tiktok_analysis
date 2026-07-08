package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class UpdateUserSettings {

    @C09CT("accepted_privacy_popup")
    public final boolean acceptedDisclaimerPopup;

    @C09CT("privacy_popup_type")
    public final int disclaimerPopupType;

    @C09CT("enable_image_record")
    public Boolean enableImageRecord;

    @C09CT("send_user")
    public final boolean sendUser;

    @C09CT("showed_privacy_popup")
    public final boolean showedDisclaimerPopup;

    @C09CT("lang_style_popup_showed")
    public final boolean showedLanguageStyleGuidePopup;

    @C09CT("showed_memory_guide_popup")
    public final boolean showedMemoryGuidePopup;

    @C09CT("switch_status")
    public final String switchStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserSettings)) {
            return false;
        }
        UpdateUserSettings updateUserSettings = (UpdateUserSettings) obj;
        return this.showedDisclaimerPopup == updateUserSettings.showedDisclaimerPopup && this.acceptedDisclaimerPopup == updateUserSettings.acceptedDisclaimerPopup && this.disclaimerPopupType == updateUserSettings.disclaimerPopupType && this.sendUser == updateUserSettings.sendUser && this.showedMemoryGuidePopup == updateUserSettings.showedMemoryGuidePopup && this.showedLanguageStyleGuidePopup == updateUserSettings.showedLanguageStyleGuidePopup && Intrinsics.LJFF(this.switchStatus, updateUserSettings.switchStatus) && Intrinsics.LJFF(this.enableImageRecord, updateUserSettings.enableImageRecord);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.showedDisclaimerPopup) * 31) + C786410Ut5.Z2(this.acceptedDisclaimerPopup)) * 31) + this.disclaimerPopupType) * 31) + C786410Ut5.Z2(this.sendUser)) * 31) + C786410Ut5.Z2(this.showedMemoryGuidePopup)) * 31) + C786410Ut5.Z2(this.showedLanguageStyleGuidePopup)) * 31) + this.switchStatus.hashCode()) * 31;
        Boolean bool = this.enableImageRecord;
        return iZ2 + (bool == null ? 0 : bool.hashCode());
    }

    public UpdateUserSettings() {
        this(false, false, 0, false, false, false, "", Boolean.FALSE);
    }

    public UpdateUserSettings(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, String str, Boolean bool) {
        this.showedDisclaimerPopup = z;
        this.acceptedDisclaimerPopup = z2;
        this.disclaimerPopupType = i;
        this.sendUser = z3;
        this.showedMemoryGuidePopup = z4;
        this.showedLanguageStyleGuidePopup = z5;
        this.switchStatus = str;
        this.enableImageRecord = bool;
    }
}
