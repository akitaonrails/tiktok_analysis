package com.ss.android.ugc.aweme.exp.safety;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class DMCameraSafetyExperiment {
    public static final CameraSafetyExperimentModel LIZ = new CameraSafetyExperimentModel(0);
    public static final C01GW LIZIZ;
    public static final int LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(142));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((CameraSafetyExperimentModel) c01gwLIZIZ.getValue()).launchTime;
    }

    public static final class CameraSafetyExperimentModel {

        @C09CT("launch_time")
        public final int launchTime;

        public CameraSafetyExperimentModel() {
            this(0);
        }

        public CameraSafetyExperimentModel(int i) {
            this.launchTime = i;
        }
    }
}
