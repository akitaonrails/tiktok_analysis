package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkEcomOptimizeExperiment {
    public static final EcomOptimizeModel LIZ = new EcomOptimizeModel(false, false, false);
    public static final C01GW LIZIZ;

    static {
        new EcomOptimizeModel(true, true, true);
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1944));
    }

    public static final class EcomOptimizeModel {

        @C09CT("spark_create_container_opt")
        public final boolean enableSparkCreateContainerOpt;

        @C09CT("spark_prefetch_opt")
        public final boolean enableSparkPrefetchOpt;

        @C09CT("spark_use_spark_opt")
        public final boolean enableSparkUseSparkOpt;

        public EcomOptimizeModel() {
            this(false, false, false);
        }

        public EcomOptimizeModel(boolean z, boolean z2, boolean z3) {
            this.enableSparkCreateContainerOpt = z;
            this.enableSparkPrefetchOpt = z2;
            this.enableSparkUseSparkOpt = z3;
        }
    }
}
