package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ECPreloadDispatchGlobalConfig {

    @C09CT("dispatch_resource_condition")
    public final ECDispatchResourceCondition dispatchResourceCondition;

    @C09CT("task_type_resource")
    public final List<ECPreloadTaskResource> taskTypeResource;

    @C09CT("task_timeout")
    public final int taskTimeout = 10000;

    @C09CT("task_dispatch_interval")
    public final long taskDispatchInterval = 3000;

    @C09CT("user_interaction_dispatch_interval")
    public final int userInteractionDispatchInterval = LSPassThroughRecordSizeConfig.DEFAULT;
}
