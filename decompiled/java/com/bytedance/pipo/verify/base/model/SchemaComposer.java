package com.bytedance.pipo.verify.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SchemaComposer {

    @C09CT("Lynx")
    public final String lynx;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @C09CT("Native")
    public final String f47native;

    @C09CT("Web")
    public final String web;

    public SchemaComposer() {
        this(null, null, null);
    }

    public SchemaComposer(String str, String str2, String str3) {
        this.f47native = str;
        this.web = str2;
        this.lynx = str3;
    }
}
