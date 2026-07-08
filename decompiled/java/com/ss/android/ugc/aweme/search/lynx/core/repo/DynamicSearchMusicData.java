package com.ss.android.ugc.aweme.search.lynx.core.repo;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchMusicData {

    @C09CT("dynamicTabImprId")
    public final String dynamicTabImprId;

    @C09CT("is_hide_engagement_data")
    public final int isHideEngagementData;

    @C09CT("is_non_personalized_search")
    public final int isNonPersonalizedSearch;

    @C09CT("searchMusicData")
    public final n musicList;

    @C09CT("network_error_code")
    public final int networkErrorCode;

    @C09CT("requestInfo")
    public final RequestInfo requestInfo;

    @C09CT("endToEndSearchSessionId")
    public final String searchEndToEndSessionId;

    @C09CT("enterFromSub")
    public final String searchEntranceSub;

    @C09CT("extraNativeLogParams")
    public final Map<String, Object> searchExtraNativeLogParams;

    @C09CT("searchSessionId")
    public final long searchSessionId;

    @C09CT("fromSearchSubtabPosition")
    public final int searchSubTabPosition;

    @C09CT("searchTypePosition")
    public final int searchTypePosition;

    @C09CT("stageTimings")
    public final SearchDynamicFragmentPerformanceData stageTime;

    @C09CT("switchTabType")
    public final String switchTabType;

    public DynamicSearchMusicData(n nVar, SearchDynamicFragmentPerformanceData searchDynamicFragmentPerformanceData, RequestInfo requestInfo, long j, String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, int i5, Map<String, ? extends Object> map) {
        this.musicList = nVar;
        this.stageTime = searchDynamicFragmentPerformanceData;
        this.requestInfo = requestInfo;
        this.searchSessionId = j;
        this.searchEndToEndSessionId = str;
        this.switchTabType = str2;
        this.searchEntranceSub = str3;
        this.isNonPersonalizedSearch = i;
        this.isHideEngagementData = i2;
        this.networkErrorCode = i3;
        this.dynamicTabImprId = str4;
        this.searchTypePosition = i4;
        this.searchSubTabPosition = i5;
        this.searchExtraNativeLogParams = map;
    }
}
