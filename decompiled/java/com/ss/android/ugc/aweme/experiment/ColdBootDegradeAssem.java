package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes25.dex */
public final class ColdBootDegradeAssem {
    public static Config LIZ;

    public static class Config {

        @C09CT("MFLocalTestAssem")
        public boolean degradeMFLocalTestAssem;

        @C09CT("NewUserGuideAssem")
        public boolean degradeNewUserGuideAssem;

        @C09CT("NewUserOptAssem")
        public boolean degradeNewUserOptAssem;
    }

    public static void LIZLLL() {
        if (LIZ == null) {
            Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "optimize_degrade_degradeassem", true);
            LIZ = config;
            if (config == null) {
                LIZ = new Config();
            }
        }
    }

    public static boolean LIZ() {
        LIZLLL();
        return LIZ.degradeMFLocalTestAssem;
    }

    public static boolean LIZIZ() {
        LIZLLL();
        return LIZ.degradeNewUserGuideAssem;
    }

    public static boolean LIZJ() {
        LIZLLL();
        return LIZ.degradeNewUserOptAssem;
    }
}
