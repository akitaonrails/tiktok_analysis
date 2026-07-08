package com.ss.android.ugc.aweme.socialgame.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StickerMatchStruct implements Serializable {

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("sticker_set_id")
    public final String stickerSetId;

    @C09CT("sticker_url")
    public final String stickerUrl;

    public StickerMatchStruct() {
        this(null, null, null);
    }

    public StickerMatchStruct(String str, String str2, String str3) {
        this.stickerSetId = str;
        this.stickerId = str2;
        this.stickerUrl = str3;
    }
}
