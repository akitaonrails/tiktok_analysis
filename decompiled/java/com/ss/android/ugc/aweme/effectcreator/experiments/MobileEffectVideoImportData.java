package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class MobileEffectVideoImportData {

    @C09CT("bitrate")
    public final int bitrate;

    @C09CT("fps")
    public final int fps;

    @C09CT("max_pack_size_bytes")
    public final int maxPackSizeBytes;

    @C09CT("max_video_sticker_count")
    public final int maxVideoStickerCount;

    @C09CT("max_video_sticker_duration_s")
    public final int maxVideoStickerDurationSeconds;

    @C09CT("min_video_sticker_duration_s")
    public final int minVideoStickerDurationSeconds;

    @C09CT("video_sticker_resolution_height")
    public final int videoStickerHeight;

    @C09CT("video_sticker_resolution_width")
    public final int videoStickerWidth;

    public MobileEffectVideoImportData() {
        this(8388608, 3, 1, 8, 720, 1280, 2097152, 24);
    }

    public MobileEffectVideoImportData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxPackSizeBytes = i;
        this.maxVideoStickerCount = i2;
        this.minVideoStickerDurationSeconds = i3;
        this.maxVideoStickerDurationSeconds = i4;
        this.videoStickerWidth = i5;
        this.videoStickerHeight = i6;
        this.bitrate = i7;
        this.fps = i8;
    }
}
