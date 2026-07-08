package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoCashierBnplEventTrackConfig {

    @C09CT("enable_btm_token")
    public final boolean enableBtmToken;

    @C09CT("enable_rendering_num")
    public final boolean enableRenderingNum;

    @C09CT("enable_tenure")
    public final boolean enableTenure;

    @C09CT("enable_track_id")
    public final boolean enableTrackId;

    public PipoCashierBnplEventTrackConfig() {
        this(true, true, true, true);
    }

    public PipoCashierBnplEventTrackConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableBtmToken = z;
        this.enableTrackId = z2;
        this.enableRenderingNum = z3;
        this.enableTenure = z4;
    }
}
