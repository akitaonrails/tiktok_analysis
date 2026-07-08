package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionConfig {

    @C09CT("activity_config_items")
    public final List<ActivityConfigItem> activityConfigItems;

    @C09CT("max_chosen_activity_num")
    public final Integer maxChosenActivityNum;

    public PromotionConfig() {
        this(null, null);
    }

    public final int hashCode() {
        Integer num = this.maxChosenActivityNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ActivityConfigItem> list = this.activityConfigItems;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public PromotionConfig(Integer num, List<ActivityConfigItem> list) {
        this.maxChosenActivityNum = num;
        this.activityConfigItems = list;
    }
}
