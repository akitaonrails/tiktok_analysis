package com.ss.android.ugc.aweme.ecommerce.base.osp.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CampaignInfo {

    @C09CT("activity_id")
    public final String campaignId;

    @C09CT("promotion_template_str")
    public final String campaignType;

    public CampaignInfo(String str, String str2) {
        this.campaignId = str;
        this.campaignType = str2;
    }
}
