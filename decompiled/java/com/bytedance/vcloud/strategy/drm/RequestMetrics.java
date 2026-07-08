package com.bytedance.vcloud.strategy.drm;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes35.dex */
public final class RequestMetrics {
    public long endTimeMs;
    public int retryCount;
    public long startTimeMs;
    public boolean success;

    public long durationMs() {
        return this.endTimeMs - this.startTimeMs;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestMetrics{durationMs=");
        sbLIZ.append(durationMs());
        sbLIZ.append(", success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.startTimeMs);
        sbLIZ.append(", endTimeMs=");
        sbLIZ.append(this.endTimeMs);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
