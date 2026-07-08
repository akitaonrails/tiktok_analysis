package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class StickerInteractionDetailsInsertion implements Serializable {

    @C09CT("sticker_type")
    public final int stickerType;

    @C09CT("user_id")
    public final long userId;

    public StickerInteractionDetailsInsertion() {
        this(0L, 0);
    }

    public StickerInteractionDetailsInsertion(long j, int i) {
        this.userId = j;
        this.stickerType = i;
    }
}
