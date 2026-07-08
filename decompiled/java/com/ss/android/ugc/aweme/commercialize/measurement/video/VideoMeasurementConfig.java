package com.ss.android.ugc.aweme.commercialize.measurement.video;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoMeasurementConfig {

    @C09CT("disable_break_when_not_render")
    public final boolean disableBreakWhenNotRender;

    @C09CT("enable_record_pos_before_stop")
    public final boolean enableRecordPosBeforeStop;

    @C09CT("use_play_progress")
    public final boolean usePlayProgress;

    @C09CT("use_player_manager_pos")
    public final boolean usePlayerManagerPos;

    public VideoMeasurementConfig() {
        this(false, true, true, false);
    }

    public VideoMeasurementConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableRecordPosBeforeStop = z;
        this.usePlayerManagerPos = z2;
        this.usePlayProgress = z3;
        this.disableBreakWhenNotRender = z4;
    }
}
