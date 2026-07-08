package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C302980BuC;
import X.C303590BvB;
import X.C303600BvC;
import X.C303610BvD;
import X.C452501pT;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkIABOptimizeConfig {
    public static final SparkIABOptimizeConfigModel LIZ = new SparkIABOptimizeConfigModel(true, true, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C303590BvB());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C303600BvC());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C303610BvD());
    public static final C01GW LJ = C452501pT.LIZIZ(new C302980BuC());

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final class SparkIABOptimizeConfigModel {

        @C09CT("disable_send_event_when_pure")
        public final boolean disableSkipSendEventWhenPure;

        @C09CT("enable_skip_mob_pure_jump")
        public final boolean enableSkipMobPureJump;

        @C09CT("enable_spark_warm_up")
        public final boolean enableSparkWarmUp;

        public SparkIABOptimizeConfigModel() {
            this(true, true, false);
        }

        public SparkIABOptimizeConfigModel(boolean z, boolean z2, boolean z3) {
            this.disableSkipSendEventWhenPure = z;
            this.enableSkipMobPureJump = z2;
            this.enableSparkWarmUp = z3;
        }
    }
}
