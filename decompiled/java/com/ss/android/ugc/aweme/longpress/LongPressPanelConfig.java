package com.ss.android.ugc.aweme.longpress;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressPanelConfig {

    @C09CT("move_tip_config")
    public final LongPressPanelMoveTipConfig moveTipConfig;

    @C09CT("panel_type")
    public final String panelType;

    @C09CT("style_config")
    public final LongPressPanelStyleConfig styleConfig;

    public LongPressPanelConfig() {
        this(null, null, null);
    }

    public LongPressPanelConfig(String str, LongPressPanelStyleConfig longPressPanelStyleConfig, LongPressPanelMoveTipConfig longPressPanelMoveTipConfig) {
        this.panelType = str;
        this.styleConfig = longPressPanelStyleConfig;
        this.moveTipConfig = longPressPanelMoveTipConfig;
    }
}
