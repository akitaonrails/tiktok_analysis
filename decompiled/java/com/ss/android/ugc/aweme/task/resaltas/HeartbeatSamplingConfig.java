package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HeartbeatSamplingConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("excluded_collectors")
    public final List<String> excludedCollectors;

    @C09CT("foreground_only")
    public final boolean foregroundOnly;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("max_total_samples")
    public final int maxTotalSamples;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("start_delay_ms")
    public final long startDelayMs;

    @C09CT("state")
    public final String state;

    public HeartbeatSamplingConfig() {
        this(false, 10000L, 30000L, 0, true, "heartbeat", "heartbeat", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartbeatSamplingConfig)) {
            return false;
        }
        HeartbeatSamplingConfig heartbeatSamplingConfig = (HeartbeatSamplingConfig) obj;
        return this.enable == heartbeatSamplingConfig.enable && this.intervalMs == heartbeatSamplingConfig.intervalMs && this.startDelayMs == heartbeatSamplingConfig.startDelayMs && this.maxTotalSamples == heartbeatSamplingConfig.maxTotalSamples && this.foregroundOnly == heartbeatSamplingConfig.foregroundOnly && Intrinsics.LJFF(this.scene, heartbeatSamplingConfig.scene) && Intrinsics.LJFF(this.state, heartbeatSamplingConfig.state) && Intrinsics.LJFF(this.excludedCollectors, heartbeatSamplingConfig.excludedCollectors);
    }

    public int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.intervalMs)) * 31) + C786410Ut5.Y2(this.startDelayMs)) * 31) + this.maxTotalSamples) * 31) + C786410Ut5.Z2(this.foregroundOnly)) * 31) + this.scene.hashCode()) * 31) + this.state.hashCode()) * 31;
        List<String> list = this.excludedCollectors;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeartbeatSamplingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", intervalMs=");
        sbLIZ.append(this.intervalMs);
        sbLIZ.append(", startDelayMs=");
        sbLIZ.append(this.startDelayMs);
        sbLIZ.append(", maxTotalSamples=");
        sbLIZ.append(this.maxTotalSamples);
        sbLIZ.append(", foregroundOnly=");
        sbLIZ.append(this.foregroundOnly);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", excludedCollectors=");
        sbLIZ.append(this.excludedCollectors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HeartbeatSamplingConfig(boolean z, long j, long j2, int i, boolean z2, String str, String str2, List<String> list) {
        this.enable = z;
        this.intervalMs = j;
        this.startDelayMs = j2;
        this.maxTotalSamples = i;
        this.foregroundOnly = z2;
        this.scene = str;
        this.state = str2;
        this.excludedCollectors = list;
    }
}
