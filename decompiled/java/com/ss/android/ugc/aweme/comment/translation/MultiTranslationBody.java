package com.ss.android.ugc.aweme.comment.translation;

import X.C09CT;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class MultiTranslationBody {

    @C09CT("translation_info")
    public List<TranslationContent> translationInfos = new ArrayList();

    @C09CT("trg_lang")
    public String trgLang;

    public static class ExtraCommentInfo {

        @C09CT("digg_count")
        public long diggCount;

        @C09CT("is_first_level_comment")
        public boolean isFirstLevelComment;

        public ExtraCommentInfo(long j, boolean z) {
            this.diggCount = j;
            this.isFirstLevelComment = z;
        }
    }

    public class TranslationContent {

        @C09CT("content_id")
        public String contentId;

        @C09CT("extra_comment_info")
        public ExtraCommentInfo extraCommentInfo;

        @C09CT("src_content")
        public String srcContent;

        @C09CT("src_lang")
        public String srcLang;

        @C09CT("text_extra_list")
        public List<TextExtraStruct> textExtras;

        public TranslationContent(MultiTranslationBody multiTranslationBody, String str, String str2, String str3, List<TextExtraStruct> list, ExtraCommentInfo extraCommentInfo) {
            this.srcContent = str;
            this.srcLang = str2;
            this.contentId = str3;
            this.textExtras = list;
            this.extraCommentInfo = extraCommentInfo;
        }
    }
}
