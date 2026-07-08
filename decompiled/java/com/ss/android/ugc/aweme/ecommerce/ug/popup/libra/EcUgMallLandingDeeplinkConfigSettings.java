package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcUgMallLandingDeeplinkConfigSettings {
    public static final EcUgMallLandingDeeplinkConfigModel LIZ;
    public static final EcUgMallLandingDeeplinkConfigModel LIZIZ;

    static {
        EcUgMallLandingDeeplinkConfigModel ecUgMallLandingDeeplinkConfigModel = new EcUgMallLandingDeeplinkConfigModel(false);
        LIZ = ecUgMallLandingDeeplinkConfigModel;
        try {
            EcUgMallLandingDeeplinkConfigModel ecUgMallLandingDeeplinkConfigModel2 = (EcUgMallLandingDeeplinkConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_ug_mall_landing_deeplink_config", EcUgMallLandingDeeplinkConfigModel.class, ecUgMallLandingDeeplinkConfigModel);
            if (ecUgMallLandingDeeplinkConfigModel2 != null) {
                ecUgMallLandingDeeplinkConfigModel = ecUgMallLandingDeeplinkConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecUgMallLandingDeeplinkConfigModel = LIZ;
        }
        LIZIZ = ecUgMallLandingDeeplinkConfigModel;
    }

    public static final class EcUgMallLandingDeeplinkConfigModel {

        @C09CT("reset_host_to_aweme")
        public final boolean resetHostToAweme;

        public EcUgMallLandingDeeplinkConfigModel() {
            this(false);
        }

        public EcUgMallLandingDeeplinkConfigModel(boolean z) {
            this.resetHostToAweme = z;
        }
    }
}
