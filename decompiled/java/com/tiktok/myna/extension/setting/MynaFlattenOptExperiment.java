package com.tiktok.myna.extension.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MynaFlattenOptExperiment {
    public static final Config LIZ = new Config(true, true, true, true, new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(107));

    public static final class Config {

        @C09CT("enable_flatten_pool")
        public final boolean enableFlattenPool;

        @C09CT("enable_leaf_flatten")
        public final boolean enableLeafFlatten;

        @C09CT("enable_level_flatten")
        public final boolean enableLevelFlatten;

        @C09CT("enable_overflow_flatten")
        public final boolean enableOverflowFlatten;

        @C09CT("flatten_blacklist")
        public final List<String> flattenBlacklist;

        public Config() {
            this(true, true, true, true, new ArrayList());
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
            this.enableLeafFlatten = z;
            this.enableLevelFlatten = z2;
            this.enableOverflowFlatten = z3;
            this.enableFlattenPool = z4;
            this.flattenBlacklist = list;
        }
    }
}
