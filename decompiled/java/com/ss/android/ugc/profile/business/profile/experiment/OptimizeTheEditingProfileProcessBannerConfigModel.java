package com.ss.android.ugc.profile.business.profile.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class OptimizeTheEditingProfileProcessBannerConfigModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("delay")
    public final Integer delay;

    @C09CT("frequency")
    public final FrequencyData frequency;

    public OptimizeTheEditingProfileProcessBannerConfigModel() {
        this(null, null);
    }

    public OptimizeTheEditingProfileProcessBannerConfigModel(FrequencyData frequencyData, Integer num) {
        this.frequency = frequencyData;
        this.delay = num;
    }
}
