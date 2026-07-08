package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class Donor implements Serializable {
    public static final int $stable = 8;

    @C09CT("anonymous")
    public final boolean anonymous;

    @C09CT("is_top_donor")
    public final boolean isTopDonor;

    @C09CT("tiktok_amount")
    public final String tiktokAmount;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("user")
    public final UserStruct user;

    @C09CT("user_amount")
    public final String userAmount;

    public Donor() {
        this(null, null, null, true, false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Donor)) {
            return false;
        }
        Donor donor = (Donor) obj;
        return Intrinsics.LJFF(this.timestamp, donor.timestamp) && Intrinsics.LJFF(this.userAmount, donor.userAmount) && Intrinsics.LJFF(this.tiktokAmount, donor.tiktokAmount) && this.anonymous == donor.anonymous && this.isTopDonor == donor.isTopDonor && Intrinsics.LJFF(this.user, donor.user);
    }

    public int hashCode() {
        Long l = this.timestamp;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.userAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tiktokAmount;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.anonymous)) * 31) + C786410Ut5.Z2(this.isTopDonor)) * 31;
        UserStruct userStruct = this.user;
        return iHashCode3 + (userStruct != null ? userStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Donor(timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", userAmount=");
        sbLIZ.append(this.userAmount);
        sbLIZ.append(", tiktokAmount=");
        sbLIZ.append(this.tiktokAmount);
        sbLIZ.append(", anonymous=");
        sbLIZ.append(this.anonymous);
        sbLIZ.append(", isTopDonor=");
        sbLIZ.append(this.isTopDonor);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isTopDonor() {
        return this.isTopDonor;
    }

    public Donor(Long l, String str, String str2, boolean z, boolean z2, UserStruct userStruct) {
        this.timestamp = l;
        this.userAmount = str;
        this.tiktokAmount = str2;
        this.anonymous = z;
        this.isTopDonor = z2;
        this.user = userStruct;
    }
}
