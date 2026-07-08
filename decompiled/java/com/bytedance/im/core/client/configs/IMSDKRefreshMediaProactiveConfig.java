package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKRefreshMediaProactiveConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("msg_types_with_delay")
    public final Map<Integer, Long> msgTypesWithDelay;

    @C09CT("require_ws_disconnect")
    public final boolean requireWsDisconnect;

    public IMSDKRefreshMediaProactiveConfig() {
        this(false, C2097608Jq.LJ(), false);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Map<Integer, Long> getMsgTypesWithDelay() {
        return this.msgTypesWithDelay;
    }

    public final boolean getRequireWsDisconnect() {
        return this.requireWsDisconnect;
    }

    public IMSDKRefreshMediaProactiveConfig(boolean z, Map<Integer, Long> map, boolean z2) {
        this.enabled = z;
        this.msgTypesWithDelay = map;
        this.requireWsDisconnect = z2;
    }
}
