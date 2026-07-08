package com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewCommentBoxConfig {

    @C09CT("comment_input_open_delay")
    public final long commentInputOpenDelay;

    @C09CT("display_delay")
    public final long displayDelay;

    @C09CT("display_exit_days")
    public final int displayExitDays;

    @C09CT("display_no_click_days")
    public final int displayNoClickDays;

    @C09CT("display_no_click_oneday")
    public final int displayNoClickOneday;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("exit_delay")
    public final long exitDelay;

    @C09CT("freq_version")
    public final int freqVersion;

    @C09CT("style")
    public final int style;

    public LivePreviewCommentBoxConfig() {
        this(false, 0, 3000L, 10000L, 1000L, 5, 3, 7, 1);
    }

    public LivePreviewCommentBoxConfig(boolean z, int i, long j, long j2, long j3, int i2, int i3, int i4, int i5) {
        this.enable = z;
        this.style = i;
        this.displayDelay = j;
        this.exitDelay = j2;
        this.commentInputOpenDelay = j3;
        this.displayNoClickOneday = i2;
        this.displayNoClickDays = i3;
        this.displayExitDays = i4;
        this.freqVersion = i5;
    }
}
