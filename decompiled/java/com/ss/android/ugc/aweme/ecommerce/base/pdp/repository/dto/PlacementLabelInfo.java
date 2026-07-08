package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PlacementLabelInfo {

    @C09CT("placement")
    public final Integer placement;

    @C09CT("labels")
    public final List<PromotionLabel> promotionLabels;

    public final int hashCode() {
        Integer num = this.placement;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PromotionLabel> list = this.promotionLabels;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public PlacementLabelInfo(Integer num, List<PromotionLabel> list) {
        this.placement = num;
        this.promotionLabels = list;
    }
}
