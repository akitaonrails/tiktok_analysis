package com.ss.android.ugc.aweme.experiment;

import X.C0C64;
import X.C1519870peb;
import X.C2503209rS;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes5.dex */
public final class ReDexExperimentOpt {
    public static final boolean DISABLE = false;
    public static final boolean ENABLED = true;
    public static final String KEY = "redex_ab_key";
    public static boolean abTest;
    public static final ReDexExperimentOpt INSTANCE = new ReDexExperimentOpt();
    public static final int $stable = 8;

    public static /* synthetic */ void getAbTest$annotations() {
    }

    public static final void load() {
        boolean z = false;
        if (C1519870peb.LIZ.get()) {
            C2503209rS.LIZ.getClass();
            if (((Keva) C2503209rS.LIZJ.getValue()).getBoolean(KEY, false)) {
                z = true;
            }
        }
        abTest = z;
    }

    public static final void update() {
        C2503209rS.LIZ.getClass();
        ((Keva) C2503209rS.LIZJ.getValue()).storeBoolean(KEY, C0C64.LJIILLIIL().LJIIIZ(31744, KEY, true, false));
    }

    public static final boolean getAbTest() {
        return abTest;
    }

    public static final void setAbTest(boolean z) {
        abTest = z;
    }
}
