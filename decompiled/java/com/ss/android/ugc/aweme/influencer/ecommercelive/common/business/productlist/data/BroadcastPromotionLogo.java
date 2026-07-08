package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes2.dex */
public final class BroadcastPromotionLogo {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("dark_mode_image")
    public final Image darkModeImage;

    @C09CT("image")
    public final Image image;

    @C09CT("promotion_id")
    public final String promotionId;

    public BroadcastPromotionLogo(Image image, Image image2, String str, String str2) {
        this.image = image;
        this.darkModeImage = image2;
        this.promotionId = str;
        this.daInfo = str2;
    }
}
