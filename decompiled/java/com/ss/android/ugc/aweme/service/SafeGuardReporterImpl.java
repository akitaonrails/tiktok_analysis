package com.ss.android.ugc.aweme.service;

import X.C01U6;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.touchpoint.api.ISafeGuardReporter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS435S0200000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class SafeGuardReporterImpl implements ISafeGuardReporter {
    public final boolean LIZ = true;
    public final String LIZIZ = "pa_biz_crash";

    @Override // com.bytedance.touchpoint.api.ISafeGuardReporter
    public final void LIZ(Throwable th) throws Throwable {
        if (this.LIZ) {
            C01U6.LIZJ(new AwS435S0200000_34(this, th, 7));
        }
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null && iAppContextService.isOffline()) {
            throw th;
        }
    }
}
