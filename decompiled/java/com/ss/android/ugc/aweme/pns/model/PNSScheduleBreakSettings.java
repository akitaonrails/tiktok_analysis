package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSScheduleBreakSettings implements Serializable {

    @C09CT("screen_down_time_status")
    public final int downTimeStatus;

    @C09CT("show_stm_down_time")
    public final boolean shouldShowDownTime;

    @C09CT("permission_review_status")
    public final int skipDownTimeStatus;

    @C09CT("screen_down_time_type")
    public final int type;

    @C09CT("screen_down_time_day_setting")
    public final List<PNSScheduleBreakWeekSettings> weekSettings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSScheduleBreakSettings)) {
            return false;
        }
        PNSScheduleBreakSettings pNSScheduleBreakSettings = (PNSScheduleBreakSettings) obj;
        return this.shouldShowDownTime == pNSScheduleBreakSettings.shouldShowDownTime && this.downTimeStatus == pNSScheduleBreakSettings.downTimeStatus && this.type == pNSScheduleBreakSettings.type && Intrinsics.LJFF(this.weekSettings, pNSScheduleBreakSettings.weekSettings) && this.skipDownTimeStatus == pNSScheduleBreakSettings.skipDownTimeStatus;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.shouldShowDownTime) * 31) + this.downTimeStatus) * 31) + this.type) * 31) + this.weekSettings.hashCode()) * 31) + this.skipDownTimeStatus;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSScheduleBreakSettings(shouldShowDownTime=");
        sbLIZ.append(this.shouldShowDownTime);
        sbLIZ.append(", downTimeStatus=");
        sbLIZ.append(this.downTimeStatus);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", weekSettings=");
        sbLIZ.append(this.weekSettings);
        sbLIZ.append(", skipDownTimeStatus=");
        sbLIZ.append(this.skipDownTimeStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSScheduleBreakSettings() {
        this(false, 0, 0, new ArrayList(), 0);
    }

    public PNSScheduleBreakSettings(boolean z, int i, int i2, List<PNSScheduleBreakWeekSettings> list, int i3) {
        this.shouldShowDownTime = z;
        this.downTimeStatus = i;
        this.type = i2;
        this.weekSettings = list;
        this.skipDownTimeStatus = i3;
    }
}
