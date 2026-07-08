package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class AdOneStopLandingPageComponentAnimationConfig implements Serializable {

    @C09CT("duration")
    public final Long duration;

    @C09CT("easing")
    public final String easing;

    @C09CT("end")
    public final Object end;

    @C09CT("property")
    public final String property;

    @C09CT("start")
    public final Object start;

    @C09CT("value")
    public final Object value;

    public AdOneStopLandingPageComponentAnimationConfig() {
        this(null, null, null, null, null, null);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getEasing() {
        return this.easing;
    }

    public final Object getEnd() {
        return this.end;
    }

    public final String getProperty() {
        return this.property;
    }

    public final Object getStart() {
        return this.start;
    }

    public final Object getValue() {
        return this.value;
    }

    public AdOneStopLandingPageComponentAnimationConfig(String str, Object obj, Object obj2, Object obj3, Long l, String str2) {
        this.property = str;
        this.value = obj;
        this.start = obj2;
        this.end = obj3;
        this.duration = l;
        this.easing = str2;
    }
}
