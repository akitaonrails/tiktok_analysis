package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class DislikeToMainAreaStage2Config {

    @C09CT("dislike_text_max_length")
    public final int dislikeTextMaxLength;

    @C09CT("show_unClickable_toast")
    public final boolean showToast;

    @C09CT("show_unClickable_toast_count")
    public final int showToastCount;

    @C09CT("show_unClickable_toast_delay")
    public final long showToastDelay;

    public DislikeToMainAreaStage2Config() {
        this(false, 86400L, 3, 60);
    }

    public DislikeToMainAreaStage2Config(boolean z, long j, int i, int i2) {
        this.showToast = z;
        this.showToastDelay = j;
        this.showToastCount = i;
        this.dislikeTextMaxLength = i2;
    }
}
