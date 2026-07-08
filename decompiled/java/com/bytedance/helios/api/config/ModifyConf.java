package com.bytedance.helios.api.config;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConf {

    @C09CT("domain")
    public final Map<String, String> domain;

    @C09CT("path")
    public final Map<String, String> path;

    @C09CT("scheme")
    public final Map<String, String> scheme;

    public ModifyConf() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public ModifyConf(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.scheme = map;
        this.domain = map2;
        this.path = map3;
    }
}
