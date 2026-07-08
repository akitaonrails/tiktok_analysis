package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class ToolsCleanupInUseConfig {

    @C09CT("clean_interval_ms")
    public final long cleanIntervalMs;

    @C09CT("enable")
    public final boolean enable;

    public ToolsCleanupInUseConfig() {
        this(false, 21600000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolsCleanupInUseConfig)) {
            return false;
        }
        ToolsCleanupInUseConfig toolsCleanupInUseConfig = (ToolsCleanupInUseConfig) obj;
        return this.enable == toolsCleanupInUseConfig.enable && this.cleanIntervalMs == toolsCleanupInUseConfig.cleanIntervalMs;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.cleanIntervalMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsCleanupInUseConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", cleanIntervalMs=");
        sbLIZ.append(this.cleanIntervalMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ToolsCleanupInUseConfig(boolean z, long j) {
        this.enable = z;
        this.cleanIntervalMs = j;
    }
}
