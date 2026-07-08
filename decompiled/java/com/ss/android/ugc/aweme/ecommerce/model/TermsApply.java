package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class TermsApply {

    @C09CT("full_terms_apply_schema")
    public final String fullTermsApplyLink;

    @C09CT("half_terms_apply_schema")
    public final String halfTermsApplyLink;

    @C09CT("terms_apply_text")
    public final String termsApplyText;

    public TermsApply() {
        this(null, null, null);
    }

    public TermsApply(String str, String str2, String str3) {
        this.termsApplyText = str;
        this.fullTermsApplyLink = str2;
        this.halfTermsApplyLink = str3;
    }
}
