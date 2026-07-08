package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.bean;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgSparkUrlAllowlistModel {

    @C09CT("blockParams")
    public final List<String> blockParams;

    @C09CT("enableDeepLink")
    public final boolean enableDeepLink;

    @C09CT("enableWhiteList")
    public final boolean enableWhiteList;

    @C09CT("host")
    public final List<String> host;

    @C09CT("path")
    public final List<String> path;

    public EcUgSparkUrlAllowlistModel() {
        this(false, false, null, null, null, 31, null);
    }

    public EcUgSparkUrlAllowlistModel(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3) {
        this.enableDeepLink = z;
        this.enableWhiteList = z2;
        this.host = list;
        this.path = list2;
        this.blockParams = list3;
    }

    public EcUgSparkUrlAllowlistModel(boolean z, boolean z2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) == 0 ? z2 : true, (i & 4) != 0 ? C1697810uHb.LJIIJJI("tiktokcdn", "tiktokcdn.com") : list, (i & 8) != 0 ? C1697810uHb.LJIIJJI("tiktok_live_ecommerce_promotion_page", "tiktok_live_new_user_deal_page", "tiktok_live_new_user_deal_page_ttf", "tiktok_live_new_user_deal_page_ttp", "tiktok_live_ecommerce_ttmal_flash_sale", "tiktok_live_ecommerce_ttmal_flash_sale_ttf", "tiktok_live_ecommerce_deal_channel_page", "tiktok_live_ecommerce_brand_discount", "tiktok_live_ecommerce_fashion_landing_page_ttf", "tiktok_live_ecommerce_ug_delivery_page", "ecom_promotion_caravel_h5", "tiktok_live_ecommerce_free_shipping_page", "tiktok_live_ecommerce_voucher_products_panel", "tiktok_live_ecommerce_top_deals_ttf") : list2, (i & 16) != 0 ? Collections.singletonList("fallback_url") : list3);
    }
}
