package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Event {

    @C09CT("config")
    public final EventConfig config;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_params")
    public final EventParam eventParams;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Event)) {
            return false;
        }
        GodaV2Event godaV2Event = (GodaV2Event) obj;
        return Intrinsics.LJFF(this.config, godaV2Event.config) && Intrinsics.LJFF(this.eventName, godaV2Event.eventName) && Intrinsics.LJFF(this.eventParams, godaV2Event.eventParams);
    }

    public GodaV2Event(EventConfig eventConfig, String str, EventParam eventParam) {
        this.config = eventConfig;
        this.eventName = str;
        this.eventParams = eventParam;
    }
}
