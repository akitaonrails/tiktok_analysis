package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorDynamicAnimationConfig {

    @C09CT("ec_anchor_metadata_call_delay_sec")
    public final int callDelaySec;

    @C09CT("ec_anchor_show_subtitle_delay")
    public final int delayShowSubtitle;

    @C09CT("enable")
    public final boolean enable;

    public AnchorDynamicAnimationConfig() {
        this(false, 3, 0);
    }

    public AnchorDynamicAnimationConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.delayShowSubtitle = i;
        this.callDelaySec = i2;
    }
}
