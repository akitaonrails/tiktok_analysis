package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class UltimateCmplSettings extends BaseResponse {

    @C09CT("c_r")
    public final String country;

    @C09CT("postpone_af_tracking")
    public final boolean delayAFStart;

    @C09CT("set_anonymize_for_appsflyer")
    public final boolean setAnonymizeUserForAF;

    @C09CT("set_anonymize_for_firebase")
    public final boolean setAnonymizeUserForFireBase;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UltimateCmplSettings)) {
            return false;
        }
        UltimateCmplSettings ultimateCmplSettings = (UltimateCmplSettings) obj;
        return this.setAnonymizeUserForAF == ultimateCmplSettings.setAnonymizeUserForAF && this.delayAFStart == ultimateCmplSettings.delayAFStart && Intrinsics.LJFF(this.country, ultimateCmplSettings.country) && this.setAnonymizeUserForFireBase == ultimateCmplSettings.setAnonymizeUserForFireBase;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.setAnonymizeUserForAF) * 31) + C786410Ut5.Z2(this.delayAFStart)) * 31) + this.country.hashCode()) * 31) + C786410Ut5.Z2(this.setAnonymizeUserForFireBase);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UltimateCmplSettings(setAnonymizeUserForAF=");
        sbLIZ.append(this.setAnonymizeUserForAF);
        sbLIZ.append(", delayAFStart=");
        sbLIZ.append(this.delayAFStart);
        sbLIZ.append(", country=");
        sbLIZ.append(this.country);
        sbLIZ.append(", setAnonymizeUserForFireBase=");
        sbLIZ.append(this.setAnonymizeUserForFireBase);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UltimateCmplSettings(boolean z, boolean z2, String str, boolean z3) {
        this.setAnonymizeUserForAF = z;
        this.delayAFStart = z2;
        this.country = str;
        this.setAnonymizeUserForFireBase = z3;
    }
}
