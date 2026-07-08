package com.ss.android.ugc.aweme.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AvPeriodicCleanStorageSettings {
    public static final AvPeriodicCleanStorageConfig LIZ = new AvPeriodicCleanStorageConfig(0, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(542));

    public static AvPeriodicCleanStorageConfig LIZ() {
        return (AvPeriodicCleanStorageConfig) LIZIZ.getValue();
    }

    public static final class AvPeriodicCleanStorageConfig {

        @C09CT("is_open")
        public final int isOpen;

        @C09CT("storage_clean_interval_days")
        public final int storageCleanIntervalDays;

        public AvPeriodicCleanStorageConfig() {
            this(0, 3);
        }

        public AvPeriodicCleanStorageConfig(int i, int i2) {
            this.isOpen = i;
            this.storageCleanIntervalDays = i2;
        }
    }
}
