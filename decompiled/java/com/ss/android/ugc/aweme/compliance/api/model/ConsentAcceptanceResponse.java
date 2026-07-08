package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class ConsentAcceptanceResponse extends BaseResponse {

    @C09CT("record_found")
    public final boolean recordFound;

    @C09CT("should_show")
    public final boolean shouldShow;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentAcceptanceResponse)) {
            return false;
        }
        ConsentAcceptanceResponse consentAcceptanceResponse = (ConsentAcceptanceResponse) obj;
        return this.shouldShow == consentAcceptanceResponse.shouldShow && this.recordFound == consentAcceptanceResponse.recordFound;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.shouldShow) * 31) + C786410Ut5.Z2(this.recordFound);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentAcceptanceResponse(shouldShow=");
        sbLIZ.append(this.shouldShow);
        sbLIZ.append(", recordFound=");
        sbLIZ.append(this.recordFound);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConsentAcceptanceResponse(boolean z, boolean z2) {
        this.shouldShow = z;
        this.recordFound = z2;
    }
}
