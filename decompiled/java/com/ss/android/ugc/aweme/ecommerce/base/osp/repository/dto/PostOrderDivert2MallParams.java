package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PostOrderDivert2MallParams {

    @C09CT("back_btn_enable")
    public final Integer backBtnEnable;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("order_bubble_enable")
    public final Integer orderBubbleEnable;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("pay_source")
    public final String paySource;

    @C09CT("pay_to_mall_source")
    public final String payToMallSource;

    @C09CT("pay_to_mall_tab")
    public final Integer payToMallTab;

    @C09CT("pay_type")
    public final String payType;

    @C09CT("scroll_to_feed_enable")
    public final Integer scrollToFeedEnable;

    @C09CT("shop_tab_ab")
    public final Integer shopTabAB;

    @C09CT("us_localization")
    public final Integer usLocalization;

    public PostOrderDivert2MallParams() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public PostOrderDivert2MallParams(Integer num, Integer num2, String str, String str2, Integer num3, String str3, String str4, Integer num4, Integer num5, Integer num6, String str5) {
        this.shopTabAB = num;
        this.payToMallTab = num2;
        this.payType = str;
        this.payRequestId = str2;
        this.usLocalization = num3;
        this.payToMallSource = str3;
        this.paySource = str4;
        this.backBtnEnable = num4;
        this.scrollToFeedEnable = num5;
        this.orderBubbleEnable = num6;
        this.enterFrom = str5;
    }
}
