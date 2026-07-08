package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsData {

    @C09CT("campaign_info")
    public final CampaignInfo campaignInfo;

    @C09CT("coupon_info")
    public final CouponInfo couponInfo;

    @C09CT("featured_video_info")
    public final FeaturedVideoInfo featuredVideoInfo;

    @C09CT("hashtag_info")
    public final HashtagInfo hashtagInfo;

    @C09CT("highlight_video_info")
    public final HighlightVideoInfo highlightVideoInfo;

    @C09CT("latitude_central")
    public final Double latitudeCentral;

    @C09CT("longitude_central")
    public final Double longitudeCentral;

    @C09CT("poi_video_summary_list")
    public final List<PoiVideoSummary> poiListSummary;

    @C09CT("share_info")
    public final ShareInfo shareInfo;

    @C09CT("user_type")
    public final Integer userType;

    public MyMomentsData(Integer num, List<PoiVideoSummary> list, CampaignInfo campaignInfo, ShareInfo shareInfo, CouponInfo couponInfo, HighlightVideoInfo highlightVideoInfo, FeaturedVideoInfo featuredVideoInfo, HashtagInfo hashtagInfo, Double d, Double d2) {
        this.userType = num;
        this.poiListSummary = list;
        this.campaignInfo = campaignInfo;
        this.shareInfo = shareInfo;
        this.couponInfo = couponInfo;
        this.highlightVideoInfo = highlightVideoInfo;
        this.featuredVideoInfo = featuredVideoInfo;
        this.hashtagInfo = hashtagInfo;
        this.latitudeCentral = d;
        this.longitudeCentral = d2;
    }
}
