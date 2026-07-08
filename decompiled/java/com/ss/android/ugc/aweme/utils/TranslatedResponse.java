package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TranslatedResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    @C09CT("translated_texts")
    public final List<TranslatedTextInfo> textInfo;

    public TranslatedResponse(List<TranslatedTextInfo> list, Integer num, String str) {
        this.textInfo = list;
        this.statusCode = num;
        this.statusMessage = str;
    }
}
