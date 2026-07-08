package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class WesternChannelComponent implements Serializable {

    @C09CT("banner_data")
    public final BannerData bannerData;

    @C09CT("component_title")
    public final String componentTitle;

    @C09CT("content_feed_data")
    public final ContentFeedData contentFeedData;

    @C09CT("follow_data")
    public final AuctionFollowListData followListData;

    @C09CT("key")
    public final String key;

    @C09CT("voucher_list_data")
    public final WesternChannelVoucherListData voucherListData;

    public WesternChannelComponent() {
        this("", null, null, null, null, "");
    }

    public WesternChannelComponent(String str, WesternChannelVoucherListData westernChannelVoucherListData, ContentFeedData contentFeedData, BannerData bannerData, AuctionFollowListData auctionFollowListData, String str2) {
        this.key = str;
        this.voucherListData = westernChannelVoucherListData;
        this.contentFeedData = contentFeedData;
        this.bannerData = bannerData;
        this.followListData = auctionFollowListData;
        this.componentTitle = str2;
    }
}
