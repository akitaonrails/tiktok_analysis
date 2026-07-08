package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ShopData {

    @C09CT("revenue")
    public Amount revenue;

    @C09CT("show_shop_data")
    public boolean showShopData;

    public static final class Amount {

        @C09CT("amount_formatted")
        public String amountFormatted = "";

        @C09CT("amount_delimited")
        public String amountDelimited = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("currency_code")
        public String currencyCode = "";

        @C09CT("currency_symbol")
        public String currencySymbol = "";
    }
}
