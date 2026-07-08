package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class RecommendImpressionItem {

    @C09CT("sub_feed_type")
    public final Integer feedSubType;

    @C09CT("feed_type")
    public final Integer feedType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public RecommendImpressionItem() {
        this(null, null, null);
    }

    public RecommendImpressionItem(Integer num, Integer num2, String str) {
        this.feedType = num;
        this.feedSubType = num2;
        this.id = str;
    }
}
