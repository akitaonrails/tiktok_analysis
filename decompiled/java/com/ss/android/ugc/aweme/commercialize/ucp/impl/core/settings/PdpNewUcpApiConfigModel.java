package com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpNewUcpApiConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("retry_count")
    public final int retryCount;

    @C09CT("retry_interval")
    public final int retryInterval;

    public PdpNewUcpApiConfigModel() {
        this(true, 1, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpNewUcpApiConfigModel)) {
            return false;
        }
        PdpNewUcpApiConfigModel pdpNewUcpApiConfigModel = (PdpNewUcpApiConfigModel) obj;
        return this.enable == pdpNewUcpApiConfigModel.enable && this.retryCount == pdpNewUcpApiConfigModel.retryCount && this.retryInterval == pdpNewUcpApiConfigModel.retryInterval;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.retryCount) * 31) + this.retryInterval;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpNewUcpApiConfigModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", retryInterval=");
        sbLIZ.append(this.retryInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PdpNewUcpApiConfigModel(boolean z, int i, int i2) {
        this.enable = z;
        this.retryCount = i;
        this.retryInterval = i2;
    }
}
