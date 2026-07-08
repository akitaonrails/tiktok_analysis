package com.ss.android.ugc.aweme.mention.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class HorizontalMentionMixSearchConfig {
    public static final int $stable = 8;

    @C09CT("ranking_buckets")
    public final List<Map<String, List<String>>> rankingBuckets;

    @C09CT("remote_search_debounce_ms")
    public final int remoteSearchDebounceMs;

    @C09CT("scenes")
    public final List<String> scenes;

    public HorizontalMentionMixSearchConfig() {
        this(null, null, 0, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalMentionMixSearchConfig)) {
            return false;
        }
        HorizontalMentionMixSearchConfig horizontalMentionMixSearchConfig = (HorizontalMentionMixSearchConfig) obj;
        return Intrinsics.LJFF(this.scenes, horizontalMentionMixSearchConfig.scenes) && Intrinsics.LJFF(this.rankingBuckets, horizontalMentionMixSearchConfig.rankingBuckets) && this.remoteSearchDebounceMs == horizontalMentionMixSearchConfig.remoteSearchDebounceMs;
    }

    public int hashCode() {
        return (((this.scenes.hashCode() * 31) + this.rankingBuckets.hashCode()) * 31) + this.remoteSearchDebounceMs;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalMentionMixSearchConfig(scenes=");
        sbLIZ.append(this.scenes);
        sbLIZ.append(", rankingBuckets=");
        sbLIZ.append(this.rankingBuckets);
        sbLIZ.append(", remoteSearchDebounceMs=");
        sbLIZ.append(this.remoteSearchDebounceMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalMentionMixSearchConfig(List<String> list, List<? extends Map<String, ? extends List<String>>> list2, int i) {
        this.scenes = list;
        this.rankingBuckets = list2;
        this.remoteSearchDebounceMs = i;
    }

    public HorizontalMentionMixSearchConfig(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? 500 : i);
    }
}
