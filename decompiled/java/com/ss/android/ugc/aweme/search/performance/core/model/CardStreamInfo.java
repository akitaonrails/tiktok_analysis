package com.ss.android.ugc.aweme.search.performance.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class CardStreamInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("ack")
    public int ack = -2;

    @C09CT("card_index")
    public int cardIndex = -1;

    @C09CT("data_scope")
    public int dataScope;

    public final int getAck() {
        return this.ack;
    }

    public final int getCardIndex() {
        return this.cardIndex;
    }

    public final int getDataScope() {
        return this.dataScope;
    }

    public final void setAck(int i) {
        this.ack = i;
    }

    public final void setCardIndex(int i) {
        this.cardIndex = i;
    }

    public final void setDataScope(int i) {
        this.dataScope = i;
    }
}
