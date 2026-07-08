package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityUserSelectionV2 {

    @C09CT("removed_activities")
    public final List<ActivityBaseInfoV2> removedActivityInfos;

    @C09CT("selected_activities")
    public final List<ActivityBaseInfoV2> selectedActivityInfos;

    public ActivityUserSelectionV2(List<ActivityBaseInfoV2> list, List<ActivityBaseInfoV2> list2) {
        this.removedActivityInfos = list;
        this.selectedActivityInfos = list2;
    }
}
