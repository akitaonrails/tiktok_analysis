package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TrendingWordsStorageData implements Serializable {
    public static final int $stable = 8;

    @C09CT("history")
    public final List<String> history;

    @C09CT("logId")
    public final String logId;

    @C09CT("search_position")
    public final String searchPosition;

    @C09CT("words")
    public final List<TrendingWord> words;

    public TrendingWordsStorageData() {
        this(null, null, null, null);
    }

    public TrendingWordsStorageData(List<TrendingWord> list, List<String> list2, String str, String str2) {
        this.words = list;
        this.history = list2;
        this.searchPosition = str;
        this.logId = str2;
    }
}
