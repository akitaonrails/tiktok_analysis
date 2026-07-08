package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class OverlayNativeConfig implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("auto_play")
    public final boolean autoPlay;

    @C09CT("background_style_type")
    public final int backgroundStyleType;

    @C09CT("close_text")
    public final String closeText;

    @C09CT("desc_text")
    public final String descText;

    public static final class Companion {
    }

    public OverlayNativeConfig() {
        this(0, "", false, "");
    }

    public OverlayNativeConfig(int i, String str, boolean z, String str2) {
        this.backgroundStyleType = i;
        this.closeText = str;
        this.autoPlay = z;
        this.descText = str2;
    }
}
