package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class IMStickerTypeInfo implements Serializable {

    @C09CT("sticker_entrance_visibility")
    public final Integer stickerEntranceVisibility;

    @C09CT("sticker_type")
    public final Integer stickerType;

    public IMStickerTypeInfo() {
        this(null, null);
    }

    public IMStickerTypeInfo(Integer num, Integer num2) {
        this.stickerType = num;
        this.stickerEntranceVisibility = num2;
    }
}
