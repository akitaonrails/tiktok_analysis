package com.ss.android.ugc.aweme.search.pages.result.common.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class TaskSchedulerOptConfig {

    @C09CT("ellipsis_sch")
    public final int enableEllipsisSch;

    @C09CT("params_sch")
    public final int enableParamsSch;

    @C09CT("root_assem_sch")
    public final int enableRootAssemSch;

    public TaskSchedulerOptConfig() {
        this(0, 0, 0);
    }

    public TaskSchedulerOptConfig(int i, int i2, int i3) {
        this.enableParamsSch = i;
        this.enableEllipsisSch = i2;
        this.enableRootAssemSch = i3;
    }
}
