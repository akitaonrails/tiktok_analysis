package com.ss.android.ugc.tiktok.tpsc.privacy.data.base;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyUpdateCommonResponse extends BaseResponse {

    @C09CT("privacy_restriction")
    public final PrivacySettingsRestriction privacySettingsRestriction;

    @C09CT("privacy_settings")
    public final PrivacyUserSettingsV2 privacyUserSettings;

    public PrivacyUpdateCommonResponse() {
        this(null, null);
    }

    public final PrivacyUpdateCommonResponse copy(PrivacyUserSettingsV2 privacyUserSettingsV2, PrivacySettingsRestriction privacySettingsRestriction) {
        return new PrivacyUpdateCommonResponse(privacyUserSettingsV2, privacySettingsRestriction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyUpdateCommonResponse)) {
            return false;
        }
        PrivacyUpdateCommonResponse privacyUpdateCommonResponse = (PrivacyUpdateCommonResponse) obj;
        return Intrinsics.LJFF(this.privacyUserSettings, privacyUpdateCommonResponse.privacyUserSettings) && Intrinsics.LJFF(this.privacySettingsRestriction, privacyUpdateCommonResponse.privacySettingsRestriction);
    }

    public int hashCode() {
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.privacyUserSettings;
        int iHashCode = (privacyUserSettingsV2 == null ? 0 : privacyUserSettingsV2.hashCode()) * 31;
        PrivacySettingsRestriction privacySettingsRestriction = this.privacySettingsRestriction;
        return iHashCode + (privacySettingsRestriction != null ? privacySettingsRestriction.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyUpdateCommonResponse(privacyUserSettings=");
        sbLIZ.append(this.privacyUserSettings);
        sbLIZ.append(", privacySettingsRestriction=");
        sbLIZ.append(this.privacySettingsRestriction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PrivacySettingsRestriction getPrivacySettingsRestriction() {
        return this.privacySettingsRestriction;
    }

    public final PrivacyUserSettingsV2 getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PrivacyUpdateCommonResponse(PrivacyUserSettingsV2 privacyUserSettingsV2, PrivacySettingsRestriction privacySettingsRestriction) {
        this.privacyUserSettings = privacyUserSettingsV2;
        this.privacySettingsRestriction = privacySettingsRestriction;
    }
}
