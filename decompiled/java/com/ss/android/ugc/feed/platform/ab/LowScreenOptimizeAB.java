package com.ss.android.ugc.feed.platform.ab;

import X.C01GW;
import X.C09CT;
import X.C0RRO;
import X.C1DDC;
import X.C452501pT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class LowScreenOptimizeAB {
    public static final LowScreenOptConfig LIZ = new LowScreenOptConfig(false, false, false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0RRO());

    public static LowScreenOptConfig LIZJ() {
        return (LowScreenOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return LIZJ().enableAdaptLeft && LIZLLL();
    }

    public static boolean LIZIZ() {
        return LIZJ().enableAdaptRight && LIZLLL();
    }

    public static boolean LIZLLL() {
        if (!LIZJ().openAB) {
            return false;
        }
        int i = C1DDC.LLILZLL.LJFF;
        return i == 3 || i == 2;
    }

    public static boolean LJ() {
        return LIZJ().unifyLastMargin;
    }

    public static final class LowScreenOptConfig implements Serializable {
        public static final int $stable = 0;

        @C09CT("enable_adapt_left_area")
        public final boolean enableAdaptLeft;

        @C09CT("enable_adapt_right_area")
        public final boolean enableAdaptRight;

        @C09CT("enable_adapt_tab")
        public final boolean enableAdaptTab;

        @C09CT("open_ab")
        public final boolean openAB;

        @C09CT("open_operator_refactor")
        public final boolean operatorRefactor;

        @C09CT("unify_last_margin")
        public final boolean unifyLastMargin;

        public LowScreenOptConfig() {
            this(false, false, false, false, false, false);
        }

        public LowScreenOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.openAB = z;
            this.unifyLastMargin = z2;
            this.operatorRefactor = z3;
            this.enableAdaptTab = z4;
            this.enableAdaptLeft = z5;
            this.enableAdaptRight = z6;
        }
    }
}
