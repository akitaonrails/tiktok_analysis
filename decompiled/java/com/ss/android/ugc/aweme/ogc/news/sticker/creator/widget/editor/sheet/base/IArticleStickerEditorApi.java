package com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base;

import X.C11NZ;
import X.C19646611to;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes30.dex */
public interface IArticleStickerEditorApi {
    public static final C19646611to LIZ = C19646611to.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/news/article_sticker/content/check")
    C11NZ<ArticleStickerContentCheckResponse> contentCheck(@InterfaceC1501070pAH("content_type") Integer num, @InterfaceC1501070pAH("content") String str);
}
