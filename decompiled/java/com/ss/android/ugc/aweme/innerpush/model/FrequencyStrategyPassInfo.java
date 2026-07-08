package com.ss.android.ugc.aweme.innerpush.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes32.dex */
public final class FrequencyStrategyPassInfo {

    @C09CT("is_pass")
    public final boolean isPass;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long strategyId;

    public FrequencyStrategyPassInfo(long j, boolean z) {
        this.strategyId = j;
        this.isPass = z;
    }
}
