package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AIMojiStickerItem implements Serializable {

    @C09CT("expression")
    public final String expression;

    @C09CT("user_id")
    public final Long userId;

    public AIMojiStickerItem() {
        this(null, null);
    }

    public AIMojiStickerItem(Long l, String str) {
        this.userId = l;
        this.expression = str;
    }
}
