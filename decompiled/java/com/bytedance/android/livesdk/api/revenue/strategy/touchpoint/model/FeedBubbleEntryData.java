package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1121530fI7;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedBubbleEntryData implements InterfaceC1121530fI7 {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("max_display_time")
    public final int maxDisplayTime;

    @C09CT("max_display_time_per_day")
    public final int maxDisplayTimePerDay;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBubbleEntryData)) {
            return false;
        }
        FeedBubbleEntryData feedBubbleEntryData = (FeedBubbleEntryData) obj;
        return this.maxDisplayTime == feedBubbleEntryData.maxDisplayTime && this.maxDisplayTimePerDay == feedBubbleEntryData.maxDisplayTimePerDay;
    }

    public final int hashCode() {
        return (this.maxDisplayTime * 31) + this.maxDisplayTimePerDay;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBubbleEntryData(maxDisplayTime=");
        sbLIZ.append(this.maxDisplayTime);
        sbLIZ.append(", maxDisplayTimePerDay=");
        sbLIZ.append(this.maxDisplayTimePerDay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedBubbleEntryData(int i, int i2) {
        this.maxDisplayTime = i;
        this.maxDisplayTimePerDay = i2;
    }
}
