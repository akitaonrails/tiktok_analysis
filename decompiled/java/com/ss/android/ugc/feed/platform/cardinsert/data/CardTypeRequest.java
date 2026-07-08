package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class CardTypeRequest {

    @C09CT("biz_info")
    public String bizInfo;

    @C09CT("card_type")
    public final int cardType;

    @C09CT("insert_aweme_ids")
    public final String insertAwemeIds;

    public CardTypeRequest() {
        this(-1, "", "");
    }

    public CardTypeRequest(int i, String str, String str2) {
        this.cardType = i;
        this.bizInfo = str;
        this.insertAwemeIds = str2;
    }
}
