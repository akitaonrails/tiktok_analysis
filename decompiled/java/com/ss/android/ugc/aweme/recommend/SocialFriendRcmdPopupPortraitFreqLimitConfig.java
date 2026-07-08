package com.ss.android.ugc.aweme.recommend;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SocialFriendRcmdPopupPortraitFreqLimitConfig {

    @C09CT("dislike_total_count_30days_real_upper_bound")
    public int dislikeTotalCount30daysRealUpperBound;

    @C09CT("dislike_total_count_3days_real_upper_bound")
    public int dislikeTotalCount3daysRealUpperBound;

    @C09CT("dislike_total_count_7days_real_upper_bound")
    public int dislikeTotalCount7daysRealUpperBound;

    @C09CT("enable_rule_based_model")
    public boolean enableRuleBasedModel;

    @C09CT("follow_total_count_30days_enum_lower_bound")
    public int followTotalCount30daysEnumLowerBound;

    @C09CT("follow_total_count_3days_enum_lower_bound")
    public int followTotalCount3daysEnumLowerBound;

    @C09CT("follow_total_count_7days_enum_lower_bound")
    public int followTotalCount7daysEnumLowerBound;

    public SocialFriendRcmdPopupPortraitFreqLimitConfig() {
        this(true, 1, 1, 2, 3, 7, 15);
    }

    public SocialFriendRcmdPopupPortraitFreqLimitConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        this.enableRuleBasedModel = z;
        this.followTotalCount3daysEnumLowerBound = i;
        this.followTotalCount7daysEnumLowerBound = i2;
        this.followTotalCount30daysEnumLowerBound = i3;
        this.dislikeTotalCount3daysRealUpperBound = i4;
        this.dislikeTotalCount7daysRealUpperBound = i5;
        this.dislikeTotalCount30daysRealUpperBound = i6;
    }
}
