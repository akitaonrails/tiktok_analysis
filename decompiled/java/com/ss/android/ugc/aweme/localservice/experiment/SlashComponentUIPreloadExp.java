package com.ss.android.ugc.aweme.localservice.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashComponentUIPreloadExp {
    public static final Config LIZ = new Config(Boolean.FALSE, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(175));

    public static boolean LIZ(String str) {
        Config config;
        List<String> list;
        C01GW c01gw = LIZIZ;
        Config config2 = (Config) c01gw.getValue();
        if (config2 == null || !Intrinsics.LJFF(config2.enable, Boolean.TRUE) || (config = (Config) c01gw.getValue()) == null || (list = config.instanceIds) == null) {
            return false;
        }
        return list.contains(str);
    }

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("instance_ids")
        public final List<String> instanceIds;

        public Config() {
            this(null, null);
        }

        public Config(Boolean bool, List<String> list) {
            this.enable = bool;
            this.instanceIds = list;
        }
    }
}
