package com.ss.android.ugc.aweme.topic.review.api;

import X.C626740Oi8;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp;
import com.ss.android.ugc.aweme.topic.review.model.TopicReviewPublishResp;

/* JADX INFO: loaded from: classes10.dex */
public interface TopicReviewApi {
    public static final C626740Oi8 LIZ = C626740Oi8.LIZ;

    @InterfaceC1501170pAR("/tiktok/topic/review/delete/v1/")
    Object deleteReview(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501070pAH("review_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/topic/review/digg/v1/")
    Object diggReview(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501070pAH("review_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/topic/review/list/v1/")
    Object getReviewList(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i2, InterfaceC1364105Vn<? super TopicReviewListResp> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/topic/review/publish/v1/")
    Object publishReview(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501050pAF("topic_rating") int i2, @InterfaceC1501050pAF("text") String str2, InterfaceC1364105Vn<? super TopicReviewPublishResp> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/topic/review/undigg/v1/")
    Object undiggReview(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501070pAH("review_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/topic/review/update/v1/")
    Object updateReview(@InterfaceC1501070pAH("topic_id") String str, @InterfaceC1501070pAH("topic_type") int i, @InterfaceC1501070pAH("review_id") String str2, @InterfaceC1501050pAF("topic_rating") int i2, @InterfaceC1501050pAF("text") String str3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
