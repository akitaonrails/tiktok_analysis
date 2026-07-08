package com.ss.android.ugc.aweme.feed.lynxcard.dynamic;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class RealTimeCardModel {

    @C09CT("card_insert_results")
    public List<CardInsertResultInfo> cardInsertResults;

    @C09CT("feed_card")
    public Aweme feedCard;

    public RealTimeCardModel() {
        this(null, null);
    }

    public RealTimeCardModel(List<CardInsertResultInfo> list, Aweme aweme) {
        this.cardInsertResults = list;
        this.feedCard = aweme;
    }
}
