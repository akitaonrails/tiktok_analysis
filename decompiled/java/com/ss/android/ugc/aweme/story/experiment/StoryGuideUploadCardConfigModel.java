package com.ss.android.ugc.aweme.story.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardConfigModel {
    public static final int $stable = 0;

    @C09CT("fast_scroll_threshold_in_ms")
    public final int fastScrollThresholdInMs;

    @C09CT("limit_negative_signal_times")
    public final int limitNegativeSignalTimes;

    @C09CT("negative_signal_forbidden_days")
    public final int negativeSignalForbiddenDays;

    public StoryGuideUploadCardConfigModel() {
        this(3, 15, LivePreCreateNextRoomPlayer.ENABLE);
    }

    public StoryGuideUploadCardConfigModel(int i, int i2, int i3) {
        this.limitNegativeSignalTimes = i;
        this.negativeSignalForbiddenDays = i2;
        this.fastScrollThresholdInMs = i3;
    }
}
