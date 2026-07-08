package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C0VG1;
import X.C452501pT;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKLSUserTraceConfig {
    public static final Config LIZ = new Config(Boolean.FALSE, null, null, null, null, null);
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0VG1());

    public static Config LIZ() {
        return (Config) LIZJ.getValue();
    }

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("network_paths")
        public final List<String> networkPaths;

        @C09CT("screenshot_enable")
        public final Boolean screenshotEnable;

        @C09CT("ttkls_events")
        public final List<String> ttklsEvents;

        @C09CT("ttkls_ss_bundles")
        public final List<String> ttklsSsBundles;

        @C09CT("ttkls_ss_channels")
        public final List<String> ttklsSsChannels;

        public Config(Boolean bool, List<String> list, List<String> list2, Boolean bool2, List<String> list3, List<String> list4) {
            this.enable = bool;
            this.networkPaths = list;
            this.ttklsEvents = list2;
            this.screenshotEnable = bool2;
            this.ttklsSsChannels = list3;
            this.ttklsSsBundles = list4;
        }
    }
}
