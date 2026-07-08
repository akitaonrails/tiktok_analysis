package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class GetLiveTaskCardRequest {

    @C09CT("card_info")
    public final String cardInfo;

    @C09CT("room_id")
    public final String roomId;

    public GetLiveTaskCardRequest() {
        this(null, null);
    }

    public GetLiveTaskCardRequest(String str, String str2) {
        this.roomId = str;
        this.cardInfo = str2;
    }
}
