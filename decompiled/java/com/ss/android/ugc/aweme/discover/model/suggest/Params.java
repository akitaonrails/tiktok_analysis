package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class Params implements Serializable {

    @C09CT("extra_info")
    public final ExtraInfo extraInfo;

    public Params() {
        this(null);
    }

    public Params(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }
}
