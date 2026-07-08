package com.ss.android.ugc.aweme.offlinemode.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultOfflineModeConfig {

    @C09CT("low_storage_threshold_gb")
    public final double lowStorageThresholdGb;

    @C09CT("min_available_storage_gb")
    public final double minAvailableStorageGb;

    @C09CT("new_user_protect_days")
    public final int newUserProtectDays;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultOfflineModeConfig)) {
            return false;
        }
        DefaultOfflineModeConfig defaultOfflineModeConfig = (DefaultOfflineModeConfig) obj;
        return Double.compare(this.minAvailableStorageGb, defaultOfflineModeConfig.minAvailableStorageGb) == 0 && Double.compare(this.lowStorageThresholdGb, defaultOfflineModeConfig.lowStorageThresholdGb) == 0 && this.newUserProtectDays == defaultOfflineModeConfig.newUserProtectDays;
    }

    public final int hashCode() {
        return (((C786410Ut5.X2(this.minAvailableStorageGb) * 31) + C786410Ut5.X2(this.lowStorageThresholdGb)) * 31) + this.newUserProtectDays;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultOfflineModeConfig(minAvailableStorageGb=");
        sbLIZ.append(this.minAvailableStorageGb);
        sbLIZ.append(", lowStorageThresholdGb=");
        sbLIZ.append(this.lowStorageThresholdGb);
        sbLIZ.append(", newUserProtectDays=");
        sbLIZ.append(this.newUserProtectDays);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DefaultOfflineModeConfig() {
        this(2.6d, 10.0d, 1);
    }

    public DefaultOfflineModeConfig(double d, double d2, int i) {
        this.minAvailableStorageGb = d;
        this.lowStorageThresholdGb = d2;
        this.newUserProtectDays = i;
    }
}
