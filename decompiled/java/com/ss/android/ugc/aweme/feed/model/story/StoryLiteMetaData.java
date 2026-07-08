package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class StoryLiteMetaData implements Serializable {

    @C09CT("item_id")
    public final String aid;

    @C09CT("progress_bar_count")
    public final int progressBarCnt;

    public StoryLiteMetaData() {
        this(null, 0);
    }

    public StoryLiteMetaData(String str, int i) {
        this.aid = str;
        this.progressBarCnt = i;
    }
}
