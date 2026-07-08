package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class OriginalTextInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("original_text")
    public final TextStruct originalText;

    @C09CT("source_lang")
    public final String sourceLang;

    public OriginalTextInfo(TextStruct textStruct, String str) {
        this.originalText = textStruct;
        this.sourceLang = str;
    }
}
