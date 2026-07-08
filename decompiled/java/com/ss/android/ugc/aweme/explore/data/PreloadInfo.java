package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PreloadInfo implements Serializable {

    @C09CT("preload_status")
    public Boolean preloadStatus;

    @C09CT("preload_ttl")
    public Long preloadTtl;

    public PreloadInfo() {
        this(null, null);
    }

    public final void setPreloadStatus(Boolean bool) {
        this.preloadStatus = bool;
    }

    public final void setPreloadTtl(Long l) {
        this.preloadTtl = l;
    }

    public PreloadInfo(Boolean bool, Long l) {
        this.preloadStatus = bool;
        this.preloadTtl = l;
    }
}
