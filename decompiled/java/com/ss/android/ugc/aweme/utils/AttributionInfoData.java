package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AttributionInfoData {

    @C09CT("ads_group_id")
    public final long adsGroupId;

    @C09CT("ad_scenario")
    public final String adsScenario;

    @C09CT("onboarding_strategy_data")
    public final OnBoardingStrategyData onBoardingStrategyData;

    @C09CT("tag_map")
    public final Map<String, String> tagMap;

    @C09CT("url")
    public final UrlData url;

    public AttributionInfoData() {
        this(-1L, null, "", null, null);
    }

    public AttributionInfoData(long j, UrlData urlData, String str, Map<String, String> map, OnBoardingStrategyData onBoardingStrategyData) {
        this.adsGroupId = j;
        this.url = urlData;
        this.adsScenario = str;
        this.tagMap = map;
        this.onBoardingStrategyData = onBoardingStrategyData;
    }
}
