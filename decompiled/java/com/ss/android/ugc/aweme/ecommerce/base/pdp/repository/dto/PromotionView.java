package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionView {

    @C09CT("promotion_items")
    public final List<PromotionItem> promotionItems;

    public PromotionView() {
        this(null);
    }

    public PromotionView(List<PromotionItem> list) {
        this.promotionItems = list;
    }
}
