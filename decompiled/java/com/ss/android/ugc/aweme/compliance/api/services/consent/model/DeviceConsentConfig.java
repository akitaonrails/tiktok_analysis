package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DeviceConsentConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("consent_box")
    public final ConsentBoxConfig consentBox;

    @C09CT("hu_consent")
    public final ConsentBoxConfig huConsent;

    @C09CT("kr_consent")
    public final KRConsentConfig krConsent;

    public DeviceConsentConfig() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceConsentConfig)) {
            return false;
        }
        DeviceConsentConfig deviceConsentConfig = (DeviceConsentConfig) obj;
        return Intrinsics.LJFF(this.consentBox, deviceConsentConfig.consentBox) && Intrinsics.LJFF(this.huConsent, deviceConsentConfig.huConsent) && Intrinsics.LJFF(this.krConsent, deviceConsentConfig.krConsent);
    }

    public int hashCode() {
        ConsentBoxConfig consentBoxConfig = this.consentBox;
        int iHashCode = (consentBoxConfig == null ? 0 : consentBoxConfig.hashCode()) * 31;
        ConsentBoxConfig consentBoxConfig2 = this.huConsent;
        int iHashCode2 = (iHashCode + (consentBoxConfig2 == null ? 0 : consentBoxConfig2.hashCode())) * 31;
        KRConsentConfig kRConsentConfig = this.krConsent;
        return iHashCode2 + (kRConsentConfig != null ? kRConsentConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceConsentConfig(consentBox=");
        sbLIZ.append(this.consentBox);
        sbLIZ.append(", huConsent=");
        sbLIZ.append(this.huConsent);
        sbLIZ.append(", krConsent=");
        sbLIZ.append(this.krConsent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeviceConsentConfig(ConsentBoxConfig consentBoxConfig, ConsentBoxConfig consentBoxConfig2, KRConsentConfig kRConsentConfig) {
        this.consentBox = consentBoxConfig;
        this.huConsent = consentBoxConfig2;
        this.krConsent = kRConsentConfig;
    }
}
