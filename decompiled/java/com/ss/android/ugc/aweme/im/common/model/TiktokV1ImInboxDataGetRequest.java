package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokV1ImInboxDataGetRequest {

    @C09CT("property_type")
    public final List<Integer> propertyTypes;

    @C09CT("previous_recommendations")
    public final RecommendationRequestBody recommendations;

    public TiktokV1ImInboxDataGetRequest() {
        this(null, null);
    }

    public TiktokV1ImInboxDataGetRequest(List<Integer> list, RecommendationRequestBody recommendationRequestBody) {
        this.propertyTypes = list;
        this.recommendations = recommendationRequestBody;
    }
}
