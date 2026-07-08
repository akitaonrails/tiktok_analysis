package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class MiddlePageRawData implements Serializable {
    public static final int $stable = 8;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("guessSearchData")
    public final MusicSearchTrendingData guessSearchData;

    @C09CT("historyData")
    public final MusicSearchHistoryData historyData;

    @C09CT("isNonPersonalize")
    public final Boolean isNonPersonalizedSearch;

    @C09CT("is_preload_container")
    public final Boolean isPreloadContainer;

    @C09CT("musicGuessSearchData")
    public final MusicSearchTrendingData musicGuessSearchData;

    @C09CT("render_id")
    public final String renderId;

    @C09CT("search_entrance")
    public final String searchEntrance;

    @C09CT("search_position")
    public final String searchPosition;

    @C09CT("shouldHideRecommendedModules")
    public final boolean shouldHideRecommendedModules;

    @C09CT("shouldShowDiscoverMoreMusic")
    public final Boolean shouldShowDiscoverMoreMusic;

    public final Boolean isNonPersonalizedSearch() {
        return this.isNonPersonalizedSearch;
    }

    public final Boolean isPreloadContainer() {
        return this.isPreloadContainer;
    }

    public MiddlePageRawData(MusicSearchHistoryData musicSearchHistoryData, MusicSearchTrendingData musicSearchTrendingData, MusicSearchTrendingData musicSearchTrendingData2, boolean z, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4) {
        this.historyData = musicSearchHistoryData;
        this.guessSearchData = musicSearchTrendingData;
        this.musicGuessSearchData = musicSearchTrendingData2;
        this.shouldHideRecommendedModules = z;
        this.shouldShowDiscoverMoreMusic = bool;
        this.isNonPersonalizedSearch = bool2;
        this.searchEntrance = str;
        this.searchPosition = str2;
        this.creationId = str3;
        this.isPreloadContainer = bool3;
        this.renderId = str4;
    }
}
