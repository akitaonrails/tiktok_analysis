package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveInnerPushShowTimeExperiment {
    public static final int DEFAULT = 0;
    public static final LiveInnerPushShowTimeExperiment INSTANCE = new LiveInnerPushShowTimeExperiment();

    private final int getValue() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "live_inner_push_show_time_opt", true);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
