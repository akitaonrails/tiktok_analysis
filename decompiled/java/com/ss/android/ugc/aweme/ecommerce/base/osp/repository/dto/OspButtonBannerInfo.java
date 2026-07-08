package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class OspButtonBannerInfo {

    @C09CT("banner_tips")
    public ECRichText bannerTips;

    @C09CT("banner_tips_detail")
    public ECRichText bannerTipsDetail;

    @C09CT("banner_title")
    public String bannerTitle;

    public OspButtonBannerInfo() {
        this(null, null, null);
    }

    public OspButtonBannerInfo(ECRichText eCRichText, String str, ECRichText eCRichText2) {
        this.bannerTips = eCRichText;
        this.bannerTitle = str;
        this.bannerTipsDetail = eCRichText2;
    }
}
