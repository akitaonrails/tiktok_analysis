package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInitTaskPreConnectForImageExp {
    public static final Config LIZ = new Config(0, null, 0L);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(344));

    public static int LIZ() {
        Integer num = ((Config) LIZIZ.getValue()).enable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final class Config {

        @C09CT("delay")
        public final Long delay;

        @C09CT("domainList")
        public final String domainList;

        @C09CT("enable")
        public final Integer enable;

        public Config() {
            this(0, null, 0L);
        }

        public Config(Integer num, String str, Long l) {
            this.enable = num;
            this.domainList = str;
            this.delay = l;
        }
    }
}
