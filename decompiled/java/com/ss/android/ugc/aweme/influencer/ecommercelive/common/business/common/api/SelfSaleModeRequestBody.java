package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SelfSaleModeRequestBody {

    @C09CT("creator_id")
    public final String authorId;

    @C09CT("room_id")
    public final Long roomId;

    @C09CT("source_type")
    public final int sourceType;

    public SelfSaleModeRequestBody(String str, int i, Long l) {
        this.authorId = str;
        this.sourceType = i;
        this.roomId = l;
    }
}
