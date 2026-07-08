package com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.IWorkflowManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkflowManager implements IWorkflowManager {
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.IWorkflowManager
    public final ITaskScheduler LIZ() {
        try {
            return (ITaskScheduler) PluggableExtentionKt.pluggableSpi$default(ITaskScheduler.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
