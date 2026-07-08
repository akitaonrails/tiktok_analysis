package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C0YIV;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKCompositeRequestConfiguration {

    @C09CT("enabled_cmds")
    public final List<Integer> enableCommands;

    @C09CT("ws_connect_interval_millis")
    public final long wsConnectIntervalMs;

    @C09CT("ws_max_request")
    public final int wsMaxRequest;

    public IMSDKCompositeRequestConfiguration() {
        this(null, 0, 0L, 7, null);
    }

    public final C0YIV toSDKModel() {
        return new C0YIV(this.enableCommands, this.wsMaxRequest, this.wsConnectIntervalMs);
    }

    public IMSDKCompositeRequestConfiguration(List<Integer> list, int i, long j) {
        this.enableCommands = list;
        this.wsMaxRequest = i;
        this.wsConnectIntervalMs = j;
    }

    public IMSDKCompositeRequestConfiguration(List list, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? 1500L : j);
    }
}
