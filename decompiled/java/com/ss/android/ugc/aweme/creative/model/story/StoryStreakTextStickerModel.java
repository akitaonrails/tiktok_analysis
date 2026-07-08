package com.ss.android.ugc.aweme.creative.model.story;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryStreakTextStickerModel implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("translation_y")
    public final float translateY;

    public StoryStreakTextStickerModel() {
        this(0.0f, 0);
    }

    public StoryStreakTextStickerModel(float f, int i) {
        this.translateY = f;
        this.height = i;
    }
}
