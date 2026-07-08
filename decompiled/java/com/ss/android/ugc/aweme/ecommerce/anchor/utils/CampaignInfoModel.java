package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class CampaignInfoModel {

    @C09CT("campaign_info")
    public final String campaignInfo;

    @C09CT("campaign_type")
    public final int campaignType;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    public CampaignInfoModel(int i, String str, Map<String, String> map) {
        this.campaignType = i;
        this.campaignInfo = str;
        this.daInfo = map;
    }
}
