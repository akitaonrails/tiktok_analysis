package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentSecurityConfig {

    @C09CT("ccdc_hide_security_tip")
    public final Boolean ccdcHideSecurityTip;

    @C09CT("ccdc_save_card_popup")
    public final Integer ccdcSaveCardPopCount;

    @C09CT("enable_webview_subtitle")
    public final Boolean enableWebviewSubtitle;

    @C09CT("ccdc_save_card_use_checkbox")
    public final Boolean useCheckBox;

    @C09CT("use_lottie_in_second_pay")
    public final Boolean useLottieInSecondPay;

    @C09CT("ccdc_save_card_use_tooltip")
    public final Boolean useTooltip;

    public EcPaymentSecurityConfig() {
        this(0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public EcPaymentSecurityConfig(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.ccdcSaveCardPopCount = num;
        this.useCheckBox = bool;
        this.useTooltip = bool2;
        this.enableWebviewSubtitle = bool3;
        this.useLottieInSecondPay = bool4;
        this.ccdcHideSecurityTip = bool5;
    }
}
