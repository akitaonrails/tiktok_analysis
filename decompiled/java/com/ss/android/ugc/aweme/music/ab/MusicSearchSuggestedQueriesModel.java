package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicSearchSuggestedQueriesModel {

    @C09CT("suggested_queries")
    public final Map<String, String> suggestedQueries;

    public MusicSearchSuggestedQueriesModel() {
        this(null);
    }

    public MusicSearchSuggestedQueriesModel(Map<String, String> map) {
        this.suggestedQueries = map;
    }
}
