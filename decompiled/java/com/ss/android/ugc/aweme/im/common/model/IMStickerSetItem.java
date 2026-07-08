package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class IMStickerSetItem implements Serializable {

    @C09CT("sticker_creation_status")
    public final Integer creationStatus;

    @C09CT("sticker_create_source")
    public final Integer stickerCreateSource;

    @C09CT("sticker_set_metadata")
    public final IMStickerSetMetaData stickerSetMeta;

    @C09CT("stickers")
    public final List<StickerItem> stickers;

    public IMStickerSetItem() {
        this(null, null, null, null);
    }

    public final IMStickerSetItem copy(IMStickerSetMetaData iMStickerSetMetaData, List<StickerItem> list, Integer num, Integer num2) {
        return new IMStickerSetItem(iMStickerSetMetaData, list, num, num2);
    }

    public IMStickerSetItem(IMStickerSetMetaData iMStickerSetMetaData, List<StickerItem> list, Integer num, Integer num2) {
        this.stickerSetMeta = iMStickerSetMetaData;
        this.stickers = list;
        this.creationStatus = num;
        this.stickerCreateSource = num2;
    }
}
