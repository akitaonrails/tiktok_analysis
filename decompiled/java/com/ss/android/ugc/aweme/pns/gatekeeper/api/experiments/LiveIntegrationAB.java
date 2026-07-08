package com.ss.android.ugc.aweme.pns.gatekeeper.api.experiments;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveIntegrationAB {
    public static final boolean DISABLED = false;
    public static final LiveIntegrationAB INSTANCE = new LiveIntegrationAB();

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_live_integrated_gatekeeper", true, false);
    }
}
