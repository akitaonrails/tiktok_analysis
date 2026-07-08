package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PageInfoSkeletonData implements Serializable {

    @C09CT("need_wait_signal")
    public final Boolean needWaitSignal;

    @C09CT("skeleton_delay_dismiss_time_ms")
    public final SkeletonDelayDismissTime skeletonDelayDismissTime;

    @C09CT("skeleton_ui_type")
    public final Integer skeletonUIType;

    public PageInfoSkeletonData() {
        this(null, null, null);
    }

    public PageInfoSkeletonData(Integer num, Boolean bool, SkeletonDelayDismissTime skeletonDelayDismissTime) {
        this.skeletonUIType = num;
        this.needWaitSignal = bool;
        this.skeletonDelayDismissTime = skeletonDelayDismissTime;
    }
}
