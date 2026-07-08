package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationInfo implements Serializable {

    @C09CT("animation_scene")
    public final int animationScene;

    @C09CT("animation_type")
    public final int animationType;

    @C09CT("element_down_animation")
    public final ElementDownAnimation elementDownAnimation;

    public AnimationInfo() {
        this(0, 0, null);
    }

    public AnimationInfo(int i, int i2, ElementDownAnimation elementDownAnimation) {
        this.animationType = i;
        this.animationScene = i2;
        this.elementDownAnimation = elementDownAnimation;
    }
}
