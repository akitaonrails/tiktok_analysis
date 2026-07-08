package com.ss.android.ugc.aweme.pipo.cashier.cashier.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoTtlsOspDirectCheckoutSettings {
    public static final Config LIZ = new Config(null, 1, null);

    public static final class Config {

        @C09CT(alternate = {"payment_method_id_list"}, value = "pm_id_list")
        public final List<String> pmIdList;

        public Config() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.LJFF(this.pmIdList, ((Config) obj).pmIdList);
        }

        public final int hashCode() {
            List<String> list = this.pmIdList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(pmIdList=");
            sbLIZ.append(this.pmIdList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(List<String> list) {
            this.pmIdList = list;
        }

        public Config(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList("pm_pi_ccdc_all") : list);
        }
    }
}
