package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveData {

    @C09CT("dynamicTabImprId")
    public final String dynamicTabImprId;

    @C09CT("is_hide_engagement_data")
    public final int isHideEngagementData;

    @C09CT("is_non_personalized_search")
    public final int isNonPersonalizedSearch;

    @C09CT("network_error_code")
    public final int networkErrorCode;

    @C09CT("raw_timestamp")
    public final Long rawTimestamp;

    @C09CT("requestInfo")
    public final RequestInfo requestInfo;

    @C09CT("endToEndSearchSessionId")
    public final String searchEndToEndSessionId;

    @C09CT("enterFromSub")
    public final String searchEntranceSub;

    @C09CT("extraNativeLogParams")
    public final n searchExtraNativeLogParams;

    @C09CT("searchLiveData")
    public final SearchLiveList searchLiveList;

    @C09CT("searchSessionId")
    public final long searchSessionId;

    @C09CT("fromSearchSubtabPosition")
    public final int searchSubTabPosition;

    @C09CT("searchTypePosition")
    public final int searchTypePosition;

    @C09CT(fe.e)
    public final int sessionId;

    @C09CT("stageTimings")
    public final SearchDynamicFragmentPerformanceData stageTime;

    @C09CT("switchTabType")
    public final String switchTabType;

    public SearchLiveData(SearchLiveList searchLiveList, SearchDynamicFragmentPerformanceData searchDynamicFragmentPerformanceData, RequestInfo requestInfo, int i, long j, String str, String str2, String str3, int i2, int i3, int i4, String str4, int i5, int i6, n nVar, Long l) {
        this.searchLiveList = searchLiveList;
        this.stageTime = searchDynamicFragmentPerformanceData;
        this.requestInfo = requestInfo;
        this.sessionId = i;
        this.searchSessionId = j;
        this.searchEndToEndSessionId = str;
        this.switchTabType = str2;
        this.searchEntranceSub = str3;
        this.isNonPersonalizedSearch = i2;
        this.isHideEngagementData = i3;
        this.networkErrorCode = i4;
        this.dynamicTabImprId = str4;
        this.searchTypePosition = i5;
        this.searchSubTabPosition = i6;
        this.searchExtraNativeLogParams = nVar;
        this.rawTimestamp = l;
    }
}
