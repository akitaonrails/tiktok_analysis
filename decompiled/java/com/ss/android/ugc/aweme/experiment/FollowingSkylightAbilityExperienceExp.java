package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingSkylightAbilityExperienceExp {
    public static final Config LIZ = new Config(false, false, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(155));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(152));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(154));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(153));

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static final class Config {

        @C09CT("avatar_size_opt")
        public final boolean avatarSizeOpt;

        @C09CT("tip_count")
        public final int tipCount;

        @C09CT("ui_opt")
        public final boolean uiOpt;

        public Config() {
            this(false, false, 3);
        }

        public Config(boolean z, boolean z2, int i) {
            this.avatarSizeOpt = z;
            this.uiOpt = z2;
            this.tipCount = i;
        }
    }
}
