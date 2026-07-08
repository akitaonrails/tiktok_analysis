package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMixCardActionBar implements Serializable {
    public static final int $stable = 0;

    @C09CT("msg_content")
    public final String msgContent;

    @C09CT("fusion_share_msg_content")
    public final String msgContentFusionShare;

    public SearchMixCardActionBar() {
        this(null, null);
    }

    public SearchMixCardActionBar(String str, String str2) {
        this.msgContent = str;
        this.msgContentFusionShare = str2;
    }
}
