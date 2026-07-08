package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationRenderedVideoMeta implements Serializable {
    public static final int $stable = 0;

    @C09CT("height")
    public final int height;

    @C09CT("width")
    public final int width;

    public CelebrationRenderedVideoMeta() {
        this(0, 0);
    }

    public CelebrationRenderedVideoMeta(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
