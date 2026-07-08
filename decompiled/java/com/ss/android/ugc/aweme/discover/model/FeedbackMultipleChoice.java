package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedbackMultipleChoice implements Serializable {

    @C09CT("key")
    public String key;

    @C09CT("type")
    public String type;

    @C09CT("value")
    public String value;

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
