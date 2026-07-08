package com.ss.android.ugc.aweme.compliance.sandbox.api.services;

import X.C2429209fW;
import android.content.Intent;

/* JADX INFO: loaded from: classes14.dex */
public final class InjectSandboxService implements com.ss.android.ugc.aweme.api.ISandboxService {
    @Override // com.ss.android.ugc.aweme.api.ISandboxService
    public final void appendDataFlowId(Intent intent, int i) {
        C2429209fW.LIZ().appendDataFlowId(intent, i);
    }

    @Override // com.ss.android.ugc.aweme.api.ISandboxService
    public final boolean needInterceptBySandbox(Intent intent, int i) {
        return C2429209fW.LIZ().needInterceptBySandbox(intent, i);
    }
}
