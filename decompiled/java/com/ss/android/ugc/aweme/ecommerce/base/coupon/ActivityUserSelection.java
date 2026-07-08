package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityUserSelection implements Serializable {
    public static final int $stable = 8;

    @C09CT("removed_activities")
    public final List<ActivityBaseInfo> removedActivityInfos;

    @C09CT("selected_activities")
    public final List<ActivityBaseInfo> selectedActivityInfos;

    public ActivityUserSelection(List<ActivityBaseInfo> list, List<ActivityBaseInfo> list2) {
        this.removedActivityInfos = list;
        this.selectedActivityInfos = list2;
    }
}
