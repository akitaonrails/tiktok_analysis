package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class MallSchemaBizParams {

    @C09CT("back_btn_enable")
    public final Integer backBtnEnable;

    @C09CT("order_bubble_enable")
    public final Integer orderBubbleEnable;

    @C09CT("scroll_to_feed_enable")
    public final Integer scrollToFeedEnable;

    @C09CT("us_localization")
    public final Integer usLocalization;

    public MallSchemaBizParams() {
        this(null, null, null, null);
    }

    public MallSchemaBizParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.usLocalization = num;
        this.backBtnEnable = num2;
        this.scrollToFeedEnable = num3;
        this.orderBubbleEnable = num4;
    }
}
