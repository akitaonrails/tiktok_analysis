package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Texture {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("angle")
    public Float angle;

    @C09CT("blend")
    public String blend;

    @C09CT("flip")
    public List<Boolean> flip;

    @C09CT("path")
    public String path;

    @C09CT("range")
    public Integer range;

    @C09CT("scale")
    public Float scale;

    public Texture() {
        this(null, null, null, null, null, null, null);
    }

    public Texture(Float f, Float f2, String str, List<Boolean> list, String str2, Integer num, Float f3) {
        this.alpha = f;
        this.angle = f2;
        this.blend = str;
        this.flip = list;
        this.path = str2;
        this.range = num;
        this.scale = f3;
    }
}
