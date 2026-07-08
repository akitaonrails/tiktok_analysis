package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class TranslationResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("translated_content_list")
    public final List<TranslatedContent> translatedContentList;

    public TranslationResponse(Integer num, List<TranslatedContent> list) {
        this.statusCode = num;
        this.translatedContentList = list;
    }
}
