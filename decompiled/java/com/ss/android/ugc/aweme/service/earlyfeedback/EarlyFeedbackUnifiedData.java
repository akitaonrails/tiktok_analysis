package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class EarlyFeedbackUnifiedData {

    @C09CT("dau")
    public final EarlyFeedbackButtonData dau;

    @C09CT("dnu")
    public final EarlyFeedbackButtonData dnu;

    @C09CT("low_active")
    public final EarlyFeedbackButtonData lowActive;

    public EarlyFeedbackUnifiedData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyFeedbackUnifiedData)) {
            return false;
        }
        EarlyFeedbackUnifiedData earlyFeedbackUnifiedData = (EarlyFeedbackUnifiedData) obj;
        return Intrinsics.LJFF(this.dnu, earlyFeedbackUnifiedData.dnu) && Intrinsics.LJFF(this.lowActive, earlyFeedbackUnifiedData.lowActive) && Intrinsics.LJFF(this.dau, earlyFeedbackUnifiedData.dau);
    }

    public final int hashCode() {
        EarlyFeedbackButtonData earlyFeedbackButtonData = this.dnu;
        int iHashCode = (earlyFeedbackButtonData == null ? 0 : earlyFeedbackButtonData.hashCode()) * 31;
        EarlyFeedbackButtonData earlyFeedbackButtonData2 = this.lowActive;
        int iHashCode2 = (iHashCode + (earlyFeedbackButtonData2 == null ? 0 : earlyFeedbackButtonData2.hashCode())) * 31;
        EarlyFeedbackButtonData earlyFeedbackButtonData3 = this.dau;
        return iHashCode2 + (earlyFeedbackButtonData3 != null ? earlyFeedbackButtonData3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EarlyFeedbackUnifiedData(dnu=");
        sbLIZ.append(this.dnu);
        sbLIZ.append(", lowActive=");
        sbLIZ.append(this.lowActive);
        sbLIZ.append(", dau=");
        sbLIZ.append(this.dau);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EarlyFeedbackUnifiedData(EarlyFeedbackButtonData earlyFeedbackButtonData, EarlyFeedbackButtonData earlyFeedbackButtonData2, EarlyFeedbackButtonData earlyFeedbackButtonData3) {
        this.dnu = earlyFeedbackButtonData;
        this.lowActive = earlyFeedbackButtonData2;
        this.dau = earlyFeedbackButtonData3;
    }
}
