package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class BotCategoryInfo {

    @C09CT("category")
    public final String category;

    @C09CT("category_key")
    public final String categoryKey;

    public BotCategoryInfo() {
        this("", "");
    }

    public BotCategoryInfo(String str, String str2) {
        this.categoryKey = str;
        this.category = str2;
    }
}
