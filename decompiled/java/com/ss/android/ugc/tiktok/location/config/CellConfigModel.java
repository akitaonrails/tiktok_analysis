package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class CellConfigModel {

    @C09CT("batch_size")
    public final int batchSize;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("region_requirements")
    public final Map<String, List<String>> regionRequirements;

    @C09CT("required_permission")
    public final int requiredPermission;

    public CellConfigModel() {
        this(10, false, C2097608Jq.LJ(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CellConfigModel(int i, boolean z, Map<String, ? extends List<String>> map, int i2) {
        this.batchSize = i;
        this.enabled = z;
        this.regionRequirements = map;
        this.requiredPermission = i2;
    }
}
