package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPDesignConfig {

    @C09CT("ec_osp_items_expand_count")
    public final Integer _itemsExpandCount;

    @C09CT("ec_osp_recommend_payment_count")
    public final Integer _paymentCount;

    @C09CT("ec_osp_cashier_entrance_position")
    public final int entrancePosition;

    @C09CT("ec_payment_component_interaction")
    public final boolean interaction;

    @C09CT("ec_cashier_payment_security")
    public final boolean paymentSecurity;

    @C09CT("ec_osp_place_order_optimize")
    public final boolean placeOrder;

    public OSPDesignConfig() {
        this(false, 0, false, false, null, null);
    }

    public OSPDesignConfig(boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2) {
        this.interaction = z;
        this.entrancePosition = i;
        this.placeOrder = z2;
        this.paymentSecurity = z3;
        this._paymentCount = num;
        this._itemsExpandCount = num2;
    }
}
