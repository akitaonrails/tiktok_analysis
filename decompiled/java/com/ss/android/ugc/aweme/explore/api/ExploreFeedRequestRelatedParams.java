package com.ss.android.ugc.aweme.explore.api;

import X.C09CT;
import X.C1DC8;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedApi;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedRequestRelatedParams {

    @C09CT("aweme_infos")
    public final List<ExploreFeedApi.ExploreAwemeReqestParam> awemeInfos;

    @C09CT("interacted_ids")
    public final String interactIds;

    @C09CT("interest_id")
    public final Long interestId;

    @C09CT("is_preload")
    public final Integer isPreload;

    @C09CT("non_personalized")
    public final Boolean nonPersonalized;

    @C09CT("real_time_client_info")
    public final C1DC8 realTimeClientInfo;

    @C09CT("tab_type")
    public final Integer tabType;

    public final List<ExploreFeedApi.ExploreAwemeReqestParam> getAwemeInfos() {
        return this.awemeInfos;
    }

    public final String getInteractIds() {
        return this.interactIds;
    }

    public final Long getInterestId() {
        return this.interestId;
    }

    public final Boolean getNonPersonalized() {
        return this.nonPersonalized;
    }

    public final C1DC8 getRealTimeClientInfo() {
        return this.realTimeClientInfo;
    }

    public final Integer getTabType() {
        return this.tabType;
    }

    public final Integer isPreload() {
        return this.isPreload;
    }

    public ExploreFeedRequestRelatedParams(List<ExploreFeedApi.ExploreAwemeReqestParam> list, Integer num, Integer num2, String str, Boolean bool, C1DC8 c1dc8, Long l) {
        this.awemeInfos = list;
        this.isPreload = num;
        this.tabType = num2;
        this.interactIds = str;
        this.nonPersonalized = bool;
        this.realTimeClientInfo = c1dc8;
        this.interestId = l;
    }
}
