package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PaPromptResponse extends BaseResponse {

    @C09CT("privacy_restriction")
    public final PrivacySettingsRestriction privacySettingsRestriction;

    @C09CT("privacy_settings")
    public final Map<String, Integer> privacyUserSettings;

    public PaPromptResponse() {
        this(null, null);
    }

    public final PaPromptResponse copy(PrivacySettingsRestriction privacySettingsRestriction, Map<String, Integer> map) {
        return new PaPromptResponse(privacySettingsRestriction, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaPromptResponse)) {
            return false;
        }
        PaPromptResponse paPromptResponse = (PaPromptResponse) obj;
        return Intrinsics.LJFF(this.privacySettingsRestriction, paPromptResponse.privacySettingsRestriction) && Intrinsics.LJFF(this.privacyUserSettings, paPromptResponse.privacyUserSettings);
    }

    public int hashCode() {
        PrivacySettingsRestriction privacySettingsRestriction = this.privacySettingsRestriction;
        int iHashCode = (privacySettingsRestriction == null ? 0 : privacySettingsRestriction.hashCode()) * 31;
        Map<String, Integer> map = this.privacyUserSettings;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaPromptResponse(privacySettingsRestriction=");
        sbLIZ.append(this.privacySettingsRestriction);
        sbLIZ.append(", privacyUserSettings=");
        sbLIZ.append(this.privacyUserSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PrivacySettingsRestriction getPrivacySettingsRestriction() {
        return this.privacySettingsRestriction;
    }

    public final Map<String, Integer> getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PaPromptResponse(PrivacySettingsRestriction privacySettingsRestriction, Map<String, Integer> map) {
        this.privacySettingsRestriction = privacySettingsRestriction;
        this.privacyUserSettings = map;
    }
}
