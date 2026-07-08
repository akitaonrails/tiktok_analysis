package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OpenSkuEvent {

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("click_from")
    public final Integer clickFrom;

    @C09CT("track_params")
    public final HashMap<String, Object> extraParams;

    @C09CT("product_id")
    public final String productId;

    @C09CT("source_btm_token")
    public final String sourceBtmToken;

    public OpenSkuEvent(Integer num, String str, String str2, HashMap<String, Object> map, String str3) {
        this.clickFrom = num;
        this.productId = str;
        this.chainKey = str2;
        this.extraParams = map;
        this.sourceBtmToken = str3;
    }
}
