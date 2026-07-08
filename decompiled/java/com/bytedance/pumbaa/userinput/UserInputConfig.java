package com.bytedance.pumbaa.userinput;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UserInputConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("performance_sample_rate")
    public final double performanceSampleRate;

    @C09CT("pipeline")
    public final PipelineConfig pipeline;

    public UserInputConfig() {
        this(false, 0.1d, new PipelineConfig(new ComponentConfig(false, 5000), new ComponentConfig(false, 5000)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInputConfig)) {
            return false;
        }
        UserInputConfig userInputConfig = (UserInputConfig) obj;
        return this.enable == userInputConfig.enable && Double.compare(this.performanceSampleRate, userInputConfig.performanceSampleRate) == 0 && Intrinsics.LJFF(this.pipeline, userInputConfig.pipeline);
    }

    public UserInputConfig(boolean z, double d, PipelineConfig pipelineConfig) {
        this.enable = z;
        this.performanceSampleRate = d;
        this.pipeline = pipelineConfig;
    }
}
