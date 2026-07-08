package com.ss.android.ugc.aweme.ecommerce.search.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchNegativeFeedbackRequest {

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("feed_id")
    public final String feedId;

    @C09CT("feed_type")
    public final int feedType;

    @C09CT("feedback_biz_type")
    public final Integer feedbackBizType;

    @C09CT("feedback_type")
    public final int feedbackType;

    @C09CT("operation_time")
    public final Long operationTime;

    @C09CT("product_info")
    public final FeedbackProductInfo productInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public EcSearchNegativeFeedbackRequest(String str, int i, int i2, Long l, String str2, Integer num, String str3, FeedbackProductInfo feedbackProductInfo) {
        this.feedId = str;
        this.feedType = i;
        this.feedbackType = i2;
        this.operationTime = l;
        this.scene = str2;
        this.feedbackBizType = num;
        this.coverUrl = str3;
        this.productInfo = feedbackProductInfo;
    }
}
