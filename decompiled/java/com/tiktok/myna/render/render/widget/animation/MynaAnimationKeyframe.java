package com.tiktok.myna.render.render.widget.animation;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class MynaAnimationKeyframe {

    @C09CT("percent")
    public final float percent;

    @C09CT("style")
    public final Map<String, Object> style;

    public MynaAnimationKeyframe() {
        this(0.0f, null);
    }

    public MynaAnimationKeyframe(float f, Map<String, ? extends Object> map) {
        this.percent = f;
        this.style = map;
    }
}
