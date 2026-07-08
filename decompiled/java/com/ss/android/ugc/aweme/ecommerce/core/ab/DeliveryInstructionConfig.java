package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryInstructionConfig {

    @C09CT("address_enable")
    public final boolean addressEnable;

    @C09CT("order_submit_enable")
    public final boolean orderSubmitEnable;

    public DeliveryInstructionConfig() {
        this(false, false);
    }

    public DeliveryInstructionConfig(boolean z, boolean z2) {
        this.addressEnable = z;
        this.orderSubmitEnable = z2;
    }
}
