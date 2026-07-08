package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C1844070y5V;
import X.C1844150y5d;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes28.dex */
public interface ICommerceAppReviewsApi {
    public static final C1844070y5V LIZ = C1844070y5V.LIZ;

    @InterfaceC1501170pAR("/portfolio/interaction/v1/ad/reviews/delete")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object deleteReview(@InterfaceC1485405rg DeleteReviewRequest deleteReviewRequest, InterfaceC1364105Vn<? super C1844150y5d> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/portfolio/interaction/v1/ad/reviews/digg")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object diggReview(@InterfaceC1485405rg DiggReviewRequest diggReviewRequest, InterfaceC1364105Vn<? super C1844150y5d> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/portfolio/interaction/v1/ad/reviews/list")
    Object getAppReviews(@InterfaceC1501070pAH("ad_id") long j, @InterfaceC1501070pAH("creative_id") long j2, @InterfaceC1501070pAH("user_id") long j3, @InterfaceC1501070pAH("order_type") int i, @InterfaceC1501070pAH("app_id") Long l, @InterfaceC1501070pAH("external_url") String str, InterfaceC1364105Vn<? super ReviewListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/portfolio/interaction/v1/ad/reviews/publish")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object publishReview(@InterfaceC1485405rg PublishReviewRequest publishReviewRequest, InterfaceC1364105Vn<? super PublishReviewResponse> interfaceC1364105Vn);
}
