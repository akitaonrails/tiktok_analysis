package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.discover.model.CardText;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class MiniGameLoadMoreData {

    @C09CT("card_text_list")
    public final List<CardText> cardTextList;

    @C09CT("minis_list")
    public final List<SearchMinisItem> loadMoreList;

    public MiniGameLoadMoreData() {
        this(null, null, 3, null);
    }

    public MiniGameLoadMoreData(List<SearchMinisItem> list, List<CardText> list2) {
        this.loadMoreList = list;
        this.cardTextList = list2;
    }

    public MiniGameLoadMoreData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
