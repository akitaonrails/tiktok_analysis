package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class DonationStats implements Serializable {
    public static final int $stable = 0;

    @C09CT("goal_amount_with_unit")
    public final String goalAmountWithUnit;

    @C09CT("progress")
    public final double progress;

    @C09CT("total_amount_with_unit")
    public final String totalAmountWithUnit;

    @C09CT("total_donor_count")
    public final int totalDonorCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonationStats)) {
            return false;
        }
        DonationStats donationStats = (DonationStats) obj;
        return Intrinsics.LJFF(this.goalAmountWithUnit, donationStats.goalAmountWithUnit) && Double.compare(this.progress, donationStats.progress) == 0 && Intrinsics.LJFF(this.totalAmountWithUnit, donationStats.totalAmountWithUnit) && this.totalDonorCount == donationStats.totalDonorCount;
    }

    public int hashCode() {
        return (((((this.goalAmountWithUnit.hashCode() * 31) + C786410Ut5.X2(this.progress)) * 31) + this.totalAmountWithUnit.hashCode()) * 31) + this.totalDonorCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationStats(goalAmountWithUnit=");
        sbLIZ.append(this.goalAmountWithUnit);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", totalAmountWithUnit=");
        sbLIZ.append(this.totalAmountWithUnit);
        sbLIZ.append(", totalDonorCount=");
        sbLIZ.append(this.totalDonorCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DonationStats() {
        this("", 0.0d, "", 0);
    }

    public DonationStats(String str, double d, String str2, int i) {
        this.goalAmountWithUnit = str;
        this.progress = d;
        this.totalAmountWithUnit = str2;
        this.totalDonorCount = i;
    }
}
