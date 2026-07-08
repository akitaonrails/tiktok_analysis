package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUsefulnessSurveyConfig implements Serializable {

    @C09CT("inner_feed_config")
    public final SearchInnerFeedConfig innerFeedConfig;

    @C09CT("survey_id")
    public final List<String> surveyId;

    public SearchUsefulnessSurveyConfig() {
        this(null, null, 3, null);
    }

    public SearchUsefulnessSurveyConfig(SearchInnerFeedConfig searchInnerFeedConfig, List<String> list) {
        this.innerFeedConfig = searchInnerFeedConfig;
        this.surveyId = list;
    }

    public SearchUsefulnessSurveyConfig(SearchInnerFeedConfig searchInnerFeedConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchInnerFeedConfig, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
