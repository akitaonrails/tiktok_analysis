package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalServiceConfig implements Serializable {

    @C09CT("key")
    public String key;

    @C09CT("val")
    public String value;

    public LocalServiceConfig() {
        this(null, null);
    }

    public LocalServiceConfig(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
