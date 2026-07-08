package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class LogPbStruct implements Serializable {

    @C09CT("placeholder")
    public final String placeholder;

    public LogPbStruct() {
        this(null);
    }

    public int hashCode() {
        String str = this.placeholder;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public LogPbStruct(String str) {
        this.placeholder = str;
    }
}
