package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class PresentShopperDetail implements Serializable {

    @C09CT("payment_detail_url")
    public final String paymentDetailUrl;

    public PresentShopperDetail() {
        this(null);
    }

    public PresentShopperDetail(String str) {
        this.paymentDetailUrl = str;
    }
}
