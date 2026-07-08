package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuBuyLimit implements Serializable {

    @C09CT("buy_limit")
    public final Integer buyLimit;

    @C09CT("sku_id")
    public final String skuId;

    public SkuBuyLimit() {
        this(null, null);
    }

    public SkuBuyLimit(String str, Integer num) {
        this.skuId = str;
        this.buyLimit = num;
    }
}
