package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PreviewCommentInfo implements Serializable {

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("polling_interval")
    public long pollingInterval;

    @C09CT("comment_list")
    public List<PreviewCommentItem> commentList = new ArrayList();

    @C09CT("title")
    public String title = "";
}
