package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class NamedValue {

    @C09CT("name")
    public final String name;

    @C09CT("value")
    public final Content value;

    public NamedValue(String str, Content content) {
        this.name = str;
        this.value = content;
    }
}
