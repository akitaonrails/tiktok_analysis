package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeRightMultiTemplateStruct {

    @C09CT("items")
    public final List<ItemNoticeStruct> items;

    @C09CT("merge_count")
    public final Integer mergeCount;

    public NoticeRightMultiTemplateStruct() {
        this(null, null);
    }

    public NoticeRightMultiTemplateStruct(List<ItemNoticeStruct> list, Integer num) {
        this.items = list;
        this.mergeCount = num;
    }
}
