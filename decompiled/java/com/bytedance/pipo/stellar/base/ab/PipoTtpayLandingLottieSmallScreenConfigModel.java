package com.bytedance.pipo.stellar.base.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtpayLandingLottieSmallScreenConfigModel {

    @C09CT("force_scale")
    public final Boolean forceScale;

    @C09CT("force_width")
    public final Integer forceWidth;

    @C09CT("sw_threshold")
    public final Integer swThreshold;

    public PipoTtpayLandingLottieSmallScreenConfigModel() {
        this(null, null, null);
    }

    public PipoTtpayLandingLottieSmallScreenConfigModel(Boolean bool, Integer num, Integer num2) {
        this.forceScale = bool;
        this.forceWidth = num;
        this.swThreshold = num2;
    }
}
