package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsCashierEnableSeCodeSettings {
    public static final ErrorCodeClientSE LIZ = new ErrorCodeClientSE(Boolean.FALSE, Boolean.FALSE);

    public static final class ErrorCodeClientSE {

        @C09CT("enable_sns")
        public final Boolean enableSns;

        @C09CT("enable")
        public final Boolean enabled;

        public ErrorCodeClientSE() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public ErrorCodeClientSE(Boolean bool, Boolean bool2) {
            this.enabled = bool;
            this.enableSns = bool2;
        }
    }

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ErrorCodeClientSE errorCodeClientSE = LIZ;
        ErrorCodeClientSE errorCodeClientSE2 = (ErrorCodeClientSE) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_cashier_enable_se_code_config", ErrorCodeClientSE.class, errorCodeClientSE);
        if (errorCodeClientSE2 != null) {
            errorCodeClientSE = errorCodeClientSE2;
        }
        return Intrinsics.LJFF(errorCodeClientSE.enabled, Boolean.TRUE);
    }
}
