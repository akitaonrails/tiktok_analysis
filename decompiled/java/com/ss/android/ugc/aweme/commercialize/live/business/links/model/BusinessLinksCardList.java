package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BusinessLinksCardList implements Serializable {

    @C09CT("card_list")
    public final List<ActiveCard> cardList;

    public BusinessLinksCardList(List<ActiveCard> list) {
        this.cardList = list;
    }
}
