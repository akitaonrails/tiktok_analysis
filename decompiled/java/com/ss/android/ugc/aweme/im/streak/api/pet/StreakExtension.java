package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakExtension {

    @C09CT("campaign")
    public final StreakCampaignInfo campaign;

    @C09CT("should_display_promotional_widget")
    public final boolean shouldDisplayPromotionalWidget;

    public StreakExtension() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakExtension)) {
            return false;
        }
        StreakExtension streakExtension = (StreakExtension) obj;
        return this.shouldDisplayPromotionalWidget == streakExtension.shouldDisplayPromotionalWidget && Intrinsics.LJFF(this.campaign, streakExtension.campaign);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.shouldDisplayPromotionalWidget) * 31;
        StreakCampaignInfo streakCampaignInfo = this.campaign;
        return iZ2 + (streakCampaignInfo == null ? 0 : streakCampaignInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakExtension(shouldDisplayPromotionalWidget=");
        sbLIZ.append(this.shouldDisplayPromotionalWidget);
        sbLIZ.append(", campaign=");
        sbLIZ.append(this.campaign);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakExtension(boolean z, StreakCampaignInfo streakCampaignInfo) {
        this.shouldDisplayPromotionalWidget = z;
        this.campaign = streakCampaignInfo;
    }
}
