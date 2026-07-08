package com.ss.android.ugc.aweme.rich.reward.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardClaimResult {
    public final String LIZ;

    @C09CT("action_report_status")
    public final Integer actionReportStatus;

    @C09CT("bubble_text")
    public final String bubbleText;

    @C09CT("coin_reward_amount")
    public final int coinRewardAmount;

    @C09CT("commonParams")
    public final String commonParams;

    @C09CT("extraParams")
    public final String extraParams;

    @C09CT("logExtra")
    public final String logExtra;

    @C09CT("show_receive_again_alert")
    public final boolean showReceiveAgainAlert;

    @C09CT("status_code")
    public final Integer statusCode;

    public GmtRewardClaimResult() {
        this(null, null, 0, false, "", null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmtRewardClaimResult)) {
            return false;
        }
        GmtRewardClaimResult gmtRewardClaimResult = (GmtRewardClaimResult) obj;
        return Intrinsics.LJFF(this.statusCode, gmtRewardClaimResult.statusCode) && Intrinsics.LJFF(this.actionReportStatus, gmtRewardClaimResult.actionReportStatus) && this.coinRewardAmount == gmtRewardClaimResult.coinRewardAmount && this.showReceiveAgainAlert == gmtRewardClaimResult.showReceiveAgainAlert && Intrinsics.LJFF(this.bubbleText, gmtRewardClaimResult.bubbleText) && Intrinsics.LJFF(this.extraParams, gmtRewardClaimResult.extraParams) && Intrinsics.LJFF(this.commonParams, gmtRewardClaimResult.commonParams) && Intrinsics.LJFF(this.logExtra, gmtRewardClaimResult.logExtra) && Intrinsics.LJFF(this.LIZ, gmtRewardClaimResult.LIZ);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.actionReportStatus;
        int iHashCode2 = (((((((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.coinRewardAmount) * 31) + C786410Ut5.Z2(this.showReceiveAgainAlert)) * 31) + this.bubbleText.hashCode()) * 31;
        String str = this.extraParams;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commonParams;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logExtra;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZ;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardClaimResult(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", actionReportStatus=");
        sbLIZ.append(this.actionReportStatus);
        sbLIZ.append(", coinRewardAmount=");
        sbLIZ.append(this.coinRewardAmount);
        sbLIZ.append(", showReceiveAgainAlert=");
        sbLIZ.append(this.showReceiveAgainAlert);
        sbLIZ.append(", bubbleText=");
        sbLIZ.append(this.bubbleText);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.commonParams);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(", rawResponse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GmtRewardClaimResult(Integer num, Integer num2, int i, boolean z, String str, String str2, String str3, String str4, String str5) {
        this.statusCode = num;
        this.actionReportStatus = num2;
        this.coinRewardAmount = i;
        this.showReceiveAgainAlert = z;
        this.bubbleText = str;
        this.extraParams = str2;
        this.commonParams = str3;
        this.logExtra = str4;
        this.LIZ = str5;
    }
}
