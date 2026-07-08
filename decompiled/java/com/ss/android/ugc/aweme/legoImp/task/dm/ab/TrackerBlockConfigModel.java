package com.ss.android.ugc.aweme.legoImp.task.dm.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class TrackerBlockConfigModel {

    @C09CT("__audit_meta__")
    public final Map<String, String> auditMeta;

    @C09CT("block_config")
    public final Map<String, Map<String, Object>> blockConfig;

    @C09CT("enable")
    public final boolean enable;

    public TrackerBlockConfigModel() {
        this(false, C2097608Jq.LJ(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackerBlockConfigModel(boolean z, Map<String, ? extends Map<String, ? extends Object>> map, Map<String, String> map2) {
        this.enable = z;
        this.blockConfig = map;
        this.auditMeta = map2;
    }
}
