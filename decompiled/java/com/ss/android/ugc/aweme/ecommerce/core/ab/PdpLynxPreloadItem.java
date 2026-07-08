package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpLynxPreloadItem {

    @C09CT("preload_duration")
    public final int duration;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    public PdpLynxPreloadItem() {
        this(false, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public PdpLynxPreloadItem(boolean z, int i) {
        this.enablePreload = z;
        this.duration = i;
    }
}
