package com.ss.android.ugc.tiktok.tpsc.privacy.account.usersettings;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyUserSettingsResponse extends BaseResponse {

    @C09CT("privacy_settings")
    public final PrivacyUserSettingsV2 privacyUserSettings;

    public PrivacyUserSettingsResponse() {
        this(null);
    }

    public final PrivacyUserSettingsResponse copy(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        return new PrivacyUserSettingsResponse(privacyUserSettingsV2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyUserSettingsResponse) && Intrinsics.LJFF(this.privacyUserSettings, ((PrivacyUserSettingsResponse) obj).privacyUserSettings);
    }

    public int hashCode() {
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.privacyUserSettings;
        if (privacyUserSettingsV2 == null) {
            return 0;
        }
        return privacyUserSettingsV2.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyUserSettingsResponse(privacyUserSettings=");
        sbLIZ.append(this.privacyUserSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PrivacyUserSettingsV2 getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PrivacyUserSettingsResponse(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        this.privacyUserSettings = privacyUserSettingsV2;
    }
}
