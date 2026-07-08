package com.ss.android.ugc.aweme.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class CutCameStorageOpt {
    public static final CutCameStorageConfig LIZ = new CutCameStorageConfig(false, 30, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(92));

    public static final class CutCameStorageConfig {

        @C09CT("common_expire_days")
        public final long commonExpireDays;

        @C09CT("extreme_low_storage_expire_days")
        public final int extremeLowStorageExpireDays;

        @C09CT("is_open")
        public final boolean isOpen;

        public CutCameStorageConfig() {
            this(false, 30L, 0);
        }

        public CutCameStorageConfig(boolean z, long j, int i) {
            this.isOpen = z;
            this.commonExpireDays = j;
            this.extremeLowStorageExpireDays = i;
        }
    }
}
