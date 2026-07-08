package com.ss.android.ugc.aweme.journey.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RevampISExperiment {
    public static boolean LIZIZ;
    public static boolean LIZLLL;
    public static int LIZ = -1;
    public static int LIZJ = 1;
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(237));

    public static boolean LIZ() {
        C01GW c01gw = LJ;
        return (((ExperimentConfig) c01gw.getValue()).abGroup == 1 || ((ExperimentConfig) c01gw.getValue()).abGroup == -1) ? false : true;
    }

    public static final class ExperimentConfig {

        @C09CT("ab_group")
        public final int abGroup;

        @C09CT("change_skip_btn_text")
        public final boolean changeSkipButtonText;

        @C09CT("show_icon")
        public final boolean showIcon;

        @C09CT("span_count")
        public final int spanCount;

        public ExperimentConfig() {
            this(-1, 0, false, false);
        }

        public ExperimentConfig(int i, int i2, boolean z, boolean z2) {
            this.abGroup = i;
            this.spanCount = i2;
            this.showIcon = z;
            this.changeSkipButtonText = z2;
        }
    }
}
