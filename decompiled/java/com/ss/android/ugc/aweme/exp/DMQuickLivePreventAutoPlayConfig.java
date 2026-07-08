package com.ss.android.ugc.aweme.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class DMQuickLivePreventAutoPlayConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("maximum_device_score_to_prevent_autoplay")
    public final float maximumDeviceScoreToPreventAutoPlay;

    @C09CT("prevent_low_end_autoplay")
    public final boolean preventLowEndAutoPlay;

    public DMQuickLivePreventAutoPlayConfig() {
        this(false, -1.0f, false);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public DMQuickLivePreventAutoPlayConfig(boolean z, float f, boolean z2) {
        this.isEnabled = z;
        this.maximumDeviceScoreToPreventAutoPlay = f;
        this.preventLowEndAutoPlay = z2;
    }
}
