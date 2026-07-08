package com.ss.android.ugc.aweme.innerpush.settings;

import X.C01GW;
import X.C09CT;
import X.C1E9T;
import X.C1E9U;
import X.C1E9V;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushAIExp {
    public static final AIConfig LIZ = new AIConfig(0, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1E9V());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1E9T());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1E9U());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(225));

    public static final class AIConfig {

        @C09CT("enable_inner_push_pitaya_register")
        public final boolean allowRegister;

        @C09CT("exp_value")
        public final int expVal;

        @C09CT("enable_pitaya_lost_focus")
        public final boolean lostFocusEnable;

        public AIConfig() {
            this(0, false, false);
        }

        public AIConfig(int i, boolean z, boolean z2) {
            this.expVal = i;
            this.lostFocusEnable = z;
            this.allowRegister = z2;
        }
    }
}
