package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class IMTypingRecommendationSAExtInfo implements Serializable {

    @C09CT("creator_uid")
    public Long creatorUid;

    @C09CT("sa_sticker_id")
    public final Long originalStickerId;

    @C09CT("sa_set_id")
    public final Long originalStickerSetId;

    @C09CT("url")
    public final StickerUrlStruct urlStruct;

    public final void setCreatorUid(Long l) {
        this.creatorUid = l;
    }

    public IMTypingRecommendationSAExtInfo(Long l, Long l2, StickerUrlStruct stickerUrlStruct, Long l3) {
        this.originalStickerId = l;
        this.originalStickerSetId = l2;
        this.urlStruct = stickerUrlStruct;
        this.creatorUid = l3;
    }
}
