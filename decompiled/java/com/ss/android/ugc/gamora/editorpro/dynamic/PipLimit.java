package com.ss.android.ugc.gamora.editorpro.dynamic;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PipLimit {

    @C09CT("max_overlay_limit")
    public int countLimit;

    @C09CT("max_height")
    public final int heightLimit;

    @C09CT("max_width")
    public final int widthLimit;

    public PipLimit() {
        this(6, 720, 1280);
    }

    public PipLimit(int i, int i2, int i3) {
        this.countLimit = i;
        this.widthLimit = i2;
        this.heightLimit = i3;
    }
}
