package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMRequestFrequencyLimitConfig {

    @C09CT("im_request_frequency_limit_count")
    public final int count;

    @C09CT("im_request_frequency_limit_enabled")
    public final int enabled;

    public IMRequestFrequencyLimitConfig() {
        this(0, 5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMRequestFrequencyLimitConfig)) {
            return false;
        }
        IMRequestFrequencyLimitConfig iMRequestFrequencyLimitConfig = (IMRequestFrequencyLimitConfig) obj;
        return this.enabled == iMRequestFrequencyLimitConfig.enabled && this.count == iMRequestFrequencyLimitConfig.count;
    }

    public int hashCode() {
        return (this.enabled * 31) + this.count;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMRequestFrequencyLimitConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMRequestFrequencyLimitConfig(int i, int i2) {
        this.enabled = i;
        this.count = i2;
    }
}
