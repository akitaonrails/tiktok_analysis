package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCampaignCardDisplay {

    @C09CT("cta_action")
    public final String ctaAction;

    @C09CT("cta_text")
    public final String ctaText;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("show")
    public final Boolean show;

    @C09CT("text")
    public final String text;

    public StreakCampaignCardDisplay() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCampaignCardDisplay)) {
            return false;
        }
        StreakCampaignCardDisplay streakCampaignCardDisplay = (StreakCampaignCardDisplay) obj;
        return Intrinsics.LJFF(this.show, streakCampaignCardDisplay.show) && Intrinsics.LJFF(this.imageUrl, streakCampaignCardDisplay.imageUrl) && Intrinsics.LJFF(this.text, streakCampaignCardDisplay.text) && Intrinsics.LJFF(this.ctaText, streakCampaignCardDisplay.ctaText) && Intrinsics.LJFF(this.ctaAction, streakCampaignCardDisplay.ctaAction);
    }

    public final int hashCode() {
        Boolean bool = this.show;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaAction;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakCampaignCardDisplay(show=");
        sbLIZ.append(this.show);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", ctaText=");
        sbLIZ.append(this.ctaText);
        sbLIZ.append(", ctaAction=");
        sbLIZ.append(this.ctaAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakCampaignCardDisplay(Boolean bool, String str, String str2, String str3, String str4) {
        this.show = bool;
        this.imageUrl = str;
        this.text = str2;
        this.ctaText = str3;
        this.ctaAction = str4;
    }
}
