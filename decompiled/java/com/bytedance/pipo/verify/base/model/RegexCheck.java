package com.bytedance.pipo.verify.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RegexCheck {

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("regex")
    public final String regex;

    public RegexCheck(String str, String str2) {
        this.regex = str;
        this.errorCode = str2;
    }
}
