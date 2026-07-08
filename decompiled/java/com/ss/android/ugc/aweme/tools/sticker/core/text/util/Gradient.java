package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Gradient {

    @C09CT("alpha")
    public List<Float> alpha;

    @C09CT("angle")
    public Float angle;

    @C09CT("color")
    public List<? extends List<Float>> color;

    @C09CT("mode")
    public String mode;

    @C09CT("percent")
    public List<Float> percent;

    public Gradient() {
        this(null, null, null, null, null);
    }

    public Gradient(List<Float> list, Float f, List<? extends List<Float>> list2, String str, List<Float> list3) {
        this.alpha = list;
        this.angle = f;
        this.color = list2;
        this.mode = str;
        this.percent = list3;
    }
}
