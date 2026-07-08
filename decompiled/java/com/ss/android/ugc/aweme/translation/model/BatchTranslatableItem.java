package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class BatchTranslatableItem {

    @C09CT("content_id")
    public final String contentId;

    @C09CT("src_content")
    public final String srcContent;

    @C09CT("src_lang")
    public final String srcLanguage;

    public BatchTranslatableItem(String str, String str2, String str3) {
        this.srcContent = str;
        this.srcLanguage = str2;
        this.contentId = str3;
    }
}
