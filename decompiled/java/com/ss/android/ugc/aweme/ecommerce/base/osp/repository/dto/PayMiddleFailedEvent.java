package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C123100dR;
import X.C842903Rb;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsCashierEnableSeCodeSettings;

/* JADX INFO: loaded from: classes2.dex */
public final class PayMiddleFailedEvent {

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMessage;

    public PayMiddleFailedEvent() {
        this(null, null);
    }

    public final String LIZ() {
        if (!PipoTtsCashierEnableSeCodeSettings.LIZ() || !C123100dR.LIZ(this.errorCode)) {
            return this.errorMessage;
        }
        String str = C842903Rb.LIZ().get(this.errorCode);
        return str == null ? this.errorMessage : str;
    }

    public PayMiddleFailedEvent(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }
}
