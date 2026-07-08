package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ExtraInfo implements Serializable {

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    public ExtraInfo() {
        this(null);
    }

    public ExtraInfo(String str) {
        this.penetrateInfo = str;
    }
}
