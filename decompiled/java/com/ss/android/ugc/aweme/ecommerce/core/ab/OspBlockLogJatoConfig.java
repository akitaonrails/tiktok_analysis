package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class OspBlockLogJatoConfig {

    @C09CT("duration")
    public final Long duration;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("from_click")
    public final Boolean fromClick;

    public OspBlockLogJatoConfig() {
        this(null, null, null);
    }

    public OspBlockLogJatoConfig(Boolean bool, Long l, Boolean bool2) {
        this.enable = bool;
        this.duration = l;
        this.fromClick = bool2;
    }
}
