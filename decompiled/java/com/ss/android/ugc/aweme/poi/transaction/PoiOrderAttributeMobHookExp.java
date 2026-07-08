package com.ss.android.ugc.aweme.poi.transaction;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderAttributeMobHookExp {
    public static final PoiOrderAttributeMobHookConfig LIZ = new PoiOrderAttributeMobHookConfig(Boolean.FALSE, C13BV.INSTANCE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(535));

    public static final class PoiOrderAttributeMobHookConfig {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("order_attr_event_list")
        public final List<String> orderAttrEventList;

        public PoiOrderAttributeMobHookConfig() {
            this(Boolean.FALSE, null);
        }

        public PoiOrderAttributeMobHookConfig(Boolean bool, List<String> list) {
            this.enable = bool;
            this.orderAttrEventList = list;
        }
    }
}
