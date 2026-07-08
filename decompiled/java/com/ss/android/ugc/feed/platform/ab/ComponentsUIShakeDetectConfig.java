package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ComponentsUIShakeDetectConfig {

    @C09CT("cold_start_config")
    public final FrameDumpConfig coldStartConfig;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("scroll_config")
    public final FrameDumpConfig scrollConfig;

    public ComponentsUIShakeDetectConfig() {
        this(null, null, null);
    }

    public ComponentsUIShakeDetectConfig(Boolean bool, FrameDumpConfig frameDumpConfig, FrameDumpConfig frameDumpConfig2) {
        this.enable = bool;
        this.coldStartConfig = frameDumpConfig;
        this.scrollConfig = frameDumpConfig2;
    }
}
