package com.ss.android.ugc.aweme.im.sharepanel.impl.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareSimpleFuzzySearchConfig {

    @C09CT("follow_status_list")
    public final List<Integer> followStatusList;

    @C09CT("follower_status_list")
    public final List<Integer> followerStatusList;

    @C09CT("threshold")
    public final Integer threshold;

    @C09CT("upper_limit")
    public final int upperLimit;

    public ShareSimpleFuzzySearchConfig() {
        this(null, null, null, 0, 15, null);
    }

    public ShareSimpleFuzzySearchConfig(Integer num, List<Integer> list, List<Integer> list2, int i) {
        this.threshold = num;
        this.followStatusList = list;
        this.followerStatusList = list2;
        this.upperLimit = i;
    }

    public ShareSimpleFuzzySearchConfig(Integer num, List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? 500 : i);
    }
}
