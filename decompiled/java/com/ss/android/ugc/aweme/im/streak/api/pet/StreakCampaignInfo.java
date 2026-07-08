package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCampaignInfo {

    @C09CT("banner")
    public final StreakCampaignBannerDisplay banner;

    @C09CT("bubble")
    public final StreakCampaignBubbleDisplay bubble;

    @C09CT("campaign_id")
    public final String campaignId;

    @C09CT("campaign_type")
    public final Integer campaignType;

    @C09CT("card")
    public final StreakCampaignCardDisplay card;

    @C09CT("end_ts_ms")
    public final Long endTsMs;

    @C09CT("ext")
    public final String ext;

    @C09CT("start_ts_ms")
    public final Long startTsMs;

    @C09CT("tasks")
    public final List<Object> tasks;

    @C09CT("widget_eligible_by_client")
    public final boolean widgetEligibleByClient;

    public StreakCampaignInfo() {
        this(null, null, null, null, null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCampaignInfo)) {
            return false;
        }
        StreakCampaignInfo streakCampaignInfo = (StreakCampaignInfo) obj;
        return Intrinsics.LJFF(this.campaignId, streakCampaignInfo.campaignId) && Intrinsics.LJFF(this.campaignType, streakCampaignInfo.campaignType) && Intrinsics.LJFF(this.tasks, streakCampaignInfo.tasks) && Intrinsics.LJFF(this.startTsMs, streakCampaignInfo.startTsMs) && Intrinsics.LJFF(this.endTsMs, streakCampaignInfo.endTsMs) && Intrinsics.LJFF(this.banner, streakCampaignInfo.banner) && Intrinsics.LJFF(this.card, streakCampaignInfo.card) && Intrinsics.LJFF(this.bubble, streakCampaignInfo.bubble) && Intrinsics.LJFF(this.ext, streakCampaignInfo.ext) && this.widgetEligibleByClient == streakCampaignInfo.widgetEligibleByClient;
    }

    public final int hashCode() {
        String str = this.campaignId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.campaignType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Object> list = this.tasks;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.startTsMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTsMs;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        StreakCampaignBannerDisplay streakCampaignBannerDisplay = this.banner;
        int iHashCode6 = (iHashCode5 + (streakCampaignBannerDisplay == null ? 0 : streakCampaignBannerDisplay.hashCode())) * 31;
        StreakCampaignCardDisplay streakCampaignCardDisplay = this.card;
        int iHashCode7 = (iHashCode6 + (streakCampaignCardDisplay == null ? 0 : streakCampaignCardDisplay.hashCode())) * 31;
        StreakCampaignBubbleDisplay streakCampaignBubbleDisplay = this.bubble;
        int iHashCode8 = (iHashCode7 + (streakCampaignBubbleDisplay == null ? 0 : streakCampaignBubbleDisplay.hashCode())) * 31;
        String str2 = this.ext;
        return ((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.widgetEligibleByClient);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakCampaignInfo(campaignId=");
        sbLIZ.append(this.campaignId);
        sbLIZ.append(", campaignType=");
        sbLIZ.append(this.campaignType);
        sbLIZ.append(", tasks=");
        sbLIZ.append(this.tasks);
        sbLIZ.append(", startTsMs=");
        sbLIZ.append(this.startTsMs);
        sbLIZ.append(", endTsMs=");
        sbLIZ.append(this.endTsMs);
        sbLIZ.append(", banner=");
        sbLIZ.append(this.banner);
        sbLIZ.append(", card=");
        sbLIZ.append(this.card);
        sbLIZ.append(", bubble=");
        sbLIZ.append(this.bubble);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", widgetEligibleByClient=");
        sbLIZ.append(this.widgetEligibleByClient);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static StreakCampaignInfo LIZ(StreakCampaignInfo streakCampaignInfo, boolean z) {
        return new StreakCampaignInfo(streakCampaignInfo.campaignId, streakCampaignInfo.campaignType, streakCampaignInfo.tasks, streakCampaignInfo.startTsMs, streakCampaignInfo.endTsMs, streakCampaignInfo.banner, streakCampaignInfo.card, streakCampaignInfo.bubble, streakCampaignInfo.ext, z);
    }

    public StreakCampaignInfo(String str, Integer num, List<Object> list, Long l, Long l2, StreakCampaignBannerDisplay streakCampaignBannerDisplay, StreakCampaignCardDisplay streakCampaignCardDisplay, StreakCampaignBubbleDisplay streakCampaignBubbleDisplay, String str2, boolean z) {
        this.campaignId = str;
        this.campaignType = num;
        this.tasks = list;
        this.startTsMs = l;
        this.endTsMs = l2;
        this.banner = streakCampaignBannerDisplay;
        this.card = streakCampaignCardDisplay;
        this.bubble = streakCampaignBubbleDisplay;
        this.ext = str2;
        this.widgetEligibleByClient = z;
    }
}
