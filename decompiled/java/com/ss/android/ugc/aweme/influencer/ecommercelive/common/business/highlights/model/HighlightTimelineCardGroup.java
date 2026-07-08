package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightTimelineCardGroup implements Serializable {
    public static final int $stable = 8;

    @C09CT("date")
    public final String date;

    @C09CT("cards")
    public final List<HighlightCard> timelineCards;

    public HighlightTimelineCardGroup(String str, List<HighlightCard> list) {
        this.date = str;
        this.timelineCards = list;
    }
}
