package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ECPreloadDispatcherConfig {

    @C09CT("dispatch_enable")
    public final boolean enable;

    @C09CT("exempt_task")
    public List<ExemptCondition> exemptTask;

    @C09CT("preload_config")
    public final ECPreloadDispatchGlobalConfig preloadConfig;

    @C09CT("task_config_list")
    public final List<ECPreloadTaskConfig> taskConfigList;
}
