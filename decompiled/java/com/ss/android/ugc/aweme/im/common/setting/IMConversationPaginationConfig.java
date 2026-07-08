package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMConversationPaginationConfig {

    @C09CT("pagination_count")
    public final int paginationCount;

    @C09CT("pre_load_count")
    public final int preLoadCount;

    public IMConversationPaginationConfig(int i, int i2) {
        this.preLoadCount = i;
        this.paginationCount = i2;
    }
}
