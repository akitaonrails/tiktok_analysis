package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentPanelShowTabConfig implements Serializable {

    @C09CT("comment_tab_info_config")
    public List<CommentTabInfo> commentTabInfoConfig;

    @C09CT("max_tab_count")
    public Long maxTabCount;

    public CommentPanelShowTabConfig() {
    }

    public CommentPanelShowTabConfig(Long l, List<CommentTabInfo> list) {
        this.maxTabCount = l;
        this.commentTabInfoConfig = list;
    }
}
