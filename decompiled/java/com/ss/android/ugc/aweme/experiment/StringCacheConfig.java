package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13DL;
import X.C13LQ;

/* JADX INFO: loaded from: classes17.dex */
public final class StringCacheConfig {

    @C09CT("cache_strings")
    public String[] cacheStrings;

    @C09CT("use_default")
    public boolean useDefault;

    public StringCacheConfig() {
        this(null, true);
    }

    public final String[] mergeDefault(String[] strArr) {
        String[] strArr2;
        if (!this.useDefault) {
            return this.cacheStrings;
        }
        String[] strArr3 = this.cacheStrings;
        if (strArr3 != null && (strArr2 = (String[]) C13LQ.LJLIIL(C13DL.LJIIIZ(strArr, strArr3)).toArray(new String[0])) != null) {
            return strArr2;
        }
        return strArr;
    }

    public final void setCacheStrings(String[] strArr) {
        this.cacheStrings = strArr;
    }

    public final void setUseDefault(boolean z) {
        this.useDefault = z;
    }

    public StringCacheConfig(String[] strArr, boolean z) {
        this.cacheStrings = strArr;
        this.useDefault = z;
    }
}
