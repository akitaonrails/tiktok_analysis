package com.ss.android.ugc.aweme.ad.experiment;

import X.C01GW;
import X.C09CT;
import X.C12ES;
import X.C452501pT;
import X.C844470XAv;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdScrollToJumpExperiment {
    public static final Config LIZ = new Config(Boolean.FALSE, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(77));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(78));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(80));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(79));

    public static int LIZ(int i) {
        C844470XAv.LIZ.getClass();
        return (int) C12ES.LIZJ(i, C844470XAv.LIZ());
    }

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("min_distance")
        public final Integer minDistance;

        @C09CT("min_velocity")
        public final Integer minVelocity;

        public Config() {
            this(null, null, null);
        }

        public Config(Boolean bool, Integer num, Integer num2) {
            this.enable = bool;
            this.minVelocity = num;
            this.minDistance = num2;
        }
    }
}
