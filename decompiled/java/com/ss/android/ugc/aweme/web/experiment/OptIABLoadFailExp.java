package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class OptIABLoadFailExp {
    public static final OptIABLoadFailConfig LIZ = new OptIABLoadFailConfig();
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;

    public static final class OptIABLoadFailConfig {

        @C09CT("disable_safe_browsing")
        public boolean disableSafeBrowsing;

        @C09CT("opt_ua")
        public boolean optUA;

        @C09CT("remove_sec_ch_ua")
        public boolean removeSecChUa;

        @C09CT("remove_x_request_with")
        public boolean removeXRequestWith;
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(301));
        LIZIZ = c01gwLIZIZ;
        OptIABLoadFailConfig optIABLoadFailConfig = (OptIABLoadFailConfig) c01gwLIZIZ.getValue();
        LIZJ = optIABLoadFailConfig != null && optIABLoadFailConfig.disableSafeBrowsing;
        OptIABLoadFailConfig optIABLoadFailConfig2 = (OptIABLoadFailConfig) c01gwLIZIZ.getValue();
        LIZLLL = optIABLoadFailConfig2 != null && optIABLoadFailConfig2.removeXRequestWith;
        OptIABLoadFailConfig optIABLoadFailConfig3 = (OptIABLoadFailConfig) c01gwLIZIZ.getValue();
        LJ = optIABLoadFailConfig3 != null && optIABLoadFailConfig3.removeSecChUa;
        OptIABLoadFailConfig optIABLoadFailConfig4 = (OptIABLoadFailConfig) c01gwLIZIZ.getValue();
        LJFF = optIABLoadFailConfig4 != null && optIABLoadFailConfig4.optUA;
    }
}
