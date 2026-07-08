package com.shopify.checkout.models.errors.violations;

import X.C08FF;

/* JADX INFO: loaded from: classes18.dex */
public enum InventoryErrorCode {
    InsufficientQuantity("insufficient_quantity"),
    OutOfStock("out_of_stock"),
    UnavailableProduct("unavailable_product"),
    UnpurchasableProduct("unpurchasable_product");

    public final String LL;

    public static InventoryErrorCode valueOf(String str) {
        return (InventoryErrorCode) C08FF.LIZ(InventoryErrorCode.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    InventoryErrorCode(String str) {
        this.LL = str;
    }
}
