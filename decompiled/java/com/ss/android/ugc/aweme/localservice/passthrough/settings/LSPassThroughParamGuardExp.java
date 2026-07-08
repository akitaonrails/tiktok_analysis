package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C0C64;

/* JADX INFO: loaded from: classes33.dex */
public final class LSPassThroughParamGuardExp {
    public static final boolean DEFAULT = false;
    public static final LSPassThroughParamGuardExp INSTANCE = new LSPassThroughParamGuardExp();
    public static final boolean hitExperiment = C0C64.LJIILLIIL().LJIIIZ(31744, "local_service_pass_through_param_guard", true, false);

    public final boolean hitExperiment() {
        return hitExperiment;
    }
}
