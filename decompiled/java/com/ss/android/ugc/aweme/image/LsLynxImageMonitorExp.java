package com.ss.android.ugc.aweme.image;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class LsLynxImageMonitorExp {
    public static final Config LIZ = new Config(Boolean.FALSE, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(37));

    public static final class ChannelConfig {

        @C09CT("bundleList")
        public final List<String> bundleList;

        public ChannelConfig(List<String> list) {
            this.bundleList = list;
        }
    }

    public static final class Config {

        @C09CT("allowLynxUrlList")
        public final Map<String, ChannelConfig> allowLynxUrlList;

        @C09CT("blockLynxUrlList")
        public final Map<String, ChannelConfig> blockLynxUrlList;

        @C09CT("enable")
        public final Boolean enable;

        public Config(Boolean bool, Map<String, ChannelConfig> map, Map<String, ChannelConfig> map2) {
            this.enable = bool;
            this.blockLynxUrlList = map;
            this.allowLynxUrlList = map2;
        }
    }
}
