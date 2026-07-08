package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerBaseFcpConfig implements Serializable {

    @C09CT("is_cache")
    public boolean isCache;

    @C09CT("server_base_component_config")
    public ServerBaseComponentConfig serverBaseComponentConfig;

    public ServerBaseFcpConfig() {
        this(null);
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public ServerBaseFcpConfig(ServerBaseComponentConfig serverBaseComponentConfig) {
        this.serverBaseComponentConfig = serverBaseComponentConfig;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }
}
