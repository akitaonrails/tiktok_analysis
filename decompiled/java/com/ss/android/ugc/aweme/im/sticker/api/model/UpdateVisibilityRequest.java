package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateVisibilityRequest {

    @C09CT("sticker_id")
    public final Long stickerId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("visibility")
    public final Integer visibility;

    public UpdateVisibilityRequest() {
        this(1, 2, null);
    }

    public UpdateVisibilityRequest(Integer num, Integer num2, Long l) {
        this.stickerType = num;
        this.visibility = num2;
        this.stickerId = l;
    }
}
