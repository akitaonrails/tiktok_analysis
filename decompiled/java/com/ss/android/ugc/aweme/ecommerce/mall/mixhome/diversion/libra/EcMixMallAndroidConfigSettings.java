package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public final class EcMixMallAndroidConfigSettings {
    public static final EcMixMallAndroidConfigModel LIZ;
    public static final EcMixMallAndroidConfigModel LIZIZ;

    public static final class EcMixMallAndroidConfigModel {

        @C09CT("bubble_find_parent_max_depth")
        public final int bubbleFindParentMaxDepth;

        @C09CT("bubble_refresh_frame_interval")
        public final long bubbleRefreshFrameInterval;

        public EcMixMallAndroidConfigModel() {
            this(0L, 3);
        }

        public EcMixMallAndroidConfigModel(long j, int i) {
            this.bubbleRefreshFrameInterval = j;
            this.bubbleFindParentMaxDepth = i;
        }
    }

    static {
        EcMixMallAndroidConfigModel ecMixMallAndroidConfigModel = new EcMixMallAndroidConfigModel(0L, 3);
        LIZ = ecMixMallAndroidConfigModel;
        try {
            EcMixMallAndroidConfigModel ecMixMallAndroidConfigModel2 = (EcMixMallAndroidConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_mix_mall_android_config", EcMixMallAndroidConfigModel.class, ecMixMallAndroidConfigModel);
            if (ecMixMallAndroidConfigModel2 != null) {
                ecMixMallAndroidConfigModel = ecMixMallAndroidConfigModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecMixMallAndroidConfigModel = LIZ;
        }
        LIZIZ = ecMixMallAndroidConfigModel;
    }
}
