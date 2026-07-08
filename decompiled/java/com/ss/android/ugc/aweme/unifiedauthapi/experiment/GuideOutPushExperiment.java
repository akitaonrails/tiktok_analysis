package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C09CT;
import X.C1EB2;
import X.C1EB3;
import X.C1EB4;
import X.C1EB5;
import X.C1EB6;
import X.C1EB7;
import X.C1EB8;
import X.C1EB9;
import X.C1EBA;
import X.C1EBB;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class GuideOutPushExperiment {
    public static final MetaData LIZ = new MetaData(0, 3, 15, 60, false, true, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1EBB());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1EB5());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1EB3());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1EB4());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1EBA());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1EB9());
    public static final C01GW LJII = C452501pT.LIZIZ(new C1EB2());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1EB6());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1EB7());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C1EB8());

    public static MetaData LIZ() {
        return (MetaData) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static final class MetaData {

        @C09CT("close_time_limit")
        public final int closeTimesLimit;

        @C09CT("freq_control_enable")
        public final boolean enableFrequencyCtrl;

        @C09CT("push_feature_exp")
        public final int featureExp;

        @C09CT("share_ug_freq")
        public final boolean shareUGFrequency;

        @C09CT("show_dm_first_dialog")
        public final boolean showDMFirstDialog;

        @C09CT("show_up_after_3times_interval")
        public final int showUpAfter3TimesInterval;

        @C09CT("show_up_interval")
        public final int showUpInterval;

        public MetaData() {
            this(0, 3, 15, 60, false, true, false);
        }

        public MetaData(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.featureExp = i;
            this.closeTimesLimit = i2;
            this.showUpInterval = i3;
            this.showUpAfter3TimesInterval = i4;
            this.shareUGFrequency = z;
            this.enableFrequencyCtrl = z2;
            this.showDMFirstDialog = z3;
        }
    }
}
