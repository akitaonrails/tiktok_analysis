package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class PaidContentBannerSetting implements Serializable {

    @C09CT("campaign_list")
    public final List<PaidContentBannerCampaign> paidContentBannerCampaignList;

    public PaidContentBannerSetting() {
        this(null);
    }

    public PaidContentBannerSetting(List<PaidContentBannerCampaign> list) {
        this.paidContentBannerCampaignList = list;
    }
}
