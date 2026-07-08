package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GSMAStatusData implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("gsma_available")
    public final Boolean gsmaAvailable;

    @C09CT("opt_out_required")
    public final Boolean optOutRequired;

    @C09CT("pop_up_config")
    public final PopupConfig popupConfig;

    public GSMAStatusData(Boolean bool, Boolean bool2, PopupConfig popupConfig, Integer num) {
        this.gsmaAvailable = bool;
        this.optOutRequired = bool2;
        this.popupConfig = popupConfig;
        this.errorCode = num;
    }
}
