package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToCartUiConfig implements Serializable {

    @C09CT("bottom_toast_distance")
    public final Integer bottomToastDistance;

    @C09CT("need_dialog_show")
    public final boolean needDialog;

    @C09CT("need_toast")
    public final boolean needToast;

    @C09CT("successVibrate")
    public final Boolean successVibrate;

    @C09CT("toast_delay_ms")
    public final Long toastDelayMs;

    public AddToCartUiConfig(boolean z, boolean z2, Long l, Integer num, Boolean bool) {
        this.needToast = z;
        this.needDialog = z2;
        this.toastDelayMs = l;
        this.bottomToastDistance = num;
        this.successVibrate = bool;
    }
}
