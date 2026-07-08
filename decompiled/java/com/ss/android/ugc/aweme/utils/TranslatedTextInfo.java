package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class TranslatedTextInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("original_text")
    public final TextStruct originalText;

    @C09CT("src_lang")
    public final String sourceLanguage;

    @C09CT("target_lang")
    public final String targetLanguage;

    @C09CT("translated_text")
    public final TextStruct translatedText;

    @C09CT("translation_model")
    public final String translationModel;

    @C09CT("translation_status_code")
    public final Integer translationStatusCode;

    public TranslatedTextInfo(TextStruct textStruct, TextStruct textStruct2, String str, Integer num, String str2, String str3) {
        this.translatedText = textStruct;
        this.originalText = textStruct2;
        this.sourceLanguage = str;
        this.translationStatusCode = num;
        this.translationModel = str2;
        this.targetLanguage = str3;
    }
}
