package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class Extra {

    @C09CT("bold")
    public final Boolean bold;

    @C09CT("color_type")
    public final Integer colorType;

    public Extra() {
        this(null, null);
    }

    public Extra(Integer num, Boolean bool) {
        this.colorType = num;
        this.bold = bool;
    }
}
