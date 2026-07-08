package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNetControlConfigExperiment {
    public static final SearchNetworkControlConfig LIZ = new SearchNetworkControlConfig(null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(345));

    public static final class SearchNetworkControlConfig {

        @C09CT("apiThrottleLimitedDomainList")
        public final String apiThrottleLimitedDomainList;

        @C09CT("blackList")
        public final String blackList;

        @C09CT("dropList")
        public final String dropList;

        @C09CT("highPriorityApis")
        public final String highPriorityApis;

        @C09CT("lowPriorityApis")
        public final String lowPriorityApis;

        @C09CT("throttleConfigByPath")
        public final String throttleConfigByPath;

        public SearchNetworkControlConfig() {
            this(null, null, null, null, null, null);
        }

        public SearchNetworkControlConfig(String str, String str2, String str3, String str4, String str5, String str6) {
            this.dropList = str;
            this.blackList = str2;
            this.lowPriorityApis = str3;
            this.highPriorityApis = str4;
            this.throttleConfigByPath = str5;
            this.apiThrottleLimitedDomainList = str6;
        }
    }
}
