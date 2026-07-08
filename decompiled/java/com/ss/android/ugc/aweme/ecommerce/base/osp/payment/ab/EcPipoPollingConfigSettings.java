package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C123100dR;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPipoPollingConfigSettings {
    public static final EcPipoPollingConfig LIZ = new EcPipoPollingConfig(null, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(58));

    public static boolean LIZ(String str) {
        List<String> list;
        if (!C123100dR.LIZ(str) || (list = ((EcPipoPollingConfig) LIZIZ.getValue()).piList) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final class EcPipoPollingConfig {

        @C09CT("enable_track")
        public final Boolean enableTrack;

        @C09CT("enable_pi_list")
        public final List<String> piList;

        public EcPipoPollingConfig() {
            this(null, null, 3, null);
        }

        public EcPipoPollingConfig(List<String> list, Boolean bool) {
            this.piList = list;
            this.enableTrack = bool;
        }

        public EcPipoPollingConfig(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList("") : list, (i & 2) != 0 ? Boolean.TRUE : bool);
        }
    }
}
