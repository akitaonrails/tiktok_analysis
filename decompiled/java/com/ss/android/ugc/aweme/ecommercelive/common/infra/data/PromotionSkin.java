package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.ext.GImage;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionSkin {

    @C09CT("image")
    public final GImage image;

    @C09CT("promotion_id")
    public final String promotionId;

    public PromotionSkin(GImage gImage, String str) {
        this.image = gImage;
        this.promotionId = str;
    }
}
