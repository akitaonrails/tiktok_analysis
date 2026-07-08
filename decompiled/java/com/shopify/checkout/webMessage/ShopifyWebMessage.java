package com.shopify.checkout.webMessage;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ShopifyWebMessage {
    INIT,
    COMPLETED,
    STATE_CHANGE,
    CHECKOUT_STARTED,
    ERROR,
    CHECKOUT_BLOCKING_EVENT,
    UPDATE_PAY_BUTTON_STATE,
    UPDATE_PROGRESS_BUTTON,
    LOCALE;

    public static ShopifyWebMessage valueOf(String str) {
        return (ShopifyWebMessage) C08FF.LIZ(ShopifyWebMessage.class, str);
    }
}
