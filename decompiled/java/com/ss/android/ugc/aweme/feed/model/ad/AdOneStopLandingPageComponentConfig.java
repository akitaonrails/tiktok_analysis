package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class AdOneStopLandingPageComponentConfig implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("complete")
    public final AdOneStopLandingPageComponentStateConfig complete;

    @C09CT("height")
    public final Float height;

    @C09CT("loading")
    public final AdOneStopLandingPageComponentStateConfig loading;

    @C09CT("scenes")
    public final List<String> scenes;

    public static final class Companion {
    }

    public AdOneStopLandingPageComponentConfig() {
        this(null, null, null, null);
    }

    public final AdOneStopLandingPageComponentStateConfig getComplete() {
        return this.complete;
    }

    public final Float getHeight() {
        return this.height;
    }

    public final AdOneStopLandingPageComponentStateConfig getLoading() {
        return this.loading;
    }

    public final List<String> getScenes() {
        return this.scenes;
    }

    public AdOneStopLandingPageComponentConfig(List<String> list, Float f, AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfig, AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfig2) {
        this.scenes = list;
        this.height = f;
        this.loading = adOneStopLandingPageComponentStateConfig;
        this.complete = adOneStopLandingPageComponentStateConfig2;
    }
}
