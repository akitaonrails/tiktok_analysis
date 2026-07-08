package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class DmNowQueryConfigSettings {
    public static final DmNowQueryConfigModel LIZ = new DmNowQueryConfigModel(500, 50);

    public static final class DmNowQueryConfigModel {

        @C09CT("now_query_check_interval")
        public final long nowQueryCheckInterval;

        @C09CT("now_query_once_max_size")
        public final int nowQueryOnceMaxSize;

        public DmNowQueryConfigModel() {
            this(500L, 50);
        }

        public DmNowQueryConfigModel(long j, int i) {
            this.nowQueryCheckInterval = j;
            this.nowQueryOnceMaxSize = i;
        }
    }
}
