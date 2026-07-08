package com.ss.android.ugc.aweme.ad.feed.ibe.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class IBELoadRetryConfigSettings {
    public static final IbeLoadRetryConfigModel LIZ = new IbeLoadRetryConfigModel(3000, 3);

    public static final class IbeLoadRetryConfigModel {

        @C09CT("load_timeout_ms")
        public final long loadTimeoutMS;

        @C09CT("retry_count")
        public final long retryCount;

        public IbeLoadRetryConfigModel(long j, long j2) {
            this.loadTimeoutMS = j;
            this.retryCount = j2;
        }
    }
}
