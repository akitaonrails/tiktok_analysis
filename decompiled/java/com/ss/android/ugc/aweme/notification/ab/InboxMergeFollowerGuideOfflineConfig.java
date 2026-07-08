package com.ss.android.ugc.aweme.notification.ab;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class InboxMergeFollowerGuideOfflineConfig {
    public static final Config LIZ = new Config(3, 30);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1746));

    public static final class Config {

        @C09CT("close_count")
        public final int closeCount;

        @C09CT("offline_days")
        public final int offlineDays;

        public Config() {
            this(3, 30);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.closeCount == config.closeCount && this.offlineDays == config.offlineDays;
        }

        public final int hashCode() {
            return (this.closeCount * 31) + this.offlineDays;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(closeCount=");
            sbLIZ.append(this.closeCount);
            sbLIZ.append(", offlineDays=");
            sbLIZ.append(this.offlineDays);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, int i2) {
            this.closeCount = i;
            this.offlineDays = i2;
        }
    }
}
