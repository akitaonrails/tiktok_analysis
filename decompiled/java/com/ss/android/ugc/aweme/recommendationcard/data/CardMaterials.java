package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class CardMaterials {

    @C09CT("card_content")
    public final List<CardContent> cardContent;

    @C09CT("feed_event_card_info")
    public final FeedEventCardInfo feedEventCardInfo;

    public CardMaterials(FeedEventCardInfo feedEventCardInfo, List<CardContent> list) {
        this.feedEventCardInfo = feedEventCardInfo;
        this.cardContent = list;
    }
}
