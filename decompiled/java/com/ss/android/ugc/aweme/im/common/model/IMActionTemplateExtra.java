package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMActionTemplateExtra {

    @C09CT("key")
    public String key;

    @C09CT("value")
    public String value;

    public IMActionTemplateExtra() {
        this("", "");
    }

    public IMActionTemplateExtra(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
