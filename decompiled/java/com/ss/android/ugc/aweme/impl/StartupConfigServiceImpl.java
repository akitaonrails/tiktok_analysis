package com.ss.android.ugc.aweme.impl;

import X.C08Q0;
import X.C844470XAv;
import android.content.Context;
import com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupConfigServiceImpl implements IStartupConfigApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final boolean LIZ() {
        return (C08Q0.LIZIZ(getApplicationContext(), 0, "downgrade_ability_performance_opt") & 1) == 1;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final boolean LIZIZ() {
        return C08Q0.LJ(getApplicationContext(), "startup_state_utils_migrate_opt", false);
    }
}
