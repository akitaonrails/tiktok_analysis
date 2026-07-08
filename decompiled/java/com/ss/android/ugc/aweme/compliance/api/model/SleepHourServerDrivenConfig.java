package com.ss.android.ugc.aweme.compliance.api.model;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SleepHourServerDrivenConfig {
    public static final int $stable = 0;
    public final String endTime;
    public final boolean isFirstShown;
    public final String startTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepHourServerDrivenConfig)) {
            return false;
        }
        SleepHourServerDrivenConfig sleepHourServerDrivenConfig = (SleepHourServerDrivenConfig) obj;
        return this.isFirstShown == sleepHourServerDrivenConfig.isFirstShown && Intrinsics.LJFF(this.startTime, sleepHourServerDrivenConfig.startTime) && Intrinsics.LJFF(this.endTime, sleepHourServerDrivenConfig.endTime);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isFirstShown) * 31;
        String str = this.startTime;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SleepHourServerDrivenConfig(isFirstShown=");
        sbLIZ.append(this.isFirstShown);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFirstShown() {
        return this.isFirstShown;
    }

    public SleepHourServerDrivenConfig(boolean z, String str, String str2) {
        this.isFirstShown = z;
        this.startTime = str;
        this.endTime = str2;
    }
}
