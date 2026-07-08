package com.ss.android.ugc.aweme.pns.businessmodel;

import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PnSScheduleBreakSettings implements Serializable {
    public final int downTimeStatus;
    public final boolean shouldShowDownTime;
    public final int skipDownTimeStatus;
    public final int type;
    public final List<PnSScheduleBreakWeekSettings> weekSettings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnSScheduleBreakSettings)) {
            return false;
        }
        PnSScheduleBreakSettings pnSScheduleBreakSettings = (PnSScheduleBreakSettings) obj;
        return this.shouldShowDownTime == pnSScheduleBreakSettings.shouldShowDownTime && this.downTimeStatus == pnSScheduleBreakSettings.downTimeStatus && this.type == pnSScheduleBreakSettings.type && Intrinsics.LJFF(this.weekSettings, pnSScheduleBreakSettings.weekSettings) && this.skipDownTimeStatus == pnSScheduleBreakSettings.skipDownTimeStatus;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.shouldShowDownTime) * 31) + this.downTimeStatus) * 31) + this.type) * 31) + this.weekSettings.hashCode()) * 31) + this.skipDownTimeStatus;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnSScheduleBreakSettings(shouldShowDownTime=");
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

    public PnSScheduleBreakSettings() {
        this(false, 0, 0, new ArrayList(), 0);
    }

    public PnSScheduleBreakSettings(boolean z, int i, int i2, List<PnSScheduleBreakWeekSettings> list, int i3) {
        this.shouldShowDownTime = z;
        this.downTimeStatus = i;
        this.type = i2;
        this.weekSettings = list;
        this.skipDownTimeStatus = i3;
    }
}
