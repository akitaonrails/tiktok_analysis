package com.ss.android.ugc.aweme.longpress;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressPanelStyleConfig {

    @C09CT("action_show_strategy")
    public final Boolean actionShowStrategy;

    @C09CT("handle_enable")
    public final Boolean handleEnable;

    @C09CT("panel_height_ratio")
    public final Float heightRatio;

    public LongPressPanelStyleConfig() {
        this(null, null, Boolean.FALSE);
    }

    public LongPressPanelStyleConfig(Float f, Boolean bool, Boolean bool2) {
        this.heightRatio = f;
        this.handleEnable = bool;
        this.actionShowStrategy = bool2;
    }
}
