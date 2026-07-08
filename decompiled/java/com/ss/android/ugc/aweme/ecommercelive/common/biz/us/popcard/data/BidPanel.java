package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class BidPanel {

    @C09CT("address_payment_schema")
    public final String addressPaymentSchema;

    @C09CT("bid_btn_text")
    public final Map<String, String> bidBtnTextMap;

    @C09CT("bid_btn_text_type")
    public final Integer bidBtnTextType;

    @C09CT("customize_bid_btn_text")
    public final String customizeBidBtnText;

    @C09CT("info_list")
    public final List<String> infoList;

    @C09CT("next_bid_btn_price_prefix_text")
    public final String nextBidBtnPricePrefixText;

    @C09CT("prefix_bid_price")
    public final String prefixBidPrice;

    @C09CT("tips")
    public final String tips;

    @C09CT("top_title")
    public final String topTitle;

    @C09CT("top_title_with_countdown")
    public final String topTitleWithCountdown;

    public BidPanel() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public BidPanel(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, Map<String, String> map, Integer num) {
        this.prefixBidPrice = str;
        this.tips = str2;
        this.customizeBidBtnText = str3;
        this.nextBidBtnPricePrefixText = str4;
        this.addressPaymentSchema = str5;
        this.infoList = list;
        this.topTitle = str6;
        this.topTitleWithCountdown = str7;
        this.bidBtnTextMap = map;
        this.bidBtnTextType = num;
    }
}
