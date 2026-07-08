package com.ss.ugc.effectplatform;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectSingleDownloadOpt {
    public static final Config LIZ = new Config(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(201));

    public static final class Config {

        @C09CT("backup_url_retry_count")
        public final int backupUrlRetryCount;

        @C09CT("retry_count_in_single_download")
        public final boolean retryCountInSingleDownload;

        public Config() {
            this(false, 0);
        }

        public Config(boolean z, int i) {
            this.retryCountInSingleDownload = z;
            this.backupUrlRetryCount = i;
        }
    }
}
