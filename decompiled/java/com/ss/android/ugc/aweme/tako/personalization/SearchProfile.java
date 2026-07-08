package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class SearchProfile {

    @C09CT("search_history")
    public final List<SearchHistorySignal> searchHistory;

    public SearchProfile() {
        this(null);
    }

    public SearchProfile(List<SearchHistorySignal> list) {
        this.searchHistory = list;
    }
}
