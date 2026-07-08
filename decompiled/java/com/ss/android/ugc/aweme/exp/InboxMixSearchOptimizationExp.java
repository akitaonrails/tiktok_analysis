package com.ss.android.ugc.aweme.exp;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class InboxMixSearchOptimizationExp {
    public static final Config LIZ = new Config(false, false, null, 0, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(996));

    public static final class Config {

        @C09CT("enable_new_ranking")
        public final boolean enableNewRanking;

        @C09CT("enable_remote_search")
        public final boolean enableRemoteSearch;

        @C09CT("remote_search_debounce_ms")
        public final int remoteSearchDebounceMs;

        @C09CT("tiered_ranking_buckets")
        public final List<List<Map<String, List<String>>>> tieredRankingBuckets;

        public Config() {
            this(false, false, null, 0, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enableNewRanking == config.enableNewRanking && this.enableRemoteSearch == config.enableRemoteSearch && Intrinsics.LJFF(this.tieredRankingBuckets, config.tieredRankingBuckets) && this.remoteSearchDebounceMs == config.remoteSearchDebounceMs;
        }

        public final int hashCode() {
            return (((((C786410Ut5.Z2(this.enableNewRanking) * 31) + C786410Ut5.Z2(this.enableRemoteSearch)) * 31) + this.tieredRankingBuckets.hashCode()) * 31) + this.remoteSearchDebounceMs;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enableNewRanking=");
            sbLIZ.append(this.enableNewRanking);
            sbLIZ.append(", enableRemoteSearch=");
            sbLIZ.append(this.enableRemoteSearch);
            sbLIZ.append(", tieredRankingBuckets=");
            sbLIZ.append(this.tieredRankingBuckets);
            sbLIZ.append(", remoteSearchDebounceMs=");
            sbLIZ.append(this.remoteSearchDebounceMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config(boolean z, boolean z2, List<? extends List<? extends Map<String, ? extends List<String>>>> list, int i) {
            this.enableNewRanking = z;
            this.enableRemoteSearch = z2;
            this.tieredRankingBuckets = list;
            this.remoteSearchDebounceMs = i;
        }

        public Config(boolean z, boolean z2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? 500 : i);
        }
    }
}
