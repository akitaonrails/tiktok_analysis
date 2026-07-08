package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class DMStickerStoreConfig {

    @C09CT("sticker_store_preload_delay")
    public final long delay;

    @C09CT("sticker_store_enable_flag")
    public final boolean enable;

    @C09CT("enable_video_sticker_origin_video_check")
    public final boolean videoCheck;

    public DMStickerStoreConfig() {
        this(true, 0L, true);
    }

    public DMStickerStoreConfig(boolean z, long j, boolean z2) {
        this.enable = z;
        this.delay = j;
        this.videoCheck = z2;
    }
}
