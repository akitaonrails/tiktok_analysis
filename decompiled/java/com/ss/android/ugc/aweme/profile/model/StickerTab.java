package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class StickerTab implements Serializable {

    @C09CT("show_sticker_set_sticker")
    public final Boolean showStickerSetSticker;

    @C09CT("show_sticker_tab")
    public final Boolean showStickerTab;

    @C09CT("show_video_sticker")
    public final Boolean showVideoSticker;

    @C09CT("sticker_set_count")
    public final Integer stickerSetCount;

    @C09CT("video_sticker_count")
    public final Integer videoStickerCount;

    public StickerTab() {
        this(null, null, null, null, null);
    }

    public final StickerTab copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        return new StickerTab(bool, bool2, bool3, num, num2);
    }

    public StickerTab(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        this.showStickerTab = bool;
        this.showStickerSetSticker = bool2;
        this.showVideoSticker = bool3;
        this.stickerSetCount = num;
        this.videoStickerCount = num2;
    }
}
