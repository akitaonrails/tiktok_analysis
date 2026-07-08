package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Shadow {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("angle")
    public Float angle;

    @C09CT("content")
    public Content content;

    @C09CT("distance")
    public Float distance;

    @C09CT("enable")
    public Boolean enable;

    @C09CT("feather")
    public Float feather;

    @C09CT("strokes")
    public List<Stroke> strokes;

    public Shadow() {
        this(null, null, null, null, null, null, null);
    }

    public Shadow(Boolean bool, Float f, Content content, Float f2, Float f3, Float f4, List<Stroke> list) {
        this.enable = bool;
        this.alpha = f;
        this.content = content;
        this.angle = f2;
        this.distance = f3;
        this.feather = f4;
        this.strokes = list;
    }
}
