package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCampaignBubbleDisplay {

    @C09CT("bubble_type")
    public final Integer bubbleType;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("show")
    public final Boolean show;

    @C09CT("text")
    public final String text;

    public StreakCampaignBubbleDisplay() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCampaignBubbleDisplay)) {
            return false;
        }
        StreakCampaignBubbleDisplay streakCampaignBubbleDisplay = (StreakCampaignBubbleDisplay) obj;
        return Intrinsics.LJFF(this.show, streakCampaignBubbleDisplay.show) && Intrinsics.LJFF(this.bubbleType, streakCampaignBubbleDisplay.bubbleType) && Intrinsics.LJFF(this.text, streakCampaignBubbleDisplay.text) && Intrinsics.LJFF(this.iconUrl, streakCampaignBubbleDisplay.iconUrl);
    }

    public final int hashCode() {
        Boolean bool = this.show;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.bubbleType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakCampaignBubbleDisplay(show=");
        sbLIZ.append(this.show);
        sbLIZ.append(", bubbleType=");
        sbLIZ.append(this.bubbleType);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakCampaignBubbleDisplay(Boolean bool, Integer num, String str, String str2) {
        this.show = bool;
        this.bubbleType = num;
        this.text = str;
        this.iconUrl = str2;
    }
}
