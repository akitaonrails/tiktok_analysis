package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommentNetControlConfigExperiment {
    public static final CommentNetworkControlConfig LIZ = new CommentNetworkControlConfig(null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(998));

    public static final class CommentNetworkControlConfig {

        @C09CT("blackList")
        public final String blackList;

        @C09CT("dropList")
        public final String dropList;

        @C09CT("highPriorityApis")
        public final String highPriorityApis;

        @C09CT("lowPriorityApis")
        public final String lowPriorityApis;

        public CommentNetworkControlConfig() {
            this(null, null, null, null);
        }

        public CommentNetworkControlConfig(String str, String str2, String str3, String str4) {
            this.dropList = str;
            this.blackList = str2;
            this.lowPriorityApis = str3;
            this.highPriorityApis = str4;
        }
    }
}
