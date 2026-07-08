package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonPanelSnapInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("addon_promotion_info")
    public final String addonPromotionInfo;

    @C09CT("addon_promotion_type")
    public final Integer addonPromotionType;

    public AddonPanelSnapInfo() {
        this(null, null);
    }

    public AddonPanelSnapInfo(Integer num, String str) {
        this.addonPromotionType = num;
        this.addonPromotionInfo = str;
    }
}
