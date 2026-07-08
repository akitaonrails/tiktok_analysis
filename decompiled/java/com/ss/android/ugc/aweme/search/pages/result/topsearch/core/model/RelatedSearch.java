package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class RelatedSearch {

    @C09CT("related_word_list")
    public final List<Object> relatedWordList;

    public RelatedSearch() {
        this(null, 1, null);
    }

    public RelatedSearch(List<Object> list) {
        this.relatedWordList = list;
    }

    public RelatedSearch(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
