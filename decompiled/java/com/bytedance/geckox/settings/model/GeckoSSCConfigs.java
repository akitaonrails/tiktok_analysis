package com.bytedance.geckox.settings.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoSSCConfigs {
    public final List<String> customChannelsEventsAllowList;
    public final boolean enableDispatchEventToSSC;

    public GeckoSSCConfigs() {
        this(false, new ArrayList());
    }

    public GeckoSSCConfigs(boolean z, List<String> list) {
        this.enableDispatchEventToSSC = z;
        this.customChannelsEventsAllowList = list;
    }
}
