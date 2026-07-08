package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TTIMImageRefreshConfig {

    @C09CT("enable_private_media_expire_image_refresh")
    public final int enablePrivateMediaImageRefresh;

    @C09CT("enable_public_video_expire_image_refresh")
    public final int enablePublicVideoImageRefresh;

    @C09CT("enable_sticker_image_refresh")
    public final int enableStickerImageRefresh;

    public TTIMImageRefreshConfig() {
        this(0, 0, 0);
    }

    public TTIMImageRefreshConfig(int i, int i2, int i3) {
        this.enablePublicVideoImageRefresh = i;
        this.enablePrivateMediaImageRefresh = i2;
        this.enableStickerImageRefresh = i3;
    }
}
