package com.ss.android.ugc.tiktok.tpsc.privacy.account.unified;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyPrompt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UnifiedDataResponse extends BaseResponse {

    @C09CT("log_report_enable")
    public final boolean logReportEnable;

    @C09CT("no_pa_control_settings")
    public final NoPAControlSettings noPaControlSettings;

    @C09CT("privacy_prompts")
    public final Map<String, PrivacyPrompt> prompts;

    @C09CT("privacy_restriction")
    public final PrivacySettingsRestriction restriction;

    @C09CT("privacy_settings")
    public final PrivacyUserSettingsV2 settings;

    public UnifiedDataResponse() {
        this(null, null, C2097608Jq.LJ(), null, false);
    }

    public final UnifiedDataResponse copy(PrivacySettingsRestriction privacySettingsRestriction, PrivacyUserSettingsV2 privacyUserSettingsV2, Map<String, PrivacyPrompt> map, NoPAControlSettings noPAControlSettings, boolean z) {
        return new UnifiedDataResponse(privacySettingsRestriction, privacyUserSettingsV2, map, noPAControlSettings, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedDataResponse)) {
            return false;
        }
        UnifiedDataResponse unifiedDataResponse = (UnifiedDataResponse) obj;
        return Intrinsics.LJFF(this.restriction, unifiedDataResponse.restriction) && Intrinsics.LJFF(this.settings, unifiedDataResponse.settings) && Intrinsics.LJFF(this.prompts, unifiedDataResponse.prompts) && Intrinsics.LJFF(this.noPaControlSettings, unifiedDataResponse.noPaControlSettings) && this.logReportEnable == unifiedDataResponse.logReportEnable;
    }

    public int hashCode() {
        PrivacySettingsRestriction privacySettingsRestriction = this.restriction;
        int iHashCode = (privacySettingsRestriction == null ? 0 : privacySettingsRestriction.hashCode()) * 31;
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.settings;
        int iHashCode2 = (((iHashCode + (privacyUserSettingsV2 == null ? 0 : privacyUserSettingsV2.hashCode())) * 31) + this.prompts.hashCode()) * 31;
        NoPAControlSettings noPAControlSettings = this.noPaControlSettings;
        return ((iHashCode2 + (noPAControlSettings != null ? noPAControlSettings.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.logReportEnable);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedDataResponse(restriction=");
        sbLIZ.append(this.restriction);
        sbLIZ.append(", settings=");
        sbLIZ.append(this.settings);
        sbLIZ.append(", prompts=");
        sbLIZ.append(this.prompts);
        sbLIZ.append(", noPaControlSettings=");
        sbLIZ.append(this.noPaControlSettings);
        sbLIZ.append(", logReportEnable=");
        sbLIZ.append(this.logReportEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getLogReportEnable() {
        return this.logReportEnable;
    }

    public final NoPAControlSettings getNoPaControlSettings() {
        return this.noPaControlSettings;
    }

    public final Map<String, PrivacyPrompt> getPrompts() {
        return this.prompts;
    }

    public final PrivacySettingsRestriction getRestriction() {
        return this.restriction;
    }

    public final PrivacyUserSettingsV2 getSettings() {
        return this.settings;
    }

    public UnifiedDataResponse(PrivacySettingsRestriction privacySettingsRestriction, PrivacyUserSettingsV2 privacyUserSettingsV2, Map<String, PrivacyPrompt> map, NoPAControlSettings noPAControlSettings, boolean z) {
        this.restriction = privacySettingsRestriction;
        this.settings = privacyUserSettingsV2;
        this.prompts = map;
        this.noPaControlSettings = noPAControlSettings;
        this.logReportEnable = z;
    }
}
