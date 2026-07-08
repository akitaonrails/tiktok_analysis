package com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumFirstFrameOptConfig {

    @C09CT("enable_async_all_album_key")
    public final boolean enableAsyncAllAlbumKey;

    @C09CT("enable_async_mob_shoot_for_album")
    public final boolean enableAsyncMobShootForAlbum;

    @C09CT("enable_async_trim_low_memory_task")
    public final boolean enableAsyncTrimLowMemoryTask;

    @C09CT("enable_defer_album_timeline_date")
    public final boolean enableDeferAlbumTimelineDate;

    @C09CT("enable_early_color_pick")
    public final boolean enableEarlyColorPick;

    @C09CT("enable_early_grid_render")
    public final boolean enableEarlyGridRender;

    @C09CT("enable_first_frame_scroll_unlock")
    public final boolean enableFirstFrameScrollUnlock;

    @C09CT("enable_first_screen_dedup_read")
    public final boolean enableFirstScreenDedupRead;

    @C09CT("enable_first_screen_stable_truncation")
    public final boolean enableFirstScreenStableTruncation;

    @C09CT("enable_warmup_first_screen")
    public final boolean enableWarmupFirstScreen;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("warmup_first_screen_page_size")
    public final int warmupFirstScreenPageSize;

    public StoryAlbumFirstFrameOptConfig() {
        this(false, false, false, false, false, false, false, false, 12, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryAlbumFirstFrameOptConfig)) {
            return false;
        }
        StoryAlbumFirstFrameOptConfig storyAlbumFirstFrameOptConfig = (StoryAlbumFirstFrameOptConfig) obj;
        return this.enabled == storyAlbumFirstFrameOptConfig.enabled && this.enableEarlyGridRender == storyAlbumFirstFrameOptConfig.enableEarlyGridRender && this.enableWarmupFirstScreen == storyAlbumFirstFrameOptConfig.enableWarmupFirstScreen && this.enableEarlyColorPick == storyAlbumFirstFrameOptConfig.enableEarlyColorPick && this.enableAsyncTrimLowMemoryTask == storyAlbumFirstFrameOptConfig.enableAsyncTrimLowMemoryTask && this.enableAsyncMobShootForAlbum == storyAlbumFirstFrameOptConfig.enableAsyncMobShootForAlbum && this.enableAsyncAllAlbumKey == storyAlbumFirstFrameOptConfig.enableAsyncAllAlbumKey && this.enableDeferAlbumTimelineDate == storyAlbumFirstFrameOptConfig.enableDeferAlbumTimelineDate && this.warmupFirstScreenPageSize == storyAlbumFirstFrameOptConfig.warmupFirstScreenPageSize && this.enableFirstScreenStableTruncation == storyAlbumFirstFrameOptConfig.enableFirstScreenStableTruncation && this.enableFirstScreenDedupRead == storyAlbumFirstFrameOptConfig.enableFirstScreenDedupRead && this.enableFirstFrameScrollUnlock == storyAlbumFirstFrameOptConfig.enableFirstFrameScrollUnlock;
    }

    public final int hashCode() {
        return (((((((((((((((((((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.enableEarlyGridRender)) * 31) + C786410Ut5.Z2(this.enableWarmupFirstScreen)) * 31) + C786410Ut5.Z2(this.enableEarlyColorPick)) * 31) + C786410Ut5.Z2(this.enableAsyncTrimLowMemoryTask)) * 31) + C786410Ut5.Z2(this.enableAsyncMobShootForAlbum)) * 31) + C786410Ut5.Z2(this.enableAsyncAllAlbumKey)) * 31) + C786410Ut5.Z2(this.enableDeferAlbumTimelineDate)) * 31) + this.warmupFirstScreenPageSize) * 31) + C786410Ut5.Z2(this.enableFirstScreenStableTruncation)) * 31) + C786410Ut5.Z2(this.enableFirstScreenDedupRead)) * 31) + C786410Ut5.Z2(this.enableFirstFrameScrollUnlock);
    }

    public final String toString() {
        return "StoryAlbumFirstFrameOptConfig(enabled=" + this.enabled + ", enableEarlyGridRender=" + this.enableEarlyGridRender + ", enableWarmupFirstScreen=" + this.enableWarmupFirstScreen + ", enableEarlyColorPick=" + this.enableEarlyColorPick + ", enableAsyncTrimLowMemoryTask=" + this.enableAsyncTrimLowMemoryTask + ", enableAsyncMobShootForAlbum=" + this.enableAsyncMobShootForAlbum + ", enableAsyncAllAlbumKey=" + this.enableAsyncAllAlbumKey + ", enableDeferAlbumTimelineDate=" + this.enableDeferAlbumTimelineDate + ", warmupFirstScreenPageSize=" + this.warmupFirstScreenPageSize + ", enableFirstScreenStableTruncation=" + this.enableFirstScreenStableTruncation + ", enableFirstScreenDedupRead=" + this.enableFirstScreenDedupRead + ", enableFirstFrameScrollUnlock=" + this.enableFirstFrameScrollUnlock + ')';
    }

    public StoryAlbumFirstFrameOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11) {
        this.enabled = z;
        this.enableEarlyGridRender = z2;
        this.enableWarmupFirstScreen = z3;
        this.enableEarlyColorPick = z4;
        this.enableAsyncTrimLowMemoryTask = z5;
        this.enableAsyncMobShootForAlbum = z6;
        this.enableAsyncAllAlbumKey = z7;
        this.enableDeferAlbumTimelineDate = z8;
        this.warmupFirstScreenPageSize = i;
        this.enableFirstScreenStableTruncation = z9;
        this.enableFirstScreenDedupRead = z10;
        this.enableFirstFrameScrollUnlock = z11;
    }
}
