package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PNSDigitalWellbeingMissionStatus {

    @C09CT("screen_time_set_task_status")
    public final Boolean screenTimeSetTaskStatus;

    @C09CT("sleep_streak_status")
    public final PNSSleepStreakStatus sleepStreakStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSDigitalWellbeingMissionStatus)) {
            return false;
        }
        PNSDigitalWellbeingMissionStatus pNSDigitalWellbeingMissionStatus = (PNSDigitalWellbeingMissionStatus) obj;
        return Intrinsics.LJFF(this.sleepStreakStatus, pNSDigitalWellbeingMissionStatus.sleepStreakStatus) && Intrinsics.LJFF(this.screenTimeSetTaskStatus, pNSDigitalWellbeingMissionStatus.screenTimeSetTaskStatus);
    }

    public final int hashCode() {
        PNSSleepStreakStatus pNSSleepStreakStatus = this.sleepStreakStatus;
        int iHashCode = (pNSSleepStreakStatus == null ? 0 : pNSSleepStreakStatus.hashCode()) * 31;
        Boolean bool = this.screenTimeSetTaskStatus;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSDigitalWellbeingMissionStatus(sleepStreakStatus=");
        sbLIZ.append(this.sleepStreakStatus);
        sbLIZ.append(", screenTimeSetTaskStatus=");
        sbLIZ.append(this.screenTimeSetTaskStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSDigitalWellbeingMissionStatus() {
        this(new PNSSleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE);
    }

    public PNSDigitalWellbeingMissionStatus(PNSSleepStreakStatus pNSSleepStreakStatus, Boolean bool) {
        this.sleepStreakStatus = pNSSleepStreakStatus;
        this.screenTimeSetTaskStatus = bool;
    }
}
