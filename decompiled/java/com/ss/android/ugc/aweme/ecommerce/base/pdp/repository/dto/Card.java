package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class Card {

    @C09CT("type")
    public final Integer cardType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("pdp_shop_promotion_data")
    public final PDPShopPromotionData pdpShopPromotionData;

    public Card() {
        this(null, null, null);
    }

    public Card(String str, Integer num, PDPShopPromotionData pDPShopPromotionData) {
        this.id = str;
        this.cardType = num;
        this.pdpShopPromotionData = pDPShopPromotionData;
    }
}
