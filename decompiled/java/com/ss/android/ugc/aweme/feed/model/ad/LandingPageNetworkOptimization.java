package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageNetworkOptimization implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("network_optimization_type")
    public final int networkOptimization;

    public static final class Companion {
    }

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
