package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class OspStartDoFrameJatoConfig {

    @C09CT("duration")
    public final Long duration;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("from_data_recv")
    public final Boolean fromDataRecv;

    public OspStartDoFrameJatoConfig() {
        this(null, null, null);
    }

    public OspStartDoFrameJatoConfig(Boolean bool, Long l, Boolean bool2) {
        this.enable = bool;
        this.duration = l;
        this.fromDataRecv = bool2;
    }
}
