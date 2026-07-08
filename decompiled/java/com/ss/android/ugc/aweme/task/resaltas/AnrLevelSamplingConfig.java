package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AnrLevelSamplingConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("excluded_collectors")
    public final List<String> excludedCollectors;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("max_samples")
    public final int maxSamples;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("state")
    public final String state;

    @C09CT("timeout_ms")
    public final long timeoutMs;

    @C09CT("trigger_level")
    public final int triggerLevel;

    public AnrLevelSamplingConfig() {
        this(false, 2, 2000L, 60000L, 30, "anr_level", "high", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnrLevelSamplingConfig)) {
            return false;
        }
        AnrLevelSamplingConfig anrLevelSamplingConfig = (AnrLevelSamplingConfig) obj;
        return this.enable == anrLevelSamplingConfig.enable && this.triggerLevel == anrLevelSamplingConfig.triggerLevel && this.intervalMs == anrLevelSamplingConfig.intervalMs && this.timeoutMs == anrLevelSamplingConfig.timeoutMs && this.maxSamples == anrLevelSamplingConfig.maxSamples && Intrinsics.LJFF(this.scene, anrLevelSamplingConfig.scene) && Intrinsics.LJFF(this.state, anrLevelSamplingConfig.state) && Intrinsics.LJFF(this.excludedCollectors, anrLevelSamplingConfig.excludedCollectors);
    }

    public int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.triggerLevel) * 31) + C786410Ut5.Y2(this.intervalMs)) * 31) + C786410Ut5.Y2(this.timeoutMs)) * 31) + this.maxSamples) * 31) + this.scene.hashCode()) * 31) + this.state.hashCode()) * 31;
        List<String> list = this.excludedCollectors;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnrLevelSamplingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", triggerLevel=");
        sbLIZ.append(this.triggerLevel);
        sbLIZ.append(", intervalMs=");
        sbLIZ.append(this.intervalMs);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(", maxSamples=");
        sbLIZ.append(this.maxSamples);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", excludedCollectors=");
        sbLIZ.append(this.excludedCollectors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnrLevelSamplingConfig(boolean z, int i, long j, long j2, int i2, String str, String str2, List<String> list) {
        this.enable = z;
        this.triggerLevel = i;
        this.intervalMs = j;
        this.timeoutMs = j2;
        this.maxSamples = i2;
        this.scene = str;
        this.state = str2;
        this.excludedCollectors = list;
    }
}
