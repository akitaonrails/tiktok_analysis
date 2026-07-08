package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdOneStopLandingPageConfig implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("background_config")
    public final AdOneStopLandingPageComponentConfig backgroundConfig;

    @C09CT("progress_bar_config")
    public final AdOneStopLandingPageComponentConfig progressBarConfig;

    @C09CT("should_continue_play")
    public final Integer shouldContinuePlay;

    @C09CT("style")
    public final Integer style;

    public static final class Companion {
    }

    public final AdOneStopLandingPageComponentConfig getBackgroundConfig() {
        return this.backgroundConfig;
    }

    public final AdOneStopLandingPageComponentConfig getProgressBarConfig() {
        return this.progressBarConfig;
    }

    public final Integer getShouldContinuePlay() {
        return this.shouldContinuePlay;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public AdOneStopLandingPageConfig(Integer num, Integer num2, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig2) {
        this.style = num;
        this.shouldContinuePlay = num2;
        this.backgroundConfig = adOneStopLandingPageComponentConfig;
        this.progressBarConfig = adOneStopLandingPageComponentConfig2;
    }
}
