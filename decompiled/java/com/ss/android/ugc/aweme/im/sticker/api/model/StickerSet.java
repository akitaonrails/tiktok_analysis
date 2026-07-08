package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerSet implements Serializable {

    @C09CT("sticker_set_metadata")
    public final StickerSetInfo info;

    @C09CT("stickers")
    public final List<SetSticker> stickers;

    public StickerSet() {
        this(null, null);
    }

    public StickerSet(StickerSetInfo stickerSetInfo, List<SetSticker> list) {
        this.info = stickerSetInfo;
        this.stickers = list;
    }
}
