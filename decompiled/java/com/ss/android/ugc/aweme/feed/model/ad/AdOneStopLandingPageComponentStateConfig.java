package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class AdOneStopLandingPageComponentStateConfig implements Serializable {

    @C09CT("animations")
    public final AdOneStopLandingPageComponentMultiAnimationConfig animations;

    @C09CT("triggers")
    public final List<String> triggers;

    public AdOneStopLandingPageComponentStateConfig() {
        this(null, null);
    }

    public final AdOneStopLandingPageComponentMultiAnimationConfig getAnimations() {
        return this.animations;
    }

    public final List<String> getTriggers() {
        return this.triggers;
    }

    public AdOneStopLandingPageComponentStateConfig(List<String> list, AdOneStopLandingPageComponentMultiAnimationConfig adOneStopLandingPageComponentMultiAnimationConfig) {
        this.triggers = list;
        this.animations = adOneStopLandingPageComponentMultiAnimationConfig;
    }
}
