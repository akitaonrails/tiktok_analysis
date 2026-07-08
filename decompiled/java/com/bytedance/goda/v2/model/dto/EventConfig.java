package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EventConfig {

    @C09CT("ignore_cache")
    public final Integer ignoreCache;

    @C09CT("once")
    public final Integer once;

    @C09CT("once_key")
    public final String onceKey;

    @C09CT("track_template_id")
    public final List<String> trackTemplate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventConfig)) {
            return false;
        }
        EventConfig eventConfig = (EventConfig) obj;
        return Intrinsics.LJFF(this.once, eventConfig.once) && Intrinsics.LJFF(this.onceKey, eventConfig.onceKey) && Intrinsics.LJFF(this.ignoreCache, eventConfig.ignoreCache) && Intrinsics.LJFF(this.trackTemplate, eventConfig.trackTemplate);
    }

    public EventConfig(Integer num, String str, Integer num2, List<String> list) {
        this.once = num;
        this.onceKey = str;
        this.ignoreCache = num2;
        this.trackTemplate = list;
    }
}
