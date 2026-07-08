package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectDetailVideoListExperiment {
    public static final EffectDetailVideoListExperimentConfig LIZ = new EffectDetailVideoListExperimentConfig(false, 20);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(76));

    public static final class EffectDetailVideoListExperimentConfig {

        @C09CT("count")
        public final int count;

        @C09CT("on")
        public final boolean on;

        public EffectDetailVideoListExperimentConfig() {
            this(false, 20);
        }

        public EffectDetailVideoListExperimentConfig(boolean z, int i) {
            this.on = z;
            this.count = i;
        }
    }
}
