package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PNSSleepStreakStatus {

    @C09CT("cur_week_status")
    public final Boolean currentWeekStatus;

    @C09CT("show_last_call_reminder")
    public final Boolean shouldShowLastCallForStreak;

    @C09CT("week")
    public final Integer week;

    public PNSSleepStreakStatus() {
        this(0, Boolean.FALSE, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSSleepStreakStatus)) {
            return false;
        }
        PNSSleepStreakStatus pNSSleepStreakStatus = (PNSSleepStreakStatus) obj;
        return Intrinsics.LJFF(this.week, pNSSleepStreakStatus.week) && Intrinsics.LJFF(this.currentWeekStatus, pNSSleepStreakStatus.currentWeekStatus) && Intrinsics.LJFF(this.shouldShowLastCallForStreak, pNSSleepStreakStatus.shouldShowLastCallForStreak);
    }

    public final int hashCode() {
        Integer num = this.week;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.currentWeekStatus;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowLastCallForStreak;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSSleepStreakStatus(week=");
        sbLIZ.append(this.week);
        sbLIZ.append(", currentWeekStatus=");
        sbLIZ.append(this.currentWeekStatus);
        sbLIZ.append(", shouldShowLastCallForStreak=");
        sbLIZ.append(this.shouldShowLastCallForStreak);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSSleepStreakStatus(Integer num, Boolean bool, Boolean bool2) {
        this.week = num;
        this.currentWeekStatus = bool;
        this.shouldShowLastCallForStreak = bool2;
    }
}
