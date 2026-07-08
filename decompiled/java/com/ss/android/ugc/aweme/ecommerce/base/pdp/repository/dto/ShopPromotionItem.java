package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopPromotionItem {

    @C09CT("shop_promotion_da_info")
    public final Map<String, Object> daInfo;

    @C09CT("shop_promotion_schema")
    public final String promotionSchema;

    @C09CT("promotion_text")
    public final ECRichText promotionText;

    public ShopPromotionItem() {
        this(null, null, null);
    }

    public ShopPromotionItem(String str, Map<String, ? extends Object> map, ECRichText eCRichText) {
        this.promotionSchema = str;
        this.daInfo = map;
        this.promotionText = eCRichText;
    }
}
