package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoCommentStickerConfig {

    @C09CT("cache_ddl_sec")
    public final int cacheDDLSec;

    @C09CT("preload_sticker_count")
    public final int preloadStickerCount;

    @C09CT("quote_video_min_sticker_count")
    public final int quoteVideoMinStickerCount;

    @C09CT("request_debounce_sec")
    public final int requestDebounceSec;

    @C09CT("return_to_video_min_sticker_count")
    public final int returnToVideoMinStickerCount;

    public PhotoCommentStickerConfig() {
        this(0, 5, 1, 86400, 5);
    }

    public PhotoCommentStickerConfig(int i, int i2, int i3, int i4, int i5) {
        this.requestDebounceSec = i;
        this.quoteVideoMinStickerCount = i2;
        this.returnToVideoMinStickerCount = i3;
        this.cacheDDLSec = i4;
        this.preloadStickerCount = i5;
    }
}
