package com.ss.android.ugc.aweme.search.lcp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLcpExperiment {
    public static final Config LIZ = new Config(0, "", "", 0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(199));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(200));

    public static boolean LIZ() {
        Integer num;
        return ((Boolean) LIZIZ.getValue()).booleanValue() && (num = ((Config) LIZJ.getValue()).useAlternative) != null && num.intValue() == 1;
    }

    public static boolean LIZIZ() {
        Integer num;
        return ((Boolean) LIZIZ.getValue()).booleanValue() && (num = ((Config) LIZJ.getValue()).useNxET) != null && num.intValue() == 1;
    }

    public static final class Config {

        @C09CT("black_list")
        public final String blackList;

        @C09CT("enable")
        public final Integer enable;

        @C09CT("enable_global_image")
        public final Integer enableGlobalImage;

        @C09CT("enable_global_video")
        public final Integer enableGlobalVideo;

        @C09CT("types")
        public final String types;

        @C09CT("use_alternative")
        public final Integer useAlternative;

        @C09CT("user_nxet")
        public final Integer useNxET;

        public Config() {
            this(0, "", "", 0, 0, 0, 0);
        }

        public Config(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.enable = num;
            this.types = str;
            this.blackList = str2;
            this.useAlternative = num2;
            this.useNxET = num3;
            this.enableGlobalVideo = num4;
            this.enableGlobalImage = num5;
        }
    }
}
