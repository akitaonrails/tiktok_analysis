package com.ss.android.ugc.aweme.search.widget.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchWidgetTypeBean implements Serializable {
    public static final int $stable = 8;

    @C09CT("words")
    public final List<SearchWidgetSuggestWord> words;

    public SearchWidgetTypeBean(List<SearchWidgetSuggestWord> list) {
        this.words = list;
    }
}
