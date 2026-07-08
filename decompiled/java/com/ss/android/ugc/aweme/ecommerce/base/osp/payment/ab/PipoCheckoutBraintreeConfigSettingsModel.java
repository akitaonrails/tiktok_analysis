package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoCheckoutBraintreeConfigSettingsModel {

    @C09CT("js_sdk_extract_correlation")
    public final Boolean jsSdkExtractCorrelation;

    @C09CT("onetime")
    public final Boolean onetime;

    @C09CT("risk_info")
    public final Boolean riskInfo;

    public PipoCheckoutBraintreeConfigSettingsModel() {
        this(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE);
    }

    public PipoCheckoutBraintreeConfigSettingsModel(Boolean bool, Boolean bool2, Boolean bool3) {
        this.onetime = bool;
        this.riskInfo = bool2;
        this.jsSdkExtractCorrelation = bool3;
    }
}
