package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTextStruct;

/* JADX INFO: loaded from: classes29.dex */
public final class TextPair {

    @C09CT("content")
    public final NoticeTextStruct content;

    @C09CT("title")
    public final NoticeTextStruct title;

    public TextPair() {
        this(null, null);
    }

    public TextPair(NoticeTextStruct noticeTextStruct, NoticeTextStruct noticeTextStruct2) {
        this.title = noticeTextStruct;
        this.content = noticeTextStruct2;
    }
}
