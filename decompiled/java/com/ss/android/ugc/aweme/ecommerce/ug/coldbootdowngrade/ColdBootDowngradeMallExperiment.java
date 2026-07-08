package com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes5.dex */
public final class ColdBootDowngradeMallExperiment {
    public static final ColdBootDowngradeMallModel LIZ = new ColdBootDowngradeMallModel(true, true, false, Mp4ScreenVideoLoadTimeout.CONTROL);

    public static final class ColdBootDowngradeMallModel {

        @C09CT("downgrade_delay_time")
        public final long downgradeDelayTime;

        @C09CT("enable_mall_main_activity_assem_downgrade")
        public final boolean enableMallMainActivityAssemDowngrade;

        @C09CT("enable_search_mall_bubble_component_downgrade")
        public final boolean enableSearchMallBubbleComponentDowngrade;

        @C09CT("enable_ug_main_assem_downgrade")
        public final boolean enableUgMainAssemDowngrade;

        public ColdBootDowngradeMallModel() {
            this(true, true, false, Mp4ScreenVideoLoadTimeout.CONTROL);
        }

        public ColdBootDowngradeMallModel(boolean z, boolean z2, boolean z3, long j) {
            this.enableUgMainAssemDowngrade = z;
            this.enableMallMainActivityAssemDowngrade = z2;
            this.enableSearchMallBubbleComponentDowngrade = z3;
            this.downgradeDelayTime = j;
        }
    }

    public static final ColdBootDowngradeMallModel LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ColdBootDowngradeMallModel coldBootDowngradeMallModel = LIZ;
            ColdBootDowngradeMallModel coldBootDowngradeMallModel2 = (ColdBootDowngradeMallModel) c0c64LJIILLIIL.LJJIIJ(true, "cold_boot_downgrade_mall_exp", 31744, ColdBootDowngradeMallModel.class, coldBootDowngradeMallModel, 2);
            return coldBootDowngradeMallModel2 != null ? coldBootDowngradeMallModel2 : coldBootDowngradeMallModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
