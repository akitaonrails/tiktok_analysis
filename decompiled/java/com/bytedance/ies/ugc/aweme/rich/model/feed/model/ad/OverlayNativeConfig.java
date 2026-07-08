package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import X.C1003690cE3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class OverlayNativeConfig implements Serializable {
    public static final C1003690cE3 Companion = new Object() { // from class: X.0cE3
    };

    @C09CT("auto_play")
    public final boolean autoPlay;

    @C09CT("background_style_type")
    public final int backgroundStyleType;

    @C09CT("close_text")
    public final String closeText;

    public OverlayNativeConfig() {
        this(0, "", false);
    }

    public OverlayNativeConfig(int i, String str, boolean z) {
        this.backgroundStyleType = i;
        this.closeText = str;
        this.autoPlay = z;
    }
}
