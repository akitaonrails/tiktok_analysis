package com.ss.android.ugc.aweme.template.search;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateSearchHistoryItem {

    @C09CT("keyword")
    public final String keyword;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("uid")
    public final String uid;

    public TemplateSearchHistoryItem() {
        this(null, null, -1L);
    }

    public final boolean equals(Object obj) {
        TemplateSearchHistoryItem templateSearchHistoryItem;
        if (obj instanceof TemplateSearchHistoryItem) {
            templateSearchHistoryItem = (TemplateSearchHistoryItem) obj;
        } else {
            templateSearchHistoryItem = null;
        }
        if (templateSearchHistoryItem == null || !Intrinsics.LJFF(this.keyword, templateSearchHistoryItem.keyword) || !Intrinsics.LJFF(this.uid, templateSearchHistoryItem.uid)) {
            return false;
        }
        return true;
    }

    public TemplateSearchHistoryItem(String str, String str2, Long l) {
        this.keyword = str;
        this.uid = str2;
        this.timestamp = l;
    }
}
