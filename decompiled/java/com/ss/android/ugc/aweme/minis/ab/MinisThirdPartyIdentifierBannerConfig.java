package com.ss.android.ugc.aweme.minis.ab;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class MinisThirdPartyIdentifierBannerConfig {

    @C09CT("cool_down_time")
    public final int coolDownTime;

    public MinisThirdPartyIdentifierBannerConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisThirdPartyIdentifierBannerConfig) && this.coolDownTime == ((MinisThirdPartyIdentifierBannerConfig) obj).coolDownTime;
    }

    public final int hashCode() {
        return this.coolDownTime;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisThirdPartyIdentifierBannerConfig(coolDownTime=");
        sbLIZ.append(this.coolDownTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisThirdPartyIdentifierBannerConfig(int i) {
        this.coolDownTime = i;
    }
}
