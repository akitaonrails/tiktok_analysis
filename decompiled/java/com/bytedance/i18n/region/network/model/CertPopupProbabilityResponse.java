package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CertPopupProbabilityResponse {

    @C09CT("cert_probability")
    public final List<CertProbabilityEntry> certProbability;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    public CertPopupProbabilityResponse() {
        this(0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertPopupProbabilityResponse)) {
            return false;
        }
        CertPopupProbabilityResponse certPopupProbabilityResponse = (CertPopupProbabilityResponse) obj;
        return this.errorCode == certPopupProbabilityResponse.errorCode && Intrinsics.LJFF(this.errorMessage, certPopupProbabilityResponse.errorMessage) && Intrinsics.LJFF(this.certProbability, certPopupProbabilityResponse.certProbability);
    }

    public final int hashCode() {
        int i = this.errorCode * 31;
        String str = this.errorMessage;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<CertProbabilityEntry> list = this.certProbability;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertPopupProbabilityResponse(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(", certProbability=");
        sbLIZ.append(this.certProbability);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CertPopupProbabilityResponse(int i, String str, List<CertProbabilityEntry> list) {
        this.errorCode = i;
        this.errorMessage = str;
        this.certProbability = list;
    }
}
