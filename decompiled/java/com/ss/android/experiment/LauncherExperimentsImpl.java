package com.ss.android.experiment;

import X.C0C64;
import com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class LauncherExperimentsImpl implements ILauncherExperimentsApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final AtomicBoolean isInitialized() {
        return new AtomicBoolean(false);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fix_bundle_too_large", true, false);
    }
}
