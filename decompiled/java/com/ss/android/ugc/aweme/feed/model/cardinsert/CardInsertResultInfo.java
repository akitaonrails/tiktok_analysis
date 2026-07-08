package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CardInsertResultInfo implements Serializable {

    @C09CT("card_id")
    public long cardId;

    @C09CT("card_insert_status")
    public int cardInsertStatus;

    @C09CT("card_type")
    public int cardType;

    public CardInsertResultInfo() {
        this(0, 0L, 0);
    }

    public final void setCardId(long j) {
        this.cardId = j;
    }

    public final void setCardInsertStatus(int i) {
        this.cardInsertStatus = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public CardInsertResultInfo(int i, long j, int i2) {
        this.cardType = i;
        this.cardId = j;
        this.cardInsertStatus = i2;
    }
}
