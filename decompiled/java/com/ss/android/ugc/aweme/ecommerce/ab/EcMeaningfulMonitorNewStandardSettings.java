package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMeaningfulMonitorNewStandardSettings {
    public static final Config LIZ = new Config(3, false, false, new LinkedHashSet());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(60));

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("end_point_fp")
        public final Integer endFrameFp;

        @C09CT("multi_report")
        public final boolean multiReport;

        @C09CT("new_event_page_names")
        public final Set<String> useNewEvent;

        public Config() {
            this(3, false, false, new LinkedHashSet());
        }

        public Config(Integer num, boolean z, boolean z2, Set<String> set) {
            this.endFrameFp = num;
            this.enable = z;
            this.multiReport = z2;
            this.useNewEvent = set;
        }
    }
}
