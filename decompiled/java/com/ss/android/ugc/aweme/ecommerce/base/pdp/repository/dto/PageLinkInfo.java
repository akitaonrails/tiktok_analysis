package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PageLinkInfo {

    @C09CT("campaign_page_info")
    public final CampaignPageInfo campaignPageInfo;

    @C09CT("pdp_info")
    public final PdpInfo pdpInfo;

    public PageLinkInfo() {
        this(null, null);
    }

    public PageLinkInfo(PdpInfo pdpInfo, CampaignPageInfo campaignPageInfo) {
        this.pdpInfo = pdpInfo;
        this.campaignPageInfo = campaignPageInfo;
    }
}
