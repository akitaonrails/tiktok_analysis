package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AuctionInfoPageData {

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("done_button")
    public final StarlingKeyValue doneButton;

    @C09CT("payment_err_msg")
    public final StarlingKeyValue paymentErrMsg;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    public AuctionInfoPageData(String str, String str2, StarlingKeyValue starlingKeyValue, StarlingKeyValue starlingKeyValue2, Map<String, String> map) {
        this.title = str;
        this.text = str2;
        this.doneButton = starlingKeyValue;
        this.paymentErrMsg = starlingKeyValue2;
        this.daInfo = map;
    }
}
