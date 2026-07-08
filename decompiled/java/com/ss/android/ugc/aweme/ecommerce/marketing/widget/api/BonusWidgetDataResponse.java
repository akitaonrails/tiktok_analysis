package com.ss.android.ugc.aweme.ecommerce.marketing.widget.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BonusWidgetDataResponse {

    @C09CT("action_notice")
    public final List<ActionNotice> actionNotice;

    @C09CT("balance_amount")
    public final String balanceAmount;

    @C09CT("bonus_center_schema")
    public final String bonusCenterSchema;

    @C09CT("bubble_info")
    public final List<BubbleInfo> bubbleInfo;

    @C09CT("logistic_info")
    public final List<LogisticInfo> logisticInfo;

    @C09CT("main_title")
    public final String mainTitle;

    @C09CT("refresh_interval_seconds")
    public final Integer refreshIntervalSeconds;

    @C09CT("sub_title")
    public final String subTitle;

    public BonusWidgetDataResponse() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusWidgetDataResponse)) {
            return false;
        }
        BonusWidgetDataResponse bonusWidgetDataResponse = (BonusWidgetDataResponse) obj;
        return Intrinsics.LJFF(this.mainTitle, bonusWidgetDataResponse.mainTitle) && Intrinsics.LJFF(this.subTitle, bonusWidgetDataResponse.subTitle) && Intrinsics.LJFF(this.balanceAmount, bonusWidgetDataResponse.balanceAmount) && Intrinsics.LJFF(this.actionNotice, bonusWidgetDataResponse.actionNotice) && Intrinsics.LJFF(this.bubbleInfo, bonusWidgetDataResponse.bubbleInfo) && Intrinsics.LJFF(this.logisticInfo, bonusWidgetDataResponse.logisticInfo) && Intrinsics.LJFF(this.refreshIntervalSeconds, bonusWidgetDataResponse.refreshIntervalSeconds) && Intrinsics.LJFF(this.bonusCenterSchema, bonusWidgetDataResponse.bonusCenterSchema);
    }

    public int hashCode() {
        String str = this.mainTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balanceAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ActionNotice> list = this.actionNotice;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BubbleInfo> list2 = this.bubbleInfo;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LogisticInfo> list3 = this.logisticInfo;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.refreshIntervalSeconds;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.bonusCenterSchema;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BonusWidgetDataResponse(mainTitle=");
        sbLIZ.append(this.mainTitle);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", balanceAmount=");
        sbLIZ.append(this.balanceAmount);
        sbLIZ.append(", actionNotice=");
        sbLIZ.append(this.actionNotice);
        sbLIZ.append(", bubbleInfo=");
        sbLIZ.append(this.bubbleInfo);
        sbLIZ.append(", logisticInfo=");
        sbLIZ.append(this.logisticInfo);
        sbLIZ.append(", refreshIntervalSeconds=");
        sbLIZ.append(this.refreshIntervalSeconds);
        sbLIZ.append(", bonusCenterSchema=");
        sbLIZ.append(this.bonusCenterSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BonusWidgetDataResponse(String str, String str2, String str3, List<ActionNotice> list, List<BubbleInfo> list2, List<LogisticInfo> list3, Integer num, String str4) {
        this.mainTitle = str;
        this.subTitle = str2;
        this.balanceAmount = str3;
        this.actionNotice = list;
        this.bubbleInfo = list2;
        this.logisticInfo = list3;
        this.refreshIntervalSeconds = num;
        this.bonusCenterSchema = str4;
    }
}
