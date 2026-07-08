package com.ss.android.ugc.aweme.compliance.api.services.edm;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EdmConsentAgreementResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("data")
    public final EdmConsentAgreementData data;

    public EdmConsentAgreementResponse() {
        this(null);
    }

    public final EdmConsentAgreementResponse copy(EdmConsentAgreementData edmConsentAgreementData) {
        return new EdmConsentAgreementResponse(edmConsentAgreementData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EdmConsentAgreementResponse) && Intrinsics.LJFF(this.data, ((EdmConsentAgreementResponse) obj).data);
    }

    public int hashCode() {
        EdmConsentAgreementData edmConsentAgreementData = this.data;
        if (edmConsentAgreementData == null) {
            return 0;
        }
        return edmConsentAgreementData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EdmConsentAgreementResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EdmConsentAgreementData getData() {
        return this.data;
    }

    public EdmConsentAgreementResponse(EdmConsentAgreementData edmConsentAgreementData) {
        this.data = edmConsentAgreementData;
    }
}
