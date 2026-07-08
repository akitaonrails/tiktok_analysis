package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Config {
    public static final int $stable = 8;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fragment_filters")
    public final List<FragmentFilter> fragmentFilters;

    @C09CT("max_dump_count")
    public final int maxDumpCount;

    public Config() {
        this(false, 0, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", maxDumpCount=");
        sbLIZ.append(this.maxDumpCount);
        sbLIZ.append(", fragmentFilters=");
        sbLIZ.append(this.fragmentFilters);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Config(boolean z, int i, List<FragmentFilter> list) {
        this.enable = z;
        this.maxDumpCount = i;
        this.fragmentFilters = list;
    }
}
