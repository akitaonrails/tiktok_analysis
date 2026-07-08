package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class CreationAutoVolumeAdjustmentOpt {
    public static final AutoVolumeAdjustmentConfig LIZ = new AutoVolumeAdjustmentConfig(false, C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)), C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(337));

    public static final class AutoVolumeAdjustmentConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("volume_with_earphone")
        public final List<Float> volumeWithEarphone;

        @C09CT("volume_without_earphone")
        public final List<Float> volumeWithoutEarphone;

        public AutoVolumeAdjustmentConfig() {
            this(false, C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)), C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)));
        }

        public AutoVolumeAdjustmentConfig(boolean z, List<Float> list, List<Float> list2) {
            this.enable = z;
            this.volumeWithoutEarphone = list;
            this.volumeWithEarphone = list2;
        }
    }
}
