package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class ToolsBaseInfoConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("collect_duration")
    public final long collectDuration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("sampling_rate")
    public final long samplingRate;

    @C09CT("scene_collect_duration")
    public final long sceneCollectDuration;

    public ToolsBaseInfoConfig() {
        this(false, Mp4ScreenVideoLoadTimeout.CONTROL, 2000L, 50L);
    }

    public ToolsBaseInfoConfig(boolean z, long j, long j2, long j3) {
        this.enable = z;
        this.collectDuration = j;
        this.sceneCollectDuration = j2;
        this.samplingRate = j3;
    }
}
