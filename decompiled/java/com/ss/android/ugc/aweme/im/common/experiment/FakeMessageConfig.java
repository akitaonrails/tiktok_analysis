package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeMessageConfig {
    public static final Config LIZ = new Config(LSPassThroughRecordSizeConfig.DEFAULT, 600000, 60000, 3000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(367));

    public static final class Config {

        @C09CT("max_search_index")
        public final int maxSearchIndex;

        @C09CT("report_insert_perf_interval")
        public final long reportInsertPerfInterval;

        @C09CT("request_content_interval")
        public final long requestContentInterval;

        @C09CT("request_content_retry_interval")
        public final long requestContentRetryInterval;

        public Config() {
            this(LSPassThroughRecordSizeConfig.DEFAULT, 600000L, 60000L, 3000L);
        }

        public Config(int i, long j, long j2, long j3) {
            this.maxSearchIndex = i;
            this.reportInsertPerfInterval = j;
            this.requestContentInterval = j2;
            this.requestContentRetryInterval = j3;
        }
    }
}
