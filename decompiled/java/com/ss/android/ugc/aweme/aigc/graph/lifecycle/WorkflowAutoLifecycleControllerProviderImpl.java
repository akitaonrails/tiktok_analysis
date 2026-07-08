package com.ss.android.ugc.aweme.aigc.graph.lifecycle;

import X.C1704510uSP;
import X.InterfaceC553510LnJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;

/* JADX INFO: loaded from: classes9.dex */
public final class WorkflowAutoLifecycleControllerProviderImpl implements WorkflowAutoLifecycleControllerProvider {
    public volatile C1704510uSP LIZ;

    @Override // com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerProvider
    public final InterfaceC553510LnJ LIZ(AIGCWorkflowManagementApi aIGCWorkflowManagementApi) {
        C1704510uSP c1704510uSP;
        C1704510uSP c1704510uSP2 = this.LIZ;
        if (c1704510uSP2 != null) {
            return c1704510uSP2;
        }
        synchronized (this) {
            try {
                c1704510uSP = this.LIZ;
                if (c1704510uSP == null) {
                    c1704510uSP = new C1704510uSP(aIGCWorkflowManagementApi);
                    this.LIZ = c1704510uSP;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1704510uSP;
    }
}
