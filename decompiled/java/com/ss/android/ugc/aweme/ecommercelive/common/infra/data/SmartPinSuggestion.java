package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class SmartPinSuggestion {

    @C09CT("action_card_info")
    public final CreatorToolsActionCardInfo actionCardInfo;

    @C09CT("first_pin_banner")
    public final ActionBannerInfo firstPinBanner;

    @C09CT("need_first_pin")
    public final Boolean needFirstPin;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_index")
    public final Long productIndex;

    @C09CT("switch_pin_banner")
    public final ActionBannerInfo switchPinBanner;

    public SmartPinSuggestion() {
        this(null, null, null, null, null, null);
    }

    public SmartPinSuggestion(String str, Long l, Boolean bool, ActionBannerInfo actionBannerInfo, ActionBannerInfo actionBannerInfo2, CreatorToolsActionCardInfo creatorToolsActionCardInfo) {
        this.productId = str;
        this.productIndex = l;
        this.needFirstPin = bool;
        this.firstPinBanner = actionBannerInfo;
        this.switchPinBanner = actionBannerInfo2;
        this.actionCardInfo = creatorToolsActionCardInfo;
    }
}
