package com.ss.android.ugc.aweme.ecommerce.base.osp.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomTTSNewOspArchConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_sea_combined_sku")
    public final boolean enableSeaCombinedSku;

    public EcomTTSNewOspArchConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomTTSNewOspArchConfig)) {
            return false;
        }
        EcomTTSNewOspArchConfig ecomTTSNewOspArchConfig = (EcomTTSNewOspArchConfig) obj;
        return this.enable == ecomTTSNewOspArchConfig.enable && this.enableSeaCombinedSku == ecomTTSNewOspArchConfig.enableSeaCombinedSku;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableSeaCombinedSku);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomTTSNewOspArchConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableSeaCombinedSku=");
        sbLIZ.append(this.enableSeaCombinedSku);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomTTSNewOspArchConfig(boolean z, boolean z2) {
        this.enable = z;
        this.enableSeaCombinedSku = z2;
    }
}
