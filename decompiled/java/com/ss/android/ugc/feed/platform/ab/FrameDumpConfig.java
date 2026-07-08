package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes29.dex */
public final class FrameDumpConfig {

    @C09CT("video_dump_time_window")
    public final Integer dumpTimeWindow;

    @C09CT("frame_diff_step_size")
    public final Integer frameDiffStepSize;

    @C09CT("video_dump_time_limit")
    public final Float videoDumpTimeLimit;

    public FrameDumpConfig() {
        this(Float.valueOf(0.6f), Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), 80);
    }

    public FrameDumpConfig(Float f, Integer num, Integer num2) {
        this.videoDumpTimeLimit = f;
        this.dumpTimeWindow = num;
        this.frameDiffStepSize = num2;
    }
}
