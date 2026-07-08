package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlacementLabel implements Serializable {

    @C09CT("labels")
    public List<PromotionLabel> labels;

    @C09CT("placement")
    public Integer placement;

    @C09CT("placement_label_list")
    public List<PromotionLabel> placementLabelList;

    public PlacementLabel() {
        this(null, null, null);
    }

    public PlacementLabel(Integer num, List<PromotionLabel> list, List<PromotionLabel> list2) {
        this.placement = num;
        this.placementLabelList = list;
        this.labels = list2;
    }
}
