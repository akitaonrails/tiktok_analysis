package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class MixSearchExpConfig {

    @C09CT("enabled")
    public final boolean isEnabled;

    @C09CT("ranking_buckets")
    public final List<Map<String, List<String>>> rankingBuckets;

    @C09CT("remote_search_debounce_ms")
    public final int remoteSearchDebounceMs;

    public MixSearchExpConfig() {
        this(false, null, 0, 7, null);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MixSearchExpConfig(boolean z, List<? extends Map<String, ? extends List<String>>> list, int i) {
        this.isEnabled = z;
        this.rankingBuckets = list;
        this.remoteSearchDebounceMs = i;
    }

    public MixSearchExpConfig(boolean z, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? 500 : i);
    }
}
