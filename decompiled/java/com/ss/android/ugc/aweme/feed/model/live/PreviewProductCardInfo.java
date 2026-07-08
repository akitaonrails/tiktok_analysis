package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonWithOriginAdapterFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PreviewProductCardInfo implements Serializable {

    @C09CT("recommend_info")
    @C09CS(StringJsonWithOriginAdapterFactory.class)
    public FypRecommendInfo recommendInfo;

    public final FypRecommendInfo getRecommendInfo() {
        return this.recommendInfo;
    }

    public final void setRecommendInfo(FypRecommendInfo fypRecommendInfo) {
        this.recommendInfo = fypRecommendInfo;
    }
}
