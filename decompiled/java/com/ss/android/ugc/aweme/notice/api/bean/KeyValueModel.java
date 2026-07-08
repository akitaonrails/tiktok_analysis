package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class KeyValueModel {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public KeyValueModel() {
        this("", "");
    }

    public KeyValueModel(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
