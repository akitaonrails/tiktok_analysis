package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftCardCheckoutInfoRespData {

    @C09CT("agreement_content")
    public final String agreementContent;

    @C09CT("cashier_basic_info_str")
    public final String cashierBasicInfoRespStr;

    @C09CT("checkout_page_footer")
    public final CheckoutPageFooter checkoutPageFooter;

    @C09CT("checkout_page_title")
    public final CheckoutPageTitle checkoutPageTitle;

    @C09CT("giftcard_notify_show_items")
    public final List<GiftCardNotifyShowItem> giftCardNotifyShowInfo;

    @C09CT("order_id")
    public final String orderId;

    public GiftCardCheckoutInfoRespData() {
        this(null, null, null, null, null, null);
    }

    public GiftCardCheckoutInfoRespData(CheckoutPageTitle checkoutPageTitle, List<GiftCardNotifyShowItem> list, String str, String str2, CheckoutPageFooter checkoutPageFooter, String str3) {
        this.checkoutPageTitle = checkoutPageTitle;
        this.giftCardNotifyShowInfo = list;
        this.cashierBasicInfoRespStr = str;
        this.agreementContent = str2;
        this.checkoutPageFooter = checkoutPageFooter;
        this.orderId = str3;
    }
}
