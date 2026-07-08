package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class Fill {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("content")
    public Content content;

    @C09CT("enable")
    public Boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public Fill() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public Fill(Float f, Content content, Boolean bool) {
        this.alpha = f;
        this.content = content;
        this.enable = bool;
    }

    public /* synthetic */ Fill(Float f, Content content, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : content, (i & 4) != 0 ? null : bool);
    }
}
