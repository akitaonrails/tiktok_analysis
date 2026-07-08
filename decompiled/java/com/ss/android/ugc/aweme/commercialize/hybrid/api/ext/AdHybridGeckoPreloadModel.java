package com.ss.android.ugc.aweme.commercialize.hybrid.api.ext;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridGeckoPreloadModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("scene_list")
    public final List<String> sceneList;

    @C09CT("throttle_interval")
    public final long throttleInterval;

    public AdHybridGeckoPreloadModel() {
        this(false, -1L, null);
    }

    public AdHybridGeckoPreloadModel(boolean z, long j, List<String> list) {
        this.enable = z;
        this.throttleInterval = j;
        this.sceneList = list;
    }
}
