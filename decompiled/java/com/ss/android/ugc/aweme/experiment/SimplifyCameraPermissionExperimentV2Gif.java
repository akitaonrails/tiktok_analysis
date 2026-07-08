package com.ss.android.ugc.aweme.experiment;

import X.C0C64;
import X.C0CHQ;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class SimplifyCameraPermissionExperimentV2Gif {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final SimplifyCameraPermissionExperimentV2Gif INSTANCE = new SimplifyCameraPermissionExperimentV2Gif();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_gif_authority_view_for_first_time_users", true, false) && !C0CHQ.LIZ().getAccountService().LIZ() && Build.VERSION.SDK_INT >= 26;
    }
}
