package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class Patch {

    @C09CT("field")
    public final String field;

    @C09CT("op")
    public final String op;

    @C09CT("value")
    public final String value;

    public Patch() {
        this("", "", "");
    }

    public Patch(String str, String str2, String str3) {
        this.op = str;
        this.field = str2;
        this.value = str3;
    }
}
