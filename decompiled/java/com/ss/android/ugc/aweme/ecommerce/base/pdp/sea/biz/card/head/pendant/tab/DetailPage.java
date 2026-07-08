package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DetailPage {

    @C09CT("black_light_disable")
    public final Boolean blackLightDisable;

    @C09CT("da_info")
    public final DetailPageDaInfo daInfo;

    @C09CT("show_find_similar_mode")
    public final Integer showFindSimilarMode;

    @C09CT("show_items_mode")
    public final Integer showItemsMode;

    public DetailPage(Integer num, Integer num2, Boolean bool, DetailPageDaInfo detailPageDaInfo) {
        this.showFindSimilarMode = num;
        this.showItemsMode = num2;
        this.blackLightDisable = bool;
        this.daInfo = detailPageDaInfo;
    }
}
