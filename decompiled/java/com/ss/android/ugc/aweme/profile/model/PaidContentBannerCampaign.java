package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class PaidContentBannerCampaign implements Serializable {

    @C09CT("extra_params")
    public final Map<String, String> extraParams;

    @C09CT("pc_banner_campaign_id")
    public final String paidContentBannerCampaignId;

    @C09CT("pc_banner_duration")
    public final int paidContentBannerDuration;

    @C09CT("pc_banner_icon_url")
    public final ImageUrlModel paidContentBannerIconUrl;

    @C09CT("pc_banner_cta_text")
    public final String paidContentBannerLinkText;

    @C09CT("pc_banner_max_display_count")
    public final int paidContentBannerMaxDisplayCount;

    @C09CT("pc_banner_message_text")
    public final String paidContentBannerMessageText;

    @C09CT("pc_banner_schema")
    public final String paidContentBannerSchema;

    @C09CT("pc_banner_title_text")
    public final String paidContentBannerTitleText;

    public PaidContentBannerCampaign() {
        this("", "", "", "", "", 3, null, 1, null);
    }

    public PaidContentBannerCampaign(String str, String str2, String str3, String str4, String str5, int i, ImageUrlModel imageUrlModel, int i2, Map<String, String> map) {
        this.paidContentBannerCampaignId = str;
        this.paidContentBannerTitleText = str2;
        this.paidContentBannerMessageText = str3;
        this.paidContentBannerLinkText = str4;
        this.paidContentBannerSchema = str5;
        this.paidContentBannerDuration = i;
        this.paidContentBannerIconUrl = imageUrlModel;
        this.paidContentBannerMaxDisplayCount = i2;
        this.extraParams = map;
    }
}
