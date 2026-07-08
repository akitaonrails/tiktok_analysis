package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import X.C1055250dZD;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageNetworkOptimization implements Serializable {
    public static final C1055250dZD Companion = new Object() { // from class: X.0dZD
    };

    @C09CT("network_optimization_type")
    public final int networkOptimization;

    public LandingPageNetworkOptimization() {
        this(0);
    }

    public final int getNetworkOptimization() {
        return this.networkOptimization;
    }

    public LandingPageNetworkOptimization(int i) {
        this.networkOptimization = i;
    }
}
