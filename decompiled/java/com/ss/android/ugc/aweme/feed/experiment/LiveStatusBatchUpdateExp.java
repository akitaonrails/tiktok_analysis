package com.ss.android.ugc.aweme.feed.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.C486760J7a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveStatusBatchUpdateExp {
    public static final LiveStatusBatchUpdateConfig LIZ = new LiveStatusBatchUpdateConfig(60000, 0, 1, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C486760J7a());

    public static final class LiveStatusBatchUpdateConfig {

        @C09CT("batch_delete_live_card")
        public final boolean batchDeleteLiveCard;

        @C09CT("batch_update_user_num")
        public final int batchUpdateUserNum;

        @C09CT("batch_update_user_status")
        public final boolean batchUpdateUserStatus;

        @C09CT("cache_expired_interval_ms")
        public final long cacheExpiredIntervalMs;

        @C09CT("enable_page_range")
        public final int enablePageRange;

        public LiveStatusBatchUpdateConfig() {
            this(60000L, 10, 1, false, false);
        }

        public LiveStatusBatchUpdateConfig(long j, int i, int i2, boolean z, boolean z2) {
            this.cacheExpiredIntervalMs = j;
            this.batchUpdateUserNum = i;
            this.enablePageRange = i2;
            this.batchUpdateUserStatus = z;
            this.batchDeleteLiveCard = z2;
        }
    }

    public static LiveStatusBatchUpdateConfig LIZ() {
        return (LiveStatusBatchUpdateConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ(String str) {
        if ((!LIZ().batchUpdateUserStatus && !LIZ().batchDeleteLiveCard) || LIZ().batchUpdateUserNum <= 0) {
            return false;
        }
        if (TextUtils.equals(str, "homepage_hot")) {
            if ((LIZ().enablePageRange & 1) == 1) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(str, "homepage_follow") && (LIZ().enablePageRange & 2) == 2) {
            return true;
        }
        return false;
    }
}
