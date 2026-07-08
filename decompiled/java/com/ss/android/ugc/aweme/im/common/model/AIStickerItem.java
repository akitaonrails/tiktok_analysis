package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AIStickerItem implements Serializable {

    @C09CT("referenced_sticker_id")
    public final String referencedStickerId;

    public AIStickerItem() {
        this(null);
    }

    public AIStickerItem(String str) {
        this.referencedStickerId = str;
    }
}
