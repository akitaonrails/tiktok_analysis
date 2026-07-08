package com.ss.android.ugc.aweme.relation.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserDialogOptimizationExp {
    public static final RecUserDialogOptimizationExp LIZ = new RecUserDialogOptimizationExp();
    public static final RecUserDialogOptimizationConfig LIZIZ = new RecUserDialogOptimizationConfig(60, false, 30);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(297));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(296));

    public static final class RecUserDialogOptimizationConfig {

        @C09CT("rec_user_optimization_enabled")
        public boolean enableUIOptimizations;

        @C09CT("dialog_resize_frequency")
        public int recUserDialogResizeFrequency;

        @C09CT("rec_user_fetch_count")
        public int recUserInitialFetchCount;

        public RecUserDialogOptimizationConfig() {
            this(60, false, 30);
        }

        public RecUserDialogOptimizationConfig(int i, boolean z, int i2) {
            this.recUserDialogResizeFrequency = i;
            this.enableUIOptimizations = z;
            this.recUserInitialFetchCount = i2;
        }
    }
}
