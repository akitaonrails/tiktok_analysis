package com.ss.android.ugc.aweme.notice.api.ab;

import X.C01GW;
import X.C09CT;
import X.C1EBC;
import X.C1EBD;
import X.C1EBE;
import X.C1EBF;
import X.C1EBG;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class EdmGuidePopupCoinExperiment {
    public static final MetaData LIZ = new MetaData(3, 4, 7, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1EBG());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1EBC());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1EBF());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1EBE());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1EBD());

    public static final class MetaData {

        @C09CT("freq_control_enable")
        public final boolean enableFreqCtrl;

        @C09CT("exit_time_limit")
        public final int exitTimesLimit;

        @C09CT("show_up_after_exit_interval")
        public final int showUpAfterExitInterval;

        @C09CT("show_up_interval")
        public final int showUpInterval;

        public MetaData() {
            this(3, 4, 7, true);
        }

        public MetaData(int i, int i2, int i3, boolean z) {
            this.exitTimesLimit = i;
            this.showUpInterval = i2;
            this.showUpAfterExitInterval = i3;
            this.enableFreqCtrl = z;
        }
    }
}
