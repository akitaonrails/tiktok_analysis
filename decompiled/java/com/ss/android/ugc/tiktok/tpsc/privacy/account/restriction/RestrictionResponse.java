package com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class RestrictionResponse extends BaseResponse {

    @C09CT("log_report_enable")
    public final boolean logReportEnable;

    @C09CT("popup_agreement")
    public final Map<String, PrivacySettingsAgreementRecord> popupAgreement;

    @C09CT("popup_agreement_v2")
    public final Map<String, PrivacySettingsAgreementRecordV2> popupAgreementV2;

    @C09CT("post_record")
    public final Map<String, PrivacySettingsAgreementRecord> postRecord;

    @C09CT("privacy_restriction")
    public final PrivacySettingsRestriction privacySettingsRestriction;

    public RestrictionResponse() {
        this(null, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), false);
    }

    public final RestrictionResponse copy(PrivacySettingsRestriction privacySettingsRestriction, Map<String, PrivacySettingsAgreementRecord> map, Map<String, PrivacySettingsAgreementRecordV2> map2, Map<String, PrivacySettingsAgreementRecord> map3, boolean z) {
        return new RestrictionResponse(privacySettingsRestriction, map, map2, map3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionResponse)) {
            return false;
        }
        RestrictionResponse restrictionResponse = (RestrictionResponse) obj;
        return Intrinsics.LJFF(this.privacySettingsRestriction, restrictionResponse.privacySettingsRestriction) && Intrinsics.LJFF(this.popupAgreement, restrictionResponse.popupAgreement) && Intrinsics.LJFF(this.popupAgreementV2, restrictionResponse.popupAgreementV2) && Intrinsics.LJFF(this.postRecord, restrictionResponse.postRecord) && this.logReportEnable == restrictionResponse.logReportEnable;
    }

    public int hashCode() {
        PrivacySettingsRestriction privacySettingsRestriction = this.privacySettingsRestriction;
        return ((((((((privacySettingsRestriction == null ? 0 : privacySettingsRestriction.hashCode()) * 31) + this.popupAgreement.hashCode()) * 31) + this.popupAgreementV2.hashCode()) * 31) + this.postRecord.hashCode()) * 31) + C786410Ut5.Z2(this.logReportEnable);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RestrictionResponse(privacySettingsRestriction=");
        sbLIZ.append(this.privacySettingsRestriction);
        sbLIZ.append(", popupAgreement=");
        sbLIZ.append(this.popupAgreement);
        sbLIZ.append(", popupAgreementV2=");
        sbLIZ.append(this.popupAgreementV2);
        sbLIZ.append(", postRecord=");
        sbLIZ.append(this.postRecord);
        sbLIZ.append(", logReportEnable=");
        sbLIZ.append(this.logReportEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getLogReportEnable() {
        return this.logReportEnable;
    }

    public final Map<String, PrivacySettingsAgreementRecord> getPopupAgreement() {
        return this.popupAgreement;
    }

    public final Map<String, PrivacySettingsAgreementRecordV2> getPopupAgreementV2() {
        return this.popupAgreementV2;
    }

    public final Map<String, PrivacySettingsAgreementRecord> getPostRecord() {
        return this.postRecord;
    }

    public final PrivacySettingsRestriction getPrivacySettingsRestriction() {
        return this.privacySettingsRestriction;
    }

    public RestrictionResponse(PrivacySettingsRestriction privacySettingsRestriction, Map<String, PrivacySettingsAgreementRecord> map, Map<String, PrivacySettingsAgreementRecordV2> map2, Map<String, PrivacySettingsAgreementRecord> map3, boolean z) {
        this.privacySettingsRestriction = privacySettingsRestriction;
        this.popupAgreement = map;
        this.popupAgreementV2 = map2;
        this.postRecord = map3;
        this.logReportEnable = z;
    }
}
