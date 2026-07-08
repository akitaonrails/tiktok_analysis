package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class UserDisplayMeta {

    @C09CT("creation_eligibility")
    public final boolean creationEligibility;

    @C09CT("current_group_cnt")
    public final int currentGroupCnt;

    @C09CT("group_cnt_limit")
    public final int groupCntLimit;

    @C09CT("group_member_limit")
    public final int groupMemberLimit;

    public UserDisplayMeta() {
        this(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, true);
    }

    public UserDisplayMeta(int i, int i2, int i3, boolean z) {
        this.currentGroupCnt = i;
        this.groupMemberLimit = i2;
        this.groupCntLimit = i3;
        this.creationEligibility = z;
    }
}
