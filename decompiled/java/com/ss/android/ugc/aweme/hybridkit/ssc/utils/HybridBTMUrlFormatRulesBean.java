package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridBTMUrlFormatRulesBean {

    @C09CT("channels")
    public final Channels channels;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("hosts")
    public final Hosts hosts;

    @C09CT("paths")
    public final Map<String, Path> paths;

    public HybridBTMUrlFormatRulesBean() {
        this(false, new Channels(null, null, null, 7, null), new Hosts(null, null, 3, null), C2097608Jq.LJ());
    }

    public HybridBTMUrlFormatRulesBean(boolean z, Channels channels, Hosts hosts, Map<String, Path> map) {
        this.enable = z;
        this.channels = channels;
        this.hosts = hosts;
        this.paths = map;
    }
}
