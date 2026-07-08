package com.ss.android.ugc.tiktok.security;

import X.C09CT;
import X.C0C64;
import X.C13LP;
import X.C1697810uHb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class OptIABUAExp {
    public static final OptIABUAModel LIZ = new OptIABUAModel(0, false, null, C1697810uHb.LJIILJJIL(268439552, 402657281, 402657282));

    public static final OptIABUAModel LIZIZ() {
        try {
            return (OptIABUAModel) C0C64.LJIILLIIL().LJJII(OptIABUAModel.class, LIZ, "opt_iab_ua", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final String LIZJ() {
        OptIABUAModel optIABUAModelLIZIZ = LIZIZ();
        if (optIABUAModelLIZIZ == null) {
            return null;
        }
        return optIABUAModelLIZIZ.safeUa;
    }

    public static final boolean LIZ(Integer num) {
        OptIABUAModel optIABUAModelLIZIZ = LIZIZ();
        if (optIABUAModelLIZIZ == null || !optIABUAModelLIZIZ.deleteSafeUa) {
            return false;
        }
        List<Integer> list = optIABUAModelLIZIZ.iabDfids;
        if (list != null && !list.isEmpty() && !C13LP.LJJJJ(num, optIABUAModelLIZIZ.iabDfids)) {
            return false;
        }
        return true;
    }

    public static final class OptIABUAModel {

        @C09CT("delete_safe_ua")
        public final boolean deleteSafeUa;

        @C09CT("iab_dfids")
        public final List<Integer> iabDfids;

        @C09CT("safe_ua")
        public final String safeUa;

        @C09CT("type")
        public final int type;

        public OptIABUAModel() {
            this(0, false, null, C1697810uHb.LJIILJJIL(268439552, 402657281, 402657282));
        }

        public OptIABUAModel(int i, boolean z, String str, List<Integer> list) {
            this.type = i;
            this.deleteSafeUa = z;
            this.safeUa = str;
            this.iabDfids = list;
        }
    }
}
