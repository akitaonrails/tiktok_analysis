package com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class LanguageDetail {

    @C09CT("app_lang_code")
    public final String appLangCode;

    @C09CT("code")
    public final String code;

    @C09CT("localName")
    public final String localName;

    @C09CT("max_line_length")
    public final int maxLineLength;

    public LanguageDetail(String str, String str2, String str3, int i) {
        this.code = str;
        this.appLangCode = str2;
        this.localName = str3;
        this.maxLineLength = i;
    }
}
