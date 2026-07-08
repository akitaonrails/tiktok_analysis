package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13LQ;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class EcPdpDenyCrossModuleCommonEvent {
    public static final CrossModuleCommonEventDenyList LIZ = new CrossModuleCommonEventDenyList(C13LQ.LJLIIL(new String[]{"paap_communication_start", "paap_communication_transit"}));

    public static final class CrossModuleCommonEventDenyList {

        @C09CT("deny_list")
        public final Set<String> denyList;

        public CrossModuleCommonEventDenyList() {
            this(null);
        }

        public CrossModuleCommonEventDenyList(Set<String> set) {
            this.denyList = set;
        }
    }
}
