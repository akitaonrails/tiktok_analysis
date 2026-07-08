package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallTrackEvent {
    public ECMixMallTrackEventRuntimeParams LIZ;

    @C09CT("config")
    public ECMixMallTrackEventConfig config;

    @C09CT("event_params")
    public ECMixMallTrackEventParams data;

    @C09CT("event_name")
    public String eventName;

    public ECMixMallTrackEvent() {
        this(new ECMixMallTrackEventConfig(0, 0, null), "", null, new ECMixMallTrackEventRuntimeParams(0));
    }

    public ECMixMallTrackEvent(ECMixMallTrackEventConfig eCMixMallTrackEventConfig, String str, ECMixMallTrackEventParams eCMixMallTrackEventParams, ECMixMallTrackEventRuntimeParams eCMixMallTrackEventRuntimeParams) {
        this.config = eCMixMallTrackEventConfig;
        this.eventName = str;
        this.data = eCMixMallTrackEventParams;
        this.LIZ = eCMixMallTrackEventRuntimeParams;
    }
}
