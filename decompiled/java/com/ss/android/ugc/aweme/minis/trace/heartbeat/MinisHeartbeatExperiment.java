package com.ss.android.ugc.aweme.minis.trace.heartbeat;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class MinisHeartbeatExperiment implements Serializable {
    public static final int $stable = 0;

    @C09CT("early_interval_seconds")
    public final int earlyIntervalSeconds;

    @C09CT("interval_seconds")
    public final int intervalSeconds;

    @C09CT("v1_enabled")
    public final boolean v1Enabled;

    @C09CT("v2_enabled")
    public final boolean v2Enabled;

    public MinisHeartbeatExperiment() {
        this(true, true, 30, 5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisHeartbeatExperiment)) {
            return false;
        }
        MinisHeartbeatExperiment minisHeartbeatExperiment = (MinisHeartbeatExperiment) obj;
        return this.v1Enabled == minisHeartbeatExperiment.v1Enabled && this.v2Enabled == minisHeartbeatExperiment.v2Enabled && this.intervalSeconds == minisHeartbeatExperiment.intervalSeconds && this.earlyIntervalSeconds == minisHeartbeatExperiment.earlyIntervalSeconds;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.v1Enabled) * 31) + C786410Ut5.Z2(this.v2Enabled)) * 31) + this.intervalSeconds) * 31) + this.earlyIntervalSeconds;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisHeartbeatExperiment(v1Enabled=");
        sbLIZ.append(this.v1Enabled);
        sbLIZ.append(", v2Enabled=");
        sbLIZ.append(this.v2Enabled);
        sbLIZ.append(", intervalSeconds=");
        sbLIZ.append(this.intervalSeconds);
        sbLIZ.append(", earlyIntervalSeconds=");
        sbLIZ.append(this.earlyIntervalSeconds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisHeartbeatExperiment(boolean z, boolean z2, int i, int i2) {
        this.v1Enabled = z;
        this.v2Enabled = z2;
        this.intervalSeconds = i;
        this.earlyIntervalSeconds = i2;
    }
}
