package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C693560RIk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class NarrowScreenOptConfig implements Serializable {
    public static final int $stable = 0;
    public static final int NONE_ADAPTION = 0;

    @C09CT("adaption_narrow_screen_font")
    public final boolean adaptionNarrowScreenFont;

    @C09CT("adaption_target")
    public final int adaptionTarget;

    @C09CT("interact_padding_dp")
    public final int interactPaddingDp;
    public static final C693560RIk Companion = new Object() { // from class: X.0RIk
    };
    public static final int ONLY_NARROW = 2;
    public static final int ALL_DEVICE = 1;

    public NarrowScreenOptConfig() {
        this(0, 100, false);
    }

    public NarrowScreenOptConfig(int i, int i2, boolean z) {
        this.adaptionTarget = i;
        this.interactPaddingDp = i2;
        this.adaptionNarrowScreenFont = z;
    }
}
