package com.ss.android.ugc.aweme.account.login.v2.ui.experiment;

import X.C0C64;
import X.C294020Bfk;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes20.dex */
public final class SMSPermissionCheckboxExp {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final SMSPermissionCheckboxExp INSTANCE = new SMSPermissionCheckboxExp();
    public static final int V1 = 1;

    private final boolean checkConfig() {
        IAccountLoginMethodsService iAccountLoginMethodsService;
        return !C294020Bfk.LIZ() || ((iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null)) != null && iAccountLoginMethodsService.LIZ());
    }

    public final boolean showCheckbox() {
        return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "need_sms_consent_during_sign_in", false) > DEFAULT && checkConfig();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getV1() {
        return V1;
    }
}
