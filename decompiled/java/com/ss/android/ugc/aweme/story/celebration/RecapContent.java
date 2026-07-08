package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class RecapContent implements Serializable {
    public static final int $stable = 8;

    @C09CT("create_tab_animation_url")
    public final AnimationUrl createTabAnimationUrl;

    public RecapContent() {
        this(null);
    }

    public RecapContent(AnimationUrl animationUrl) {
        this.createTabAnimationUrl = animationUrl;
    }
}
