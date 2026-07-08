package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallstatus.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcMallUgRefactorConfigSettings {
    public static final EcMallUgRefactorConfigModel LIZ;
    public static final EcMallUgRefactorConfigModel LIZIZ;

    static {
        EcMallUgRefactorConfigModel ecMallUgRefactorConfigModel = new EcMallUgRefactorConfigModel(false);
        LIZ = ecMallUgRefactorConfigModel;
        try {
            EcMallUgRefactorConfigModel ecMallUgRefactorConfigModel2 = (EcMallUgRefactorConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_mall_ug_refactor_config", EcMallUgRefactorConfigModel.class, ecMallUgRefactorConfigModel);
            if (ecMallUgRefactorConfigModel2 != null) {
                ecMallUgRefactorConfigModel = ecMallUgRefactorConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecMallUgRefactorConfigModel = LIZ;
        }
        LIZIZ = ecMallUgRefactorConfigModel;
    }

    public static final class EcMallUgRefactorConfigModel {

        @C09CT("disable_mark_route_for_handle_click")
        public final boolean disableMarkRouteForHandleClick;

        public EcMallUgRefactorConfigModel() {
            this(false);
        }

        public EcMallUgRefactorConfigModel(boolean z) {
            this.disableMarkRouteForHandleClick = z;
        }
    }
}
