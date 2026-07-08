package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C01GW;
import X.C09CT;
import X.C1585070rLl;
import X.C303000BuE;
import X.C308470C7h;
import X.C343780Ddo;
import X.C452501pT;
import X.EnumC1584360rKc;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FriendsTabTopExperiment {
    public static final FriendsTabTopConfig LIZ;
    public static final FriendsTabTopConfig LIZIZ;
    public static final C01GW LIZJ;
    public static volatile FriendsTabTopConfig LIZLLL;
    public static final C01GW LJ;

    static {
        FriendsTabTopConfig friendsTabTopConfig = new FriendsTabTopConfig(-20);
        LIZ = friendsTabTopConfig;
        LIZIZ = new FriendsTabTopConfig(-1);
        LIZJ = C452501pT.LIZIZ(new C303000BuE());
        LIZLLL = friendsTabTopConfig;
        LJ = C452501pT.LIZIZ(new C308470C7h());
    }

    public static int LIZ() {
        if (!C343780Ddo.LIZIZ()) {
            return !Intrinsics.LJFF(LIZLLL, LIZ) ? LIZLLL.indexOnTop : ((Number) LJ.getValue()).intValue();
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        c1585070rLl.getClass();
        return C1585070rLl.LJFF(enumC1584360rKc, null) ? 1 : -1;
    }

    public static boolean LIZIZ() {
        return LIZ() >= 0;
    }

    public static final class FriendsTabTopConfig {

        @C09CT("index_on_the_top")
        public final int indexOnTop;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FriendsTabTopConfig) && this.indexOnTop == ((FriendsTabTopConfig) obj).indexOnTop;
        }

        public FriendsTabTopConfig(int i) {
            this.indexOnTop = i;
        }
    }
}
