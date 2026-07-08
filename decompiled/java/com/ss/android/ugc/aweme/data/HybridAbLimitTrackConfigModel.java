package com.ss.android.ugc.aweme.data;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class HybridAbLimitTrackConfigModel {

    @C09CT("limit_precise_exposure_key")
    public List<String> limitPreciseExposureKey;

    @C09CT("limit_track_enable")
    public boolean limitTrackEnable;

    @C09CT("limit_track_event")
    public List<String> limitTrackEvent;

    public HybridAbLimitTrackConfigModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.limitTrackEvent = c13bv;
        this.limitPreciseExposureKey = c13bv;
    }
}
