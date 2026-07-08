package com.ss.android.ugc.aweme.ogc.declaration.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DeclarationOptions {
    public static final int $stable = 8;

    @C09CT("term_link")
    public String termLink;

    @C09CT("declaration_type")
    public Integer type;

    public DeclarationOptions() {
        this(null, null);
    }

    public final void setTermLink(String str) {
        this.termLink = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public DeclarationOptions(Integer num, String str) {
        this.type = num;
        this.termLink = str;
    }
}
