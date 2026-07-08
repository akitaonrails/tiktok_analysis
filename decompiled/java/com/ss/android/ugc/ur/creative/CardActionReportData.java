package com.ss.android.ugc.ur.creative;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CardActionReportData {
    public String activityName;
    public String inspirationId;
    public String primaryScene;
    public Integer topicType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardActionReportData)) {
            return false;
        }
        CardActionReportData cardActionReportData = (CardActionReportData) obj;
        return Intrinsics.LJFF(this.inspirationId, cardActionReportData.inspirationId) && Intrinsics.LJFF(this.primaryScene, cardActionReportData.primaryScene) && Intrinsics.LJFF(this.topicType, cardActionReportData.topicType) && Intrinsics.LJFF(this.activityName, cardActionReportData.activityName);
    }

    public int hashCode() {
        String str = this.inspirationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryScene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.topicType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.activityName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardActionReportData(inspirationId=");
        sbLIZ.append(this.inspirationId);
        sbLIZ.append(", primaryScene=");
        sbLIZ.append(this.primaryScene);
        sbLIZ.append(", topicType=");
        sbLIZ.append(this.topicType);
        sbLIZ.append(", activityName=");
        sbLIZ.append(this.activityName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setActivityName(String str) {
        this.activityName = str;
    }

    public final void setInspirationId(String str) {
        this.inspirationId = str;
    }

    public final void setPrimaryScene(String str) {
        this.primaryScene = str;
    }

    public final void setTopicType(Integer num) {
        this.topicType = num;
    }

    public CardActionReportData(String str, String str2, Integer num, String str3) {
        this.inspirationId = str;
        this.primaryScene = str2;
        this.topicType = num;
        this.activityName = str3;
    }
}
