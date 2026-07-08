package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTabInfo implements Serializable {

    @C09CT("priority")
    public Long priority;

    @C09CT("tab_id")
    public Long tabId;

    @C09CT("tab_name")
    public String tabName;

    public CommentTabInfo() {
    }

    public CommentTabInfo(Long l, String str, Long l2) {
        this.tabId = l;
        this.tabName = str;
        this.priority = l2;
    }
}
