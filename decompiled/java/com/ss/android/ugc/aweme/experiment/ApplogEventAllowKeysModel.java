package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class ApplogEventAllowKeysModel {

    @C09CT("allow_events")
    public final Map<String, Map<String, Object>> allowEvents;

    @C09CT("__audit_meta__")
    public final Map<String, String> auditMeta;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("is_dry_run")
    public final boolean isDryRun;

    @C09CT("is_only_event")
    public final boolean isOnlyEvent;

    @C09CT("sample_rate")
    public final int sampleRate;

    public ApplogEventAllowKeysModel() {
        this(true, true, true, 100, C2097608Jq.LJ(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApplogEventAllowKeysModel(boolean z, boolean z2, boolean z3, int i, Map<String, ? extends Map<String, ? extends Object>> map, Map<String, String> map2) {
        this.enable = z;
        this.isOnlyEvent = z2;
        this.isDryRun = z3;
        this.sampleRate = i;
        this.allowEvents = map;
        this.auditMeta = map2;
    }
}
