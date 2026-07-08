package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchGeneralConfig {

    @C09CT("music_search_general_algo_enabled")
    public final boolean musicSearchGeneralAlgoEnabled;

    @C09CT("music_search_suggested_queries_algo_enabled")
    public final boolean musicSearchSuggestedQueriesAlgoEnabled;

    @C09CT("music_search_suggested_queries_design")
    public final int musicSearchSuggestedQueriesDesign;

    @C09CT("music_search_suggested_queries_enabled")
    public final boolean musicSearchSuggestedQueriesEnabled;

    public MusicSearchGeneralConfig() {
        this(false, false, false, 0);
    }

    public MusicSearchGeneralConfig(boolean z, boolean z2, boolean z3, int i) {
        this.musicSearchGeneralAlgoEnabled = z;
        this.musicSearchSuggestedQueriesEnabled = z2;
        this.musicSearchSuggestedQueriesAlgoEnabled = z3;
        this.musicSearchSuggestedQueriesDesign = i;
    }
}
