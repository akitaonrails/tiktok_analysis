package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnimationInfoStruct implements Serializable {

    @C09CT("animation_seconds")
    public final int animationSeconds;

    @C09CT("target_height")
    public final int targetHeight;

    public AnimationInfoStruct() {
        this(0, 0);
    }

    public final int getAnimationSeconds() {
        return this.animationSeconds;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public AnimationInfoStruct(int i, int i2) {
        this.animationSeconds = i;
        this.targetHeight = i2;
    }
}
