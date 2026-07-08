package com.ss.android.ugc.aweme.im.streak.impl.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakEntryInfo {

    @C09CT("campaign_id")
    public final String campaignId;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("pet_panel_additional_params")
    public final String petPanelAdditionalParams;

    public StreakEntryInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakEntryInfo)) {
            return false;
        }
        StreakEntryInfo streakEntryInfo = (StreakEntryInfo) obj;
        return Intrinsics.LJFF(this.enterMethod, streakEntryInfo.enterMethod) && Intrinsics.LJFF(this.campaignId, streakEntryInfo.campaignId) && Intrinsics.LJFF(this.petPanelAdditionalParams, streakEntryInfo.petPanelAdditionalParams);
    }

    public final int hashCode() {
        String str = this.enterMethod;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.petPanelAdditionalParams;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakEntryInfo(enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", campaignId=");
        sbLIZ.append(this.campaignId);
        sbLIZ.append(", petPanelAdditionalParams=");
        sbLIZ.append(this.petPanelAdditionalParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakEntryInfo(String str, String str2, String str3) {
        this.enterMethod = str;
        this.campaignId = str2;
        this.petPanelAdditionalParams = str3;
    }
}
