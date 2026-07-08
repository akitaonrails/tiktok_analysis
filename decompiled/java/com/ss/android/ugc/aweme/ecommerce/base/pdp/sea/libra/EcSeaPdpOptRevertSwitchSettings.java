package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpOptRevertSwitchSettings {
    public static final EcSeaPdpOptRevertSwitchModel LIZ;
    public static final EcSeaPdpOptRevertSwitchModel LIZIZ;

    static {
        EcSeaPdpOptRevertSwitchModel ecSeaPdpOptRevertSwitchModel = new EcSeaPdpOptRevertSwitchModel(false, false);
        LIZ = ecSeaPdpOptRevertSwitchModel;
        try {
            EcSeaPdpOptRevertSwitchModel ecSeaPdpOptRevertSwitchModel2 = (EcSeaPdpOptRevertSwitchModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_sea_pdp_opt_revert_switch", EcSeaPdpOptRevertSwitchModel.class, ecSeaPdpOptRevertSwitchModel);
            if (ecSeaPdpOptRevertSwitchModel2 != null) {
                ecSeaPdpOptRevertSwitchModel = ecSeaPdpOptRevertSwitchModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecSeaPdpOptRevertSwitchModel = LIZ;
        }
        LIZIZ = ecSeaPdpOptRevertSwitchModel;
    }

    public static final class EcSeaPdpOptRevertSwitchModel {

        @C09CT("disable_cart_bubble_anchor_switch")
        public final boolean disableCartBubbleAnchorSwitch;

        @C09CT("disable_text_ellipsized_monitor")
        public final boolean disableTextEllipsizedMonitor;

        public EcSeaPdpOptRevertSwitchModel() {
            this(false, false);
        }

        public EcSeaPdpOptRevertSwitchModel(boolean z, boolean z2) {
            this.disableTextEllipsizedMonitor = z;
            this.disableCartBubbleAnchorSwitch = z2;
        }
    }
}
