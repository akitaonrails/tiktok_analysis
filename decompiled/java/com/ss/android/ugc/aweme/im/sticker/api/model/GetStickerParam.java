package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetStickerParam {

    @C09CT("sticker_id")
    public final Long stickerId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("str_sticker_id")
    public final String thirdPartyId;

    public GetStickerParam() {
        this(null, null, null);
    }

    public GetStickerParam(Integer num, Long l, String str) {
        this.stickerType = num;
        this.stickerId = l;
        this.thirdPartyId = str;
    }
}
