package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchTrendingData implements Serializable {
    public static final int $stable = 0;

    @C09CT("isCachedSuggestWords")
    public final Boolean isCached;

    @C09CT("guessSearchResponse")
    public final String trendingResponse;

    public final Boolean isCached() {
        return this.isCached;
    }

    public MusicSearchTrendingData(String str, Boolean bool) {
        this.trendingResponse = str;
        this.isCached = bool;
    }
}
