package com.ss.android.ugc.aweme.pipo.cashier.cashier.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoTtlsEnableSecuritySdkSettings {
    public static final SecurityConfigModel LIZ = new SecurityConfigModel(null, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(515));

    public static final class SecurityConfigModel {

        @C09CT("api_list")
        public final List<String> apiList;

        @C09CT("enable")
        public final Boolean enable;

        public SecurityConfigModel() {
            this(null, null, 3, null);
        }

        public SecurityConfigModel(Boolean bool, List<String> list) {
            this.enable = bool;
            this.apiList = list;
        }

        public SecurityConfigModel(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Collections.singletonList("") : list);
        }
    }
}
