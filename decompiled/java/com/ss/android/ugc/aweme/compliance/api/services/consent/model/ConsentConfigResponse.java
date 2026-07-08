package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentConfigResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("consent_label")
    public final ConsentLabelConfig consentLabel;

    @C09CT("device_consent")
    public final DeviceConsentConfig deviceConsent;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("status_code")
    public final Integer statusCode;

    public ConsentConfigResponse() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentConfigResponse)) {
            return false;
        }
        ConsentConfigResponse consentConfigResponse = (ConsentConfigResponse) obj;
        return Intrinsics.LJFF(this.deviceConsent, consentConfigResponse.deviceConsent) && Intrinsics.LJFF(this.consentLabel, consentConfigResponse.consentLabel) && Intrinsics.LJFF(this.statusCode, consentConfigResponse.statusCode) && Intrinsics.LJFF(this.errorCode, consentConfigResponse.errorCode);
    }

    public int hashCode() {
        DeviceConsentConfig deviceConsentConfig = this.deviceConsent;
        int iHashCode = (deviceConsentConfig == null ? 0 : deviceConsentConfig.hashCode()) * 31;
        ConsentLabelConfig consentLabelConfig = this.consentLabel;
        int iHashCode2 = (iHashCode + (consentLabelConfig == null ? 0 : consentLabelConfig.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.errorCode;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentConfigResponse(deviceConsent=");
        sbLIZ.append(this.deviceConsent);
        sbLIZ.append(", consentLabel=");
        sbLIZ.append(this.consentLabel);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConsentConfigResponse(DeviceConsentConfig deviceConsentConfig, ConsentLabelConfig consentLabelConfig, Integer num, Integer num2) {
        this.deviceConsent = deviceConsentConfig;
        this.consentLabel = consentLabelConfig;
        this.statusCode = num;
        this.errorCode = num2;
    }
}
