package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class CardInsertRequest {

    @C09CT("current_flow_index")
    public final int cardType;

    @C09CT("insert_cards")
    public final List<CardTypeRequest> insertCards;

    public CardInsertRequest() {
        this(0, null);
    }

    public CardInsertRequest(int i, List<CardTypeRequest> list) {
        this.cardType = i;
        this.insertCards = list;
    }
}
