package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionConfig {

    @C09CT("activity_config_items")
    public final List<ActivityConfigItem> activityConfigItems;

    @C09CT("max_chosen_activity_num")
    public final Integer maxChosenActivityNum;

    public PromotionConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionConfig)) {
            return false;
        }
        PromotionConfig promotionConfig = (PromotionConfig) obj;
        return Intrinsics.LJFF(this.maxChosenActivityNum, promotionConfig.maxChosenActivityNum) && Intrinsics.LJFF(this.activityConfigItems, promotionConfig.activityConfigItems);
    }

    public final int hashCode() {
        Integer num = this.maxChosenActivityNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ActivityConfigItem> list = this.activityConfigItems;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionConfig(maxChosenActivityNum=");
        sbLIZ.append(this.maxChosenActivityNum);
        sbLIZ.append(", activityConfigItems=");
        sbLIZ.append(this.activityConfigItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionConfig(Integer num, List<ActivityConfigItem> list) {
        this.maxChosenActivityNum = num;
        this.activityConfigItems = list;
    }
}
