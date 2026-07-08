package com.ss.android.ugc.aweme.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsDiskCacheStorageSetting {
    public static final ToolsDiskCacheStorageConfig LIZ = new ToolsDiskCacheStorageConfig(700, 0.8f, 300, 100, 30, 7, 7, 2000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(94));

    public static final class ToolsDiskCacheStorageConfig {

        @C09CT("redundant_op_count")
        public final int redundantOpCount;

        @C09CT("storage_allow_list_size_mb")
        public final long storageAllowListSizeMb;

        @C09CT("storage_clean_factor")
        public final float storageCleanFactor;

        @C09CT("storage_max_days_to_cache")
        public final long storageMaxDaysToCache;

        @C09CT("storage_max_days_to_cache_for_e_low_storage")
        public final long storageMaxDaysToCacheForELowStorage;

        @C09CT("storage_max_days_to_cache_for_low_storage")
        public final long storageMaxDaysToCacheForLowStorage;

        @C09CT("storage_max_size_mb")
        public final long storageMaxSizeMb;

        @C09CT("storage_trim_size_mb")
        public final long storageTrimSizeMb;

        public ToolsDiskCacheStorageConfig() {
            this(700L, 0.8f, 300L, 100L, 30L, 7L, 7L, 2000);
        }

        public ToolsDiskCacheStorageConfig(long j, float f, long j2, long j3, long j4, long j5, long j6, int i) {
            this.storageMaxSizeMb = j;
            this.storageCleanFactor = f;
            this.storageTrimSizeMb = j2;
            this.storageAllowListSizeMb = j3;
            this.storageMaxDaysToCache = j4;
            this.storageMaxDaysToCacheForLowStorage = j5;
            this.storageMaxDaysToCacheForELowStorage = j6;
            this.redundantOpCount = i;
        }
    }

    public static ToolsDiskCacheStorageConfig LIZ() {
        return (ToolsDiskCacheStorageConfig) LIZIZ.getValue();
    }
}
