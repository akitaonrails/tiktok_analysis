package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonProductPromotionInfo {

    @C09CT("promotion_text")
    public ECRichText promotionText;

    public AddonProductPromotionInfo() {
    }

    public AddonProductPromotionInfo(ECRichText eCRichText) {
        this.promotionText = eCRichText;
    }
}
