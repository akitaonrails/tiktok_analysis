package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCampaignBannerDisplay {

    @C09CT("cta_action")
    public final String ctaAction;

    @C09CT("cta_text")
    public final String ctaText;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("show")
    public final Boolean show;

    @C09CT("title")
    public final String title;

    public StreakCampaignBannerDisplay() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCampaignBannerDisplay)) {
            return false;
        }
        StreakCampaignBannerDisplay streakCampaignBannerDisplay = (StreakCampaignBannerDisplay) obj;
        return Intrinsics.LJFF(this.show, streakCampaignBannerDisplay.show) && Intrinsics.LJFF(this.title, streakCampaignBannerDisplay.title) && Intrinsics.LJFF(this.imageUrl, streakCampaignBannerDisplay.imageUrl) && Intrinsics.LJFF(this.ctaText, streakCampaignBannerDisplay.ctaText) && Intrinsics.LJFF(this.ctaAction, streakCampaignBannerDisplay.ctaAction);
    }

    public final int hashCode() {
        Boolean bool = this.show;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaAction;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakCampaignBannerDisplay(show=");
        sbLIZ.append(this.show);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", ctaText=");
        sbLIZ.append(this.ctaText);
        sbLIZ.append(", ctaAction=");
        sbLIZ.append(this.ctaAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakCampaignBannerDisplay(Boolean bool, String str, String str2, String str3, String str4) {
        this.show = bool;
        this.title = str;
        this.imageUrl = str2;
        this.ctaText = str3;
        this.ctaAction = str4;
    }
}
