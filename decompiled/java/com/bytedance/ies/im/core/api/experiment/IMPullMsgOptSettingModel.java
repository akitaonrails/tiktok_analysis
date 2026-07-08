package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMPullMsgOptSettingModel {

    @C09CT("default_passive_interval")
    public final int defaultPassivePullInterval;

    @C09CT("respect_force_pull_flag")
    public final boolean respectForcePullFlag;

    public IMPullMsgOptSettingModel() {
        this(30000, false);
    }

    public IMPullMsgOptSettingModel(int i, boolean z) {
        this.defaultPassivePullInterval = i;
        this.respectForcePullFlag = z;
    }
}
