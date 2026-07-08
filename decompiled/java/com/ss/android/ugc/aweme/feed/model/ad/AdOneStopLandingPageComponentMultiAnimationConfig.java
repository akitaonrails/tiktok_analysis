package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AdOneStopLandingPageComponentMultiAnimationConfig implements Serializable {

    @C09CT("sequence")
    public final List<AdOneStopLandingPageComponentAnimationConfig> sequence;

    public AdOneStopLandingPageComponentMultiAnimationConfig() {
        this(null);
    }

    public final List<AdOneStopLandingPageComponentAnimationConfig> getSequence() {
        return this.sequence;
    }

    public AdOneStopLandingPageComponentMultiAnimationConfig(List<AdOneStopLandingPageComponentAnimationConfig> list) {
        this.sequence = list;
    }
}
