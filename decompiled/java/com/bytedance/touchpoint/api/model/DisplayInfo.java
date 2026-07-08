package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DisplayInfo {

    @C09CT("ads_config")
    public AdsInfo adsInfo;

    @C09CT("start_event_config")
    public StartEventConfig startEventConfig;

    @C09CT("timer_config")
    public TimeInfo timeInfo;

    public DisplayInfo() {
        this(null, null, null);
    }

    public DisplayInfo(TimeInfo timeInfo, AdsInfo adsInfo, StartEventConfig startEventConfig) {
        this.timeInfo = timeInfo;
        this.adsInfo = adsInfo;
        this.startEventConfig = startEventConfig;
    }
}
