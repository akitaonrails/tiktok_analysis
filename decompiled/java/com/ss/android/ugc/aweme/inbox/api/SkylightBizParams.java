package com.ss.android.ugc.aweme.inbox.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightBizParams implements Serializable {
    public static final int $stable = 0;

    @C09CT("parameter")
    public final String param;

    @C09CT("biz_type")
    public final Integer type;

    public SkylightBizParams() {
        this(null, null);
    }

    public SkylightBizParams(Integer num, String str) {
        this.type = num;
        this.param = str;
    }
}
