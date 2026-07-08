package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class ShoutoutsProduct {

    @C09CT("creator_uid")
    public final String creatorUid;

    @C09CT("description")
    public final String description;

    @C09CT("posted")
    public final boolean posted;

    @C09CT("price")
    public final ShoutoutsPrice price;

    @C09CT("product_id")
    public final String productId;

    @C09CT("rating_avg")
    public final float ratingAvg;

    @C09CT("rating_cnt")
    public final int ratingCnt;

    @C09CT("restrict")
    public final ShoutoutsOrderRestrict restrict;

    @C09CT("show_rating")
    public final boolean showRating;

    @C09CT("sold_cnt")
    public final int soldCnt;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("video_info")
    public final Aweme videoInfo;

    public ShoutoutsProduct(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3) {
        this.videoInfo = aweme;
        this.price = shoutoutsPrice;
        this.description = str;
        this.ratingAvg = f;
        this.ratingCnt = i;
        this.soldCnt = i2;
        this.productId = str2;
        this.showRating = z;
        this.posted = z2;
        this.restrict = shoutoutsOrderRestrict;
        this.status = i3;
        this.creatorUid = str3;
    }
}
