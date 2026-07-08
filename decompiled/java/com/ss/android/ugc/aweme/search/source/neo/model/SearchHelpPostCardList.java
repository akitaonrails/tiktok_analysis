package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C13BV;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHelpPostCardList {

    @C09CT("help_post_card_list")
    public final List<Pair<String, SearchHelpPostCardInfo>> helpPostCardList;

    public SearchHelpPostCardList() {
        this(null, 1, null);
    }

    public SearchHelpPostCardList(List<Pair<String, SearchHelpPostCardInfo>> list) {
        this.helpPostCardList = list;
    }

    public SearchHelpPostCardList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.synchronizedList(C13BV.INSTANCE) : list);
    }
}
