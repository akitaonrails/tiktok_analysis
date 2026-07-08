package com.ss.android.ugc.aweme.translation.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class TranslationContent {

    @C09CT("content_id")
    public String contentId;

    @C09CT("extra_comment_info")
    public final ExtraCommentInfo extraCommentInfo;

    @C09CT("src_content")
    public String srcContent;

    @C09CT("src_lang")
    public String srcLang;

    @C09CT("text_extra_list")
    public List<? extends TextExtraStruct> textExtras;

    public TranslationContent(String str, String str2, String str3, List<? extends TextExtraStruct> list, ExtraCommentInfo extraCommentInfo) {
        this.srcContent = str;
        this.srcLang = str2;
        this.contentId = str3;
        this.textExtras = list;
        this.extraCommentInfo = extraCommentInfo;
    }
}
