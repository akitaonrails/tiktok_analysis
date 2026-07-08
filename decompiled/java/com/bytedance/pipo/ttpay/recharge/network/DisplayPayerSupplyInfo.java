package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayPayerSupplyInfo implements Serializable {

    @C09CT("present_shopper_detail")
    public final PresentShopperDetail presentShopperDetail;

    public DisplayPayerSupplyInfo() {
        this(null);
    }

    public DisplayPayerSupplyInfo(PresentShopperDetail presentShopperDetail) {
        this.presentShopperDetail = presentShopperDetail;
    }
}
