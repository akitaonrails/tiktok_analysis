package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PGCIncentiveInfo {

    @C09CT("is_follower_criteria_met")
    public boolean isFollowerCriteriaMet;

    @C09CT("is_sov_criteria_met")
    public int isSovCriteriaMet;

    @C09CT("is_vv_criteria_met")
    public boolean isVvCriteriaMet;

    @C09CT("num_sub_only_videos_this_month")
    public long numSubOnlyVideosThisMonth;

    @C09CT("should_show_incentive_info")
    public boolean shouldShowIncentiveInfo;
}
