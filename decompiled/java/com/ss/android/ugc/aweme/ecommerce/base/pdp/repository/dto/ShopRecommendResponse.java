package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopRecommendResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final CommonFeedData data;

    @C09CT("message")
    public final String message;

    public final boolean LIZ() {
        CommonFeedData commonFeedData;
        List<Feed> list;
        Integer num = this.code;
        return (num == null || num.intValue() != 0 || (commonFeedData = this.data) == null || (list = commonFeedData.feedList) == null || list.size() <= 0) ? false : true;
    }

    public ShopRecommendResponse(Integer num, String str, CommonFeedData commonFeedData) {
        this.code = num;
        this.message = str;
        this.data = commonFeedData;
    }
}
