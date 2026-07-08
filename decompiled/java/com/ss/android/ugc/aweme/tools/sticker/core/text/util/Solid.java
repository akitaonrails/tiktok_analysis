package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Solid {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("color")
    public List<Float> color;

    public Solid() {
        this(null, null);
    }

    public Solid(Float f, List<Float> list) {
        this.alpha = f;
        this.color = list;
    }
}
