package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FreeTrialInfo {

    @C09CT("duration_value")
    public final Long durationValue;

    @C09CT("footer")
    public final FooterOverride footer;

    @C09CT("free_trial_duration_units")
    public final Integer freeTrialDurationUnits;

    public FreeTrialInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTrialInfo)) {
            return false;
        }
        FreeTrialInfo freeTrialInfo = (FreeTrialInfo) obj;
        return Intrinsics.LJFF(this.durationValue, freeTrialInfo.durationValue) && Intrinsics.LJFF(this.freeTrialDurationUnits, freeTrialInfo.freeTrialDurationUnits) && Intrinsics.LJFF(this.footer, freeTrialInfo.footer);
    }

    public final int hashCode() {
        Long l = this.durationValue;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.freeTrialDurationUnits;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        FooterOverride footerOverride = this.footer;
        return iHashCode2 + (footerOverride != null ? footerOverride.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreeTrialInfo(durationValue=");
        sbLIZ.append(this.durationValue);
        sbLIZ.append(", freeTrialDurationUnits=");
        sbLIZ.append(this.freeTrialDurationUnits);
        sbLIZ.append(", footer=");
        sbLIZ.append(this.footer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FreeTrialInfo(Long l, Integer num, FooterOverride footerOverride) {
        this.durationValue = l;
        this.freeTrialDurationUnits = num;
        this.footer = footerOverride;
    }
}
