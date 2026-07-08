package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiIabTopFloatingLayerCheckerConfig {
    public static final Config LIZ = new Config(0, 0, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(328));

    public static final class Config {

        @C09CT("hide_enable")
        public final int hideEnable;

        @C09CT("identify_enable")
        public final int identifyEnable;

        @C09CT("unique_config")
        public final Map<String, List<String>> uniqueConfig;

        public Config() {
            this(0, 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config(int i, int i2, Map<String, ? extends List<String>> map) {
            this.identifyEnable = i;
            this.hideEnable = i2;
            this.uniqueConfig = map;
        }
    }
}
