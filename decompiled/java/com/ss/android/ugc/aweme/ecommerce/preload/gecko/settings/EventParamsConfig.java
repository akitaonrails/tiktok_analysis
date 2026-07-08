package com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class EventParamsConfig {

    @C09CT("event")
    public final String event;

    @C09CT("matchers")
    public final EventParamMatcher[] matchers;

    public EventParamsConfig() {
        this(null, new EventParamMatcher[0]);
    }

    public EventParamsConfig(String str, EventParamMatcher[] eventParamMatcherArr) {
        this.event = str;
        this.matchers = eventParamMatcherArr;
    }
}
