package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PSPInfo implements Serializable {

    @C09CT("dynamic_info")
    public String dynamicInfo;

    public PSPInfo() {
        this(null);
    }

    public PSPInfo(String str) {
        this.dynamicInfo = str;
    }
}
