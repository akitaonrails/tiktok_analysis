package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class Stroke {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("content")
    public Content content;

    @C09CT("enable")
    public Boolean enable;

    @C09CT("width")
    public Float width;

    public Stroke() {
        this(null, null, null, null);
    }

    public Stroke(Boolean bool, Float f, Content content, Float f2) {
        this.enable = bool;
        this.alpha = f;
        this.content = content;
        this.width = f2;
    }
}
