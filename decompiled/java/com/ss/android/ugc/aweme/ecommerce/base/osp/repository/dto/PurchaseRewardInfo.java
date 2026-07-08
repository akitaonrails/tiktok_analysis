package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseRewardInfo {

    @C09CT("desc")
    public ECRichText bannerDescription;

    @C09CT("schema")
    public String bannerSchema;

    @C09CT("title")
    public ECRichText bannerTitle;

    public PurchaseRewardInfo() {
        this(null, null, null);
    }

    public PurchaseRewardInfo(String str, ECRichText eCRichText, ECRichText eCRichText2) {
        this.bannerSchema = str;
        this.bannerTitle = eCRichText;
        this.bannerDescription = eCRichText2;
    }
}
