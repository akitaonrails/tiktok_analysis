package com.ss.android.ugc.aweme.experiment;

import X.C0C64;
import X.C0CHQ;

/* JADX INFO: loaded from: classes5.dex */
public final class SimplifyCameraPermissionExperiment {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final SimplifyCameraPermissionExperiment INSTANCE = new SimplifyCameraPermissionExperiment();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_unified_authority_view_for_non_first_authorization", true, false) && !C0CHQ.LIZ().getAccountService().LIZ();
    }
}
