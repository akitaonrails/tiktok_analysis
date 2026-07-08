package com.ss.android.ugc.aweme.tux.theme.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class MotionCurveDeviceScoreSettings {
    public static final MotionCurveDeviceScoreSettings INSTANCE = new MotionCurveDeviceScoreSettings();
    public static final LowPerfDeviceThresholdModel DEFAULT_GROUP = new LowPerfDeviceThresholdModel(6.6f, 5.5f);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(500));

    public static final class LowPerfDeviceThresholdModel {

        @C09CT("low_perf_device_score_threshold")
        public final float lowPerfScore;

        @C09CT("very_low_perf_device_score_threshold")
        public final float veryLowPerfScore;

        public LowPerfDeviceThresholdModel() {
            this(6.6f, 5.5f);
        }

        public LowPerfDeviceThresholdModel(float f, float f2) {
            this.veryLowPerfScore = f;
            this.lowPerfScore = f2;
        }
    }

    public final LowPerfDeviceThresholdModel getValue() {
        return (LowPerfDeviceThresholdModel) value$delegate.getValue();
    }

    public final float getLowPerfScore() {
        return getValue().lowPerfScore;
    }

    public final float getVeryLowPerfScore() {
        return getValue().veryLowPerfScore;
    }

    public final LowPerfDeviceThresholdModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
