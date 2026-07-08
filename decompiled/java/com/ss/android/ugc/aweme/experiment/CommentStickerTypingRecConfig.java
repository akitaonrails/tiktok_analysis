package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentStickerTypingRecConfig {

    @C09CT("auto_disappear_time_ms")
    public final long autoDisappearTimeMs;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("max_items")
    public final int maxItems;

    @C09CT("max_show_times_per_edit")
    public final int maxShowTimesPerEdit;

    @C09CT("pause_ms")
    public final long pauseMs;

    @C09CT("use_local_cache")
    public final boolean useLocalCache;

    public CommentStickerTypingRecConfig() {
        this(false, 25, 50L, 4, Mp4ScreenVideoLoadTimeout.CONTROL, false);
    }

    public CommentStickerTypingRecConfig(boolean z, int i, long j, int i2, long j2, boolean z2) {
        this.enabled = z;
        this.maxItems = i;
        this.pauseMs = j;
        this.maxShowTimesPerEdit = i2;
        this.autoDisappearTimeMs = j2;
        this.useLocalCache = z2;
    }
}
