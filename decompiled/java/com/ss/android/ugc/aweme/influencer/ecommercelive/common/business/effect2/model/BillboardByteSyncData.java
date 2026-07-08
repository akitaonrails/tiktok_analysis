package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.bytedance.android.livesdk.model.message.CampaignBannerDisplay;

/* JADX INFO: loaded from: classes.dex */
public final class BillboardByteSyncData {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_info")
    public final BillboardInfo billboardInfo;

    @C09CT("billboard_version")
    public Integer billboardVersion;

    @C09CT("born_time_ms")
    public String bornTimeMs;

    @C09CT("is_display")
    public final Boolean campaignBannerDisplay;

    @C09CT("campaign_banner_display")
    public CampaignBannerDisplay campaignBannerDisplayStruct;

    @C09CT("image_url")
    public final String imageUrl;

    public BillboardByteSyncData(int i, BillboardInfo billboardInfo, String str, Boolean bool, String str2, CampaignBannerDisplay campaignBannerDisplay, String str3, Integer num) {
        this.actionType = i;
        this.billboardInfo = billboardInfo;
        this.authorId = str;
        this.campaignBannerDisplay = bool;
        this.imageUrl = str2;
        this.campaignBannerDisplayStruct = campaignBannerDisplay;
        this.bornTimeMs = str3;
        this.billboardVersion = num;
    }
}
